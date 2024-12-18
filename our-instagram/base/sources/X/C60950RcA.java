package X;

import com.facebook.msys.mci.SessionedNotificationCenter;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.RcA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60950RcA extends AbstractRunnableC14200nk {
    public final /* synthetic */ SJW A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60950RcA(SJW sjw) {
        super(1773997430, 3, false, false);
        this.A00 = sjw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SJW sjw = this.A00;
        AtomicBoolean atomicBoolean = sjw.A09;
        if (!atomicBoolean.get()) {
            sjw.A0A.set(false);
            C006802i c006802i = sjw.A03;
            int i = sjw.A00;
            c006802i.markerAnnotate(936452326, i, "is_http_success", false);
            c006802i.markerAnnotate(936452326, i, "is_http_time_out", true);
            atomicBoolean.set(true);
        }
        UserSession userSession = sjw.A04;
        SessionedNotificationCenter sessionedNotificationCenter = C61A.A02(userSession, true).getSessionedNotificationCenter();
        C14360o3.A07(sessionedNotificationCenter);
        sessionedNotificationCenter.removeObserver(sjw.A02, "MEMContextSendPingResultV2Notification", null);
        AtomicBoolean atomicBoolean2 = sjw.A05;
        if (!atomicBoolean2.get()) {
            sjw.A06.set(false);
            C006802i c006802i2 = sjw.A03;
            int i2 = sjw.A00;
            c006802i2.markerAnnotate(936452326, i2, "is_act_success", false);
            c006802i2.markerAnnotate(936452326, i2, "is_act_time_out", true);
            atomicBoolean2.set(true);
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36320150421315689L)) {
            AtomicBoolean atomicBoolean3 = sjw.A0B;
            if (!atomicBoolean3.get()) {
                sjw.A0C.set(false);
                C006802i c006802i3 = sjw.A03;
                int i3 = sjw.A00;
                c006802i3.markerAnnotate(936452326, i3, "is_mqtt_success", false);
                c006802i3.markerAnnotate(936452326, i3, "is_mqtt_time_out", true);
                atomicBoolean3.set(true);
            }
        }
        SessionedNotificationCenter sessionedNotificationCenter2 = C61A.A02(userSession, true).getSessionedNotificationCenter();
        C14360o3.A07(sessionedNotificationCenter2);
        sessionedNotificationCenter2.removeObserver(sjw.A01, "DGWSendPingCompletedNotification", null);
        AtomicBoolean atomicBoolean4 = sjw.A07;
        if (!atomicBoolean4.get()) {
            sjw.A08.set(false);
            C006802i c006802i4 = sjw.A03;
            int i4 = sjw.A00;
            c006802i4.markerAnnotate(936452326, i4, "is_dgw_success", false);
            c006802i4.markerAnnotate(936452326, i4, "is_dgw_time_out", true);
            atomicBoolean4.set(true);
        }
        sjw.A03.markerEnd(936452326, sjw.A00, (short) 2);
    }
}
