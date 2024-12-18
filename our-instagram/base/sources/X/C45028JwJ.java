package X;

/* renamed from: X.JwJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45028JwJ extends C0T6 {
    public final String A00;
    public final boolean A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45028JwJ) {
                C45028JwJ c45028JwJ = (C45028JwJ) obj;
                if (!C14360o3.A0K(this.A00, c45028JwJ.A00) || this.A01 != c45028JwJ.A01 || this.A03 != c45028JwJ.A03 || !C14360o3.A0K(this.A02, c45028JwJ.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A01, AbstractC167017dG.A0O(this.A00) * 31)) + AbstractC25227BEk.A07(this.A02);
    }

    public C45028JwJ(String str, String str2, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = z;
        this.A03 = z2;
        this.A02 = str2;
    }
}
