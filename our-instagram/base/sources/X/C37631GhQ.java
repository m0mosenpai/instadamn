package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GhQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37631GhQ implements InterfaceC42271xH {
    public final /* synthetic */ C37540Gfw A00;
    public final /* synthetic */ C37546Gg2 A01;

    public C37631GhQ(C37540Gfw c37540Gfw, C37546Gg2 c37546Gg2) {
        this.A01 = c37546Gg2;
        this.A00 = c37540Gfw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        return false;
     */
    @Override // X.InterfaceC42271xH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean A79(java.lang.Object r7) {
        /*
            r6 = this;
            X.3Cr r7 = (X.C70073Cr) r7
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.Gg2 r5 = r6.A01
            com.instagram.user.model.User r4 = r7.A00
            X.Gg8 r0 = r5.A0A
            java.util.Iterator r3 = X.AbstractC37552Gg8.A08(r0)
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.5dq r1 = (X.C120985dq) r1
            com.instagram.common.session.UserSession r0 = r5.A09
            com.instagram.user.model.User r0 = r1.A09(r0)
            boolean r0 = X.C14360o3.A0K(r0, r4)
            if (r0 == 0) goto L10
            r0 = 1
            if (r2 != 0) goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37631GhQ.A79(java.lang.Object):boolean");
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(205501712);
        C70073Cr c70073Cr = (C70073Cr) obj;
        int A032 = C0f9.A03(1762076765);
        C14360o3.A0B(c70073Cr, 0);
        User user = c70073Cr.A00;
        boolean CQf = user.CQf();
        C37540Gfw c37540Gfw = this.A00;
        if (CQf) {
            C37546Gg2 c37546Gg2 = this.A01;
            List A0J = c37546Gg2.A0A.A0J();
            ArrayList<C120985dq> A1E = AbstractC166987dD.A1E();
            for (Object obj2 : A0J) {
                if (C14360o3.A0K(((C120985dq) obj2).A09(c37546Gg2.A09), user)) {
                    A1E.add(obj2);
                }
            }
            for (C120985dq c120985dq : A1E) {
                AbstractC39459Hbl abstractC39459Hbl = c37540Gfw.A0q;
                UserSession userSession = c37540Gfw.A0Y;
                C14360o3.A0B(c120985dq, 0);
                C14360o3.A0B(abstractC39459Hbl, 1);
                C14360o3.A0B(userSession, 2);
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM != null) {
                    C3YS.A00(userSession).A02(c38321qM, false);
                    abstractC39459Hbl.Ecj(c120985dq, EnumC75193Zm.A0F);
                }
                C37540Gfw.A02(c120985dq, c37540Gfw);
            }
        }
        C59952od c59952od = c37540Gfw.A07;
        if (c59952od != null && c59952od.A0C == null) {
            C14360o3.A0F("viewerAdapter");
            throw C00O.createAndThrow();
        }
        C0f9.A0A(1543448704, A032);
        C0f9.A0A(-1935632533, A03);
    }
}
