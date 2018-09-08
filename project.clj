(defproject co.chatterbox/valuehash "0.1.2"
  :description "Value based hashing for Clojure data"
  :dependencies [[org.clojure/clojure "1.9.0" :scope "provided"]
                 [org.clojure/test.check "0.10.0-alpha3" :scope "test"]
                 [criterium "0.4.4" :scope "test"]]
  :repositories [["chatterbox" {:url      "https://chatterbox.jfrog.io/chatterbox/java"
                                :username "machine" :password "machine"}]]

  :deploy-repositories [["snapshots" {:url           "https://chatterbox.jfrog.io/chatterbox/libs-snapshot-local/"
                                      :username      "machine" :password "machine"
                                      :sign-releases false}]
                        ["releases" {:url           "https://chatterbox.jfrog.io/chatterbox/libs-release-local/"
                                     :username      "machine" :password "machine"
                                     :sign-releases false}]])