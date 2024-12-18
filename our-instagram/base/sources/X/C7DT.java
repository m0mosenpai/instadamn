package X;

/* renamed from: X.7DT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7DT extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7DT) {
                C7DT c7dt = (C7DT) obj;
                if (!C14360o3.A0K(this.A01, c7dt.A01) || !C14360o3.A0K(this.A02, c7dt.A02) || !C14360o3.A0K(this.A03, c7dt.A03) || this.A00 != c7dt.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.A00;
    }

    public C7DT(String str, String str2, String str3, int i) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = i;
    }

    public C7DT() {
        this(null, null, null, 0);
    }
}
