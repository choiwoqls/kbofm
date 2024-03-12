package dao.team;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.team.TeamVO;

public class TeamDAO {
	
	private SqlSession sqlSession;
	
	public TeamDAO(SqlSession sqlSession) {
		this.sqlSession=sqlSession;
	}
	
	public List<TeamVO> teamSelect(){
		return sqlSession.selectList("teamSelect");
	}

}
