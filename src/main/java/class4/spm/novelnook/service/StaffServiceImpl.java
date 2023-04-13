package class4.spm.novelnook.service;

import class4.spm.novelnook.mapper.StaffMapper;
import class4.spm.novelnook.pojo.Book;
import class4.spm.novelnook.pojo.Patron;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    StaffMapper staffMapper;

    // 获取所有patron信息  具体实现
    public List<Patron> getAllPatrons() {
        return staffMapper.getAllPatrons();
    }

    //根据userid获取patron信息 具体实现
    @Override
    public Patron getPatronById(String userid) {
        return staffMapper.getPatronById(userid);
    }

    //根据bookid获取书信息 具体实现
    @Override
    public Book getBookById(String bookid) {
        return staffMapper.getBookById(bookid);
    }


}