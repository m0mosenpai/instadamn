package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WhU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70811WhU implements InterfaceC13000lm, InterfaceC42271xH {
    public static final XDR A02 = new C65904TwA(7);
    public final C65739TtE A00;
    public final UserSession A01;

    public final synchronized List A00() {
        return this.A00.A01();
    }

    public final synchronized void A01(User user) {
        this.A00.A04(user);
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        boolean contains;
        C2AS c2as = (C2AS) obj;
        C14360o3.A0B(c2as, 0);
        synchronized (this) {
            contains = A00().contains(c2as.A00);
        }
        return contains;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC25651Mw.A00(this.A01).A02(this, C2AS.class);
    }

    public C70811WhU(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = new C65739TtE(userSession, C65740TtF.A02, A02, 20);
        AbstractC25651Mw.A00(userSession).A01(this, C2AS.class);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1783660789);
        C2AS c2as = (C2AS) obj;
        synchronized (this) {
            int A0N = AbstractC167017dG.A0N(c2as, -1833600603);
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
            C0f9.A0A(-128247490, A0N);
        }
        C0f9.A0A(595534, A03);
    }
}
