;; Sequences: filter - Elementary
;; The filter function takes two arguments: a predicate function (f) and a sequence (s).  
;; Filter returns a new sequence consisting of all the items of s for which (f item) returns true.
;; tags - 
;; restricted - 
(ns offline-4clojure.p18
  (:use clojure.test))

(defn custom-filter [fn seq]
  (if-not (empty? seq)
    (let [[x & xs] seq]
         (if (fn x)
           (cons x (custom-filter fn xs))
           (custom-filter fn xs)))
    '()))

(testing "custom-filter implementation"
  (is
   (= (custom-filter #(> % 5) '(3 4 5 6 7)) (filter #(> % 5) '(3 4 5 6 7)))))
