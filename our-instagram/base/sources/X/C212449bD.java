package X;

/* renamed from: X.9bD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212449bD extends AbstractC179397xp {
    public final float[] A04 = new float[16];
    public float A02 = 0.0f;
    public float A03 = 0.0f;
    public float A01 = 1.0f;
    public float A00 = 0.0f;

    public final void A0B(float f, float f2, float f3, float f4) {
        if (this.A02 == f && this.A03 == f2 && this.A01 == f3 && this.A00 == f4) {
            return;
        }
        this.A02 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A00 = f4;
        super.A01 = true;
    }
}
