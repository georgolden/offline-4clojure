;; Reverse a Sequence - Easy
;; Write a function which reverses a sequence.
;; tags - seqs:core-functions
;; restricted - reverse:rseq
(ns offline-4clojure.p23
  (:use clojure.test))

(defn custom-reverse [seq]
  (into '() seq))

(testing "custom reverse sequence"
  (is (= (custom-reverse [1 2 3 4 5]) [5 4 3 2 1]))
  (is (= (custom-reverse (sorted-set 5 7 2 7)) '(7 5 2)))
  (is (= (custom-reverse [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]])))
