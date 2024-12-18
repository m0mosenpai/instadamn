package X;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* renamed from: X.SfI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63213SfI {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public static final Pattern A0C = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern A0A = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern A09 = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern A0B = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0029, code lost:
    
        if (r1 > r0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0035, code lost:
    
        if (r1 == ':') goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r1 == '\t') goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(java.lang.String r2, int r3, int r4, boolean r5) {
        /*
        L0:
            if (r3 >= r4) goto L39
            char r1 = r2.charAt(r3)
            r0 = 32
            if (r1 >= r0) goto L17
            r0 = 9
            if (r1 != r0) goto L37
        Le:
            r1 = 0
        Lf:
            r0 = r5 ^ 1
            if (r1 != r0) goto L14
            return r3
        L14:
            int r3 = r3 + 1
            goto L0
        L17:
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 >= r0) goto L37
            r0 = 48
            if (r1 < r0) goto Le
            r0 = 57
            if (r1 <= r0) goto L37
            r0 = 97
            if (r1 < r0) goto L2c
            r0 = 122(0x7a, float:1.71E-43)
        L29:
            if (r1 <= r0) goto L37
            goto Le
        L2c:
            r0 = 65
            if (r1 < r0) goto L33
            r0 = 90
            goto L29
        L33:
            r0 = 58
            if (r1 != r0) goto Le
        L37:
            r1 = 1
            goto Lf
        L39:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63213SfI.A00(java.lang.String, int, int, boolean):int");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C63213SfI)) {
            return false;
        }
        C63213SfI c63213SfI = (C63213SfI) obj;
        if (!c63213SfI.A02.equals(this.A02) || !c63213SfI.A04.equals(this.A04) || !c63213SfI.A01.equals(this.A01) || !c63213SfI.A03.equals(this.A03) || c63213SfI.A00 != this.A00 || c63213SfI.A08 != this.A08 || c63213SfI.A06 != this.A06 || c63213SfI.A07 != this.A07 || c63213SfI.A05 != this.A05) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC25236BEt.A01(this.A00, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A04, AbstractC50523MSb.A02(this.A02))))) + (!this.A08 ? 1 : 0)) * 31) + (!this.A06 ? 1 : 0)) * 31) + (!this.A07 ? 1 : 0)) * 31) + (!this.A05 ? 1 : 0);
    }

    public C63213SfI(String str, String str2, String str3, String str4, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = str;
        this.A04 = str2;
        this.A00 = j;
        this.A01 = str3;
        this.A03 = str4;
        this.A08 = z;
        this.A06 = z2;
        this.A05 = z3;
        this.A07 = z4;
    }

    public final String toString() {
        String format;
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC58322PtE.A1S(A1C, this.A02);
        A1C.append(this.A04);
        if (this.A07) {
            long j = this.A00;
            if (j == Long.MIN_VALUE) {
                format = "; max-age=0";
            } else {
                A1C.append("; expires=");
                format = ((DateFormat) S8F.A00.get()).format(new Date(j));
            }
            A1C.append(format);
        }
        if (!this.A05) {
            A1C.append("; domain=");
            A1C.append(this.A01);
        }
        A1C.append("; path=");
        A1C.append(this.A03);
        if (this.A08) {
            A1C.append("; secure");
        }
        if (this.A06) {
            A1C.append("; httponly");
        }
        return A1C.toString();
    }
}
