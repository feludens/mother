package com.zabador.motherspills.alarm;

/**
 * Alarm Manager's Factory.
 * Created on 11/21/15.
 *
 * @author Adrian Pena
 */
public class AlarmManagerFactory {

    private AlarmManagerFactory() {
        //NOP
    }
    /**
     * Retrieves an implementation for the Alarm Manager.
     * @return an {@link AlarmManager}.
     */
    public static AlarmManager getAlarmManager() {
        return SugarAlarmManager.getInstance();
    }
}
