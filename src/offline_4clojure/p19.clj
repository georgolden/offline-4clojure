;; Last Element - Easy
;; Write a function which returns the last element in a sequence.
;; tags - seqs:core-functions
;; restricted - last
(ns offline-4clojure.p19
  (:use clojure.test))

(defn last-element [seq]
  (if-not (empty? seq)
    (if (= 1 (count seq))
      (first seq)
      (last (rest seq)))))

(testing "last element of seq"
  (is (= (last-element [1 2 3 4 5]) 5))
  (is (= (last-element '(5 4 3)) 3))
  (is (= (last-element ["b" "c" "d"]) "d")))
