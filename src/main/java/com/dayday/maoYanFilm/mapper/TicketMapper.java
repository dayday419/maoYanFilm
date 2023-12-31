package com.dayday.maoYanFilm.mapper;

import com.dayday.maoYanFilm.pojo.Ticket;
import com.dayday.maoYanFilm.pojo.TicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TicketMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int countByExample(TicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int deleteByExample(TicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int deleteByPrimaryKey(Integer filmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int insert(Ticket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int insertSelective(Ticket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    List<Ticket> selectByExample(TicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    Ticket selectByPrimaryKey(Integer filmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int updateByExampleSelective(@Param("record") Ticket record, @Param("example") TicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int updateByExample(@Param("record") Ticket record, @Param("example") TicketExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int updateByPrimaryKeySelective(Ticket record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticket
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int updateByPrimaryKey(Ticket record);
}