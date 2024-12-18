package X;

/* renamed from: X.Bee, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25990Bee extends C0T6 {
    public final float A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25990Bee) {
                C25990Bee c25990Bee = (C25990Bee) obj;
                if (this.A03 != c25990Bee.A03 || this.A01 != c25990Bee.A01 || this.A02 != c25990Bee.A02 || Float.compare(this.A00, c25990Bee.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(AbstractC167007dF.A0D(this.A02, AbstractC25236BEt.A01(this.A01, AbstractC25225BEi.A08(this.A03))), this.A00);
    }

    public C25990Bee(float f, long j, boolean z, boolean z2) {
        this.A03 = z;
        this.A01 = j;
        this.A02 = z2;
        this.A00 = f;
    }
}
