;; Double Down - Elementary
;; Write a function which doubles a number.
;; tags - 
;; restricted - 
(ns offline-4clojure.p15
  (:use clojure.test))

(defn double-val [x] (* 2 x))

(testing "double"
  (is (= (double-val 2) 4))
  (is (= (double-val 3) 6))
  (is (= (double-val 11) 22))
  (is (= (double-val 7) 14)))
