package X;

/* renamed from: X.Bn9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26488Bn9 extends AbstractC51572Yf {
    public final int A00;
    public final long A01;
    public final long A02;
    public final EnumC72394Xcg A03;
    public final C51722Yv A04;
    public final C93E A05;
    public final CharSequence A06;
    public final Integer A07;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        CharSequence charSequence = this.A06;
        C29474Cyo c29474Cyo = new C29474Cyo(this.A03, this.A07);
        int i = this.A00;
        C93E c93e = this.A05;
        C3F c3f = new C3F(this.A02, this.A01);
        C51722Yv c51722Yv = this.A04;
        if (c51722Yv == null) {
            c51722Yv = C51722Yv.A02;
        }
        return new C26471Bms(c51722Yv, c93e, C93G.TOP, c29474Cyo, c3f, charSequence, i);
    }

    public C26488Bn9(EnumC72394Xcg enumC72394Xcg, C51722Yv c51722Yv, C93E c93e, CharSequence charSequence, Integer num, int i, long j, long j2) {
        this.A06 = charSequence;
        this.A07 = num;
        this.A03 = enumC72394Xcg;
        this.A00 = i;
        this.A05 = c93e;
        this.A02 = j;
        this.A01 = j2;
        this.A04 = c51722Yv;
    }
}
