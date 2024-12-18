package X;

/* renamed from: X.MrC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51619MrC extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C8RR A04;
    public final C195868lW A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51619MrC) {
                C51619MrC c51619MrC = (C51619MrC) obj;
                if (!C14360o3.A0K(this.A05, c51619MrC.A05) || this.A02 != c51619MrC.A02 || this.A01 != c51619MrC.A01 || this.A00 != c51619MrC.A00 || this.A03 != c51619MrC.A03 || !C14360o3.A0K(this.A04, c51619MrC.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0M(this.A05) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31) + this.A03) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public C51619MrC(C8RR c8rr, C195868lW c195868lW, int i, int i2, int i3, int i4) {
        this.A05 = c195868lW;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = i4;
        this.A04 = c8rr;
    }
}
