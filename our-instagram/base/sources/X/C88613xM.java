package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.SystemClock;
import com.facebook.analytics2.logger.legacy.uploader.HighPriUploadRetryReceiver;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3xM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88613xM {
    public static C88613xM A02;
    public static final long A03 = TimeUnit.SECONDS.toMillis(90);
    public PowerManager A00;
    public AlarmManager A01;

    private synchronized AlarmManager A00(Context context) {
        AlarmManager alarmManager;
        alarmManager = this.A01;
        if (alarmManager == null) {
            alarmManager = (AlarmManager) context.getSystemService("alarm");
            this.A01 = alarmManager;
        }
        return alarmManager;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.3xM] */
    public static C88613xM A01() {
        C88613xM c88613xM;
        synchronized (C88613xM.class) {
            C88613xM c88613xM2 = A02;
            c88613xM = c88613xM2;
            if (c88613xM2 == null) {
                ?? obj = new Object();
                A02 = obj;
                c88613xM = obj;
            }
        }
        return c88613xM;
    }

    public final void A02(Context context, Bundle bundle, C40401u8 c40401u8, C88623xN c88623xN, String str, int i) {
        PowerManager powerManager;
        if (c88623xN == null || (c88623xN.A01 >= 0 && c88623xN.A00 >= 0)) {
            ComponentName componentName = ((C88603xK) AbstractC40481uH.A00(context)).A00;
            synchronized (C88613xM.class) {
                powerManager = this.A00;
                if (powerManager == null) {
                    powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
                    this.A00 = powerManager;
                }
            }
            String A0u = AnonymousClass001.A0u("JobSchedulerHack-", componentName.getShortClassName(), "-client-", String.valueOf(i));
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, A0u);
            C0BX.A02(newWakeLock, A0u);
            AbstractC09820fg.A02(newWakeLock);
            Q3X q3x = new Q3X(new C62409SAj(newWakeLock));
            Messenger messenger = new Messenger(q3x);
            C88633xO.A01().add(q3x);
            Intent putExtras = new Intent().setComponent(componentName).setAction(str).putExtras(new C88633xO(context, bundle, messenger, c40401u8, c88623xN, str, i).A02());
            long j = A03;
            newWakeLock.acquire(j);
            C0BX.A01(newWakeLock, j);
            try {
                C0b3.A00().A07().A05(context, putExtras);
                return;
            } catch (IllegalStateException unused) {
                A03(context, c40401u8, str, i, 0L, true);
                return;
            }
        }
        throw new IllegalStateException("fallback delay ms must be >= 0");
    }

    public final void A03(Context context, C40401u8 c40401u8, String str, int i, long j, boolean z) {
        ComponentName componentName;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        C88633xO c88633xO = new C88633xO(context, null, null, c40401u8, new C88623xN(timeUnit.toMillis(15L), timeUnit.toMillis(30L), str), str, i);
        Intent intent = new Intent();
        if (z) {
            componentName = new ComponentName(context, (Class<?>) HighPriUploadRetryReceiver.class);
        } else {
            componentName = ((C88603xK) AbstractC40481uH.A00(context)).A00;
        }
        Intent putExtras = intent.setComponent(componentName).setAction("com.facebook.analytics2.logger.UPLOAD_NOW").putExtras(c88633xO.A02());
        int i2 = 134217728;
        if (Build.VERSION.SDK_INT >= 30) {
            i2 = 201326592;
        }
        try {
            PendingIntent service = PendingIntent.getService(context, 1, putExtras, i2);
            try {
                if (AbstractC02620Al.A00(A00(context), context)) {
                    A00(context).setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j, service);
                } else {
                    A00(context).set(2, SystemClock.elapsedRealtime() + j, service);
                }
            } catch (NullPointerException e) {
                C0K8.A0H("JobSchedulerHack", "Unexpected NPE when scheduling alarm. This is most likely an OS bug.", e);
            }
        } catch (SecurityException e2) {
            C0K8.A0P("JobSchedulerHack", "Exception while calling PendingIntent.getService: %s", e2.getMessage());
        }
    }

    public final void A04(Context context, boolean z) {
        ComponentName componentName;
        Intent intent = new Intent();
        if (z) {
            componentName = new ComponentName(context, (Class<?>) HighPriUploadRetryReceiver.class);
        } else {
            componentName = ((C88603xK) AbstractC40481uH.A00(context)).A00;
        }
        Intent action = intent.setComponent(componentName).setAction("com.facebook.analytics2.logger.UPLOAD_NOW");
        int i = 536870912;
        if (Build.VERSION.SDK_INT >= 30) {
            i = 603979776;
        }
        PendingIntent service = PendingIntent.getService(context, 1, action, i);
        if (service != null) {
            A00(context).cancel(service);
        }
    }
}
