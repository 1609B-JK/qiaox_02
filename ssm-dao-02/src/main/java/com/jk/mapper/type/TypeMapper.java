package com.jk.mapper.type;

import com.jk.entity.type.MovieTypeResponse;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by DELL on 2017/5/25.
 */
public interface TypeMapper {

    @Select("select t_id as \"typeID\", t_name as \"typeName\", 'http://' as \"typeLink\" from t_movie_types where t_id > 0")
    List<MovieTypeResponse> selectMovieTypeList();
}
