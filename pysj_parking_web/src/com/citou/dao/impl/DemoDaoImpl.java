package com.citou.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.citou.dao.DemoDao;
import com.citou.model.DemoModel;

@Repository
public class DemoDaoImpl extends JdbcDaoSupport implements DemoDao {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void setDatasource(DataSource dataSource) {
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(
				dataSource);
		setDataSource(dataSource);
	}

	private static final BeanPropertyRowMapper<DemoModel> rowMapper = new BeanPropertyRowMapper<DemoModel>(
			DemoModel.class);

	static {
		rowMapper.setPrimitivesDefaultedForNullValue(true);
	}

	private static final String LOAD_JOB_DETAIL_INFO = "select j.* from info as j where j.id=? ";


	public DemoModel query(int jid) {

		DemoModel detail = null;
		List<DemoModel> result = this.getJdbcTemplate().query(LOAD_JOB_DETAIL_INFO, new Object[] { jid }, rowMapper);

		detail = result.get(0);
		return detail;
	}

	private static String UPDATE_JOB_INFO="";
	public void update()
	{
		int ret = -1;
		try {
			ret = this.getJdbcTemplate().update(UPDATE_JOB_INFO,
					new Object[] { });
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (ret > 0)
		{
			//TODO:添加正常返回逻辑
		}
	}


	@Override
	public String getResult() {

		//TODO:这里添加访问数据库的逻辑
		return "this a example of ajax get";
	}
}
