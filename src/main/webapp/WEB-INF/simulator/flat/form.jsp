<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pengajuan Bunga jenis Flat</title>
    </head>
    <body>
    <f:form action="result" method="POST" commandName="flat">
        <div>
            <f:label path="plafond">Plafond</f:label>
            <f:input path="plafond"/>
        </div>
        <div>
            <f:label path="bunga">Bunga</f:label>
            <f:input path="bunga"/>
        </div>
        <div>
            <f:label path="jangka">Jangka</f:label>
            <f:input path="jangka"/>
        </div>
        <div>
            <input type="submit" value="Kirim"/>
        </div>
    </f:form>
</body>
</html>
