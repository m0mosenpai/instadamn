package X;

/* renamed from: X.Bn8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26487Bn8 extends AbstractC51572Yf {
    public final EnumC72438Xdi A00;
    public final EnumC72438Xdi A01;
    public final EnumC27424C8r A02;
    public final C51722Yv A03;
    public final Integer A04;
    public final String A05;
    public final InterfaceC16820sZ A06;
    public final boolean A07;

    public C26487Bn8(EnumC72438Xdi enumC72438Xdi, EnumC72438Xdi enumC72438Xdi2, EnumC27424C8r enumC27424C8r, C51722Yv c51722Yv, Integer num, String str, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC25233BEq.A0v(1, enumC72438Xdi, enumC27424C8r, num);
        this.A00 = enumC72438Xdi;
        this.A02 = enumC27424C8r;
        this.A04 = num;
        this.A01 = enumC72438Xdi2;
        this.A07 = true;
        this.A05 = str;
        this.A06 = interfaceC16820sZ;
        this.A03 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C51722Yv c51722Yv;
        C51722Yv c51722Yv2;
        int i;
        C51722Yv A00;
        EnumC72394Xcg enumC72394Xcg;
        C51722Yv c51722Yv3 = this.A03;
        long A0E = AbstractC25229BEm.A0E();
        if (c51722Yv3 != null) {
            c51722Yv = C51722Yv.A02;
            c51722Yv2 = c51722Yv;
            i = 2;
            A00 = C9CU.A00(null, C05F.A1F, 2, A0E);
        } else {
            c51722Yv3 = new C51722Yv(null, null);
            c51722Yv = C51722Yv.A02;
            c51722Yv2 = c51722Yv;
            i = 2;
            A00 = C9CU.A00(null, C05F.A1F, 2, A0E);
        }
        C51722Yv A002 = c51722Yv3.A00(A00);
        boolean z = this.A07;
        C51722Yv A003 = A002.A00(AbstractC25232BEp.A16(null, C05F.A0F, Boolean.valueOf(z)));
        String str = this.A05;
        if (str != null) {
            c51722Yv = C9CV.A00(null, C05F.A0N, str, 0);
        }
        C51722Yv A004 = A003.A00(c51722Yv);
        Integer num = C05F.A01;
        C51722Yv A005 = A004.A00(C9CV.A00(null, num, "android.widget.Button", 0));
        float f = 1.0f;
        if (!z) {
            f = 0.3f;
        }
        C51722Yv A006 = new C51722Yv(null, null).A00(AbstractC171007jr.A00(c51722Yv2, f));
        InterfaceC16820sZ interfaceC16820sZ = this.A06;
        if (interfaceC16820sZ == null || !z) {
            A006 = A005.A00(A006);
        }
        EnumC72438Xdi enumC72438Xdi = this.A00;
        EnumC27424C8r enumC27424C8r = this.A02;
        EnumC27423C8q enumC27423C8q = EnumC27423C8q.SIZE_24;
        int intValue = this.A04.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != i) {
                    if (intValue != 3) {
                        if (intValue == 4) {
                            enumC72394Xcg = EnumC72394Xcg.A1p;
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        enumC72394Xcg = EnumC72394Xcg.A0u;
                    }
                } else {
                    enumC72394Xcg = EnumC72394Xcg.A1W;
                }
            } else {
                enumC72394Xcg = EnumC72394Xcg.A2A;
            }
        } else {
            enumC72394Xcg = EnumC72394Xcg.A1o;
        }
        C26450BmX c26450BmX = new C26450BmX(enumC72438Xdi, this.A01, enumC27423C8q, enumC27424C8r, enumC72394Xcg, A006);
        if (interfaceC16820sZ != null && z) {
            return new C26451BmY(c26450BmX, A005, C05F.A00, C05F.A0C, num, interfaceC16820sZ);
        }
        return c26450BmX;
    }
}
