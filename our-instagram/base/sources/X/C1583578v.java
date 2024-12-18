package X;

/* renamed from: X.78v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1583578v extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1583578v) {
                C1583578v c1583578v = (C1583578v) obj;
                if (!C14360o3.A0K(this.A03, c1583578v.A03) || !C14360o3.A0K(this.A01, c1583578v.A01) || !C14360o3.A0K(this.A02, c1583578v.A02) || !C14360o3.A0K(this.A00, c1583578v.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A03;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A00;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public C1583578v(String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = str4;
    }
}
