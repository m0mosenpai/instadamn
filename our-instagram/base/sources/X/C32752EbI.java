package X;

/* renamed from: X.EbI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32752EbI extends FKR {
    public final C38321qM A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32752EbI) {
                C32752EbI c32752EbI = (C32752EbI) obj;
                if (!C14360o3.A0K(this.A01, c32752EbI.A01) || !C14360o3.A0K(this.A00, c32752EbI.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32752EbI(C38321qM c38321qM, String str) {
        super(C2EY.A0W, str);
        this.A01 = str;
        this.A00 = c38321qM;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
