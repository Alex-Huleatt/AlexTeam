package AlexTeam;

import battlecode.common.RobotController;
import battlecode.common.RobotType;

public class RobotPlayer {
	public static void run(RobotController rc) {
		while (true) {
			try {
			
				RobotType rt = rc.getType();
				switch (rt) {
				case HQ: {
					HQ hq = new HQ(rc);
					hq.run();
				}
				case BEAVER: {
					Beaver b = new Beaver(rc);
					b.run();
				}
				}
				
			} catch (Exception e) {
                            e.printStackTrace();
			}
		}
	}
}
