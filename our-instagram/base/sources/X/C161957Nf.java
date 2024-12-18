package X;

/* renamed from: X.7Nf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161957Nf extends C0T6 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final long A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C161957Nf) {
                C161957Nf c161957Nf = (C161957Nf) obj;
                if (!C14360o3.A0K(this.A03, c161957Nf.A03) || !C14360o3.A0K(this.A00, c161957Nf.A00) || !C14360o3.A0K(this.A02, c161957Nf.A02) || !C14360o3.A0K(this.A01, c161957Nf.A01) || !C14360o3.A0K(this.A04, c161957Nf.A04) || !C14360o3.A0K(this.A05, c161957Nf.A05) || !C14360o3.A0K(this.A08, c161957Nf.A08) || this.A06 != c161957Nf.A06 || !C14360o3.A0K(this.A07, c161957Nf.A07)) {
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
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.A00;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.A02;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.A01;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.A04;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.A05;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.A08;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        long j = this.A06;
        int i8 = (((i7 + hashCode7) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str8 = this.A07;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return i8 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trigger : ");
        sb.append(this.A05);
        sb.append(", State : ");
        sb.append(this.A03);
        sb.append(", Bot Action : ");
        sb.append(this.A00);
        sb.append(", Sentiment : ");
        sb.append(this.A02);
        sb.append(", Intensity : ");
        sb.append(this.A01);
        sb.append(", Transition : ");
        sb.append(this.A04);
        sb.append(", AppendMode : ");
        sb.append(this.A07);
        sb.append(", Video Id : ");
        sb.append(this.A08);
        sb.append(", Video Duration : ");
        sb.append(this.A06);
        return sb.toString();
    }

    public C161957Nf(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j) {
        this.A03 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A01 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A08 = str7;
        this.A06 = j;
        this.A07 = str8;
    }

    public C161957Nf() {
        this(null, null, null, null, null, null, null, null, 0L);
    }
}
