package X;

import java.util.Arrays;

/* renamed from: X.1HX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HX {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final int[] A09;
    public final String A0A;

    public C1HX(String str) {
        this(str, null, null, null, new int[0], Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1HX)) {
            return false;
        }
        C1HX c1hx = (C1HX) obj;
        return this.A08.equals(c1hx.A08) && C2I7.A00(this.A0A, c1hx.A0A) && this.A05 == c1hx.A05 && this.A02 == c1hx.A02 && C2I7.A00(this.A06, c1hx.A06) && C2I7.A00(this.A07, c1hx.A07) && this.A04 == c1hx.A04 && this.A00 == c1hx.A00 && this.A03 == c1hx.A03 && Arrays.equals(this.A09, c1hx.A09) && this.A01 == c1hx.A01;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A08, this.A0A, Long.valueOf(this.A05), Integer.valueOf(this.A02), this.A06, this.A07, Integer.valueOf(this.A04), Integer.valueOf(this.A00), Integer.valueOf(this.A03), Integer.valueOf(Arrays.hashCode(this.A09)), Integer.valueOf(this.A01)});
    }

    public C1HX(String str, String str2, String str3, String str4, int[] iArr, int i, int i2, int i3, int i4, int i5, long j) {
        this.A08 = str;
        this.A0A = str2;
        this.A05 = j;
        this.A02 = i;
        this.A06 = str3;
        this.A07 = str4;
        this.A04 = i2;
        this.A00 = i3;
        this.A03 = i4;
        this.A09 = iArr;
        this.A01 = i5;
    }
}
