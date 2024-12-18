package X;

/* renamed from: X.4DI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4DI extends C0T6 {
    public long A00;
    public long A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C4DI(String str, String str2, String str3, String str4, String str5, int i, long j, long j2, long j3, long j4) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        C14360o3.A0B(str4, 7);
        C14360o3.A0B(str5, 10);
        this.A02 = i;
        this.A06 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A03 = j;
        this.A00 = j2;
        this.A07 = str4;
        this.A04 = j3;
        this.A01 = j4;
        this.A05 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4DI) {
                C4DI c4di = (C4DI) obj;
                if (this.A02 != c4di.A02 || !C14360o3.A0K(this.A06, c4di.A06) || !C14360o3.A0K(this.A08, c4di.A08) || !C14360o3.A0K(this.A09, c4di.A09) || this.A03 != c4di.A03 || this.A00 != c4di.A00 || !C14360o3.A0K(this.A07, c4di.A07) || this.A04 != c4di.A04 || this.A01 != c4di.A01 || !C14360o3.A0K(this.A05, c4di.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((this.A02 * 31) + this.A06.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A09.hashCode()) * 31;
        long j = this.A03;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A00;
        int hashCode2 = (((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A07.hashCode()) * 31;
        long j3 = this.A04;
        int i2 = (hashCode2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.A01;
        return ((i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.A05.hashCode();
    }
}
