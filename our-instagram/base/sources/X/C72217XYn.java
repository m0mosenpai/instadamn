package X;

/* renamed from: X.XYn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72217XYn extends Y1j {
    public final float A00;

    public final boolean A00(float f, float f2, float f3) {
        if (AbstractC166987dD.A01(f2, this.A01) > f || AbstractC166987dD.A01(f3, super.A00) > f) {
            return false;
        }
        float f4 = this.A00;
        float A01 = AbstractC166987dD.A01(f, f4);
        if (A01 > 1.0f && A01 > f4) {
            return false;
        }
        return true;
    }

    public C72217XYn(float f, float f2, float f3) {
        super(f, f2);
        this.A00 = f3;
    }
}
