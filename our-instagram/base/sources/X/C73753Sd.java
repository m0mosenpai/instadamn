package X;

/* renamed from: X.3Sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73753Sd extends C0T6 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Float A04;
    public final Integer A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C73753Sd(Float f, Integer num, Long l, String str, String str2, String str3, int i, int i2, long j, long j2) {
        C14360o3.A0B(str, 2);
        this.A00 = i;
        this.A08 = str;
        this.A03 = j;
        this.A05 = num;
        this.A07 = str2;
        this.A01 = i2;
        this.A06 = l;
        this.A04 = f;
        this.A09 = str3;
        this.A02 = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C73753Sd) {
                C73753Sd c73753Sd = (C73753Sd) obj;
                if (this.A00 != c73753Sd.A00 || !C14360o3.A0K(this.A08, c73753Sd.A08) || this.A03 != c73753Sd.A03 || !C14360o3.A0K(this.A05, c73753Sd.A05) || !C14360o3.A0K(this.A07, c73753Sd.A07) || this.A01 != c73753Sd.A01 || !C14360o3.A0K(this.A06, c73753Sd.A06) || !C14360o3.A0K(this.A04, c73753Sd.A04) || !C14360o3.A0K(this.A09, c73753Sd.A09) || this.A02 != c73753Sd.A02) {
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
        int hashCode4;
        int hashCode5 = ((this.A00 * 31) + this.A08.hashCode()) * 31;
        long j = this.A03;
        int i = (hashCode5 + ((int) (j ^ (j >>> 32)))) * 31;
        Integer num = this.A05;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        String str = this.A07;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i4 = (((i3 + hashCode2) * 31) + this.A01) * 31;
        Long l = this.A06;
        if (l == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        Float f = this.A04;
        if (f == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = f.hashCode();
        }
        int i6 = (i5 + hashCode4) * 31;
        String str2 = this.A09;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i7 = (i6 + i2) * 31;
        long j2 = this.A02;
        return i7 + ((int) (j2 ^ (j2 >>> 32)));
    }
}
