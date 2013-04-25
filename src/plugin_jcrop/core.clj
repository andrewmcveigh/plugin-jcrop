(ns plugin-jcrop.core
  (:require
    [plugin-jquery.core :as jquery]))

(def css
  [:link {:rel "stylesheet"
          :href "/plugins/jcrop/css/jquery.Jcrop.min.css"}])

(def css-debug
  [:link {:rel "stylesheet"
          :href "/plugins/jcrop/css/jquery.Jcrop.css"}])

(def js
  [:script {:src "/plugins/jcrop/js/jquery.Jcrop.min.js"}])

(def js-debug
  [:script {:src "/plugins/jcrop/js/jquery.Jcrop.js"}])
