package X;

import com.facebook.R;

/* renamed from: X.YFe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73481YFe implements BCE {
    public XO3 A00;
    public XO2 A01;
    public C72867Xpa A02;
    public C72867Xpa A03;

    public static void A00(C72867Xpa c72867Xpa) {
        c72867Xpa.A02(2, 5120, "aPosition", false, 0);
        c72867Xpa.A02(2, 5120, AbstractC111324zv.A00(1874), false, 2);
    }

    @Override // X.BCE
    public final void COG(C22978ABc c22978ABc) {
        XO2 xo2;
        XO3 A01 = AHg.A01(c22978ABc, R.raw.uniform_texture_vert, R.raw.uniform_texture_frag);
        this.A00 = A01;
        AbstractC72243XZy A09 = AbstractC72046XLm.A09("uColor", A01.A03);
        if (A09 instanceof XO2) {
            xo2 = (XO2) A09;
        } else {
            xo2 = null;
        }
        this.A01 = xo2;
        C72301Xay c72301Xay = new C72301Xay(this.A00, C73480YFd.A09);
        this.A03 = c72301Xay;
        A00(c72301Xay);
        C72301Xay c72301Xay2 = new C72301Xay(this.A00, C73480YFd.A08);
        this.A02 = c72301Xay2;
        A00(c72301Xay2);
    }
}
