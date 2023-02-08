;; Intro to Functions - Elementary
;; Clojure has many different ways to create functions.
;; tags - 
;; restricted - 
(ns offline-4clojure.p14
  (:use clojure.test))

(def eight 8)

(testing "function definitions"
  (is (= eight ((fn add-five [x] (+ x 5)) 3)))
  (is (= eight ((fn [x] (+ x 5)) 3)))
  (is (= eight (#(+ % 5) 3)))
  (is (= eight ((partial + 5) 3))))
