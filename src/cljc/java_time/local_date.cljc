(ns cljc.java-time.local-date (:require [cljs.java-time.interop :as jti] #? (:cljs [java.time :refer [LocalDate]])) (:refer-clojure :exclude [get range format min max next name resolve]) #? (:clj (:import [java.time LocalDate])))
(def max (. java.time.LocalDate -MAX))
(def min (. java.time.LocalDate -MIN))
(clojure.core/defn minus-weeks {:arglists (quote (["java.time.LocalDate" "long"]))} (^java.time.LocalDate [^java.time.LocalDate this1887 ^long long1888] (.minusWeeks this1887 long1888)))
(clojure.core/defn plus-weeks {:arglists (quote (["java.time.LocalDate" "long"]))} (^java.time.LocalDate [^java.time.LocalDate this1889 ^long long1890] (.plusWeeks this1889 long1890)))
(clojure.core/defn length-of-year {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.Integer [^java.time.LocalDate this1891] (.lengthOfYear this1891)))
(clojure.core/defn range {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]))} (^java.time.temporal.ValueRange [^java.time.LocalDate this1892 ^java.time.temporal.TemporalField java-time-temporal-TemporalField1893] (.range this1892 java-time-temporal-TemporalField1893)))
(clojure.core/defn get-era {:arglists (quote (["java.time.LocalDate"]))} (^java.time.chrono.Era [^java.time.LocalDate this1894] (jti/getter era this1894)))
(clojure.core/defn of {:arglists (quote (["int" "java.time.Month" "int"] ["int" "int" "int"]))} (^java.time.LocalDate [G__1896 G__1897 G__1898] #? (:cljs (. java.time.LocalDate of G__1896 G__1897 G__1898) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Integer") G__1896) (clojure.core/instance? (java.lang.Class/forName "java.time.Month") G__1897) (clojure.core/instance? (java.lang.Class/forName "java.lang.Integer") G__1898)) (clojure.core/let [G__1896 ^"java.lang.Integer" G__1896 G__1897 ^"java.time.Month" G__1897 G__1898 ^"java.lang.Integer" G__1898] (. java.time.LocalDate of G__1896 G__1897 G__1898)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Integer") G__1896) (clojure.core/instance? (java.lang.Class/forName "java.lang.Integer") G__1897) (clojure.core/instance? (java.lang.Class/forName "java.lang.Integer") G__1898)) (clojure.core/let [G__1896 ^"java.lang.Integer" G__1896 G__1897 ^"java.lang.Integer" G__1897 G__1898 ^"java.lang.Integer" G__1898] (. java.time.LocalDate of G__1896 G__1897 G__1898)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn with-month {:arglists (quote (["java.time.LocalDate" "int"]))} (^java.time.LocalDate [^java.time.LocalDate this1899 ^java.lang.Integer int1900] (.withMonth this1899 int1900)))
(clojure.core/defn is-equal {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))} (^java.lang.Boolean [^java.time.LocalDate this1901 ^java.time.chrono.ChronoLocalDate java-time-chrono-ChronoLocalDate1902] (.isEqual this1901 java-time-chrono-ChronoLocalDate1902)))
(clojure.core/defn get-year {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.Integer [^java.time.LocalDate this1903] (jti/getter year this1903)))
(clojure.core/defn to-epoch-day {:arglists (quote (["java.time.LocalDate"]))} (^long [^java.time.LocalDate this1904] (.toEpochDay this1904)))
(clojure.core/defn get-day-of-year {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.Integer [^java.time.LocalDate this1905] (jti/getter dayOfYear this1905)))
(clojure.core/defn plus {:arglists (quote (["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"] ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"] ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"]))} (^java.lang.Object [this1906 G__1907 G__1908] #? (:cljs (.plus ^java.time.LocalDate this1906 G__1907 G__1908) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1907) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__1908)) (clojure.core/let [G__1907 (clojure.core/long G__1907) G__1908 ^"java.time.temporal.TemporalUnit" G__1908] (.plus ^java.time.LocalDate this1906 G__1907 G__1908)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1907) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__1908)) (clojure.core/let [G__1907 (clojure.core/long G__1907) G__1908 ^"java.time.temporal.TemporalUnit" G__1908] (.plus ^java.time.LocalDate this1906 G__1907 G__1908)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1907) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__1908)) (clojure.core/let [G__1907 (clojure.core/long G__1907) G__1908 ^"java.time.temporal.TemporalUnit" G__1908] (.plus ^java.time.LocalDate this1906 G__1907 G__1908)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this1909 G__1910] #? (:cljs (.plus ^java.time.LocalDate this1909 G__1910) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__1910)) (clojure.core/let [G__1910 ^"java.time.temporal.TemporalAmount" G__1910] (.plus ^java.time.LocalDate this1909 G__1910)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__1910)) (clojure.core/let [G__1910 ^"java.time.temporal.TemporalAmount" G__1910] (.plus ^java.time.LocalDate this1909 G__1910)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__1910)) (clojure.core/let [G__1910 ^"java.time.temporal.TemporalAmount" G__1910] (.plus ^java.time.LocalDate this1909 G__1910)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn is-leap-year {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.Boolean [^java.time.LocalDate this1911] (.isLeapYear this1911)))
(clojure.core/defn query {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalQuery"]))} (^java.lang.Object [^java.time.LocalDate this1912 ^java.time.temporal.TemporalQuery java-time-temporal-TemporalQuery1913] (.query this1912 java-time-temporal-TemporalQuery1913)))
(clojure.core/defn get-day-of-week {:arglists (quote (["java.time.LocalDate"]))} (^java.time.DayOfWeek [^java.time.LocalDate this1914] (jti/getter dayOfWeek this1914)))
(clojure.core/defn to-string {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.String [^java.time.LocalDate this1915] (.toString this1915)))
(clojure.core/defn plus-months {:arglists (quote (["java.time.LocalDate" "long"]))} (^java.time.LocalDate [^java.time.LocalDate this1916 ^long long1917] (.plusMonths this1916 long1917)))
(clojure.core/defn is-before {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))} (^java.lang.Boolean [^java.time.LocalDate this1918 ^java.time.chrono.ChronoLocalDate java-time-chrono-ChronoLocalDate1919] (.isBefore this1918 java-time-chrono-ChronoLocalDate1919)))
(clojure.core/defn minus-months {:arglists (quote (["java.time.LocalDate" "long"]))} (^java.time.LocalDate [^java.time.LocalDate this1920 ^long long1921] (.minusMonths this1920 long1921)))
(clojure.core/defn minus {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalAmount"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"] ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.temporal.TemporalAmount"] ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "long" "java.time.temporal.TemporalUnit"]))} (^java.lang.Object [this1922 G__1923] #? (:cljs (.minus ^java.time.LocalDate this1922 G__1923) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__1923)) (clojure.core/let [G__1923 ^"java.time.temporal.TemporalAmount" G__1923] (.minus ^java.time.LocalDate this1922 G__1923)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__1923)) (clojure.core/let [G__1923 ^"java.time.temporal.TemporalAmount" G__1923] (.minus ^java.time.LocalDate this1922 G__1923)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAmount") G__1923)) (clojure.core/let [G__1923 ^"java.time.temporal.TemporalAmount" G__1923] (.minus ^java.time.LocalDate this1922 G__1923)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this1924 G__1925 G__1926] #? (:cljs (.minus ^java.time.LocalDate this1924 G__1925 G__1926) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1925) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__1926)) (clojure.core/let [G__1925 (clojure.core/long G__1925) G__1926 ^"java.time.temporal.TemporalUnit" G__1926] (.minus ^java.time.LocalDate this1924 G__1925 G__1926)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1925) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__1926)) (clojure.core/let [G__1925 (clojure.core/long G__1925) G__1926 ^"java.time.temporal.TemporalUnit" G__1926] (.minus ^java.time.LocalDate this1924 G__1925 G__1926)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1925) (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__1926)) (clojure.core/let [G__1925 (clojure.core/long G__1925) G__1926 ^"java.time.temporal.TemporalUnit" G__1926] (.minus ^java.time.LocalDate this1924 G__1925 G__1926)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn plus-days {:arglists (quote (["java.time.LocalDate" "long"]))} (^java.time.LocalDate [^java.time.LocalDate this1927 ^long long1928] (.plusDays this1927 long1928)))
(clojure.core/defn get-long {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]))} (^long [^java.time.LocalDate this1929 ^java.time.temporal.TemporalField java-time-temporal-TemporalField1930] (.getLong this1929 java-time-temporal-TemporalField1930)))
(clojure.core/defn with-year {:arglists (quote (["java.time.LocalDate" "int"]))} (^java.time.LocalDate [^java.time.LocalDate this1931 ^java.lang.Integer int1932] (.withYear this1931 int1932)))
(clojure.core/defn length-of-month {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.Integer [^java.time.LocalDate this1933] (.lengthOfMonth this1933)))
(clojure.core/defn until {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"] ["java.time.LocalDate" "java.time.temporal.Temporal" "java.time.temporal.TemporalUnit"] ["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))} (^java.lang.Object [this1934 G__1935] #? (:cljs (.until ^java.time.LocalDate this1934 G__1935) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.chrono.ChronoLocalDate") G__1935)) (clojure.core/let [G__1935 ^"java.time.chrono.ChronoLocalDate" G__1935] (.until ^java.time.LocalDate this1934 G__1935)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.chrono.ChronoLocalDate") G__1935)) (clojure.core/let [G__1935 ^"java.time.chrono.ChronoLocalDate" G__1935] (.until ^java.time.LocalDate this1934 G__1935)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^long [^java.time.LocalDate this1936 ^java.time.temporal.Temporal java-time-temporal-Temporal1937 ^java.time.temporal.TemporalUnit java-time-temporal-TemporalUnit1938] (.until this1936 java-time-temporal-Temporal1937 java-time-temporal-TemporalUnit1938)))
(clojure.core/defn of-epoch-day {:arglists (quote (["long"]))} (^java.time.LocalDate [^long long1939] (. java.time.LocalDate ofEpochDay long1939)))
(clojure.core/defn with-day-of-month {:arglists (quote (["java.time.LocalDate" "int"]))} (^java.time.LocalDate [^java.time.LocalDate this1940 ^java.lang.Integer int1941] (.withDayOfMonth this1940 int1941)))
(clojure.core/defn get-day-of-month {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.Integer [^java.time.LocalDate this1942] (jti/getter dayOfMonth this1942)))
(clojure.core/defn from {:arglists (quote (["java.time.temporal.TemporalAccessor"]))} (^java.time.LocalDate [^java.time.temporal.TemporalAccessor java-time-temporal-TemporalAccessor1943] (. java.time.LocalDate from java-time-temporal-TemporalAccessor1943)))
(clojure.core/defn is-after {:arglists (quote (["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))} (^java.lang.Boolean [^java.time.LocalDate this1944 ^java.time.chrono.ChronoLocalDate java-time-chrono-ChronoLocalDate1945] (.isAfter this1944 java-time-chrono-ChronoLocalDate1945)))
(clojure.core/defn is-supported {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"] ["java.time.LocalDate" "java.time.temporal.TemporalUnit"]))} (^java.lang.Boolean [this1946 G__1947] #? (:cljs (.isSupported ^java.time.LocalDate this1946 G__1947) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__1947)) (clojure.core/let [G__1947 ^"java.time.temporal.TemporalField" G__1947] (.isSupported ^java.time.LocalDate this1946 G__1947)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalUnit") G__1947)) (clojure.core/let [G__1947 ^"java.time.temporal.TemporalUnit" G__1947] (.isSupported ^java.time.LocalDate this1946 G__1947)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn minus-years {:arglists (quote (["java.time.LocalDate" "long"]))} (^java.time.LocalDate [^java.time.LocalDate this1948 ^long long1949] (.minusYears this1948 long1949)))
(clojure.core/defn get-chronology {:arglists (quote (["java.time.LocalDate"] ["java.time.LocalDate"]))} (^java.lang.Object [this1950] #? (:cljs (jti/getter chronology ^java.time.LocalDate this1950) :clj (clojure.core/cond (clojure.core/and) (clojure.core/let [] (jti/getter chronology ^java.time.LocalDate this1950)) (clojure.core/and) (clojure.core/let [] (jti/getter chronology ^java.time.LocalDate this1950)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn parse {:arglists (quote (["java.lang.CharSequence" "java.time.format.DateTimeFormatter"] ["java.lang.CharSequence"]))} (^java.time.LocalDate [^java.lang.CharSequence java-lang-CharSequence1951 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter1952] (. java.time.LocalDate parse java-lang-CharSequence1951 java-time-format-DateTimeFormatter1952)) (^java.time.LocalDate [^java.lang.CharSequence java-lang-CharSequence1953] (. java.time.LocalDate parse java-lang-CharSequence1953)))
(clojure.core/defn hash-code {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.Integer [^java.time.LocalDate this1954] (.hashCode this1954)))
(clojure.core/defn adjust-into {:arglists (quote (["java.time.LocalDate" "java.time.temporal.Temporal"]))} (^java.time.temporal.Temporal [^java.time.LocalDate this1955 ^java.time.temporal.Temporal java-time-temporal-Temporal1956] (.adjustInto this1955 java-time-temporal-Temporal1956)))
(clojure.core/defn with {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField" "long"] ["java.time.LocalDate" "java.time.temporal.TemporalField" "long"] ["java.time.LocalDate" "java.time.temporal.TemporalField" "long"] ["java.time.LocalDate" "java.time.temporal.TemporalAdjuster"] ["java.time.LocalDate" "java.time.temporal.TemporalAdjuster"] ["java.time.LocalDate" "java.time.temporal.TemporalAdjuster"]))} (^java.lang.Object [this1957 G__1958 G__1959] #? (:cljs (.with ^java.time.LocalDate this1957 G__1958 G__1959) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__1958) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1959)) (clojure.core/let [G__1958 ^"java.time.temporal.TemporalField" G__1958 G__1959 (clojure.core/long G__1959)] (.with ^java.time.LocalDate this1957 G__1958 G__1959)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__1958) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1959)) (clojure.core/let [G__1958 ^"java.time.temporal.TemporalField" G__1958 G__1959 (clojure.core/long G__1959)] (.with ^java.time.LocalDate this1957 G__1958 G__1959)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalField") G__1958) (clojure.core/instance? (java.lang.Class/forName "java.lang.Long") G__1959)) (clojure.core/let [G__1958 ^"java.time.temporal.TemporalField" G__1958 G__1959 (clojure.core/long G__1959)] (.with ^java.time.LocalDate this1957 G__1958 G__1959)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.lang.Object [this1960 G__1961] #? (:cljs (.with ^java.time.LocalDate this1960 G__1961) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__1961)) (clojure.core/let [G__1961 ^"java.time.temporal.TemporalAdjuster" G__1961] (.with ^java.time.LocalDate this1960 G__1961)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__1961)) (clojure.core/let [G__1961 ^"java.time.temporal.TemporalAdjuster" G__1961] (.with ^java.time.LocalDate this1960 G__1961)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.temporal.TemporalAdjuster") G__1961)) (clojure.core/let [G__1961 ^"java.time.temporal.TemporalAdjuster" G__1961] (.with ^java.time.LocalDate this1960 G__1961)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn now {:arglists (quote ([] ["java.time.Clock"] ["java.time.ZoneId"]))} (^java.time.LocalDate [] (. java.time.LocalDate now)) (^java.time.LocalDate [G__1963] #? (:cljs (. java.time.LocalDate now G__1963) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.Clock") G__1963)) (clojure.core/let [G__1963 ^"java.time.Clock" G__1963] (. java.time.LocalDate now G__1963)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.ZoneId") G__1963)) (clojure.core/let [G__1963 ^"java.time.ZoneId" G__1963] (. java.time.LocalDate now G__1963)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn at-start-of-day {:arglists (quote (["java.time.LocalDate" "java.time.ZoneId"] ["java.time.LocalDate"]))} (^java.time.ZonedDateTime [^java.time.LocalDate this1964 ^java.time.ZoneId java-time-ZoneId1965] (.atStartOfDay this1964 java-time-ZoneId1965)) (^java.time.LocalDateTime [^java.time.LocalDate this1966] (.atStartOfDay this1966)))
(clojure.core/defn get-month-value {:arglists (quote (["java.time.LocalDate"]))} (^java.lang.Integer [^java.time.LocalDate this1967] (jti/getter monthValue this1967)))
(clojure.core/defn with-day-of-year {:arglists (quote (["java.time.LocalDate" "int"]))} (^java.time.LocalDate [^java.time.LocalDate this1968 ^java.lang.Integer int1969] (.withDayOfYear this1968 int1969)))
(clojure.core/defn compare-to {:arglists (quote (["java.time.LocalDate" "java.lang.Object"] ["java.time.LocalDate" "java.time.chrono.ChronoLocalDate"]))} (^java.lang.Integer [this1970 G__1971] #? (:cljs (.compareTo ^java.time.LocalDate this1970 G__1971) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.lang.Object") G__1971)) (clojure.core/let [G__1971 ^"java.lang.Object" G__1971] (.compareTo ^java.time.LocalDate this1970 G__1971)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.chrono.ChronoLocalDate") G__1971)) (clojure.core/let [G__1971 ^"java.time.chrono.ChronoLocalDate" G__1971] (.compareTo ^java.time.LocalDate this1970 G__1971)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))))
(clojure.core/defn get-month {:arglists (quote (["java.time.LocalDate"]))} (^java.time.Month [^java.time.LocalDate this1972] (jti/getter month this1972)))
(clojure.core/defn of-year-day {:arglists (quote (["int" "int"]))} (^java.time.LocalDate [^java.lang.Integer int1973 ^java.lang.Integer int1974] (. java.time.LocalDate ofYearDay int1973 int1974)))
(clojure.core/defn get {:arglists (quote (["java.time.LocalDate" "java.time.temporal.TemporalField"]))} (^java.lang.Integer [^java.time.LocalDate this1975 ^java.time.temporal.TemporalField java-time-temporal-TemporalField1976] (.get this1975 java-time-temporal-TemporalField1976)))
(clojure.core/defn equals {:arglists (quote (["java.time.LocalDate" "java.lang.Object"]))} (^java.lang.Boolean [^java.time.LocalDate this1977 ^java.lang.Object java-lang-Object1978] (.equals this1977 java-lang-Object1978)))
(clojure.core/defn at-time {:arglists (quote (["java.time.LocalDate" "int" "int" "int" "int"] ["java.time.LocalDate" "java.time.OffsetTime"] ["java.time.LocalDate" "java.time.LocalTime"] ["java.time.LocalDate" "int" "int"] ["java.time.LocalDate" "java.time.LocalTime"] ["java.time.LocalDate" "int" "int" "int"]))} (^java.time.LocalDateTime [^java.time.LocalDate this1979 ^java.lang.Integer int1980 ^java.lang.Integer int1981 ^java.lang.Integer int1982 ^java.lang.Integer int1983] (.atTime this1979 int1980 int1981 int1982 int1983)) (^java.lang.Object [this1984 G__1985] #? (:cljs (.atTime ^java.time.LocalDate this1984 G__1985) :clj (clojure.core/cond (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.OffsetTime") G__1985)) (clojure.core/let [G__1985 ^"java.time.OffsetTime" G__1985] (.atTime ^java.time.LocalDate this1984 G__1985)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.LocalTime") G__1985)) (clojure.core/let [G__1985 ^"java.time.LocalTime" G__1985] (.atTime ^java.time.LocalDate this1984 G__1985)) (clojure.core/and (clojure.core/instance? (java.lang.Class/forName "java.time.LocalTime") G__1985)) (clojure.core/let [G__1985 ^"java.time.LocalTime" G__1985] (.atTime ^java.time.LocalDate this1984 G__1985)) :else (throw (java.lang.IllegalArgumentException. "no corresponding java.time method with these args"))))) (^java.time.LocalDateTime [^java.time.LocalDate this1986 ^java.lang.Integer int1987 ^java.lang.Integer int1988] (.atTime this1986 int1987 int1988)) (^java.time.LocalDateTime [^java.time.LocalDate this1989 ^java.lang.Integer int1990 ^java.lang.Integer int1991 ^java.lang.Integer int1992] (.atTime this1989 int1990 int1991 int1992)))
(clojure.core/defn format {:arglists (quote (["java.time.LocalDate" "java.time.format.DateTimeFormatter"]))} (^java.lang.String [^java.time.LocalDate this1993 ^java.time.format.DateTimeFormatter java-time-format-DateTimeFormatter1994] (.format this1993 java-time-format-DateTimeFormatter1994)))
(clojure.core/defn plus-years {:arglists (quote (["java.time.LocalDate" "long"]))} (^java.time.LocalDate [^java.time.LocalDate this1995 ^long long1996] (.plusYears this1995 long1996)))
(clojure.core/defn minus-days {:arglists (quote (["java.time.LocalDate" "long"]))} (^java.time.LocalDate [^java.time.LocalDate this1997 ^long long1998] (.minusDays this1997 long1998)))
