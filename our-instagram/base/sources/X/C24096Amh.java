package X;

/* renamed from: X.Amh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24096Amh implements InterfaceC150976qx {
    public final int A00;
    public final Object A01;

    public C24096Amh(C188708Xk c188708Xk, int i) {
        this.A00 = i;
        this.A01 = c188708Xk;
    }

    @Override // X.InterfaceC150976qx
    public final void Dbl(AbstractC125325le abstractC125325le, float f) {
        float f2;
        int i = this.A00;
        C188708Xk c188708Xk = (C188708Xk) this.A01;
        if (i != 0) {
            f2 = 1.0f - f;
        } else {
            double d = f;
            if (d >= 0.25d) {
                f2 = (float) AbstractC70163Da.A04(d - 0.25d, 0.0d, 1.0d - 0.25d, 0.0d, 1.0d);
            } else {
                f2 = 0.0f;
            }
        }
        c188708Xk.Cz0(f2, -16777216);
    }
}
