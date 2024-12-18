package X;

import com.instagram.common.session.UserSession;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2Fa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47322Fa {
    public long A00;
    public long A01;
    public final int A02;
    public final long A03;
    public final UserSession A04;
    public final AtomicBoolean A05;
    public final AtomicInteger A06;
    public final boolean A07;
    public final boolean A08;
    public final C58352Pts A09;
    public final AtomicBoolean A0A;

    public C47322Fa(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A0A = new AtomicBoolean(false);
        this.A04 = userSession;
        this.A07 = z;
        this.A05 = new AtomicBoolean(!C218914p.A08());
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A08 = C18U.A06(c06090Tz, userSession, 36313042257381060L);
        this.A03 = C18U.A01(c06090Tz, userSession, 36594517226882805L);
        this.A06 = new AtomicInteger(0);
        this.A02 = new Random(System.currentTimeMillis()).nextInt();
        this.A09 = new C58352Pts(this);
    }

    public final void A00() {
        UserSession userSession = this.A04;
        if (C18U.A06(C06090Tz.A05, userSession, 36325991575991853L)) {
            AtomicBoolean atomicBoolean = this.A0A;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                C218914p.A03(EnumC220415e.A03, this.A09);
                C14270nr A00 = C14270nr.A00();
                C14360o3.A07(A00);
                if (!userSession.isEnded() && !userSession.isDestroyed() && !userSession.isStopped()) {
                    A00.A01(new RcL(A00, this), 20000L);
                }
            }
        }
    }
}
