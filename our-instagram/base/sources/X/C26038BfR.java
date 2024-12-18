package X;

/* renamed from: X.BfR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26038BfR extends C0T6 {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C26038BfR(Integer num, Integer num2, Integer num3, String str, String str2) {
        this.A01 = num;
        this.A04 = str;
        this.A00 = num2;
        this.A05 = true;
        this.A02 = num3;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26038BfR) {
                C26038BfR c26038BfR = (C26038BfR) obj;
                if (!C14360o3.A0K(this.A01, c26038BfR.A01) || !C14360o3.A0K(this.A04, c26038BfR.A04) || !C14360o3.A0K(this.A00, c26038BfR.A00) || this.A05 != c26038BfR.A05 || this.A02 != c26038BfR.A02 || !C14360o3.A0K(this.A03, c26038BfR.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0D = AbstractC167007dF.A0D(this.A05, ((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31);
        int intValue = this.A02.intValue();
        if (1 != intValue) {
            str = "Text";
        } else {
            str = "Icon";
        }
        return AbstractC25231BEo.A0H(str, intValue, A0D) + AbstractC25227BEk.A07(this.A03);
    }

    public C26038BfR() {
        this(null, null, C05F.A00, null, null);
    }
}
