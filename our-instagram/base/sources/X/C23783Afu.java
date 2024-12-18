package X;

/* renamed from: X.Afu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23783Afu implements BDM {
    public final float A00;
    public final float A01;

    public C23783Afu(int i, int i2) {
        float f = ((i * 0.5f) / 0.5625f) / i2;
        this.A00 = f;
        this.A01 = (1.0f - f) / 2.0f;
    }

    @Override // X.BDM
    public final float BqS() {
        return 0.5f;
    }

    @Override // X.BDM
    public final float BqT() {
        return this.A00;
    }

    @Override // X.BDM
    public final float CAj() {
        return this.A01;
    }
}
