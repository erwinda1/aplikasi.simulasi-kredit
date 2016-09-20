<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<c:url value="/webjars/materializecss/0.97.5/css/materialize.min.css" />"/>
        <script type="text/javascript" src="<c:url value="/webjars/jquery/2.1.1/jquery.min.js" />" ></script>
        <script type="text/javascript" src="<c:url value="/webjars/materializecss/0.97.5/js/materialize.min.js" />" ></script>
        <script type="text/javascript">
            $(".dropdown-button").dropdown();
        </script>
    </head>
    <body>
        <ul id="dropdown1" class="dropdown-content">
            <li>
                <a href="<s:url value="/simulator/flat/form"/>">Jenis Bunga Flat</a>
            </li>
            <li>
                <a href="<s:url value="/simulator/anuitas/form"/>">Jenis Bunga Efektif Anuitas</a>
            </li>
            <li>
                <a href="<s:url value="/simulator/efektif/form"/>">Jenis Bunga Efektif</a>
            </li>
        </ul>
        <nav class="teal accent-4">
            <div class="nav-wrapper container">
                <a href="<s:url value="/"/>" class="brand-logo">PT. Ukabima Group</a>
                <ul class="right hide-on-med-and-down">
                    <!-- Dropdown Trigger -->
                    <li><a class="dropdown-button" href="#!" data-activates="dropdown1">Simulasi Kredit</a></li>
                </ul>
            </div>
        </nav>
        <br/>
        <div class="row container">
            <f:form action="result" method="POST" commandName="kredit">
                <div class="input-field col s12 m6">
                    <f:input path="plafond"/>
                    <f:label path="plafond">Jumlah Pinjaman</f:label>
                </div>
                <div class="input-field col s12 m2">
                    <f:input path="bunga"/>
                    <f:label path="bunga">Bunga</f:label>
                </div>
                <div class="input-field col s12 m4">
                    <f:label path="jangka">Jangka</f:label>
                    <f:input path="jangka"/>
                </div>

                <button class="btn waves-effect waves-light" type="submit" name="action">Kirim</button>
            </f:form>            
        </div>
    </body>
</html>
