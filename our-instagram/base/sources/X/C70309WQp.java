package X;

/* renamed from: X.WQp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70309WQp implements InterfaceC58362lv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C70309WQp(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A01 = obj5;
        this.A02 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A03 = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r2 != 1) goto L11;
     */
    @Override // X.InterfaceC58362lv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onChanged(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            if (r0 == 0) goto L42
            X.Sjd r8 = (X.C63406Sjd) r8
            boolean r0 = X.C63406Sjd.A0G(r8)
            if (r0 == 0) goto L21
            java.lang.Throwable r1 = r8.A02
            boolean r0 = r1 instanceof X.C64864TXp
            if (r0 == 0) goto L3f
            X.TXp r1 = (X.C64864TXp) r1
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            int r2 = r1.A00
            r1 = 1
            r0 = 12
            if (r2 == r0) goto L3f
            if (r2 == r1) goto L3f
        L21:
            r1 = 0
        L22:
            java.lang.Object r0 = r7.A02
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            java.lang.Object r0 = r7.A05
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            java.lang.Object r0 = r7.A04
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            java.lang.Object r0 = r7.A03
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r1)
            return
        L3f:
            r1 = 8
            goto L22
        L42:
            X.W4v r8 = (X.AbstractC70120W4v) r8
            java.lang.Object r6 = r7.A03
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r6.removeAllViews()
            if (r8 == 0) goto L8a
            java.lang.Object r0 = r7.A05
            X.X9j r0 = (X.InterfaceC71899X9j) r0
            java.lang.Object r3 = r7.A02
            X.4kP r3 = (X.C102884kP) r3
            java.lang.Object r2 = r7.A01
            X.6FG r2 = (X.C6FG) r2
            X.UHq r0 = r0.D8Y(r6)
            r8.A01(r0)
            android.view.View r0 = r0.itemView
            r6.addView(r0)
            r0 = 2
            r5 = 0
            int r1 = r3.A03(r0, r5)
            r0 = 3
            int r0 = r3.A03(r0, r5)
            r6.measure(r1, r0)
            X.630 r4 = X.AnonymousClass634.A02(r2)
            int r0 = r3.A04
            long r2 = (long) r0
            X.V4b r1 = new X.V4b
            r1.<init>(r6, r5)
            X.WfI r0 = new X.WfI
            r0.<init>(r2)
            r4.A0G(r0, r1)
            r4.A09()
        L8a:
            java.lang.Object r0 = r7.A04
            X.UFY r0 = (X.UFY) r0
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70309WQp.onChanged(java.lang.Object):void");
    }
}
