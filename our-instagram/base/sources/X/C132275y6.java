package X;

/* renamed from: X.5y6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132275y6 extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final int A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132275y6) {
                C132275y6 c132275y6 = (C132275y6) obj;
                if (!C14360o3.A0K(this.A03, c132275y6.A03) || !C14360o3.A0K(this.A01, c132275y6.A01) || this.A00 != c132275y6.A00 || this.A04 != c132275y6.A04 || !C14360o3.A0K(this.A02, c132275y6.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A03;
        int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A00) * 31) + this.A04) * 31;
        String str2 = this.A02;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public C132275y6(String str, String str2, String str3, int i, int i2) {
        this.A03 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A04 = i2;
        this.A02 = str3;
    }
}
