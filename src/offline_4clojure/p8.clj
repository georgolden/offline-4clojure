;; Intro to Sets - Elementary
;; Sets are collections of unique values.
;; tags - 
;; restricted - 
(ns offline-4clojure.p8
  (:use clojure.test)
  (:require [clojure.set :as set]))

(def expected-set #{:a :b :c :d})

(testing "Set"
  (is (= expected-set (set '(:a :a :b :c :c :c :c :d :d))))
  (is (= expected-set (set/union #{:a :b :c} #{:b :c :d}))))
