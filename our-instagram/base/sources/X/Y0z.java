package X;

import android.view.Choreographer;

/* loaded from: classes12.dex */
public final class Y0z {
    public XPJ A00;
    public AbstractC24941Jv A01 = null;
    public boolean A02;
    public final C0Gd A03;

    public static void A00(Y0z y0z) {
        if (!y0z.A02) {
            y0z.A02 = true;
            XPJ xpj = new XPJ(Choreographer.getInstance(), y0z.A03, y0z);
            XPJ xpj2 = y0z.A00;
            if (xpj2 != null) {
                xpj2.A01();
            }
            y0z.A00 = xpj;
        }
    }

    public Y0z(C0Gd c0Gd) {
        this.A03 = c0Gd;
    }

    public final void A01(AbstractC24941Jv abstractC24941Jv) {
        this.A01 = abstractC24941Jv;
    }
}
