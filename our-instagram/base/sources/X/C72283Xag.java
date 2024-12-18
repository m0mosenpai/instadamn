package X;

import java.nio.FloatBuffer;

/* renamed from: X.Xag, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C72283Xag extends AbstractC73478YFb {
    public int A00;
    public int A01;
    public C72236XZn A02;
    public XOM A03;
    public XOM A04;
    public XO2 A05;
    public C22978ABc A06;

    @Override // X.YQ3
    public void CNp(C22978ABc c22978ABc) {
        XO3 A02;
        C72236XZn c72236XZn;
        XOM xom;
        XOM xom2;
        XO2 xo2;
        if (this.A06 == null) {
            this.A06 = c22978ABc;
            try {
                int i = this.A00;
                if (i != 0) {
                    A02 = AHg.A01(c22978ABc, this.A01, i);
                } else {
                    A02 = AHg.A02(null, null);
                }
                super.A04 = A02;
                AbstractC72243XZy A09 = AbstractC72046XLm.A09("uMVP", A02.A03);
                if (A09 == null) {
                    c72236XZn = null;
                } else if (A09 instanceof C72236XZn) {
                    c72236XZn = (C72236XZn) A09;
                } else {
                    throw AbstractC58319PtB.A0k("brush program must have ", "uMVP", " as floatMatrix4 uniform");
                }
                this.A02 = c72236XZn;
                if (c72236XZn == null) {
                    XO3 xo3 = super.A04;
                    C14360o3.A0B(xo3, 0);
                    AbstractC72243XZy A092 = AbstractC72046XLm.A09("uMVPMatrix", xo3.A03);
                    if (A092 != null) {
                        if (A092 instanceof C72236XZn) {
                            C72236XZn c72236XZn2 = (C72236XZn) A092;
                            if (c72236XZn2 != null) {
                                this.A02 = c72236XZn2;
                            }
                        } else {
                            throw AbstractC58319PtB.A0k("brush program must have ", "uMVPMatrix", " as floatMatrix4 uniform");
                        }
                    }
                    throw AbstractC58319PtB.A0k("program must have ", "uMVPMatrix", " as floatMatrix4 uniform");
                }
                XO3 xo32 = super.A04;
                C14360o3.A0B(xo32, 0);
                AbstractC72243XZy A093 = AbstractC72046XLm.A09("uNativeScale", xo32.A03);
                if (A093 instanceof XOM) {
                    xom = (XOM) A093;
                } else {
                    xom = null;
                }
                this.A03 = xom;
                if (xom != null) {
                    xom.A00(1.0f);
                }
                XO3 xo33 = super.A04;
                C14360o3.A0B(xo33, 0);
                AbstractC72243XZy A094 = AbstractC72046XLm.A09("uSize", xo33.A03);
                if (A094 instanceof XOM) {
                    xom2 = (XOM) A094;
                } else {
                    xom2 = null;
                }
                this.A04 = xom2;
                XO3 xo34 = super.A04;
                C14360o3.A0B(xo34, 0);
                AbstractC72243XZy A095 = AbstractC72046XLm.A09("uColor", xo34.A03);
                if (A095 instanceof XO2) {
                    xo2 = (XO2) A095;
                } else {
                    xo2 = null;
                }
                this.A05 = xo2;
            } catch (RuntimeException e) {
                C0w9.A07("IGDrawKit", e);
                super.A04 = null;
            }
        }
    }

    @Override // X.YQ3
    public final void EYc(float[] fArr) {
        this.A07 = fArr;
        C72236XZn c72236XZn = this.A02;
        if (c72236XZn != null) {
            c72236XZn.A00 = FloatBuffer.wrap(fArr);
            ((AbstractC72243XZy) c72236XZn).A00 = true;
        }
    }

    @Override // X.YQ3
    public final C22978ABc ArF() {
        return this.A06;
    }
}
