<div class="container">
	<div class="row">

		<!-- side bar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>

		</div>
		<!-- Display Events -->

		<div class="col-md-9">
			<!-- Added breadcrumb componet -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllEvents == true}">
						<ol class="breadcrumb">
							<li><a href="${ContextRoot}/home">Home</a></li>
							<li class="active">All Events</li>
						</ol>
					</c:if>
					
					<c:if test="${userClickCategryEvents == true}">
						<ol class="breadcrumb">
							<li><a href="${ContextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>
				</div>
			</div>
		</div>
	</div>
</div>