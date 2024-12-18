package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: X.SbL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63042SbL {
    static {
        C48442Kl.A01("Alarms");
    }

    public static void A01(Context context, C2WP id, int alarmId) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent A08 = MSW.A08(context, SystemAlarmService.class);
        A08.setAction("ACTION_DELAY_MET");
        C63649SrF.A00(A08, id);
        PendingIntent service = PendingIntent.getService(context, alarmId, A08, 603979776);
        if (service != null && alarmManager != null) {
            C48442Kl.A00();
            alarmManager.cancel(service);
        }
    }

    public static void A00(Context context, WorkDatabase workDatabase, C2WP id, long triggerAtMillis) {
        int A0H;
        C2M6 A02 = workDatabase.A02();
        C2WT C4j = A02.C4j(id);
        if (C4j != null) {
            A0H = C4j.A01;
            A01(context, id, A0H);
        } else {
            C51032Vz c51032Vz = new C51032Vz(workDatabase);
            Object runInTransaction = c51032Vz.A00.runInTransaction(new CallableC58499PwS(c51032Vz, 2));
            C14360o3.A07(runInTransaction);
            A0H = AbstractC166987dD.A0H(runInTransaction);
            A02.COh(new C2WT(id.A01, id.A00, A0H));
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent A08 = MSW.A08(context, SystemAlarmService.class);
        A08.setAction("ACTION_DELAY_MET");
        C63649SrF.A00(A08, id);
        PendingIntent service = PendingIntent.getService(context, A0H, A08, 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, triggerAtMillis, service);
        }
    }
}
