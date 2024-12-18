package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.notifications.armadillo.retry.ArmadilloPushNotificationRetryWorker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5sX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129115sX {
    public static final C129115sX A00 = new Object();

    public final void A00(UserSession userSession) {
        C2L1.A00(AbstractC12290kX.A00).A05(AnonymousClass001.A0R("ArmadilloPushNotificationRetryScheduler", userSession.userId));
    }

    public final void A01(UserSession userSession, Map map) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36327627958532843L)) {
            long A01 = C18U.A01(c06090Tz, userSession, 36609102935299937L);
            C48552Kx c48552Kx = new C48552Kx();
            int A012 = (int) C18U.A01(c06090Tz, userSession, 36609102935431010L);
            String A002 = AbstractC43591JPw.A00(1158);
            Map map2 = c48552Kx.A00;
            map2.put(A002, Integer.valueOf(A012));
            map2.put("recipient_id", userSession.userId);
            if (map != null) {
                c48552Kx.A02(map);
            }
            AbstractC48382Kf abstractC48382Kf = new AbstractC48382Kf(ArmadilloPushNotificationRetryWorker.class);
            C48362Kd c48362Kd = new C48362Kd();
            Integer num = C05F.A01;
            c48362Kd.A01(num);
            abstractC48382Kf.A03(c48362Kd.A00());
            TimeUnit timeUnit = TimeUnit.MINUTES;
            abstractC48382Kf.A02(A01, timeUnit);
            abstractC48382Kf.A00.A0C = c48552Kx.A00();
            abstractC48382Kf.A04(num, timeUnit, A01);
            C2L1 A003 = C2L1.A00(AbstractC12290kX.A00);
            String A0R = AnonymousClass001.A0R("ArmadilloPushNotificationRetryScheduler", userSession.userId);
            A003.A02((QA7) abstractC48382Kf.A00(), C05F.A00, A0R);
        }
    }
}
