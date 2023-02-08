;; Count a Sequence - Easy
;; Write a function which returns the total number of elements in a sequence.
;; tags - seqs:core-functions
;; restricted - count
(ns offline-4clojure.p22
  (:use clojure.test))

(defn custom-count [seq]
  (loop [x seq cnt 0]
    (if (empty? x)
      cnt
      (recur (rest x) (inc cnt)))))

(defn custom-count-reduce [seq]
  (reduce (fn [cnt _] (inc cnt)) 0 seq))

(testing "custom-count"
  (is (= (custom-count '(1 2 3 3 1)) 5))
  (is (= (custom-count "Hello World") 11))
  (is (= (custom-count [[1 2] [3 4] [5 6]]) 3))
  (is (= (custom-count '(13)) 1))
  (is (= (custom-count '(:a :b :c)) 3)))

(testing "custom-count-reduce"
  (is (= (custom-count-reduce '(1 2 3 3 1)) 5))
  (is (= (custom-count-reduce "Hello World") 11))
  (is (= (custom-count-reduce [[1 2] [3 4] [5 6]]) 3))
  (is (= (custom-count-reduce '(13)) 1))
  (is (= (custom-count-reduce '(:a :b :c)) 3)))
