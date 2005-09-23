<%@ include file="/taglibs.jsp" %>

<div class="sidebarFade">
    <div class="menu-tr">
        <div class="menu-tl">
            
            <h3><fmt:message key="mainPage.actions" /></h3>
            <hr size="1" noshade="noshade" />
            
			<%-- Add Category link --%>
			<p>
            <img src='<c:url value="/images/FolderNew16.png"/>' border="0"alt="icon" />
			<roller:link page="/editor/categoryEdit.do">
			    <roller:linkparam id="<%= RollerRequest.PARENTID_KEY %>"
			         name="category" property="id" />
			    <fmt:message key="categoriesForm.addCategory" />
			</roller:link>
			</p>
			
			<br />
			
        </div>
    </div>
</div>			
