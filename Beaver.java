package AlexTeam;

import AlexTeam.movement.MovementController;
import battlecode.common.Direction;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

public class Beaver {

    public RobotController rc;
    public MovementController mc;

    public Beaver(RobotController rc) {
        this.rc = rc;
        this.mc = new MovementController(rc);
    }

    public void run() throws Exception {
        MapLocation enemyHQ = rc.senseEnemyHQLocation();
        while (true) {
            MapLocation me = rc.getLocation();

            if (rc.isCoreReady()) {
                if (me.distanceSquaredTo(enemyHQ) > 4) {
                    mc.bug(enemyHQ);
                }
                else if (rc.isWeaponReady() && rc.canAttackLocation(enemyHQ)) {
                    rc.attackLocation(enemyHQ);
                }
                
            }
            rc.yield();
        }
    }
}
