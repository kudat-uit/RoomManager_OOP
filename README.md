# Room Manager - OOP - Lập trình hương đối tượng
## Hãy sử dụng kiến thức lập trình hướng đối tượng để quản lý cơ sở vật chất trường ĐH, biết rằng các phòng đều có các thông tin: 
- Tên
- Tầng
- Số phòng
- Sức chứa


Trường có 3 loại phòng:  
1. Lý thuyết: có thêm thuộc tinh có máy lạnh hoặc không (ID 1) 
2. Thực hành: có thêm thuộc tinh số lượng máy tính (ID 2)
3. Giảng đường: có thêm thuộc tinh số lượng máy chiếu (ID 3)


Nhập vào n, danh sách n phòng của trường trên n dòng và thông số k. Sau đó, tính tổng sức chứa và tìm phòng khít nhất (ưu tiên lầu thấp, số phòng thấp) nhất với sức chứa k (nếu không có in ra NULL).

Input:

[số phòng]

[loại] [tên] [tầng] [số phòng] [sức chứa] [thông tin khác]

...

[sức chứa k]

Output:

[tổng sức chứa]

[tên phòng khít nhất]

>**Input Format**

int

int string int int int int

...

int
**Constraints**

*No constrains*

>**Output Format**
int
string
>**Sample Input 0**
<br />5
<br />1 P101 1 1 50 1
<br />1 P102 1 2 100 0
<br />2 PM1 2 1 50 40
<br />3 GD1 1 3 200 2
<br />1 PM2 3 1 100 40
<br />60


>**Sample Output 0**
<br />500
<br />P102
