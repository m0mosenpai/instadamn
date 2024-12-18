package X;

/* renamed from: X.52z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1118752z extends C0T6 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;
    public boolean A08;

    public C1118752z(Integer num, Integer num2, Integer num3, Integer num4, Long l, Long l2, String str, boolean z) {
        this.A08 = z;
        this.A02 = num;
        this.A07 = str;
        this.A05 = l;
        this.A06 = null;
        this.A00 = num2;
        this.A04 = l2;
        this.A03 = num3;
        this.A01 = num4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1118752z) {
                C1118752z c1118752z = (C1118752z) obj;
                if (this.A08 != c1118752z.A08 || !C14360o3.A0K(this.A02, c1118752z.A02) || !C14360o3.A0K(this.A07, c1118752z.A07) || !C14360o3.A0K(this.A05, c1118752z.A05) || !C14360o3.A0K(this.A06, c1118752z.A06) || !C14360o3.A0K(this.A00, c1118752z.A00) || !C14360o3.A0K(this.A04, c1118752z.A04) || !C14360o3.A0K(this.A03, c1118752z.A03) || !C14360o3.A0K(this.A01, c1118752z.A01)) {
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
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        int i2 = i * 31;
        Integer num = this.A02;
        int i3 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        String str = this.A07;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        Long l = this.A05;
        if (l == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        String str2 = this.A06;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        Integer num2 = this.A00;
        if (num2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num2.hashCode();
        }
        int i8 = (i7 + hashCode5) * 31;
        Long l2 = this.A04;
        if (l2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l2.hashCode();
        }
        int i9 = (i8 + hashCode6) * 31;
        Integer num3 = this.A03;
        if (num3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num3.hashCode();
        }
        int i10 = (i9 + hashCode7) * 31;
        Integer num4 = this.A01;
        if (num4 != null) {
            i3 = num4.hashCode();
        }
        return i10 + i3;
    }

    public C1118752z() {
        this(null, null, null, null, null, null, null, false);
    }
}
