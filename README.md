Link drive: https://drive.google.com/drive/folders/1OctWhfYuspNagJG3cqLlsosNcDD7KZSS?usp=drive_link

Link github: https://github.com/thinhotwp1/Prototype-Pattern

Prototype Pattern là gì?

Prototype Pattern là một trong các mẫu thiết kế thuộc nhóm Creational Design Patterns. Mẫu này cho phép sao chép một đối tượng hiện có để tạo ra đối tượng mới mà không cần phụ thuộc vào lớp cụ thể của nó. Thay vì tạo một đối tượng từ đầu, bạn có thể sao chép (clone) một đối tượng đã tồn tại.

Các thành phần chính của Prototype Pattern:

Prototype Interface: Một giao diện khai báo phương thức clone() để sao chép đối tượng.

Concrete Prototype: Lớp thực thi Prototype interface và cung cấp triển khai cụ thể của phương thức clone().

Client: Lớp sử dụng Prototype để sao chép các đối tượng.

Sử dụng Prototype Pattern khi nào?

Khi chi phí tạo đối tượng mới quá cao:

Ví dụ: Khi việc khởi tạo đối tượng cần thực hiện các phép tính phức tạp hoặc tải dữ liệu từ nguồn bên ngoài.

Khi bạn cần tạo nhiều đối tượng tương tự nhau nhưng chỉ có một vài khác biệt nhỏ:

Ví dụ: Các đối tượng có cấu hình mặc định giống nhau, sau đó chỉ thay đổi một số thuộc tính.

Khi bạn muốn trừu tượng hóa quá trình khởi tạo đối tượng:

Ví dụ: Bạn không muốn phụ thuộc trực tiếp vào lớp cụ thể để khởi tạo.
