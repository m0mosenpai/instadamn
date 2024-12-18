package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.AoF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24192AoF implements BDW {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final HashMap A03;

    @Override // X.BDW
    public final void A8j(C5NJ c5nj) {
        UserSession userSession = this.A02;
        AbstractC166987dD.A0t(userSession).A04();
        String str = c5nj.A05;
        C14360o3.A07(str);
        try {
            InterfaceC197718oi A01 = C209089Mq.A01(this.A01, str, this.A00, AbstractC002300n.A0f(AbstractC167007dF.A0h(str), ".pkm", false), true);
            HashMap hashMap = this.A03;
            if (A01 != null) {
                hashMap.put(c5nj, A01);
                AbstractC166987dD.A0t(userSession).A05();
                return;
            }
            throw new NullPointerException("Required value was null.");
        } catch (Exception e) {
            int i = c5nj.A01;
            int i2 = c5nj.A00;
            boolean A18 = AbstractC167027dH.A18(userSession);
            C0f5 A0G = AbstractC167027dH.A0G(str);
            A0G.ABX("emptyPath", AbstractC167007dF.A1N(str.length()));
            AbstractC167027dH.A0v(A0G, e, i, i2, A18);
            throw e;
        }
    }

    @Override // X.BDW
    public final InterfaceC197718oi C6s(C5NJ c5nj, long j, long j2) {
        return (InterfaceC197718oi) this.A03.get(c5nj);
    }

    @Override // X.BDW
    public final void cleanup() {
        HashMap hashMap = this.A03;
        Iterator A0t = AbstractC167017dG.A0t(hashMap);
        while (A0t.hasNext()) {
            ((InterfaceC199658sH) A0t.next()).cleanup();
        }
        hashMap.clear();
    }

    public C24192AoF(Context context, UserSession userSession, int i) {
        AbstractC167017dG.A1P(userSession, context);
        this.A02 = userSession;
        this.A01 = context;
        this.A00 = i;
        this.A03 = AbstractC166987dD.A1G();
    }
}
