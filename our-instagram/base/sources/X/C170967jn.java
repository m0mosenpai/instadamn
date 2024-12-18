package X;

/* renamed from: X.7jn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170967jn extends C0T6 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C170967jn) {
                C170967jn c170967jn = (C170967jn) obj;
                if (!C14360o3.A0K(this.A04, c170967jn.A04) || this.A01 != c170967jn.A01 || !C14360o3.A0K(this.A03, c170967jn.A03) || this.A00 != c170967jn.A00 || this.A02 != c170967jn.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A04.hashCode() * 31;
        long j = this.A01;
        int hashCode2 = (((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.A03.hashCode()) * 31) + this.A00) * 31;
        long j2 = this.A02;
        return hashCode2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C170967jn(String str, String str2, int i, long j, long j2) {
        this.A04 = str;
        this.A01 = j;
        this.A03 = str2;
        this.A00 = i;
        this.A02 = j2;
    }
}
