package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.TtF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65740TtF implements InterfaceC13000lm, InterfaceC42271xH {
    public static final XED A02 = new C37406Gdm(4);
    public static final XDR A03 = new C65904TwA(8);
    public final C65739TtE A00;
    public final UserSession A01;

    public final synchronized void A01(User user) {
        this.A00.A04(user);
    }

    public final void A00(User user) {
        C65739TtE c65739TtE = this.A00;
        Iterator it = c65739TtE.A02().iterator();
        while (it.hasNext()) {
            if (C14360o3.A0K(((C65741TtG) it.next()).A06(), user)) {
                c65739TtE.A05(user);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r2 == null) goto L12;
     */
    @Override // X.InterfaceC42271xH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean A79(java.lang.Object r6) {
        /*
            r5 = this;
            X.2AS r6 = (X.C2AS) r6
            r4 = r5
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            monitor-enter(r4)
            X.TtE r0 = r5.A00     // Catch: java.lang.Throwable -> L2d
            java.util.List r0 = r0.A01()     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L2f
        L12:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L2a
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L2f
            r1 = r2
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1     // Catch: java.lang.Throwable -> L2f
            com.instagram.user.model.User r0 = r6.A00     // Catch: java.lang.Throwable -> L2f
            boolean r0 = X.C14360o3.A0K(r1, r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L12
            r0 = 1
            if (r2 != 0) goto L2b
        L2a:
            r0 = 0
        L2b:
            monitor-exit(r4)
            return r0
        L2d:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L2f
        L2f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65740TtF.A79(java.lang.Object):boolean");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC25651Mw.A00(this.A01).A02(this, C2AS.class);
    }

    public C65740TtF(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = new C65739TtE(userSession, A02, A03, 100);
        AbstractC25651Mw.A00(userSession).A01(this, C2AS.class);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A032 = C0f9.A03(40308723);
        C2AS c2as = (C2AS) obj;
        synchronized (this) {
            int A0N = AbstractC167017dG.A0N(c2as, -1524255841);
            Iterator it = this.A00.A02().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                User A06 = ((C65741TtG) it.next()).A06();
                User user = c2as.A00;
                if (C14360o3.A0K(A06, user)) {
                    if (AbstractC65792TuA.A01(A06, user)) {
                        A01(user);
                    }
                }
            }
            C0f9.A0A(-836811156, A0N);
        }
        C0f9.A0A(108523642, A032);
    }
}
