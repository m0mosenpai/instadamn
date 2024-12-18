package com.facebook.wellbeing.timeinapp.jnibindings;

import X.C09170dP;
import X.EnumC49762Qj;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class TimeInAppControllerWrapper {
    public final HybridData mHybridData = initHybrid();

    private native void dispatchHybrid(int i);

    private native void dispatchWithTimestampHybrid(int i, long j);

    private native void initControllerHybrid(ScheduledExecutorService scheduledExecutorService, SQLiteDatabase sQLiteDatabase, XAnalyticsHolder xAnalyticsHolder, int i, int i2);

    public static native HybridData initHybrid();

    private native void queryIntervalsHybrid(long j, long j2, TimeInAppIntervalList timeInAppIntervalList);

    private native void queryIntervalsWithEventHybrid(long j, long j2, TimeInAppIntervalWithEventList timeInAppIntervalWithEventList);

    public void dispatch(EnumC49762Qj enumC49762Qj) {
        dispatchHybrid(2);
    }

    public native String getCurrentState();

    public native int[] getDailyTimeInApp(long j);

    public native int[] getDailyTimeInAppUtc(long j, long j2);

    public native long getTimeInApp(long j, long j2);

    public native void setReminder(TimeInAppReminder timeInAppReminder, int i);

    public native void setSessionTrigger(String str, int i, TimeInAppReminder timeInAppReminder);

    public native void setValidateHeartBeatGap(boolean z);

    public void initController(ScheduledExecutorService scheduledExecutorService, String str, XAnalyticsHolder xAnalyticsHolder, int i, int i2) {
        try {
            initControllerHybrid(scheduledExecutorService, SQLiteDatabase.openOrCreateDatabase(str, (SQLiteDatabase.CursorFactory) null), xAnalyticsHolder, 8, 30000);
        } catch (SQLiteException unused) {
        }
    }

    public ImmutableList queryIntervals(long j, long j2) {
        TimeInAppIntervalList timeInAppIntervalList = new TimeInAppIntervalList();
        queryIntervalsHybrid(j, j2, timeInAppIntervalList);
        return timeInAppIntervalList.intervals.build();
    }

    static {
        C09170dP.A0C("timeinapp-jni");
    }

    public ImmutableList queryIntervalsWithEvent(long j, long j2) {
        TimeInAppIntervalWithEventList timeInAppIntervalWithEventList = new TimeInAppIntervalWithEventList();
        queryIntervalsWithEventHybrid(j, Long.MAX_VALUE, timeInAppIntervalWithEventList);
        return timeInAppIntervalWithEventList.intervals.build();
    }

    public void dispatch(EnumC49762Qj enumC49762Qj, Long l) {
        dispatchHybrid(enumC49762Qj.ordinal());
    }
}
