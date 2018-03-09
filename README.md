Since 2016, thanks to Mike Nygard, I've been having so much fun programming in Clojure and ClojureScript.  Because of the discipline it forces upon the programmer about immutability and functional programming, I've become a much better programmer.

For the first time in decades, I've been able to write programs that grow over time that don't collapse under their own weight, due to my sloppiness, mixing of concerns, poor choice of class structure, global variables, and so forth.

While it's been fun writing larger programs in Clojure, it's always seemed to be less suited for smaller ad hoc tasks, such as maniuplating text files, counting string occurrences, etc.  Back in the day, we probably wrote these in awk, sed, grep, etc.  Then later with perl, ruby, python...

I've never attempted to do them in Clojure until recently.  Part of it is the slower startup times associated with Clojure/JVM and the longer compile times associated with ClojureScript. 

But, there's a new variant of "self-hosted ClojureScript," such as Planck and Lumo. They have the instantaneous startup times and execution speed that feel just like perl/ruby/python.  They do this by compiling and running ClojureScript entirely within a JavaScript virtual machine: Planck uses the MacOS JavaScriptCore that powers Safari; Lumo uses the Node.js and V8 JavaScript virtual machine that powers Google Chrome.

For the programmer, it means that you can run `planck script.cljs` or `lumo script.cljs`, and it runs as fast as you'd expect a ruby script to run.

Last week, I had fun writing a short program Lumo/ClojureScript that calculated word frequencies so that I could create word clouds for the 90K word Beyond The Phoenix Project manuscript.  (Link)

What it showed me was that you can now quickly and easily use Clojure to write small disposable scripts.  So now I'm using Clojure for large programs and small.

Until now, since 2007, I've been using ruby for tasks like this.  I often referred to the [Ruby One-Liners](http://reference.jumpingmonkey.org/programming_languages/ruby/ruby-one-liners.html), because it often showed me how to do various operations, without having to read a bunch of manuals.

I wanted to write the ClojureScript equivalents, mostly so I could use it as a similar type of reference.

I hope this might be useful to a whole new gruop that would like to try Clojure!

Cheers,
Gene





