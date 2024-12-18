package X;

/* renamed from: X.Bne, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26519Bne extends AbstractC51572Yf {
    public final C51722Yv A00;
    public final C88 A01;
    public final C88 A02;
    public final C88 A03;
    public final CharSequence A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final InterfaceC16820sZ A09;
    public final boolean A0A = true;

    public C26519Bne(C51722Yv c51722Yv, C88 c88, C88 c882, C88 c883, CharSequence charSequence, Integer num, Integer num2, Integer num3, Integer num4, InterfaceC16820sZ interfaceC16820sZ) {
        this.A04 = charSequence;
        this.A05 = num;
        this.A07 = num2;
        this.A08 = num3;
        this.A02 = c88;
        this.A03 = c882;
        this.A06 = num4;
        this.A01 = c883;
        this.A09 = interfaceC16820sZ;
        this.A00 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        CharSequence charSequence = this.A04;
        Integer num = this.A05;
        Integer num2 = this.A07;
        Integer num3 = this.A08;
        return new C26558BoH(this.A00, new C29470Cyk(this.A02, this.A03, this.A01, num, num2, num3, this.A06), charSequence, charSequence, this.A09, this.A0A);
    }
}
