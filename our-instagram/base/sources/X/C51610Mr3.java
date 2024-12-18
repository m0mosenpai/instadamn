package X;

/* renamed from: X.Mr3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51610Mr3 extends C0T6 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final long A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51610Mr3) {
                C51610Mr3 c51610Mr3 = (C51610Mr3) obj;
                if (Float.compare(this.A01, c51610Mr3.A01) != 0 || Float.compare(this.A02, c51610Mr3.A02) != 0 || this.A04 != c51610Mr3.A04 || Float.compare(this.A00, c51610Mr3.A00) != 0 || this.A03 != c51610Mr3.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC25236BEt.A01(this.A04, AbstractC166997dE.A00(Float.floatToIntBits(this.A01) * 31, this.A02)), this.A00) + this.A03;
    }

    public C51610Mr3(float f, float f2, float f3, int i, long j) {
        this.A01 = f;
        this.A02 = f2;
        this.A04 = j;
        this.A00 = f3;
        this.A03 = i;
    }
}
