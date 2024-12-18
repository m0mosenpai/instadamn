package X;

/* renamed from: X.Mry, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51667Mry extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final String A04;

    public C51667Mry(String str, int i, int i2, int i3, long j) {
        C14360o3.A0B(str, 1);
        this.A04 = str;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51667Mry) {
                C51667Mry c51667Mry = (C51667Mry) obj;
                if (!C14360o3.A0K(this.A04, c51667Mry.A04) || this.A01 != c51667Mry.A01 || this.A02 != c51667Mry.A02 || this.A00 != c51667Mry.A00 || this.A03 != c51667Mry.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166987dD.A0J(this.A04) + this.A01) * 31) + this.A02) * 31) + this.A00) * 31) + AbstractC25228BEl.A03(this.A03);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoInfo(filepath=");
        A1C.append(this.A04);
        A1C.append(", rotation=");
        A1C.append(this.A01);
        A1C.append(", width=");
        MSX.A1O(A1C, this.A02);
        A1C.append(this.A00);
        A1C.append(", duration=");
        A1C.append(this.A03);
        return AbstractC167017dG.A0p(A1C);
    }
}
