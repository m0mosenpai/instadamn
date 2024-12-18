package X;

/* renamed from: X.BnK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26499BnK extends AbstractC51572Yf {
    public final EnumC27424C8r A00;
    public final C51722Yv A01;
    public final C28138Cal A02;
    public final CharSequence A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final InterfaceC16820sZ A07;
    public final boolean A08;

    public C26499BnK(EnumC27424C8r enumC27424C8r, C51722Yv c51722Yv, C28138Cal c28138Cal, CharSequence charSequence, Integer num, Integer num2, Integer num3, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C14360o3.A0B(c28138Cal, 7);
        this.A03 = charSequence;
        this.A04 = num;
        this.A05 = num2;
        this.A06 = num3;
        this.A00 = enumC27424C8r;
        this.A02 = c28138Cal;
        this.A08 = z;
        this.A07 = interfaceC16820sZ;
        this.A01 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        CharSequence charSequence = this.A03;
        C29469Cyj c29469Cyj = new C29469Cyj(this.A00, this.A04, this.A05, this.A06);
        InterfaceC16820sZ interfaceC16820sZ = this.A07;
        boolean z = this.A08;
        C51722Yv c51722Yv = this.A01;
        if (c51722Yv == null) {
            c51722Yv = C51722Yv.A02;
        }
        return new C26558BoH(c51722Yv, c29469Cyj, charSequence, charSequence, interfaceC16820sZ, z);
    }
}
