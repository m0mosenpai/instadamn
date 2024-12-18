package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.msys.mci.GlobalNotificationCenter;
import com.facebook.msys.mci.NotificationCenterInternal;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RcL extends AbstractRunnableC14200nk {
    public final /* synthetic */ C14270nr A00;
    public final /* synthetic */ C47322Fa A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcL(C14270nr c14270nr, C47322Fa c47322Fa) {
        super(1773997430, 3, false, false);
        this.A01 = c47322Fa;
        this.A00 = c14270nr;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [com.facebook.msys.mci.NotificationCenterInternal, com.facebook.msys.mci.GlobalNotificationCenter] */
    @Override // java.lang.Runnable
    public final void run() {
        GlobalNotificationCenter globalNotificationCenter;
        C47322Fa c47322Fa = this.A01;
        UserSession userSession = c47322Fa.A04;
        if (!userSession.isEnded() && !userSession.isDestroyed() && !userSession.isStopped()) {
            boolean z = c47322Fa.A07;
            boolean z2 = c47322Fa.A05.get();
            long now = AwakeTimeSinceBootClock.INSTANCE.now();
            if (z2 ? now - c47322Fa.A01 > 12000 : c47322Fa.A08 && now - c47322Fa.A00 <= c47322Fa.A03 * 1000) {
                SJW sjw = new SJW(userSession);
                int incrementAndGet = c47322Fa.A06.incrementAndGet();
                int i = c47322Fa.A02;
                C006802i c006802i = sjw.A03;
                int i2 = sjw.A00;
                c006802i.markerStart(936452326, i2);
                if (c006802i.isMarkerOn(936452326, i2)) {
                    if (incrementAndGet == 1) {
                        c006802i.markerAnnotate(936452326, i2, "is_first_time_check", true);
                    }
                    UserSession userSession2 = sjw.A04;
                    Iterator A14 = AbstractC166997dE.A14(AbstractC86593tX.A0J(userSession2));
                    while (A14.hasNext()) {
                        Map.Entry A1K = AbstractC166987dD.A1K(A14);
                        c006802i.markerAnnotate(936452326, i2, AbstractC31172DnG.A17(A1K), AbstractC58318PtA.A0p(A1K));
                    }
                    c006802i.markerAnnotate(936452326, i2, "current_check_count", incrementAndGet);
                    c006802i.markerAnnotate(936452326, i2, "instance_key", i2);
                    c006802i.markerAnnotate(936452326, i2, "moinitor_id", i);
                    c006802i.markerAnnotate(936452326, i2, "is_account_switch", z);
                    c006802i.markerAnnotate(936452326, i2, TraceFieldType.IsForeground, z2);
                    if (!sjw.A09.get()) {
                        C26371Ps A0e = AbstractC58319PtB.A0e();
                        A0e.A02("https://www.instagram.com/status.php");
                        A0e.A01(C05F.A0N);
                        C1QW A00 = A0e.A00();
                        TFG tfg = new TFG(sjw);
                        C1QX A0J = MSY.A0J();
                        A0J.A03 = C1Ef.OnScreen;
                        C1C6.A00().A02(tfg, A00, A0J.A00());
                    }
                    if (!sjw.A05.get()) {
                        SessionedNotificationCenter sessionedNotificationCenter = C61A.A02(userSession2, true).getSessionedNotificationCenter();
                        C14360o3.A07(sessionedNotificationCenter);
                        sessionedNotificationCenter.addObserver(sjw.A02, "MEMContextSendPingResultV2Notification", 5, null);
                        synchronized (GlobalNotificationCenter.class) {
                            GlobalNotificationCenter globalNotificationCenter2 = GlobalNotificationCenter.sInstance;
                            globalNotificationCenter = globalNotificationCenter2;
                            if (globalNotificationCenter2 == null) {
                                ?? notificationCenterInternal = new NotificationCenterInternal();
                                GlobalNotificationCenter.sInstance = notificationCenterInternal;
                                globalNotificationCenter = notificationCenterInternal;
                            }
                        }
                        globalNotificationCenter.postStrictNotification("GMEMContextSendPingNotification", 1, null);
                    }
                    if (C18U.A06(C06090Tz.A05, userSession2, 36320150421315689L) && !sjw.A0B.get()) {
                        RealtimeClientManager.getInstance(userSession2).publishWithCallbacks("/echo", new byte[0], C4Q5.ACKNOWLEDGED_DELIVERY, new T1Q(sjw, 2));
                    }
                    if (!sjw.A07.get()) {
                        SessionedNotificationCenter sessionedNotificationCenter2 = C61A.A02(userSession2, true).getSessionedNotificationCenter();
                        C14360o3.A07(sessionedNotificationCenter2);
                        sessionedNotificationCenter2.addObserver(sjw.A01, "DGWSendPingCompletedNotification", 1, null);
                        SessionedNotificationCenter sessionedNotificationCenter3 = C61A.A02(userSession2, true).getSessionedNotificationCenter();
                        C14360o3.A07(sessionedNotificationCenter3);
                        sessionedNotificationCenter3.postStrictNotification("DGWSendPingNotification", 1, null);
                    }
                    C14270nr A002 = C14270nr.A00();
                    C14360o3.A07(A002);
                    A002.A01(new C60950RcA(sjw), 6000L);
                }
            }
            this.A00.A01(this, 120000L);
        }
    }
}
