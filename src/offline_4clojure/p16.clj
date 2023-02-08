;; Hello World - Elementary
;; Write a function which returns a personalized greeting.
;; tags - 
;; restricted - 
(ns offline-4clojure.p16
  (:use clojure.test))

(defn greet [name] (str "Hello, " name "!"))

(testing "greet"
  (is (= (greet "Dave") "Hello, Dave!"))
  (is (= (greet "Jenn") "Hello, Jenn!"))
  (is (= (greet "Rhea") "Hello, Rhea!")))
