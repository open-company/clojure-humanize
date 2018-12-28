(ns clojure.contrib.humanize-macros
  (:require [clojure.contrib.inflect :refer [pluralize-noun]]))

(defmacro with-dt-diff [desc-diff diff desc-type future-time? prefix suffix]
  `(let [d# (~desc-diff ~diff)
         t# (pluralize-noun (~desc-diff ~diff) ~desc-type)]
     (if ~future-time?
       (str ~prefix " " d# " " t#)
       (str d# " " t# " " ~suffix))))