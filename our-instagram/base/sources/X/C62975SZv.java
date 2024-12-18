package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;

/* renamed from: X.SZv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62975SZv {
    public static final String A0D = AnonymousClass001.A0R(C62975SZv.class.getCanonicalName(), ".ACTION_ALARM.");
    public boolean A00;
    public boolean A01;
    public final AlarmManager A02;
    public final PendingIntent A03;
    public final BroadcastReceiver A04;
    public final Context A05;
    public final Handler A06;
    public final C3UW A07;
    public final String A08;
    public final int A09;
    public final RealtimeSinceBootClock A0A;
    public final InterfaceC65369Tj1 A0B;
    public volatile Runnable A0C;

    public final synchronized void A00() {
        PendingIntent pendingIntent;
        if (this.A00 && (pendingIntent = this.A03) != null) {
            this.A00 = false;
            this.A07.A03(this.A02, pendingIntent);
        }
    }

    public final synchronized void A01() {
        if (!this.A01) {
            this.A01 = this.A07.A07(this.A04, this.A05, new IntentFilter(this.A08), this.A06, AbstractC166997dE.A0a());
        }
        if (!this.A00) {
            long j = (this.A09 + 60) * 1000;
            PendingIntent pendingIntent = this.A03;
            if (pendingIntent != null) {
                this.A00 = true;
                try {
                    this.A07.A04(this.A05, this.A02, 2, SystemClock.elapsedRealtime() + j, pendingIntent);
                } catch (Throwable th) {
                    this.A00 = false;
                    C0K8.A0M("PingUnreceivedAlarm", "alarm_failed; intervalSec=%s", th, Long.valueOf(j / 1000));
                }
            }
        }
    }

    public C62975SZv(Context context, Handler handler, RealtimeSinceBootClock realtimeSinceBootClock, C3UW c3uw, C62670SLh c62670SLh, InterfaceC65369Tj1 interfaceC65369Tj1, String str) {
        PendingIntent pendingIntent;
        this.A05 = context;
        StringBuilder A0s = AbstractC58318PtA.A0s(A0D);
        AbstractC58323PtF.A11(context, str, A0s);
        String obj = A0s.toString();
        this.A08 = obj;
        AbstractC64515THi A00 = c62670SLh.A00(AlarmManager.class, "alarm");
        if (A00 instanceof C60546R6j) {
            throw AbstractC166987dD.A12("Cannot acquire Alarm service");
        }
        this.A02 = (AlarmManager) A00.A01();
        this.A0A = realtimeSinceBootClock;
        this.A06 = handler;
        this.A0B = interfaceC65369Tj1;
        this.A07 = c3uw;
        this.A09 = 60;
        this.A04 = new Q1k(this, 11);
        Intent A0B = AbstractC58320PtC.A0B(context, obj);
        try {
            C04750Mt c04750Mt = new C04750Mt();
            c04750Mt.A0A(A0B);
            c04750Mt.A09();
            pendingIntent = c04750Mt.A02(context, 0, 134217728);
        } catch (SecurityException unused) {
            pendingIntent = null;
        }
        this.A03 = pendingIntent;
    }
}
