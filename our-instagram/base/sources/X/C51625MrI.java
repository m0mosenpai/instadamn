package X;

/* renamed from: X.MrI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51625MrI extends C0T6 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51625MrI) {
                C51625MrI c51625MrI = (C51625MrI) obj;
                if (this.A03 != c51625MrI.A03 || this.A04 != c51625MrI.A04 || this.A05 != c51625MrI.A05 || this.A01 != c51625MrI.A01 || Float.compare(this.A00, c51625MrI.A00) != 0 || this.A06 != c51625MrI.A06 || this.A02 != c51625MrI.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A00(((((((this.A03 * 31) + this.A04) * 31) + this.A05) * 31) + this.A01) * 31, this.A00)) + this.A02;
    }

    public C51625MrI(float f, int i, int i2, int i3, int i4, int i5, boolean z) {
        this.A03 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A01 = i4;
        this.A00 = f;
        this.A06 = z;
        this.A02 = i5;
    }
}
