<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<fmt:setLocale value="in_ID" scope="session"/>
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
        <div class="container flow-text">
            <div class="input-field">
                Plafond: <fmt:formatNumber groupingUsed="true" value="${kredit.plafond}" type="currency"/>
            </div>
            <div class="input-field">
                Bunga: ${kredit.bunga}
            </div>
            <div class="input-field">
                Jangka: ${kredit.jangka} / Bulan
            </div>
        </div>
        <br/>
        <div class="container">
            <table>
                <thead>
                    <tr>
                        <th>Ke</th>
                        <th>Jatuh Tempo</th>
                        <th>Angsuran Pokok</th>
                        <th>Angsuran Bunga</th>
                        <th>Total Angsuran</th>
                        <th>Baki</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${kredit.simulasi}" var="s">
                        <tr>
                            <th>${s.angsuranKe}</th>
                            <th>${s.jatuhTempo}</th>
                            <th><fmt:formatNumber groupingUsed="true" value="${s.angsuranPokok}" type="currency"/></th>
                            <th><fmt:formatNumber groupingUsed="true" value="${s.angsuranBunga}" type="currency"/></th>
                            <th><fmt:formatNumber groupingUsed="true" value="${s.totalAngsuran}" type="currency"/></th>
                            <th><fmt:formatNumber groupingUsed="true" value="${s.baki}" type="currency"/></th>
                        </tr>                        
                    </c:forEach>  
                    <tr>
                        <th>Total</th>
                        <th>&nbsp;</th>
                        <th><fmt:formatNumber groupingUsed="true" value="${grantTotalAngsuranPokok}" type="currency"/></th>
                        <th><fmt:formatNumber groupingUsed="true" value="${grantTotalAngsuranBunga}" type="currency"/></th>
                        <th><fmt:formatNumber groupingUsed="true" value="${grantTotalAngsuran}" type="currency"/></th>
                        <th>&nbsp;</th>
                    </tr>
                </tbody>
            </table>

        </div>
    </body>
</html>
