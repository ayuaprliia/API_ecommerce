# API_ecommerce

Backend API untuk E-commerce sederhana merupakan sistem yang dapat digunakan untuk melakukan pemrosesan dari request yang diberikan oleh sender. API ini terdiri atas berbagai endpoint dan fungsi yang berfungsi untuk mengatur users, product, orders, order details, dan reviews yang ada di dalam database E-commerce. 
 Untuk membuat suatu API bagi E-commerce sederhana, dibutuhkan beberapa software pendukung seperti JDK, Intellij dan SQLite, dan beberapa library pendukung seperti “doten-java”, “jdbc-sqlite’, dan “json” yang nantinya disimpan di dalam JAR Directory. Pengujian dari API ini dilakukan pada aplikasi POSTMAN dengan forman JSON. Format JSON (JavasScript Object Notation) adalah format file berbentuk teks yang umum digunakan untuk proses pertukaran data antar server. 
Berikut merupakan beberapa fitur dan endpoints yang digunakan pada program ini.
A.	Users
Users menyimpan segala informasi yang berkaitan dengan pengguna dari E-commerce. Data-data yang disimpan di dalam users ini adalah id_users, first_name, last_name, email, phone_number, dan type (buyer atau seller). 
-	Untuk menampilkan atau mengambil semua data dari users : GET/8030/users
-	Menampilkan data users berdasarkan id_user = GET/8030/users/1001 (menampilkan data users dengan id_user= 1001).
-	Membuat data users baru : POST/8030/users (pada bagian body dapat menuliskan data dari users baru yang ingin ditambahkan, kemudian klik SEND pada POSTMAN)
-	Melakukan update pada data users= PUT/8030/users/1001 (melakukan update pada user dengan id_user=1001).
-	Menghapus salah satu data dari users= DELETE/8030/users/1001 (menghapus data dari users dengan id_user=1001).
-	Menambahkan addresses pada users= POST/8030/users/addresses

B.	Products
Products menyimpan data-data dari produk yang ada di dalam E-commerce. 
-	Untuk menampilkan atau mengambil semua data dari products : GET/8030/products
-	Menampilkan data products berdasarkan id_product = GET/8030/products/2001 (menampilkan data users dengan id_product= 2001).
-	Membuat data products baru: POST/8030/products (pada bagian body dapat menuliskan data dari products baru yang ingin ditambahkan, kemudian klik SEND pada POSTMAN)
-	Melakukan update pada data prodcts= PUT/8030/products/2001 (melakukan update pada products dengan id_product=2001).
-	Menghapus salah satu data dari products= DELETE/8030/products/2001 (menghapus data dari producs dengan id_product=2001).

C.	Orders
Orders berisikan informasi mengenai kegiatan transaksi yang dilakukan oleh users. Terdapat informasi berupa id_order, id_user, note, total, discount, dan is_paid yang menandai apakah pesanan yang dibuat sudah dibayar atau belum.
-	Untuk menampilkan atau mengambil semua data dari orders : GET/8030/orders
-	Menampilkan data orders berdasarkan id_order= GET/8030/orders/3001 (menampilkan data users dengan id_order= 3001).
-	Membuat data orders baru: POST/8030/orders (pada bagian body dapat menuliskan data dari orders baru yang ingin ditambahkan, kemudian klik SEND pada POSTMAN)
-	Melakukan update pada data orders= PUT/8030/orders/3001 (melakukan update pada orders dengan id_order=3001).
-	Menghapus salah satu data dari orders= DELETE/8030/orders/3001 (menghapus data dari orders dengan id_order=3001).

D.	Order Details
Order details berisi detail dari masing-masing kegiatan transaksi atau order yang dilakukan oleh user. Di dalam order details, disimpan informasi mengenai id_order, id_product, quantity, dan price.
-	Untuk menampilkan atau mengambil data dari order_details : GET/8030/orderDetails/3001 (menampilkan order_details dengan id_order=3001)
-	Membuat data order_details baru : POST/8030/orderDetails (pada bagian body dapat menuliskan data dari order_details baru yang ingin ditambahkan, kemudian klik SEND pada POSTMAN)
-	Melakukan update pada data order_details= PUT/8030/orderDetails/3001 (melakukan update pada order_details dengan id_order=3001).
-	Menghapus salah satu data dari order_details= DELETE/8030/orderDetails/3001 (menghapus data dari order_details dengan id_order=3001).

E.	Reviews
Reviews berisikan data-data megenai ulasan yang diberikan oleh users atas barang yang diterimanya. Di dalam reviews terdapat id_order, star, dan description.
-	Untuk menampilkan atau mengambil semua data dari reviews: GET/8030/reviews/3001 (menampilkan data dari reviews dengan id_order=3001).
-	Membuat data reviews baru : POST/8030/reviews (pada bagian body dapat menuliskan data dari reviews baru yang ingin ditambahkan, kemudian klik SEND pada POSTMAN)
-	Melakukan update pada data reviews= PUT/8030/reviews/3001 (melakukan update pada reviews dengan id_order=3001).
-	Menghapus salah satu data dari reviews= DELETE/8030/reviews/3001 (menghapus data dari reviewa dengan id_order=3001).
Penjelasan di atas merupaka  beberapa fungsi dan endpoints yang terdapat di dalam program API_ecommerce ini. 8030 menandakan port yang digunakan di dalam program dan dapat diubah nilainya.



