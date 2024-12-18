package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.Pgl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57573Pgl extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ InterfaceC74963Ym A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16620sF A05;
    public final /* synthetic */ InterfaceC16600sD A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57573Pgl(InterfaceC74963Ym interfaceC74963Ym, C38321qM c38321qM, Reel reel, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, InterfaceC16600sD interfaceC16600sD, boolean z) {
        super(1);
        this.A01 = c38321qM;
        this.A07 = z;
        this.A02 = reel;
        this.A00 = interfaceC74963Ym;
        this.A04 = interfaceC16820sZ;
        this.A05 = interfaceC16620sF;
        this.A03 = str;
        this.A06 = interfaceC16600sD;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            X.1qM r3 = r9.A01
            if (r3 == 0) goto L95
            java.lang.String r6 = r3.getId()
        Lc:
            boolean r8 = r9.A07
            if (r8 != 0) goto L93
            com.instagram.model.reels.Reel r1 = r9.A02
            if (r6 == 0) goto L93
            X.3Ym r0 = r9.A00
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            java.util.List r0 = r1.A0O(r0)
            X.C14360o3.A07(r0)
            java.util.Iterator r5 = r0.iterator()
            r7 = 0
            r4 = 0
        L29:
            boolean r0 = r5.hasNext()
            r2 = -1
            r1 = 1
            if (r0 == 0) goto L91
            java.lang.Object r0 = r5.next()
            X.1vS r0 = (X.C41181vS) r0
            X.1qM r0 = r0.A0b
            if (r0 == 0) goto L8e
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L8e
            boolean r0 = r0.startsWith(r6)
            if (r0 != r1) goto L8e
        L47:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            int r0 = r0.intValue()
            if (r0 == r2) goto L52
            r7 = r0
        L52:
            X.3Ym r0 = r9.A00
            java.lang.Object r6 = r0.getValue()
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            X.0sF r2 = r9.A05
            java.lang.String r1 = r9.A03
            r0 = 12
            X.MHi r5 = new X.MHi
            r5.<init>(r3, r2, r1, r0)
            X.0sZ r4 = r9.A04
            X.0sD r2 = r9.A06
            com.instagram.model.reels.Reel r1 = r9.A02
            r0 = 18
            X.Dbq r3 = new X.Dbq
            r3.<init>(r7, r0, r1, r2)
            if (r8 == 0) goto L7d
            r5.invoke()
            r4.invoke()
        L7a:
            X.0eB r0 = X.C0eB.A00
            return r0
        L7d:
            X.Ow3 r2 = X.Ow3.A00(r6)
            X.C14360o3.A07(r2)
            r1 = 1
            X.NS9 r0 = new X.NS9
            r0.<init>(r2, r1)
            r3.invoke(r10, r0)
            goto L7a
        L8e:
            int r4 = r4 + 1
            goto L29
        L91:
            r4 = -1
            goto L47
        L93:
            r7 = 0
            goto L52
        L95:
            r6 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57573Pgl.invoke(java.lang.Object):java.lang.Object");
    }
}
