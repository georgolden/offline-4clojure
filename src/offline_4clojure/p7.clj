;; Vectors: conj - Elementary
;; When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.
;; tags - 
;; restricted - 
(ns offline-4clojure.p7
  (:use clojure.test))

(def expected-vector [1 2 3 4]
;; your solution here
  )

(testing "Vector conj"
  (is (= expected-vector (conj [1 2 3] 4)))
  (is (= expected-vector (conj [1 2] 3 4))))
