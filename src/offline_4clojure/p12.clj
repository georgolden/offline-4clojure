;; Intro to Sequences - Elementary
;; All Clojure collections support sequencing.  You can operate on sequences with functions like first, second, and last.
;; tags - 
;; restricted - 
(ns offline-4clojure.p12
  (:use clojure.test))

(def three 3)

(testing "get by position"
  (is (= three (first '(3 2 1))))
  (is (= three (second [2 3 4])))
  (is (= three (last (list 1 2 3)))))
