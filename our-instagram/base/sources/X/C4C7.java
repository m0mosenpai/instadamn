package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4C7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4C7 {
    public static final C4C7 A0B;
    public final int A00;
    public final int A01;

    @Deprecated
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final android.net.Uri A06;
    public final C4C6 A07;
    public final String A08;
    public final Map A09;
    public final byte[] A0A;

    static {
        C460829s.A00("goog.exo.datasource");
        A0B = new C4C7(android.net.Uri.parse("www.facebook.com"), 0, -1);
    }

    public final C4C7 A00(long j, long j2) {
        if (j == 0 && this.A03 == j2) {
            return this;
        }
        android.net.Uri uri = this.A06;
        long j3 = this.A05;
        int i = this.A01;
        byte[] bArr = this.A0A;
        Map map = this.A09;
        long j4 = this.A04 + j;
        String str = this.A08;
        int i2 = this.A00;
        C4C6 c4c6 = this.A07;
        String str2 = c4c6.A0N;
        String str3 = c4c6.A0M;
        long j5 = c4c6.A0A;
        boolean z = c4c6.A0T;
        int i3 = c4c6.A08;
        int i4 = c4c6.A07;
        int i5 = c4c6.A00;
        int i6 = c4c6.A09;
        boolean z2 = c4c6.A0V;
        boolean z3 = c4c6.A0S;
        int i7 = c4c6.A05;
        long j6 = c4c6.A0C;
        C4C2 c4c2 = c4c6.A0I;
        long j7 = c4c6.A0F;
        boolean z4 = c4c6.A0U;
        int i8 = c4c6.A06;
        int i9 = c4c6.A02;
        long j8 = c4c6.A0E;
        long j9 = c4c6.A0B;
        int i10 = c4c6.A01;
        Map map2 = c4c6.A0Q;
        int i11 = c4c6.A04;
        String str4 = c4c6.A0K;
        String str5 = c4c6.A0J;
        return new C4C7(uri, new C4C6(c4c6.A0H, c4c2, str3, str4, str5, c4c6.A0O, c4c6.A0L, c4c6.A0P, str2, map2, i3, i4, i5, i6, i7, i8, i9, i10, i11, c4c6.A03, j5, j6, j7, j8, j9, -1L, -1L, z, z2, z3, z4, c4c6.A0R), str, map, bArr, i, i2, j3, j4, j2);
    }

    public final void A01(Map map) {
        Map map2 = this.A07.A0Q;
        map2.clear();
        for (Map.Entry entry : map.entrySet()) {
            map2.put(entry.getKey(), entry.getValue());
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("DataSpec[");
        int i = this.A01;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str = "POST";
            }
        } else {
            str = "GET";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.A06);
        sb.append(", ");
        sb.append(this.A04);
        sb.append(", ");
        sb.append(this.A03);
        sb.append(", ");
        sb.append(this.A08);
        sb.append(", ");
        sb.append(this.A00);
        sb.append(", ");
        C4C6 c4c6 = this.A07;
        sb.append(c4c6);
        sb.append(", ");
        sb.append(c4c6.A0Q);
        sb.append("]");
        return sb.toString();
    }

    @Deprecated
    public C4C7(android.net.Uri uri, int i, int i2) {
        this(uri, new C4C6(C4C4.A02, new C4C2(), "", null, null, null, "", "", null, null, -1, -1, -1, -1, i2, -1, -1, -1, -1, -1, -1L, -1L, -1L, -1L, -1L, -1L, -1L, false, false, false, false, false), null, Collections.emptyMap(), null, 1, i, 0L, 0L, -1L);
    }

    public C4C7(android.net.Uri uri, C4C6 c4c6, String str, Map map, byte[] bArr, int i, int i2, long j, long j2, long j3) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        boolean z = true;
        C4B8.A03(j4 >= 0);
        C4B8.A03(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C4B8.A03(z);
        this.A06 = uri;
        this.A05 = j;
        this.A01 = i;
        this.A0A = (bArr == null || bArr2.length == 0) ? null : bArr2;
        this.A09 = Collections.unmodifiableMap(new HashMap(map));
        this.A04 = j2;
        this.A02 = j4;
        this.A03 = j3;
        this.A08 = str;
        this.A00 = i2;
        this.A07 = c4c6;
    }
}
