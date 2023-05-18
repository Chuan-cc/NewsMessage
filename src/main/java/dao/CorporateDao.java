package dao;

import domain.Corporate;
import domain.Customer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CorporateDao {
    @Insert("insert into corporateInfo Values(0,#{company_name},#{writename},#{phone_number},#{pswd})")
    public void save(Corporate corporate);
    @Update("update corporateInfo set company_name=#{company_name},writename=#{writename},phone_number=#{phone_number},pswd=#{pswd} where id=#{id};")
    public void update(Corporate corporate);
    @Delete("delete from corporateInfo where id=#{id}")
    public void delete(Integer id);
    @Select("select * from corporateInfo where id=#{id};")
    public Corporate getById(Integer id);
    @Select("select * from corporateInfo where company_name=#{company_name} and writename=#{writename} and phone_number=#{phone_number} and pswd=#{pswd};")
    public Corporate getId(Corporate corporate);
    @Select("select * from corporateInfo;")
    public List<Corporate> getAll();
}
