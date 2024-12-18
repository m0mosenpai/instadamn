package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Vpp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69512Vpp {
    public final C70780Wgt A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C70780Wgt c70780Wgt = C70780Wgt.A07;
        if (c70780Wgt == null) {
            synchronized (this) {
                c70780Wgt = C70780Wgt.A07;
                if (c70780Wgt == null) {
                    C41711wL A01 = C41711wL.A01(userSession);
                    C14360o3.A07(A01);
                    C06090Tz c06090Tz = C06090Tz.A05;
                    W93 w93 = new W93(C1U4.A00(userSession.deviceSession.A06()), C18U.A00(c06090Tz, userSession, 37157531604877373L), C18U.A00(c06090Tz, userSession, 37157531604942910L), C18U.A00(c06090Tz, userSession, 37157531604811836L), (int) C18U.A01(c06090Tz, userSession, 36594581651195685L));
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    c70780Wgt = new C70780Wgt(w93, A01, timeUnit.toMillis(C18U.A01(c06090Tz, userSession, 36594581651064611L)), timeUnit.toMillis(C18U.A01(c06090Tz, userSession, 36594581651261222L)), timeUnit.toMillis(C18U.A01(c06090Tz, userSession, 36594581650868000L)), timeUnit.toMillis(C18U.A01(c06090Tz, userSession, 36594581650933537L)), timeUnit.toMillis(C18U.A01(c06090Tz, userSession, 36594581650999074L)), timeUnit.toMillis(C18U.A01(c06090Tz, userSession, 36594581651130148L)), timeUnit.toMillis(C18U.A01(c06090Tz, userSession, 36594581651326759L)));
                    C70780Wgt.A07 = c70780Wgt;
                }
            }
        }
        return c70780Wgt;
    }
}
