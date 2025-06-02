# 📱 Ứng dụng Android - Quản lý Hoạt động và Cộng đồng Sinh viên

Đây là ứng dụng Android được phát triển để hỗ trợ quản lý các hoạt động, tài liệu và thông tin cộng đồng cho sinh viên trong một môi trường học tập. Ứng dụng được chia thành **2 vai trò chính**: **Sinh viên (Người dùng)** và **Quản trị viên (Admin)**. Khi mở ứng dụng, người dùng cần đăng nhập để truy cập các chức năng tương ứng với vai trò của mình.

---

## 🔑 Chức năng chính

### 👩‍🎓 Giao diện và chức năng cho Sinh viên

- **Trang chủ (Home)**  
  - Hiển thị các bài đăng từ quản trị viên.  
  - Một số bài đăng kèm hoạt động mà sinh viên có thể đăng ký tham gia (nếu còn hạn).  
  - Nếu hoạt động đã hết hạn đăng ký, nút "Đăng ký" sẽ bị ẩn hoặc vô hiệu hóa.

- **Trang Group (Cộng đồng sinh viên)**  
  - Cho phép sinh viên đăng bài viết chia sẻ.  
  - Các bài viết có thể được thích (like) và bình luận, tương tự mạng xã hội nhưng đơn giản hơn.

- **Trang Tài liệu (Tài nguyên)**  
  - Hiển thị các tài liệu được đăng tải bởi quản trị viên.  
  - Cho phép sinh viên tải về các tài liệu này.

- **Trang Thông báo**  
  - Hiển thị các bài viết thông báo từ quản trị viên, bao gồm thông báo mới và cũ để tiện theo dõi.

- **Trang Cá nhân**  
  - Hiển thị thông tin cá nhân của sinh viên.  
  - Danh sách các hoạt động đã đăng ký kèm theo ngày bắt đầu và ngày kết thúc.  
  - Xác nhận đã tham gia hoạt động bằng cách chụp ảnh làm minh chứng mỗi lần tham gia.  
  - Đổi mật khẩu tài khoản.

> **Lưu ý:** Ứng dụng không có chức năng đăng ký tài khoản trực tiếp. Tài khoản (cả sinh viên và quản trị viên) sẽ được tạo thủ công bởi quản trị viên.

---

### 👨‍💻 Giao diện và chức năng cho Admin

- **Trang Đăng bài**  
  - Tạo bài đăng thông thường hoặc bài đăng có hoạt động để sinh viên đăng ký tham gia.  
  - Thiết lập thời gian kết thúc đăng ký cho hoạt động.

- **Trang Tài liệu**  
  - Đăng tải tài liệu để sinh viên tải về.

- **Quản lý Tài khoản sinh viên**  
  - Tạo, chỉnh sửa và xóa tài khoản sinh viên.  
  - Cấp quyền (admin hoặc người dùng).

> Tất cả các chức năng đều hỗ trợ cập nhật, chỉnh sửa hoặc xóa nội dung.

---

## 🛠️ Công nghệ sử dụng

- Android (Java/Kotlin)
- Firebase hoặc SQLite (tùy chọn)
- Thư viện xử lý hình ảnh: Glide hoặc Picasso (tùy chọn)

---

## 🚀 Hướng dẫn cài đặt

1. Clone repository:
   ```bash
   git clone [https://github.com/yourusername/yourprojectname.git](https://github.com/nguynbao/project_Tin_tuc_android)
