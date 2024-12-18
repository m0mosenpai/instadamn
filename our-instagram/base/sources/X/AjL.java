package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AjL implements BCA, BDV {
    public final UserSession A00;
    public final YPq A01;
    public final HashMap A02;

    @Override // X.BDV
    public final void A8j(C5NJ c5nj) {
        java.util.Set set;
        ACB acb;
        InterfaceC197718oi interfaceC197718oi;
        UserSession userSession = this.A00;
        AbstractC166987dD.A0t(userSession).A04();
        String str = c5nj.A05;
        C14360o3.A07(str);
        boolean A0f = AbstractC002300n.A0f(AbstractC167007dF.A0h(str), ".pkm", false);
        try {
            C209139Mv c209139Mv = (C209139Mv) this.A01;
            c209139Mv.A06.add(this);
            C209149Mw c209149Mw = c209139Mv.A00;
            Map map = c209149Mw.A02;
            if (!map.containsKey(this)) {
                set = AbstractC166987dD.A1H();
                map.put(this, set);
            } else {
                Object obj = map.get(this);
                if (obj != null) {
                    set = (java.util.Set) obj;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            synchronized (c209149Mw) {
                try {
                    Map map2 = c209149Mw.A04;
                    if (!map2.containsKey(str)) {
                        interfaceC197718oi = null;
                        InterfaceC197718oi A01 = C209089Mq.A01(c209149Mw.A00, str, 2, A0f, false);
                        if (A01 != null) {
                            acb = new ACB(A01, str);
                            C209089Mq.A05("TextureManager.loadTexture");
                            map2.put(str, acb);
                        }
                    } else {
                        Object obj2 = map2.get(str);
                        if (obj2 != null) {
                            acb = (ACB) obj2;
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    if (set.add(acb)) {
                        acb.A00++;
                    }
                    interfaceC197718oi = acb.A01;
                } catch (Throwable th) {
                    throw th;
                }
            }
            HashMap hashMap = this.A02;
            if (interfaceC197718oi != null) {
                hashMap.put(c5nj, interfaceC197718oi);
                AbstractC166987dD.A0t(userSession).A05();
            }
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

    @Override // X.BDV
    public final InterfaceC197718oi C6s(C5NJ c5nj, long j, long j2) {
        return (InterfaceC197718oi) this.A02.get(c5nj);
    }

    @Override // X.BDV
    public final void cleanup() {
        HashMap hashMap = this.A02;
        Iterator A0t = AbstractC167017dG.A0t(hashMap);
        while (A0t.hasNext()) {
            ((InterfaceC199658sH) A0t.next()).cleanup();
        }
        hashMap.clear();
    }

    public AjL(UserSession userSession, YPq yPq) {
        AbstractC167017dG.A1P(userSession, yPq);
        this.A00 = userSession;
        this.A01 = yPq;
        this.A02 = AbstractC166987dD.A1G();
    }

    @Override // X.BCA
    public final void AHR(YPq yPq) {
        cleanup();
    }
}
