;; Intro to Lists - Elementary
;; Lists can be constructed with either a function or a quoted form.
;; tags - 
;; restricted - 
(ns offline-4clojure.p4
  (:use clojure.test))

(def vec-abc [:a :b :c])
(def a :a)
(def b :b)
(def c :c)

(testing "List check"
  (is (= (lazy-seq vec-abc) '(:a :b :c)))
  (is (= (list a b c) '(:a :b :c)))
  )
