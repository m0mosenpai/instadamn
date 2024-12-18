package X;

/* renamed from: X.Bl1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26356Bl1 extends AbstractC51572Yf {
    public final EnumC72394Xcg A00;
    public final C51722Yv A01;
    public final Integer A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C29464Cye c29464Cye = new C29464Cye(this.A00, this.A02);
        C51722Yv c51722Yv = this.A01;
        if (c51722Yv == null) {
            c51722Yv = C51722Yv.A02;
        }
        return new C26325BkW(c51722Yv, c29464Cye);
    }

    public C26356Bl1(EnumC72394Xcg enumC72394Xcg, C51722Yv c51722Yv, Integer num) {
        this.A00 = enumC72394Xcg;
        this.A02 = num;
        this.A01 = c51722Yv;
    }
}
