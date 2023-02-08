;; Intro to Strings - Elementary
;; Clojure strings are Java strings. 
;; This means that you can use any of the Java string methods on Clojure strings.
;; tags - 
;; restricted - 
(ns offline-4clojure.p3
  (:use clojure.test))

(def upper-world "HELLO WORLD"
;; your solution here
)

(testing "Upper hello world"
  (is (= upper-world (.toUpperCase "hello world"))))
