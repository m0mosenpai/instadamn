package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.BoV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26572BoV extends AbstractC51572Yf {
    public final long A00;
    public final InterfaceC16820sZ A01;
    public final long A02;
    public final long A03;
    public final C51722Yv A04;
    public final C88 A05;
    public final C88 A06;
    public final C88 A07;
    public final CharSequence A08;
    public final Integer A09;
    public final InterfaceC16820sZ A0A;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C88 c88 = this.A05;
        int A00 = AbstractC28406CgC.A00(c76223bS, c88);
        C88 c882 = this.A06;
        int A002 = AbstractC28406CgC.A00(c76223bS, c882);
        Drawable drawable = (Drawable) AbstractC77183d4.A00(c76223bS, new C57263Pbl(this, A002, c76223bS, A00, 6), new Object[]{c88, c882});
        InterfaceC16820sZ interfaceC16820sZ = this.A0A;
        if (interfaceC16820sZ != null) {
            C2WH A03 = A03(drawable, c76223bS);
            Integer num = C05F.A01;
            return new C26555BoE(A03, C51722Yv.A02, new C29472Cym(num, C05F.A00, num), interfaceC16820sZ, null);
        }
        return A03(drawable, c76223bS);
    }

    private final C2WH A03(Drawable drawable, C2Z1 c2z1) {
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0B = AbstractC25234BEr.A0B(null, AbstractC25225BEi.A0m(C05F.A01, 0.0f, 1), 0.0f);
        Integer num = C05F.A00;
        C51722Yv A00 = AbstractC25230BEn.A0e(AbstractC25233BEq.A0R(C9CU.A00(AbstractC25232BEp.A15(AbstractC25232BEp.A16(A0B, num, drawable), num, EnumC77683ds.FLEX_START), C05F.A1F, 2, AbstractC25229BEm.A0E()), AbstractC25225BEi.A0n(C05F.A04, 0, AbstractC25230BEn.A0L()), 0, AbstractC25229BEm.A0B()), num, C30181DRm.A01(this, 14), null).A00(this.A04);
        C2Z0 A0L = AbstractC25233BEq.A0L(c2z1);
        CharSequence charSequence = this.A08;
        Integer num2 = this.A09;
        return AbstractC25226BEj.A0l(new C26567BoQ(null, C93E.TEXT_START, this.A07, charSequence, num2, 1, this.A03, this.A02), A0L, c2z1, A00);
    }

    public C26572BoV(C51722Yv c51722Yv, C88 c88, C88 c882, C88 c883, CharSequence charSequence, Integer num, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, long j, long j2, long j3) {
        this.A08 = charSequence;
        this.A01 = interfaceC16820sZ;
        this.A0A = interfaceC16820sZ2;
        this.A07 = c88;
        this.A09 = num;
        this.A05 = c882;
        this.A06 = c883;
        this.A00 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A04 = c51722Yv;
    }
}
