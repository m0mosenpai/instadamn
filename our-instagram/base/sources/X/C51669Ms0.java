package X;

/* renamed from: X.Ms0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51669Ms0 extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51669Ms0) {
                C51669Ms0 c51669Ms0 = (C51669Ms0) obj;
                if (this.A04 != c51669Ms0.A04 || !C14360o3.A0K(this.A03, c51669Ms0.A03) || this.A02 != c51669Ms0.A02 || this.A01 != c51669Ms0.A01 || this.A00 != c51669Ms0.A00 || this.A05 != c51669Ms0.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, (((((((AbstractC25225BEi.A08(this.A04) + AbstractC167017dG.A0O(this.A03)) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
    }

    public C51669Ms0(String str, int i, int i2, int i3, boolean z, boolean z2) {
        this.A04 = z;
        this.A03 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A05 = z2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CoverImage(isCustom=");
        A1C.append(this.A04);
        A1C.append(", filepath=");
        A1C.append(this.A03);
        A1C.append(", width=");
        MSX.A1O(A1C, this.A02);
        A1C.append(this.A01);
        A1C.append(", fromVideoTimeMs=");
        A1C.append(this.A00);
        A1C.append(", isFromVideoEdited=");
        return AbstractC25236BEt.A0a(A1C, this.A05);
    }
}
