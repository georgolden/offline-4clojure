;; Nth Element - Easy
;; Write a function which returns the Nth element 
;; from a sequence.
;; tags - seqs:core-functions
;; restricted - nth
(ns offline-4clojure.p21
  (:use clojure.test))

(defn custom-nth [[first & others] i]
  (if (= i 0)
    first
    (recur others (dec i))))

(testing "custom nth element"
  (is (= (custom-nth '(4 5 6 7) 2) 6))
  (is (= (custom-nth [:a :b :c] 0) :a))
  (is (= (custom-nth [1 2 3 4] 1) 2))
  (is (= (custom-nth '([1 2] [3 4] [5 6]) 2) [5 6])))
