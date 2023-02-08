;; Sum It All Up - Easy
;; Write a function which returns the sum of
;; a sequence of numbers.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p24
  (:use clojure.test))

(defn sum-all [seq]
  (if-not (empty? seq)
    (loop [[x & xs] seq sum 0]
      (if (empty? xs)
        (+ x sum)
        (recur xs (+ x sum))))
    0))

(defn sum-all-reduce [seq]
  (reduce + seq))

(testing "sum all"
  (is (= (sum-all [1 2 3]) (sum-all-reduce [1 2 3]) 6))
  (is (= (sum-all (list 0 -2 5 5)) (sum-all-reduce (list 0 -2 5 5)) 8))
  (is (= (sum-all #{4 2 1}) (sum-all-reduce #{4 2 1}) 7))
  (is (= (sum-all '(0 0 -1)) (sum-all-reduce '(0 0 -1)) -1))
  (is (= (sum-all '(1 10 3)) (sum-all-reduce '(1 10 3)) 14)))
