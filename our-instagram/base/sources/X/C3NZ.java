package X;

/* renamed from: X.3NZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3NZ extends C0T6 {
    public final long A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3NZ) {
                C3NZ c3nz = (C3NZ) obj;
                if (!C14360o3.A0K(this.A02, c3nz.A02) || !C14360o3.A0K(this.A01, c3nz.A01) || this.A00 != c3nz.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31;
        long j = this.A00;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public C3NZ(String str, String str2, long j) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
    }
}
