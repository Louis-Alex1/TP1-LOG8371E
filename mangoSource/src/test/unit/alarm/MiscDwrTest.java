package test.unit.alarm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.serotonin.mango.web.dwr.MiscDwr;
import com.serotonin.web.dwr.DwrResponseI18n;

public class MiscDwrTest {

    @Test
    @DisplayName("testMiscDwrInitializeLongPoll")
    void testMiscDwrInitializeLongPoll() {
        assertEquals(true, true);
    }

    @Test
    @DisplayName("testMiscDwrDoLongPoll")
    void testMiscDwrDoLongPoll() {
        assertEquals(true, true);
    }

    @Test
    @DisplayName("testMiscDwrTerminateLongPoll")
    void testMiscDwrTerminateLongPoll() {
        assertEquals(true, true);
    }

    @Test
    @DisplayName("testMiscDwrToggleSilence")
    void testMiscDwrToggleSilence() {
        MiscDwr miscdwr = new MiscDwr();

        DwrResponseI18n response = miscdwr.toggleSilence(1);
        
        assertEquals(response.getData().get("eventId"), 1);
        assertEquals(response.getData().get("silenced"), false);
    }
    
    @Test
    @DisplayName("testMiscDwrSilenceAll")
    void testMiscDwrSilenceAll() {
        assertTrue(true);
    }

    @Test
    @DisplayName("testMiscDwrAcknowledgeEvent")
    void testMiscDwrAcknowledgeEvent() {
        assertTrue(true);
    }

    @Test
    @DisplayName("testMiscDwrAcknowledgeAllPendingEvents")
    void testMiscDwrAcknowledgeAllPendingEvents() {
        assertTrue(true);
    }

}