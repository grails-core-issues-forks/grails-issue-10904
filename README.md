# Grails Issue 10904 #

This sample project reproduces [https://github.com/grails/grails-core/issues/10904](https://github.com/grails/grails-core/issues/10904)

Start the application go to `http://localhost:8080/` and click on both "Example V1" and Example V2 links. Every link
should point to a different controller and render `index - v1` and `index - v2` but both render `index - v1` because of
the namespace in the controllers.

Changing the actual version to the one commented out in the two controllers, index.gsp and URL Mappings "fixes" the
problem because the namespace is generated as `v1` and `v2` instead of `example`. To fix the issue the namespaces should
be generated with the `.`
