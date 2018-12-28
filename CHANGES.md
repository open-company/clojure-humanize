## 0.2.3-alpha1

Updated dependencies.

Renamed ns `clojure.contrib.macros` to `clojure.contrib.humanize-macros` to avoid clash with [https://clojure.github.io/clojure-contrib/macros-api.html](https://clojure.github.io/clojure-contrib/macros-api.html).


## 0.2.2

`clojure.contrib.inflect/datetime` now supports diffs that represent a 
time in the future, as well as _centuries_ and _millennia_ diffs.

Fix pluralizing nouns that end in _ff_.


## 0.2.1

`clojure.contrib.inflect/pluralize-noun` now pluralizes a count of zero; previously any count less
than or equal to 1 was considered singular.

Added `clojure.contrib.humanize/duration` and `duration-terms` to format a duration, in
milliseconds, as a string.
