;; Intro to Vectors - Elementary
;; Vectors can be constructed several ways.  You can compare them with lists.
;; tags - 
;; restricted - 
(ns offline-4clojure.p6
  (:use clojure.test))

(def vector-abs [:a :b :c]
;; your solution here
  )

(testing "Vector"
  (is (=
       vector-abs
       (list :a :b :c)
       (vec '(:a :b :c))
       (vector :a :b :c))))
