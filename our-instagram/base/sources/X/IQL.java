package X;

import android.app.Activity;

/* loaded from: classes7.dex */
public abstract class IQL {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r1 == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(X.C38321qM r1) {
        /*
            X.1rF r0 = r1.A0C
            X.3wq r0 = r0.B3J()
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.B3M()
            if (r0 == 0) goto L15
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L16
        L15:
            r0 = 1
        L16:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IQL.A01(X.1qM):boolean");
    }

    public static final void A00(Activity activity, C38321qM c38321qM) {
        InterfaceC88353wq B3J;
        String B3M;
        if (A01(c38321qM) && (B3J = c38321qM.A0C.B3J()) != null && (B3M = B3J.B3M()) != null) {
            C193328hC A0H = AbstractC31171DnF.A0H(activity);
            A0H.A0A(2131962008);
            A0H.A0r(B3M);
            A0H.A0J(new DialogInterfaceOnClickListenerC35446Fk3(B3M, activity, 4), 2131956834);
            AbstractC31176DnK.A14(new DialogInterfaceOnClickListenerC41789If5(0), A0H);
        }
    }
}
