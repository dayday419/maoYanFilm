package com.dayday.maoYanFilm.mapper;

import com.dayday.maoYanFilm.pojo.Film;
import com.dayday.maoYanFilm.pojo.FilmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilmMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int countByExample(FilmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int deleteByExample(FilmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int deleteByPrimaryKey(Integer filmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int insert(Film record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int insertSelective(Film record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    List<Film> selectByExample(FilmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    Film selectByPrimaryKey(Integer filmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int updateByExampleSelective(@Param("record") Film record, @Param("example") FilmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int updateByExample(@Param("record") Film record, @Param("example") FilmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int updateByPrimaryKeySelective(Film record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film
     *
     * @mbggenerated Sat Aug 12 15:50:47 CST 2023
     */
    int updateByPrimaryKey(Film record);
}