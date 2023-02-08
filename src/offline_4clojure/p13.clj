;; Sequences: rest - Elementary
;; The rest function will return all the items of a sequence except the first.
;; tags - 
;; restricted - 
(ns offline-4clojure.p13
  (:use clojure.test))

(def expected-rest [20 30 40])

(testing "rest"
  (is
   (= expected-rest (rest [10 20 30 40]))))
