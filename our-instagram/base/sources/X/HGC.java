package X;

/* loaded from: classes7.dex */
public final class HGC extends C1P1 {
    public final /* synthetic */ C70Y A00;
    public final /* synthetic */ String A01;

    public HGC(C70Y c70y, String str) {
        this.A00 = c70y;
        this.A01 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(814877658);
        C40791um c40791um = (C40791um) abstractC115105If.A00();
        if (c40791um != null) {
            int i = c40791um.mStatusCode;
            if (i == 400) {
                C70Y c70y = this.A00;
                C1563470e c1563470e = c70y.A07;
                String str = this.A01;
                EnumC39539HdB enumC39539HdB = EnumC39539HdB.A02;
                c1563470e.A0E(enumC39539HdB, str);
                AbstractC25651Mw.A00(c70y.A06).E4s(new C71I(enumC39539HdB, null, str, null, null, false));
            } else if (AbstractC37423Ge3.A00(i)) {
                C70Y c70y2 = this.A00;
                C1563470e c1563470e2 = c70y2.A07;
                String str2 = this.A01;
                EnumC39539HdB enumC39539HdB2 = EnumC39539HdB.A03;
                c1563470e2.A0E(enumC39539HdB2, str2);
                C70Y.A01(null, c70y2, enumC39539HdB2, str2, false);
            }
            C0f9.A0A(-219714197, A03);
        }
        C70Y c70y3 = this.A00;
        C1563470e c1563470e3 = c70y3.A07;
        String str3 = this.A01;
        EnumC39539HdB enumC39539HdB3 = EnumC39539HdB.A02;
        c1563470e3.A0E(enumC39539HdB3, str3);
        C70Y.A01(c1563470e3.A06(str3), c70y3, enumC39539HdB3, str3, false);
        C0f9.A0A(-219714197, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        C0f9.A0A(266913843, C0f9.A03(-1974786399));
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1639091236);
        C38888HAk c38888HAk = (C38888HAk) obj;
        int A032 = C0f9.A03(273899341);
        C70Y c70y = this.A00;
        C1563470e c1563470e = c70y.A07;
        String str = this.A01;
        EnumC39539HdB enumC39539HdB = EnumC39539HdB.A03;
        c1563470e.A0E(enumC39539HdB, str);
        C14360o3.A0B(c38888HAk, 0);
        C1563470e.A03(c1563470e, c38888HAk.A02, c38888HAk.A01);
        c70y.A00 = c38888HAk.A00;
        C70Y.A01(c1563470e.A06(str), c70y, enumC39539HdB, str, false);
        C0f9.A0A(2099519507, A032);
        C0f9.A0A(770097391, A03);
    }
}
