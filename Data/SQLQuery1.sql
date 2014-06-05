select tblSinhVien.fldmasv, tblLop.fldMaLop ,tblMonHoc.fldMaMH, tblDiem.fldLanThi, tblDiem.fldHeSo,
tblDiem.fldDiem, tblDiem.fldTrangThai from tblSinhVien inner join tblLop 
on tblSinhVien.fldMaLop = tblLop.fldMaLop
inner join tblDiem on tblSinhVien.fldmasv = tblDiem.fldmasv
inner join tblMonHoc on tblDiem.fldMaMH = tblMonHoc.fldMaMH 
and tblDiem.fldMaSV ='45'

select tblLop.fldMaLop 
from tblSinhVien inner join tblLop 
on tblSinhVien.fldMaLop = tblLop.fldMaLop
inner join tblDiem on tblSinhVien.fldmasv = tblDiem.fldmasv
inner join tblMonHoc on tblDiem.fldMaMH = tblMonHoc.fldMaMH 
and tblDiem.fldMaSV ='45'



update tblDiem set fldHeSo ='1',fldDiem ='5',fldTrangThai='true' where fldMaSV ='12313' and fldMaMH ='MH002' and fldLanThi='1'
