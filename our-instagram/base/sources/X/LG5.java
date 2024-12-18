package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class LG5 {
    public static final C47727L5o A05 = new Object();
    public final ACD A00;
    public final C42201xA A01;
    public final C135816Cj A02;
    public final AtomicBoolean A03 = AbstractC166997dE.A17();
    public final UserSession A04;

    public final void A00(boolean z, Runnable runnable) {
        C2057599a c2057599a = C99Y.A00;
        UserSession userSession = this.A04;
        int i = 0;
        if (!c2057599a.A03(userSession, true) && !AbstractC453326q.A04(userSession)) {
            this.A01.accept(EnumC46168Kc6.A05);
            if (!z) {
                i = 2;
            }
            this.A00.A01(new C44176Jff(47, runnable, this), i);
        } else {
            runnable.run();
        }
        C14360o3.A07(C201808wA.A00);
    }

    public LG5(ACD acd, C42201xA c42201xA, UserSession userSession, C135816Cj c135816Cj) {
        this.A04 = userSession;
        this.A02 = c135816Cj;
        this.A00 = acd;
        this.A01 = c42201xA;
    }
}
