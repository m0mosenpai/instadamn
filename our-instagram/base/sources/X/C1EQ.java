package X;

import java.util.Arrays;

/* renamed from: X.1EQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1EQ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final String A0D;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1EQ)) {
            return false;
        }
        C1EQ c1eq = (C1EQ) obj;
        return this.A0D.equals(c1eq.A0D) && this.A04 == c1eq.A04 && this.A01 == c1eq.A01 && this.A02 == c1eq.A02 && this.A03 == c1eq.A03 && this.A09 == c1eq.A09 && this.A0A == c1eq.A0A && this.A0B == c1eq.A0B && this.A05 == c1eq.A05 && this.A06 == c1eq.A06 && this.A08 == c1eq.A08 && this.A07 == c1eq.A07 && this.A00 == c1eq.A00 && this.A0C == c1eq.A0C;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0D, Integer.valueOf(this.A04), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A09), Integer.valueOf(this.A0A), Integer.valueOf(this.A0B), Integer.valueOf(this.A05), Integer.valueOf(this.A06), Integer.valueOf(this.A08), Integer.valueOf(this.A07), Integer.valueOf(this.A00), Integer.valueOf(this.A0C)});
    }

    public C1EQ(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        this.A0D = str;
        this.A04 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A09 = i5;
        this.A0A = i6;
        this.A0B = i7;
        this.A05 = i8;
        this.A06 = i9;
        this.A08 = i10;
        this.A07 = i11;
        this.A00 = i12;
        this.A0C = i13;
    }
}
