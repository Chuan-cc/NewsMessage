package dao;

import domain.Customer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao {
    @Insert("insert into customerInfo Values(0,#{usname},#{gender},#{birthday},#{phone_number},#{pswd})")
    public void save(Customer customer);
    @Update("update customerInfo set usname=#{usname},gender=#{gender},birthday=#{birthday},phone_number=#{phone_number},pswd=#{pswd} where id=#{id};")
    public void update(Customer customer);
    @Delete("delete from customerInfo where id=#{id}")
    public void delete(Integer id);
    @Select("select * from customerInfo where id=#{id};")
    public Customer getById(Integer id);
    @Select("select id from customerInfo where usname=#{usname} and gender=#{gender} and birthday=#{birthday} and phone_number=#{phone_number} and pswd=#{pswd};")
    public Customer getId(Customer customer);
    @Select("select * from customerInfo;")
    public List<Customer> getAll();
}
