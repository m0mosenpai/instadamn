package X;

/* renamed from: X.JZd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43816JZd extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final long A03;
    public final C114205Dh A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43816JZd) {
                C43816JZd c43816JZd = (C43816JZd) obj;
                if (!C14360o3.A0K(this.A02, c43816JZd.A02) || !C14360o3.A0K(this.A01, c43816JZd.A01) || this.A00 != c43816JZd.A00 || this.A03 != c43816JZd.A03 || !C14360o3.A0K(this.A04, c43816JZd.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final float A00() {
        C114205Dh c114205Dh = this.A04;
        float f = (c114205Dh.A02 - c114205Dh.A01) * (c114205Dh.A00 - c114205Dh.A03);
        long j = this.A03;
        return f / (((int) (j >> 32)) * C119055aN.A00(j));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A04, AbstractC25236BEt.A01(this.A03, (((AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0O(this.A01)) * 31) + this.A00) * 31));
    }

    public C43816JZd(C114205Dh c114205Dh, String str, String str2, int i, long j) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = j;
        this.A04 = c114205Dh;
    }
}
