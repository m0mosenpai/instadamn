package X;

import java.util.concurrent.Executor;

/* renamed from: X.Pzq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58677Pzq extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C1339463c A00;
    public final /* synthetic */ C58678Pzr A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Executor A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58677Pzq(C1339463c c1339463c, C58678Pzr c58678Pzr, String str, String str2, String str3, Executor executor, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        super(1);
        this.A00 = c1339463c;
        this.A04 = str;
        this.A06 = interfaceC16660sJ;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = c58678Pzr;
        this.A07 = z;
        this.A08 = z2;
        this.A05 = executor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r9.A08 != false) goto L20;
     */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            X.Q0R r10 = (X.Q0R) r10
            if (r10 == 0) goto L68
            X.0e4 r6 = r10.A00
        L6:
            X.63c r2 = r9.A00
            java.util.Set r1 = r2.A04
            java.lang.String r0 = r9.A04
            r1.remove(r0)
            if (r6 == 0) goto L50
            java.lang.Object r3 = r6.A00
            X.Q0J r3 = (X.Q0J) r3
            boolean r0 = r3 instanceof X.Q0I
            if (r0 == 0) goto L3a
            X.0sJ r5 = r9.A06
            java.lang.String r4 = r9.A03
            X.Q0I r3 = (X.Q0I) r3
            X.THk r2 = r3.A01
            java.lang.Object r1 = r6.A01
            X.Q03 r1 = (X.Q03) r1
            X.Q0Q r0 = new X.Q0Q
            r0.<init>(r1, r2, r4)
            r5.invoke(r0)
            X.Q0E r0 = r3.A00
            X.Q0A r3 = new X.Q0A
            r3.<init>(r0, r1, r4)
        L34:
            r5.invoke(r3)
        L37:
            X.0eB r0 = X.C0eB.A00
            return r0
        L3a:
            boolean r0 = r3 instanceof X.C60926Rbg
            if (r0 == 0) goto L6a
            X.0sJ r5 = r9.A06
            java.lang.String r2 = r9.A03
            X.Rbg r3 = (X.C60926Rbg) r3
            X.THk r1 = r3.A00
            java.lang.Object r0 = r6.A01
            X.Q03 r0 = (X.Q03) r0
            X.Q0Q r3 = new X.Q0Q
            r3.<init>(r0, r1, r2)
            goto L34
        L50:
            java.lang.String r4 = r9.A03
            java.lang.String r5 = r9.A02
            X.Pzr r3 = r9.A01
            boolean r0 = r9.A07
            if (r0 == 0) goto L5f
            boolean r0 = r9.A08
            r8 = 1
            if (r0 == 0) goto L60
        L5f:
            r8 = 0
        L60:
            java.util.concurrent.Executor r6 = r9.A05
            X.0sJ r7 = r9.A06
            r2.A00(r3, r4, r5, r6, r7, r8)
            goto L37
        L68:
            r6 = 0
            goto L6
        L6a:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58677Pzq.invoke(java.lang.Object):java.lang.Object");
    }
}
