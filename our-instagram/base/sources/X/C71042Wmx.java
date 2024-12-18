package X;

/* renamed from: X.Wmx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71042Wmx implements InterfaceC150976qx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C86013sY A02;

    public C71042Wmx(C86013sY c86013sY, int i, int i2) {
        this.A02 = c86013sY;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC150976qx
    public final void Dbl(AbstractC125325le abstractC125325le, float f) {
        C86013sY c86013sY = this.A02;
        float f2 = this.A00;
        float f3 = 1.0f - 0.0f;
        float f4 = this.A01 - f2;
        float f5 = 0.0f;
        if (f3 != 0.0f) {
            f5 = (f - 0.0f) / f3;
        }
        c86013sY.A00((int) ((f5 * f4) + f2));
    }
}
