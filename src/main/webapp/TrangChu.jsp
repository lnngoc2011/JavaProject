<%@ page import="banhmodal.Banh"%>
<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Danh sách bánh</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f5f5f5;
        }

        .container {
            max-width: 1200px;
            margin: 0 auto;
        }

        .grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(250px, 1fr));
            gap: 20px;
            padding: 20px;
        }

        .product-card {
            background: white;
            border-radius: 8px;
            padding: 15px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
            transition: transform 0.2s;
        }

        .product-card:hover {
            transform: translateY(-5px);
            box-shadow: 0 4px 8px rgba(0,0,0,0.2);
        }

        .product-image {
            width: 100%;
            height: 200px;
            object-fit: cover;
            border-radius: 4px;
            margin-bottom: 10px;
        }

        .product-info {
            padding: 10px 0;
        }

        .product-name {
            font-size: 1.1em;
            font-weight: bold;
            color: #333;
            margin: 8px 0;
        }

        .product-id {
            color: #666;
            font-size: 0.9em;
            margin: 5px 0;
        }

        .product-price {
            color: #e44d26;
            font-weight: bold;
            font-size: 1.2em;
            margin: 8px 0;
        }

        .product-quantity {
            color: #4CAF50;
            font-size: 0.9em;
        }

        .no-data {
            grid-column: 1 / -1;
            text-align: center;
            padding: 20px;
            background: white;
            border-radius: 8px;
            color: #666;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="grid">
        <%
        ArrayList<Banh> ds = (ArrayList<Banh>) request.getAttribute("ds");
        
        if (ds == null || ds.isEmpty()) {
        %>
            <div class="no-data">Không có dữ liệu</div>
        <%
        } else {
            for (Banh tt : ds) {
        %>
            <div class="product-card">
                <img src="<%= tt.getAnh() %>" alt="<%= tt.getTenbanh() %>" class="product-image">
                <div class="product-info">
                    <div class="product-name"><%= tt.getTenbanh() %></div>
                    <div class="product-id">Mã bánh: <%= tt.getMabanh() %></div>
                    <div class="product-id">Mã loại: <%= tt.getMaloai() %></div>
                    <div class="product-price"><%= String.format("%,d", tt.getGia()) %> đ</div>
                    <div class="product-quantity">Số lượng: <%= tt.getSoluong() %></div>
                </div>
            </div>
        <%
            }
        }
        %>
    </div>
</div>
</body>
</html>