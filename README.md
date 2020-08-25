Design Consideration
--------------------
Singleton
1. Singleton class should have only one instance and static in nature.
2. Singleton class should provide global access to get the instance of the class

Prototype
1. New instance is created each time when requested.
2. Mainly used for stateful bean for maintaining different state

Limitations
-----------
Singleton
1. Dependencies are hidden 
2. Increase tight coupling
3. Unit Test become difficult

Prototype
1. Spring do not know the lifecycle of prototype bean.
2. Performance issue when perform loops in creating prototype beans.

Getting Started / Usage Guide
-----------------------------
1. Open the project with IntelliJ/Eclipse
2. Run MainApp.java
3. Expected log printing of Pet Project publish in media (Twitter, Hackernews, Reddit).