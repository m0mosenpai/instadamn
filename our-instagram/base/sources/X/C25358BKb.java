package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.BKb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25358BKb implements InterfaceC42271xH {
    public final /* synthetic */ C59952od A00;

    public C25358BKb(C59952od c59952od) {
        this.A00 = c59952od;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        C70063Cq c70063Cq = (C70063Cq) obj;
        C14360o3.A0B(c70063Cq, 0);
        C37546Gg2 c37546Gg2 = this.A00.A0C;
        if (c37546Gg2 == null) {
            C14360o3.A0F("viewerAdapter");
            throw C00O.createAndThrow();
        }
        User user = c70063Cq.A00;
        List<C120985dq> A0J = c37546Gg2.A0A.A0J();
        if (!(A0J instanceof Collection) || !A0J.isEmpty()) {
            for (C120985dq c120985dq : A0J) {
                UserSession userSession = c37546Gg2.A09;
                C4Ez.A00(userSession);
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM != null && C4F0.A01(userSession, c38321qM, user)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        X.C0f9.A0A(r0, r4);
        X.C0f9.A0A(-2049801149, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        return;
     */
    @Override // X.InterfaceC41501vz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 1566116452(0x5d590a64, float:9.774639E17)
            int r3 = X.C0f9.A03(r0)
            X.3Cq r12 = (X.C70063Cq) r12
            r0 = 1815179902(0x6c31727e, float:8.580822E26)
            int r4 = X.AbstractC167017dG.A0N(r12, r0)
            X.2od r5 = r11.A00
            X.Gg2 r9 = r5.A0C
            java.lang.String r10 = "viewerAdapter"
            if (r9 == 0) goto L80
            com.instagram.user.model.User r6 = r12.A00
            X.Gg8 r0 = r9.A0A
            java.util.List r0 = r0.A0J()
            java.util.ArrayList r8 = X.AbstractC166987dD.A1E()
            java.util.Iterator r7 = r0.iterator()
        L28:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r2 = r7.next()
            r0 = r2
            X.5dq r0 = (X.C120985dq) r0
            com.instagram.common.session.UserSession r1 = r9.A09
            X.C4Ez.A00(r1)
            X.1qM r0 = r0.A02
            if (r0 == 0) goto L28
            boolean r0 = X.C4F0.A01(r1, r0, r6)
            if (r0 == 0) goto L28
            r8.add(r2)
            goto L28
        L48:
            com.instagram.common.session.UserSession r0 = X.C59952od.A01(r5)
            X.C4Ez.A00(r0)
            java.util.Iterator r2 = r8.iterator()
        L53:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r2.next()
            X.5dq r0 = (X.C120985dq) r0
            X.1qM r1 = r0.A02
            if (r1 != 0) goto L70
            r0 = -1062054768(0xffffffffc0b25490, float:-5.5728226)
        L66:
            X.C0f9.A0A(r0, r4)
            r0 = -2049801149(0xffffffff85d28443, float:-1.979689E-35)
            X.C0f9.A0A(r0, r3)
            return
        L70:
            com.instagram.common.session.UserSession r0 = X.C59952od.A01(r5)
            X.C4F0.A00(r0, r1, r6)
            goto L53
        L78:
            X.Gg2 r0 = r5.A0C
            if (r0 == 0) goto L80
            r0 = -1813680612(0xffffffff93e56e1c, float:-5.7916303E-27)
            goto L66
        L80:
            X.C14360o3.A0F(r10)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25358BKb.onEvent(java.lang.Object):void");
    }
}
