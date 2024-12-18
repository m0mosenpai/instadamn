package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.Bpd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26642Bpd extends AbstractC77583di {
    public static final C51532Yb A08 = AbstractC25230BEn.A0i(C28993Cqi.A00, 4);
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final InterfaceC16660sJ A05;
    public final InterfaceC16660sJ A06;
    public final C51722Yv A07;

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        Drawable A0E = AbstractC77623dm.A0E(c77993eR, this.A03);
        C51722Yv c51722Yv = this.A07;
        String str = this.A04;
        float f = this.A01;
        return AbstractC25225BEi.A0g(c51722Yv, new C29046CrZ(A0E, str, this.A06, this.A05, f, this.A00, this.A02), AbstractC25229BEm.A0c(c77993eR, A08, C29788DCg.A00, new C50268MHx(42, A0E, this)));
    }

    public C26642Bpd(C51722Yv c51722Yv, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, float f, float f2, int i, int i2) {
        C14360o3.A0B(c51722Yv, 8);
        this.A03 = i;
        this.A04 = str;
        this.A01 = f;
        this.A06 = interfaceC16660sJ;
        this.A05 = interfaceC16660sJ2;
        this.A02 = i2;
        this.A00 = f2;
        this.A07 = c51722Yv;
    }
}
