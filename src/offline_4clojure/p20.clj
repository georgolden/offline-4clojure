;; Penultimate Element - Easy
;; Write a function which returns the second to 
;; last element from a sequence.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p20
  (:use clojure.test))

(defn second-to-last [[first & seq]] 
  (if (= 1 (count seq))
   first
   (second-to-last seq)))

(testing "second to last element of seq"
  (is (= (second-to-last (list 1 2 3 4 5)) 4))
  (is (= (second-to-last ["a" "b" "c"]) "b"))
  (is (= (second-to-last [[1 2] [3 4]]) [1 2])))
