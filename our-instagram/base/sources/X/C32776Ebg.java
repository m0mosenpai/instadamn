package X;

/* renamed from: X.Ebg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32776Ebg extends FKR {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32776Ebg) {
                C32776Ebg c32776Ebg = (C32776Ebg) obj;
                if (!C14360o3.A0K(this.A00, c32776Ebg.A00) || !C14360o3.A0K(this.A01, c32776Ebg.A01) || !C14360o3.A0K(this.A03, c32776Ebg.A03) || !C14360o3.A0K(this.A02, c32776Ebg.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32776Ebg(String str, String str2, String str3, String str4) {
        super(C2EY.A0r, str);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A02 = str4;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A02);
    }
}
