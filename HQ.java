package AlexTeam;

import battlecode.common.Direction;
import battlecode.common.RobotController;
import battlecode.common.RobotType;

public class HQ {

	public RobotController rc;
	
	public HQ(RobotController rc) {
		this.rc = rc;
	}
	
	public void run() throws Exception {
		while (true) {
		if (rc.isCoreReady() && rc.canSpawn(Direction.NORTH, RobotType.BEAVER)) {
			rc.spawn(Direction.NORTH, RobotType.BEAVER);
		}
		rc.yield();
		}
	}
}
