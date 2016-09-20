<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<fmt:setLocale value="in_ID" scope="session"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div>
            <div>
                Plafond: <fmt:formatNumber groupingUsed="true" value="${kredit.plafond}" type="currency"/>
            </div>
            <div>
                Bunga: ${kredit.bunga}
            </div>
            <div>
                Jangka: ${kredit.jangka} / Bulan
            </div>
        </div>
        <div>
            <table border="1">
                <thead>
                    <tr>
                        <th>Angsuran Ke</th>
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
