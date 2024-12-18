package X;

/* loaded from: classes7.dex */
public final class J1M implements InterfaceC64472w6 {
    public final /* synthetic */ C38016Go3 A00;

    @Override // X.InterfaceC64472w6
    public final void Dky() {
    }

    public J1M(C38016Go3 c38016Go3) {
        this.A00 = c38016Go3;
    }

    @Override // X.InterfaceC64472w6
    public final void DPp(String str) {
        String str2;
        C38016Go3 c38016Go3 = this.A00;
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        ILJ ilj = c38016Go3.A0J;
        C114485Es c114485Es = ilj.A01;
        C41718Idp c41718Idp = c114485Es.A08;
        if (c41718Idp == null) {
            C14360o3.A0F("chainingLogger");
            throw C00O.createAndThrow();
        }
        C3FQ c3fq = c41718Idp.A01;
        if (c3fq != null && c3fq.BM3() >= 0) {
            int A00 = C41718Idp.A00(c41718Idp);
            if (A00 >= c41718Idp.A04.getCount() || (str2 = C41718Idp.A02(c41718Idp, A00)) == null) {
                str2 = c41718Idp.A0A;
                A00 = 0;
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41718Idp.A07, "chaining_feed_load_more_button_show");
            AbstractC37300Gc1.A0r(A0f, c41718Idp.A0B);
            AbstractC37301Gc2.A12(A0f, C41718Idp.A01(c41718Idp, A00));
            A0f.AAP("media_id", str2);
            A0f.AAP("view_type", str);
            A0f.A9K("time_spent_ms", Long.valueOf(c41718Idp.A05.now() - c41718Idp.A00));
            A0f.Cht();
        }
        C62112sC c62112sC = c114485Es.A0D;
        if (c62112sC != null) {
            c62112sC.A01();
        }
        if (c114485Es.A0O) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - ilj.A00 > 1000) {
                ilj.A00 = currentTimeMillis;
                C114485Es.A01(c114485Es);
            }
        }
    }
}
