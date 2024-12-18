package X;

/* renamed from: X.Jwa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45045Jwa extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45045Jwa) {
                C45045Jwa c45045Jwa = (C45045Jwa) obj;
                if (!C14360o3.A0K(this.A04, c45045Jwa.A04) || this.A01 != c45045Jwa.A01 || this.A02 != c45045Jwa.A02 || this.A03 != c45045Jwa.A03 || this.A00 != c45045Jwa.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166987dD.A0J(this.A04) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A00;
    }

    public C45045Jwa(String str, int i, int i2, int i3, int i4) {
        this.A04 = str;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
    }
}
