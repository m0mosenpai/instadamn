package X;

/* renamed from: X.40R, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40R extends C0T6 {
    public long A00;
    public long A01;
    public JJ5 A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public final long A0B;

    public C40R(JJ5 jj5, String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, long j3, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str4, 5);
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A02 = jj5;
        this.A08 = str4;
        this.A0B = j;
        this.A06 = str5;
        this.A09 = z;
        this.A00 = j2;
        this.A01 = j3;
        this.A0A = z2;
        this.A07 = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C40R) {
                C40R c40r = (C40R) obj;
                if (!C14360o3.A0K(this.A03, c40r.A03) || !C14360o3.A0K(this.A05, c40r.A05) || !C14360o3.A0K(this.A04, c40r.A04) || !C14360o3.A0K(this.A02, c40r.A02) || !C14360o3.A0K(this.A08, c40r.A08) || this.A0B != c40r.A0B || !C14360o3.A0K(this.A06, c40r.A06) || this.A09 != c40r.A09 || this.A00 != c40r.A00 || this.A01 != c40r.A01 || this.A0A != c40r.A0A || !C14360o3.A0K(this.A07, c40r.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((this.A03.hashCode() * 31) + this.A05.hashCode()) * 31;
        String str = this.A04;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        JJ5 jj5 = this.A02;
        if (jj5 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = jj5.hashCode();
        }
        int hashCode5 = (((i2 + hashCode2) * 31) + this.A08.hashCode()) * 31;
        long j = this.A0B;
        int i3 = (hashCode5 + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.A06;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        int i5 = 1237;
        if (this.A09) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        long j2 = this.A00;
        int i7 = (i6 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.A01;
        int i8 = (i7 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        int i9 = 1237;
        if (this.A0A) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        String str3 = this.A07;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i10 + i;
    }
}
