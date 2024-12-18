package X;

/* renamed from: X.EbT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32763EbT extends FKR {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32763EbT) {
                C32763EbT c32763EbT = (C32763EbT) obj;
                if (!C14360o3.A0K(this.A01, c32763EbT.A01) || !C14360o3.A0K(this.A00, c32763EbT.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32763EbT(String str, String str2) {
        super(C2EY.A1P, str);
        this.A01 = str;
        this.A00 = str2;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC25227BEk.A07(this.A00);
    }
}
