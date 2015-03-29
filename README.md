# Securing Mule HTTP endpoints using Spring Security with a JDBC provider

This is an example of how to use a Spring Security in Mule with a JDBC provider to secure the Mule HTTP endpoints.

Due a bug in Mule 3.6.1 to use this example, you must copy the MySql jar to

**If you are using the Anypoint Studio:**
```
<MULE_STUDIO_PATH>/AnypointStudio/plugins/org.mule.tooling.server.3.x.xxxx/mule/lib/mule
```
**Or in a Standalone Mule:**
```
<MULE_PATH>/mule-standalone-3.x.0/lib/mule
```

(ref: http://stackoverflow.com/questions/29312361/configure-spring-security-in-mule-using-jdbc-provider/29321637#29321637)
