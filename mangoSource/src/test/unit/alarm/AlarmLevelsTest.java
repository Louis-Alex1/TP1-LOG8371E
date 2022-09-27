package test.unit.alarm;

import static org.junit.jupiter.api.Assertions.*;

import com.serotonin.mango.rt.event.AlarmLevels;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AlarmLevelsTest {

    @Test
    @DisplayName("Alarm Levels Description test")
    void alarmLevelsDescriptionTest() {
        assertEquals(AlarmLevels.getAlarmLevelDescription(0), AlarmLevels.NONE_DESCRIPTION);
        assertEquals(AlarmLevels.getAlarmLevelDescription(1), AlarmLevels.INFORMATION_DESCRIPTION);
        assertEquals(AlarmLevels.getAlarmLevelDescription(2), AlarmLevels.URGENT_DESCRIPTION);
        assertEquals(AlarmLevels.getAlarmLevelDescription(3), AlarmLevels.CRITICAL_DESCRIPTION);
        assertEquals(AlarmLevels.getAlarmLevelDescription(4), AlarmLevels.LIFE_SAFETY_DESCRIPTION);
    }
}
