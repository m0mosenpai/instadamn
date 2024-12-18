package X;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.instagram.registrationpush.RegistrationPushAlarmReceiver;

/* renamed from: X.Fxa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36160Fxa implements InterfaceC12870lZ {
    public static C36160Fxa A03;
    public final AlarmManager A00;
    public final NotificationManager A01;
    public final Context A02;

    public static synchronized C36160Fxa A00(Context context) {
        C36160Fxa c36160Fxa;
        synchronized (C36160Fxa.class) {
            c36160Fxa = A03;
            if (c36160Fxa == null) {
                c36160Fxa = new C36160Fxa(context.getApplicationContext());
                A03 = c36160Fxa;
            }
        }
        return c36160Fxa;
    }

    public final void A01() {
        C04750Mt c04750Mt = new C04750Mt();
        Context context = this.A02;
        Intent intent = new Intent(context, (Class<?>) RegistrationPushAlarmReceiver.class);
        intent.setAction("RegistrationPush.PUSH_ACTION");
        c04750Mt.A0B(intent, context.getClassLoader());
        PendingIntent A02 = c04750Mt.A02(context, 0, 536870912);
        if (A02 != null) {
            this.A00.cancel(A02);
        }
        this.A01.cancel("registration", 64278);
    }

    public C36160Fxa(Context context) {
        this.A02 = context;
        this.A00 = (AlarmManager) context.getSystemService("alarm");
        this.A01 = (NotificationManager) context.getSystemService("notification");
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A032 = C0f9.A03(-1551326841);
        A01();
        if (!C35264Fgy.A05() && !C35264Fgy.A06()) {
            long elapsedRealtime = SystemClock.elapsedRealtime() + 1800000;
            C04750Mt c04750Mt = new C04750Mt();
            Context context = this.A02;
            Intent intent = new Intent(context, (Class<?>) RegistrationPushAlarmReceiver.class);
            intent.setAction("RegistrationPush.PUSH_ACTION");
            c04750Mt.A0B(intent, context.getClassLoader());
            this.A00.set(2, elapsedRealtime, c04750Mt.A02(context, 0, 134217728));
        } else {
            C218914p.A06(this);
        }
        C0f9.A0A(-2133824819, A032);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A032 = C0f9.A03(-1020357735);
        A01();
        C0f9.A0A(-233288084, A032);
    }
}
