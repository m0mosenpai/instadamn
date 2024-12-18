package X;

/* renamed from: X.VuE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69719VuE {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A08 = 0.0f;
    public float A09 = 0.0f;
    public float A07 = 0.0f;
    public float A04 = 0.0f;
    public float A05 = 0.0f;
    public float A06 = 0.0f;
    public float A03 = -3.4028235E38f;
    public float A02 = Float.MAX_VALUE;

    public final void A01(C69627VsU c69627VsU, float f) {
        C14360o3.A0B(c69627VsU, 0);
        c69627VsU.A05 += this.A08 * f;
        c69627VsU.A06 += this.A09 * f;
        c69627VsU.A02 += this.A04 * f;
        c69627VsU.A03 += this.A05 * f;
        c69627VsU.A04 += f * this.A06;
    }

    public final void A00(float f) {
        this.A08 += this.A00 * f;
        this.A09 = C17s.A02(this.A09 + (this.A01 * f), this.A03, this.A02);
        this.A04 += f * this.A07;
    }
}
