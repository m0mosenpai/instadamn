package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6RV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6RV extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C41181vS A03;
    public final /* synthetic */ InterfaceC145506h9 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6RV(UserSession userSession, C41181vS c41181vS, InterfaceC145506h9 interfaceC145506h9, float f, float f2) {
        super(2);
        this.A00 = f;
        this.A01 = f2;
        this.A02 = userSession;
        this.A03 = c41181vS;
        this.A04 = interfaceC145506h9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        r3 = r11.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r13 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (java.lang.Float.valueOf(r4) != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        r3 = r13.getRawY();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (java.lang.Float.valueOf(r3) == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        r6 = r11.A02;
        r1 = r11.A03;
        new X.ViewOnClickListenerC77633dn(r6, r1.A0k, null, new X.C29922DHk(r1, r11.A04, r3, r4, 2), true).onClick(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        return X.C0eB.A00;
     */
    @Override // X.InterfaceC16620sF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            android.view.View r12 = (android.view.View) r12
            android.view.MotionEvent r13 = (android.view.MotionEvent) r13
            r0 = 0
            X.C14360o3.A0B(r12, r0)
            if (r13 == 0) goto L3a
            float r4 = r13.getRawX()
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            if (r0 == 0) goto L3a
        L14:
            float r3 = r13.getRawY()
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            if (r0 == 0) goto L3f
        L1e:
            com.instagram.common.session.UserSession r6 = r11.A02
            X.1vS r1 = r11.A03
            java.lang.String r7 = r1.A0k
            r8 = 0
            X.6h9 r2 = r11.A04
            r5 = 2
            X.DHk r0 = new X.DHk
            r0.<init>(r1, r2, r3, r4, r5)
            r10 = 1
            X.3dn r5 = new X.3dn
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r5.onClick(r12)
            X.0eB r0 = X.C0eB.A00
            return r0
        L3a:
            float r4 = r11.A00
            if (r13 == 0) goto L3f
            goto L14
        L3f:
            float r3 = r11.A01
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6RV.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
