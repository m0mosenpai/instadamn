package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2NR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2NR implements Runnable {
    public static final String A04 = C48442Kl.A01("ForceStopRunnable");
    public static final long A05 = TimeUnit.DAYS.toMillis(3650);
    public int A00 = 0;
    public final Context A01;
    public final C2L1 A02;
    public final C2NO A03;

    public static void A00(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = 134217728;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + A05;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x001d, code lost:
    
        r5.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0020, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x030b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x030c, code lost:
    
        r7.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x001b, code lost:
    
        if (r0 == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0195, code lost:
    
        X.C48442Kl.A00();
        r15 = true;
        r7.beginTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019c, code lost:
    
        r10 = r7.A05();
        r9 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a8, code lost:
    
        if (r9.hasNext() == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01aa, code lost:
    
        r10.CnQ(-1, (java.lang.String) r9.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b6, code lost:
    
        r7.setTransactionSuccessful();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b9, code lost:
    
        r7.endTransaction();
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2NR.run():void");
    }

    public C2NR(Context context, C2L1 workManager) {
        this.A01 = context.getApplicationContext();
        this.A02 = workManager;
        this.A03 = workManager.A05;
    }
}
