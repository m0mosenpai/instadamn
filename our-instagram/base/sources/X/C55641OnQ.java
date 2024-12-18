package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.OnQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55641OnQ implements InterfaceC57900Pm4 {
    public final C51496Moh A00;
    public final C55143Od2 A01;

    @Override // X.InterfaceC57900Pm4
    public final void CwK(C54806OKa c54806OKa) {
    }

    public C55641OnQ(C54774OIn c54774OIn, C47815L9x c47815L9x, UserSession userSession, C19L c19l) {
        C55555Olp c55555Olp = new C55555Olp(c47815L9x, userSession);
        Context context = c54774OIn.A00;
        String str = c54774OIn.A00().A09;
        if (str != null) {
            c55555Olp.A02 = c19l;
            C55143Od2 c55143Od2 = new C55143Od2(context, c47815L9x, new C50526MSf(3, 0, false), c19l);
            c55555Olp.A00 = c55143Od2;
            c55143Od2.A06(userSession, context);
            C55143Od2 c55143Od22 = c55555Olp.A00;
            if (c55143Od22 != null) {
                AKN akn = c55143Od22.A04;
                if (akn != null) {
                    akn.A02();
                }
                C55143Od2 c55143Od23 = c55555Olp.A00;
                if (c55143Od23 != null) {
                    c55143Od23.A05(context, str);
                    C55143Od2 c55143Od24 = c55555Olp.A00;
                    if (c55143Od24 != null) {
                        this.A01 = c55143Od24;
                        C54747OFz c54747OFz = OWV.A06;
                        C14360o3.A0B(userSession, 0);
                        O6V o6v = O6V.A01;
                        if (o6v == null) {
                            o6v = new O6V(userSession);
                            O6V.A01 = o6v;
                        }
                        C55642OnS c55642OnS = new C55642OnS(c54747OFz.A00(o6v));
                        c55642OnS.ED4(this);
                        c55642OnS.CNy(c54774OIn.A00());
                        C54806OKa c54806OKa = c55642OnS.A00;
                        if (c54806OKa != null) {
                            this.A00 = new C51496Moh(context, c54806OKa, c55555Olp, c19l);
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            }
            C14360o3.A0F("provider");
            throw C00O.createAndThrow();
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
