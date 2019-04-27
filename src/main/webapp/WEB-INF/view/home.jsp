<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>My Book Store</title>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/view/template/header.jsp"%>

<main role="main">

    <center>
        <h1>Spring MVC File Upload Demo</h1>
        <form method="post" action="uploadFile.do" enctype="multipart/form-data">
            <table border="0">
                <tr>
                    <td>Row number:</td>
                    <td><input type="text" name="description" size="50"/></td>
                </tr>
                <tr>
                    <td>Pick file #1:</td>
                    <td><input type="file" name="fileUpload" size="50000" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Upload" /></td>
                </tr>
            </table>
        </form>
    </center>

    <!-- FOOTER -->
    <%@include file="/WEB-INF/view/template/footer.jsp" %>
