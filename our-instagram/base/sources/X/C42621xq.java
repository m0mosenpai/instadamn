package X;

import com.instagram.common.session.UserSession;
import java.util.Random;

/* renamed from: X.1xq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42621xq {
    public final int A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final Random A03 = new Random();
    public final boolean A04;
    public final C42571xl A05;

    public C42621xq(UserSession userSession, C42571xl c42571xl) {
        this.A05 = c42571xl;
        this.A02 = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A04 = C18U.A06(c06090Tz, userSession, 36310460974235758L);
        this.A00 = Long.valueOf(C18U.A01(c06090Tz, userSession, 36591935951011906L)).intValue();
        C14360o3.A0B(userSession, 0);
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "ig_request_prefetch_coverage";
        this.A01 = c12210kP.A00();
    }
}
