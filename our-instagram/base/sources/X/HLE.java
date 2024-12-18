package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HLE extends C5SE {
    public final C37644Ghd A00;
    public final UserSession A01;
    public final C40971v4 A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HLE(X.C37644Ghd r2, com.instagram.common.session.UserSession r3, X.C40971v4 r4) {
        /*
            r1 = this;
            X.3Zb r0 = r2.A0E
            if (r0 == 0) goto L12
            X.GyJ r0 = r0.A06()
            r1.<init>(r3, r4, r0)
            r1.A01 = r3
            r1.A02 = r4
            r1.A00 = r2
            return
        L12:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HLE.<init>(X.Ghd, com.instagram.common.session.UserSession, X.1v4):void");
    }

    @Override // X.C5SE, X.C5H9
    public final void A8X(C82713mZ c82713mZ, InterfaceC60442pS interfaceC60442pS, String str) {
        AbstractC167017dG.A1O(str, c82713mZ);
        super.A8X(c82713mZ, interfaceC60442pS, str);
        C40971v4 c40971v4 = this.A02;
        if (c40971v4.A0x && AbstractC37587Ggi.A00(this.A01)) {
            c82713mZ.A5d = c40971v4.A0f;
            c82713mZ.A8I = true;
            c82713mZ.A3W = AbstractC31171DnF.A0V(this.A00.A06());
        }
    }
}
