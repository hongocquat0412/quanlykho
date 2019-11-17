<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminLTE 3 | Dashboard</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Font Awesome -->
  <jsp:include page="header.jsp"/>
</head>
<body class="hold-transition sidebar-mini layout-fixed">
<div class="wrapper">
  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#"><i class="fas fa-bars"></i></a>
      </li>
    </ul>

    <!-- SEARCH FORM -->
    <form class="form-inline ml-3">
      <div class="input-group input-group-sm">
        <input class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
        <div class="input-group-append">
          <button class="btn btn-navbar" type="submit">
            <i class="fas fa-search"></i>
          </button>
        </div>
      </div>
    </form>

    <!-- Right navbar links -->
  </nav>
  <!-- /. navbar -->
  <!-- Main Sidebar Container -->
  	<jsp:include page="MainSidebar.jsp"/>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 class="m-0 text-dark">QUẢN LÝ PHIẾU NHẬP</h1>
          </div><!-- /.col -->
          <div class="col-sm-6">

          </div><!-- /.col -->
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content-header -->

    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="card card-primary">
          <div class="card-header">
            <h3 class="card-title">Thêm thông tin phiếu nhập</h3>
          </div>
          <!-- /.card-header -->
          <!-- form start -->
          <form role="form">
            <div class="card-body">
              <div class="form-group">
                <label for="inputDate">Ngày lập phiếu</label>
                <input type="date" class="form-control" id="inputDate">
              </div>
              <!--table product-->
              <div class="row">
                <div class="col-sm-12 col-md-6">
                  <strong>* Danh sách sản phẩm</strong>
                  <table id="productList" class="table table-bordered table-striped">
                    <thead>
                    <tr>
                      <th>ID</th>
                      <th>Tên sản phẩm</th>
                      <th>Giá</th>
                      <th>Đơn vị đếm</th>
                      <th>Thêm vào phiếu nhập</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                      <td>1</td>
                      <td>Súng AK47</td>
                      <td>1000000</td>
                      <td>Cái</td>
                      <td><button type="button" onclick="addProduct('1','Súng AK47','1000000','Cái')" style="height: 40px;" class="btn btn-info">>></button></td>
                    </tr>
                    <tr>
                      <td>2</td>
                      <td>Lựu đạn</td>
                      <td>250000</td>
                      <td>Quả</td>
                      <td><button type="button" onclick="addProduct('2','Lựu đạn','250000','Quả')" style="height: 40px;" class="btn btn-info">>></button></td>
                    </tr>
                  </table>
                </div>
                <div class="col-sm-12 col-md-6">
                    <strong>* Thêm vào phiếu nhập</strong>
                  <table id="inputProducts" class="table table-bordered table-striped">
                    <thead>
                    <tr>
                      <th>ID</th>
                      <th>Tên sản phẩm</th>
                      <th>Giá</th>
                      <th>Đơn vị đếm</th>
                      <th>Số lượng</th>
                      <th>Xóa</th>
                    </tr>
                    </thead>
                  </table>
                </div>
              </div>

              <!-- ./ tablel-->
            <!-- /.card-body -->
            <div class="card-footer">
              <button type="submit" class="btn btn-primary">Submit</button>
            </div>
            </div>
          </form>
        </div>
      </div><!-- /.container-fluid -->
      <!--List Products -->
      <div class="card card-primary">
        <div class="card-header">
          <h3 class="card-title">Danh sách phiếu nhập</h3>
        </div>
        <!-- /.card-header -->
        <div class="card-body">
          <div class="row">

            <div class="col-sm-12 col-md-6">
              <div id="example1_filter" class="dataTables_filter">
                <label>Search:
                  <input type="search" class="form-control form-control-sm" placeholder="" aria-controls="example1">
                </label>
              </div>
            </div>
          </div>
          <table id="example1" class="table table-bordered table-striped">
            <thead>
            <tr>
              <th>ID</th>
              <th>Ngày lập phiếu</th>
              <th>Tổng số tiền</th>
              <th>Sửa</th>
              <th>Xóa</th>
            </tr>
            </thead>
            <tbody>
            <tr>
              <td>1</td>
              <td>10/10/2016</td>
              <td>150000</td>
              <td><a href="update.html"><p>Sửa</p></a></td>
              <td><a href="#"><p>Xóa</p></a></td>
            </tr>
            <tr>
              <td>2</td>
              <td>15/2/2017</td>
              <td>600000</td>
              <td><a href="update.html"><p>Sửa</p></a></td>
              <td><a href="#"><p>Xóa</p></a></td>
            </tr>
          </table>
        </div>
        <!-- /.card-body -->
      </div>
      <!--end List Products -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
	<jsp:include page="footer.jsp"/>
</body>
</html>

