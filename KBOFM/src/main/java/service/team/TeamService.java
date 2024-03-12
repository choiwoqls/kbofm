package service.team;

import java.util.List;

import dao.team.TeamDAO;
import vo.team.TeamVO;

public class TeamService {
	
	private TeamDAO teamDao;
	
	public TeamService(TeamDAO teamDao) {
		this.teamDao=teamDao;
	}

	public List<TeamVO> teamSelect(){
		return teamDao.teamSelect();
	}
	
}
