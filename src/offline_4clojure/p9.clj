;; Sets: conj - Elementary
;; When operating on a set, the conj function returns a new set with one or more keys "added".
;; tags - 
;; restricted - 
(ns offline-4clojure.p9
  (:use clojure.test))

(testing "Set conj"
  (is
   (= #{1 2 3 4} (conj #{1 4 3} 2))))
