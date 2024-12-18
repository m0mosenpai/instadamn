package X;

/* renamed from: X.8RE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8RE extends AbstractC65716Tsp {
    public final C8RF A00;

    @Override // X.AbstractC65716Tsp
    public final void A03(float f) {
        this.A00.A01 = f * 62.5f;
    }

    @Override // X.AbstractC65716Tsp
    public final boolean A07(long j) {
        C8RF c8rf = this.A00;
        float f = this.A03;
        float f2 = this.A04;
        C68873VdV c68873VdV = c8rf.A02;
        float f3 = (float) j;
        float f4 = c8rf.A00;
        float exp = (float) (f2 * Math.exp((f3 / 1000.0f) * f4));
        c68873VdV.A01 = exp;
        float exp2 = (float) ((f - r11) + ((f2 / f4) * Math.exp((f4 * f3) / 1000.0f)));
        c68873VdV.A00 = exp2;
        float abs = Math.abs(exp);
        float f5 = c8rf.A01;
        if (abs < f5) {
            c68873VdV.A01 = 0.0f;
            exp = 0.0f;
        }
        this.A03 = exp2;
        this.A04 = exp;
        float f6 = this.A01;
        if (exp2 >= f6) {
            f6 = super.A00;
            if (exp2 <= f6) {
                if (exp2 >= f6 || exp2 <= f6 || Math.abs(exp) < f5) {
                    return true;
                }
                return false;
            }
        }
        this.A03 = f6;
        return true;
    }

    public C8RE(VK3 vk3, Object obj) {
        super(vk3, obj);
        C8RF c8rf = new C8RF();
        this.A00 = c8rf;
        c8rf.A01 = this.A02 * 0.75f * 62.5f;
    }
}
