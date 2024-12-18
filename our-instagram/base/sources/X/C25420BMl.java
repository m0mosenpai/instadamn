package X;

/* renamed from: X.BMl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25420BMl extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25420BMl(Object obj, int i, boolean z, boolean z2) {
        super(0);
        this.A00 = i;
        this.A02 = z;
        this.A01 = obj;
        this.A03 = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, ((X.LIE) r4.A01).A06, 36319991506935694L) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L5d;
                case 1: goto L1f;
                case 2: goto L3b;
                default: goto L5;
            }
        L5:
            boolean r0 = r4.A02
            if (r0 == 0) goto L19
            java.lang.Object r0 = r4.A01
            X.BLI r0 = (X.BLI) r0
            X.5dq r0 = r0.A06
            boolean r0 = r0.CdW()
            if (r0 != 0) goto L19
            boolean r0 = r4.A03
        L17:
            if (r0 == 0) goto L39
        L19:
            r0 = 1
        L1a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1f:
            boolean r0 = r4.A02
            if (r0 == 0) goto L39
            boolean r0 = r4.A03
            if (r0 != 0) goto L39
            java.lang.Object r0 = r4.A01
            X.LIE r0 = (X.LIE) r0
            com.instagram.common.session.UserSession r3 = r0.A06
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319991506673549(0x8108d700001f8d, double:3.0322471054628435E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            goto L17
        L39:
            r0 = 0
            goto L1a
        L3b:
            boolean r0 = r4.A02
            if (r0 == 0) goto L57
            boolean r0 = r4.A03
            if (r0 != 0) goto L57
            java.lang.Object r0 = r4.A01
            X.LIE r0 = (X.LIE) r0
            com.instagram.common.session.UserSession r3 = r0.A06
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319991506935694(0x8108d700041f8e, double:3.032247105628625E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 3
            if (r1 != 0) goto L58
        L57:
            r0 = 2
        L58:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L5d:
            boolean r0 = r4.A02
            if (r0 == 0) goto L81
            java.lang.Object r1 = r4.A01
            X.2XI r1 = (X.C2XI) r1
            r0 = 2
            X.BFF r3 = new X.BFF
            r3.<init>(r1, r0)
            float[] r0 = new float[r0]
            r0 = {x0096: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
        L70:
            android.animation.ValueAnimator r2 = X.AbstractC25232BEp.A0u(r0)
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            r2.addUpdateListener(r3)
            r2.start()
        L7f:
            r0 = 0
            return r0
        L81:
            boolean r0 = r4.A03
            if (r0 == 0) goto L7f
            java.lang.Object r1 = r4.A01
            X.2XI r1 = (X.C2XI) r1
            r0 = 3
            X.BFF r3 = new X.BFF
            r3.<init>(r1, r0)
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x009e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25420BMl.invoke():java.lang.Object");
    }
}
