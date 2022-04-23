<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <!-- <link rel="stylesheet" href="css/search.css"> -->
 <style type="text/css">
 * {
  margin: 0;
  padding: 0;
  background: #6C7A86;
  font-family: sans-serif;
}

.search-box {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%,-50%);
  background: black;
  height: 50px;
  border-radius: 50px;
  padding: 10px;
}

.search-btn {
  color: white;
  float: right;
  width: 50px;
  height: 50px;
  border-radius: 50%;
  background: black;
  display: flex;
  justify-content: center;
  align-items: center;
  transition: 2s;
}

.fa-search {
  background: black;
  font-size: 24px;
}

.search-input {
  border: none;
  background: none;
  outline: none;
  float: left;
  padding: 0;
  color: white;
  font-size: 20px;
  transition: 0.4s;
  line-height: 50px;
  width: 0;
}

.search-box:hover > .search-input {
  width: 250px;
  padding: 0 7px;
}

 
 </style>
<meta charset="UTF-8">
<title>Search View</title>
</head>
<body>
<form action="search"	>
<div class="search-box">

  <input class="search-input" type="text" name="searchbox" placeholder="Search">
  <button class="search-btn">
    <i class="fas fa-search"></i>
  </button>     

</div>
</form>
</body>
<script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>


</html>