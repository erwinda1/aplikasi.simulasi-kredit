<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simulasi Kredit - PT. BPR Ukabima</title>
    </head>
    <body>
        <h1>Simulasi Kredit - PT. BPR Ukabima</h1>
        <ul>
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
    </body>
</html>
