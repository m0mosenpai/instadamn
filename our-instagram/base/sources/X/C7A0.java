package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7A0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7A0 {
    public final UserSession A00;
    public final InterfaceC164987Zn A01;
    public final InterfaceC165707ax A02;
    public final InterfaceC164967Zl A03;
    public final InterfaceC164957Zk A04;
    public final InterfaceC165717ay A05;
    public final AnonymousClass988 A06;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r2.startsWith("content://com.instagram.android.tam-attachment") != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(com.instagram.common.typedurl.ImageUrl r5, X.C158797Aq r6, X.C7A0 r7, X.JUG r8, boolean r9) {
        /*
            boolean r3 = r6.A0d
            if (r5 == 0) goto L18
            java.lang.String r2 = r5.getUrl()
            X.C14360o3.A07(r2)
            java.lang.String r1 = "content://com.instagram.android.tam-attachment"
            r0 = 1
            X.C14360o3.A0B(r1, r0)
            boolean r1 = r2.startsWith(r1)
            r0 = 0
            if (r1 == 0) goto L19
        L18:
            r0 = 1
        L19:
            if (r3 == 0) goto L1f
            if (r0 == 0) goto L1f
            r0 = 0
            return r0
        L1f:
            X.988 r0 = r7.A06
            X.0do r0 = r0.A0l
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            X.7ay r1 = r7.A05
            if (r1 == 0) goto L38
            com.instagram.feed.widget.IgProgressImageView r0 = r8.A09
            r1.CrE(r0, r6)
        L38:
            r0 = 1
            return r0
        L3a:
            X.7Zk r2 = r7.A04
            if (r2 == 0) goto L38
            java.util.List r6 = java.util.Collections.singletonList(r6)
            X.C14360o3.A07(r6)
            com.instagram.feed.widget.IgProgressImageView r3 = r8.A09
            android.graphics.RectF r1 = X.AbstractC13880nE.A0G(r3)
            r0 = 0
            X.E6B r4 = new X.E6B
            r4.<init>(r1, r0)
            java.lang.Integer r5 = X.C05F.A01
            r7 = 0
            r8 = r9
            r9 = r7
            r2.CrH(r3, r4, r5, r6, r7, r8, r9)
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7A0.A00(com.instagram.common.typedurl.ImageUrl, X.7Aq, X.7A0, X.JUG, boolean):boolean");
    }

    public C7A0(UserSession userSession, InterfaceC164987Zn interfaceC164987Zn, InterfaceC165707ax interfaceC165707ax, InterfaceC164957Zk interfaceC164957Zk, InterfaceC165717ay interfaceC165717ay, InterfaceC164967Zl interfaceC164967Zl, AnonymousClass988 anonymousClass988) {
        this.A03 = interfaceC164967Zl;
        this.A01 = interfaceC164987Zn;
        this.A05 = interfaceC165717ay;
        this.A02 = interfaceC165707ax;
        this.A04 = interfaceC164957Zk;
        this.A00 = userSession;
        this.A06 = anonymousClass988;
    }
}
