package X;

/* renamed from: X.BmX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26450BmX extends AbstractC51572Yf {
    public final EnumC72438Xdi A00;
    public final EnumC72438Xdi A01;
    public final EnumC27423C8q A02;
    public final EnumC27424C8r A03;
    public final EnumC72394Xcg A04;
    public final C51722Yv A05;

    public C26450BmX(EnumC72438Xdi enumC72438Xdi, EnumC72438Xdi enumC72438Xdi2, EnumC27423C8q enumC27423C8q, EnumC27424C8r enumC27424C8r, EnumC72394Xcg enumC72394Xcg, C51722Yv c51722Yv) {
        AbstractC167027dH.A0a(1, enumC72438Xdi, enumC27424C8r, enumC27423C8q, enumC72394Xcg);
        this.A00 = enumC72438Xdi;
        this.A03 = enumC27424C8r;
        this.A02 = enumC27423C8q;
        this.A04 = enumC72394Xcg;
        this.A01 = enumC72438Xdi2;
        this.A05 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        EnumC72438Xdi enumC72438Xdi = this.A00;
        EnumC27424C8r enumC27424C8r = this.A03;
        C29467Cyh c29467Cyh = new C29467Cyh(enumC72438Xdi, this.A01, this.A02, enumC27424C8r, this.A04);
        C51722Yv c51722Yv = this.A05;
        if (c51722Yv == null) {
            c51722Yv = C51722Yv.A02;
        }
        return new C26324BkV(c51722Yv, c29467Cyh);
    }
}
