package X;

/* renamed from: X.EbR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32761EbR extends FKR {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32761EbR) {
                C32761EbR c32761EbR = (C32761EbR) obj;
                if (!C14360o3.A0K(this.A00, c32761EbR.A00) || !C14360o3.A0K(this.A01, c32761EbR.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32761EbR(String str, String str2) {
        super(C2EY.A1w, str);
        this.A00 = str;
        this.A01 = str2;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC167017dG.A0O(this.A00) * 31);
    }
}
