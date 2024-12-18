package X;

/* loaded from: classes7.dex */
public final class HGZ extends C1P1 {
    public final C1P1 A00;
    public final HYE A01;

    public HGZ(C1P1 c1p1, HYE hye) {
        this.A00 = c1p1;
        this.A01 = hye;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(978823229);
        C14360o3.A0B(abstractC115105If, 0);
        HYE hye = this.A01;
        if (hye != null) {
            hye.A02 = C05F.A0Y;
            hye.A04 = false;
        }
        super.onFail(abstractC115105If);
        this.A00.onFail(abstractC115105If);
        C0f9.A0A(1290977175, A03);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 100898563);
        super.onFailInBackground(abstractC115105If);
        this.A00.onFailInBackground(abstractC115105If);
        C0f9.A0A(1129252056, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1699029235);
        HYE hye = this.A01;
        if (hye != null) {
            hye.A01 = null;
        }
        super.onFinish();
        this.A00.onFinish();
        C0f9.A0A(1949800032, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(2110067693);
        super.onStart();
        this.A00.onStart();
        C0f9.A0A(1139731788, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r7.A02 == X.C05F.A00) goto L10;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 37469086(0x23bbb9e, float:1.3792434E-37)
            int r5 = X.C0f9.A03(r0)
            X.1up r11 = (X.InterfaceC40821up) r11
            r0 = 973599433(0x3a07f2c9, float:5.186019E-4)
            int r6 = X.C0f9.A03(r0)
            r8 = 0
            X.C14360o3.A0B(r11, r8)
            X.HYE r7 = r10.A01
            if (r7 == 0) goto L54
            java.lang.String r9 = r7.A03
            if (r9 == 0) goto L38
            com.instagram.common.session.UserSession r4 = r7.A05
            X.1ID r3 = X.C1IC.A00(r4)
            boolean r0 = r7.A04
            if (r0 == 0) goto L2d
            java.lang.Integer r2 = r7.A02
            java.lang.Integer r1 = X.C05F.A00
            r0 = 0
            if (r2 != r1) goto L2e
        L2d:
            r0 = 1
        L2e:
            r3.A03(r9, r0)
            X.1ID r0 = X.C1IC.A00(r4)
            X.C1ID.A00(r0)
        L38:
            r4 = r11
            X.2h1 r4 = (X.InterfaceC55612h1) r4
            X.0nS r3 = X.C14120nc.A00()
            X.C14360o3.A07(r3)
            r0 = r11
            X.1um r0 = (X.C40791um) r0
            long r1 = r0.mResponseTimestamp
            X.4cU r0 = new X.4cU
            r0.<init>(r4, r3, r1)
            r7.A00 = r0
            java.lang.Integer r0 = X.C05F.A0Y
            r7.A02 = r0
            r7.A04 = r8
        L54:
            super.onSuccess(r11)
            X.1P1 r0 = r10.A00
            r0.onSuccess(r11)
            r0 = 1383241071(0x5272956f, float:2.6047229E11)
            X.C0f9.A0A(r0, r6)
            r0 = -2121536660(0xffffffff818beb6c, float:-5.139835E-38)
            X.C0f9.A0A(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HGZ.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-2105967354);
        int A0N = AbstractC167017dG.A0N(obj, 143496342);
        super.onSuccessInBackground(obj);
        this.A00.onSuccessInBackground(obj);
        C0f9.A0A(-115860635, A0N);
        C0f9.A0A(1573243075, A03);
    }
}
