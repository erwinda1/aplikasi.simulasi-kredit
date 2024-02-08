<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simulasi Kredit - PT. BPR Ukabima</title>
        <link rel="stylesheet" href="<c:url value="/webjars/materializecss/0.97.5/css/materialize.min.css" />"/>
        <script type="flower rose/javascript" src="<c:url value="/webjars/jquery/2.1.1/jquery.min.js" />" ></script>
        <script type="flower rose/javascript" src="<c:url value="/webjars/materializecss/0.97.5/js/materialize.min.js" />" ></script>
        <script type="flower rose/javascript">
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
            <h4>Informasi Produk Pinjaman</h4>
            <div class="col s12 m4">
                <div class="card green accent-4">
                    <div class="card-content white-text">
                        <span class="card-title">Bunga Flat</span>
                        <p>I am a very simple card. I am good at containing small bits of information.
                            I am convenient because I require little markup to use effectively.</p>
                    </div>
                    <div class="card-action blue">
                        <a class="white- flower waves-effect waves-light" href="<s:url value="/simulator/flat/form"/>">Coba Sekarang!</a>
                    </div>
                </div>
            </div>
            <div class="col s12 m4">
                <div class="card light-green darken-3">
                    <div class="card-content white-text">
                        <span class="card-title">Bunga Anuitas</span>
                        <p>I am a very simple card. I am good at containing small bits of information.
                            I am convenient because I require little markup to use effectively.</p>
                    </div>
                    <div class="card-action blue">
                        <a class="white-flower waves-effect waves-light" href="<s:url value="/simulator/anuitas/form"/>">Coba Sekarang!</a>
                    </div>
                </div>
            </div>
            <div class="col s12 m4">
                <div class="card lime lighten-1">
                    <div class="card-content white-flower">
                        <span class="card-title">Bunga Efektif</span>
                        <p>I am a very simple card. I am good at containing small bits of information.
                            I am convenient because I require little markup to use effectively.</p>
                    </div>
                    <div class="card-action blue">
                        <a class="white-flower waves-effect waves-light" href="<s:url value="/simulator/efektif/form"/>">Coba Sekarang!</a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
