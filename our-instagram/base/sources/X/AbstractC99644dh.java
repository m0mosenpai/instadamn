package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.IgTextLayoutView;
import java.util.Arrays;

/* renamed from: X.4dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC99644dh {
    public static final int A00(C79233gU c79233gU) {
        Object valueOf;
        C14360o3.A0B(c79233gU, 0);
        Object obj = c79233gU.A03.A3b.A00;
        C84923qg c84923qg = c79233gU.A01;
        if (c84923qg.A02()) {
            valueOf = Integer.valueOf(c79233gU.A00);
        } else {
            valueOf = Boolean.valueOf(c84923qg.A0O);
        }
        return Arrays.hashCode(new Object[]{valueOf, obj});
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (X.C3YV.A06(r4, r5, r7.A03.A0o, r6.getModuleName()) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C206389Bv A01(com.instagram.common.session.UserSession r4, X.C38321qM r5, X.InterfaceC60442pS r6, X.C79233gU r7) {
        /*
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            r3 = 1
            r0 = 2
            X.C14360o3.A0B(r4, r0)
            r0 = 3
            X.C14360o3.A0B(r6, r0)
            X.3qg r0 = r7.A01
            boolean r0 = r0.A02()
            if (r0 == 0) goto L24
            java.lang.String r1 = r6.getModuleName()
            X.3Zb r0 = r7.A03
            X.341 r0 = r0.A0o
            boolean r0 = X.C3YV.A06(r4, r5, r0, r1)
            r2 = 1
            if (r0 != 0) goto L25
        L24:
            r2 = 0
        L25:
            java.lang.String r1 = r5.getId()
            if (r1 == 0) goto L31
            X.9Bv r0 = new X.9Bv
            r0.<init>(r1, r2, r3)
            return r0
        L31:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC99644dh.A01(com.instagram.common.session.UserSession, X.1qM, X.2pS, X.3gU):X.9Bv");
    }

    public static final void A02(C87323uq c87323uq) {
        C38321qM A01;
        UserSession userSession = c87323uq.A01;
        if (userSession != null) {
            C75113Zb c75113Zb = c87323uq.A04;
            EnumC71343Hv enumC71343Hv = EnumC71343Hv.A0j;
            Integer num = null;
            if (c75113Zb != null && c75113Zb.A3e) {
                num = Integer.valueOf(c75113Zb.A02);
            }
            C71313Hs A00 = C71313Hs.A00(userSession);
            C14360o3.A07(A00);
            IgTextLayoutView igTextLayoutView = c87323uq.A0C;
            A00.A08(igTextLayoutView, new C71353Hw(num, enumC71343Hv, null, null));
            String str = c87323uq.A08;
            InterfaceC60442pS interfaceC60442pS = c87323uq.A03;
            if (str != null && interfaceC60442pS != null && (A01 = C1DX.A03.A01(userSession, "FeedCommentRowViewBinder", str)) != null) {
                A00.A0A(igTextLayoutView, new C79623hD(null, userSession, A01, interfaceC60442pS));
            }
        }
    }
}
