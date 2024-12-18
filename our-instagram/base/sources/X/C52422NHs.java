package X;

/* renamed from: X.NHs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52422NHs extends O7N {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C51832Mva A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52422NHs(C51832Mva c51832Mva, float f, int i, int i2, int i3) {
        super(i, c51832Mva.A0B);
        C14360o3.A0B(c51832Mva, 2);
        this.A01 = i;
        this.A04 = c51832Mva;
        this.A00 = f;
        this.A02 = i2;
        this.A03 = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52422NHs) {
                C52422NHs c52422NHs = (C52422NHs) obj;
                if (this.A01 != c52422NHs.A01 || !C14360o3.A0K(this.A04, c52422NHs.A04) || Float.compare(this.A00, c52422NHs.A00) != 0 || this.A02 != c52422NHs.A02 || this.A03 != c52422NHs.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A00(AbstractC166997dE.A0J(this.A04, this.A01 * 31), this.A00) + this.A02) * 31) + this.A03;
    }
}
