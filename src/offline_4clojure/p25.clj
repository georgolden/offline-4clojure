;; Find the odd numbers - Easy
;; Write a function which returns only the odd numbers
;; from a sequence.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p25
  (:use clojure.test))

(defn odd-seq [seq]
  (if-not (empty? seq)
    (let [[x & xs] seq]
      (if-not (= 0 (mod x 2))
        (cons x (odd-seq xs))
        (odd-seq xs)))
    '()))

(defn odd-seq-filter [seq]
  (filter odd? seq))

(testing "odd-seq"
  (is (= (odd-seq-filter #{1 2 3 4 5}) (odd-seq #{1 2 3 4 5}) '(1 3 5)))
  (is (= (odd-seq-filter [4 2 1 6]) (odd-seq [4 2 1 6]) '(1)))
  (is (= (odd-seq-filter [2 2 4 6]) (odd-seq [2 2 4 6]) '()))
  (is (= (odd-seq-filter [1 1 1 3]) (odd-seq [1 1 1 3]) '(1 1 1 3))))
