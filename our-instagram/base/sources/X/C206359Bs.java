package X;

/* renamed from: X.9Bs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206359Bs extends C0T6 {
    public final int A00 = 1;
    public final long A01;
    public final long A02;
    public final long A03;
    public final String A04;

    public C206359Bs(String str, long j, long j2, long j3) {
        this.A04 = str;
        this.A03 = j;
        this.A02 = j2;
        this.A01 = j3;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            return super.equals(obj);
        }
        if (this != obj) {
            if (obj instanceof C206359Bs) {
                C206359Bs c206359Bs = (C206359Bs) obj;
                if (c206359Bs.A00 != 0 || this.A03 != c206359Bs.A03 || this.A01 != c206359Bs.A01 || this.A02 != c206359Bs.A02 || !C14360o3.A0K(this.A04, c206359Bs.A04)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return super.hashCode();
        }
        long j = this.A03;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A01;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.A02;
        return ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.A04.hashCode();
    }

    public C206359Bs(String str, long j, long j2, long j3, int i) {
        C14360o3.A0B(str, 4);
        this.A03 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A04 = str;
    }
}
