package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2sB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62102sB extends AbstractC62022s3 {
    public final UserSession A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);

    @Override // X.AbstractC62022s3, X.InterfaceC62002s1
    public final void DgP(C1I1 c1i1, C74283Vj c74283Vj) {
        if (this.A01.compareAndSet(false, true)) {
            UserSession userSession = this.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36328057458539630L)) {
                boolean A06 = C18U.A06(c06090Tz, userSession, 36328057458605167L);
                boolean A062 = C18U.A06(c06090Tz, userSession, 36328057458670704L);
                if (A06) {
                    AbstractC24641Ih.A02.EpA(new AbstractC18280vF() { // from class: X.52s
                        {
                            super("prefetchNewsfeed", 353, 2, false, false);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            UserSession userSession2 = C62102sB.this.A00;
                            C4DU.A00(userSession2, new C4DT(userSession2)).A03(false);
                        }
                    });
                } else if (A062) {
                    AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.5IY
                        {
                            super("prefetchNewsfeed", 353, 2, false, false);
                        }

                        @Override // X.AbstractC18280vF
                        public final void loggedRun() {
                            UserSession userSession2 = C62102sB.this.A00;
                            C4DU.A00(userSession2, new C4DT(userSession2)).A03(false);
                        }
                    });
                } else {
                    C4DU.A00(userSession, new C4DT(userSession)).A03(false);
                }
            }
        }
    }

    public C62102sB(UserSession userSession) {
        this.A00 = userSession;
    }
}
