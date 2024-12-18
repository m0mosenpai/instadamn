package X;

import java.util.Arrays;

/* renamed from: X.4m2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103834m2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final C103824m1[] A06;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C103834m2)) {
            return false;
        }
        C103834m2 c103834m2 = (C103834m2) obj;
        return this.A03 == c103834m2.A03 && this.A00 == c103834m2.A00 && this.A01 == c103834m2.A01 && this.A04 == c103834m2.A04 && this.A02 == c103834m2.A02 && this.A05 == c103834m2.A05 && Arrays.equals(this.A06, c103834m2.A06);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A03), Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A04), Integer.valueOf(this.A02), Boolean.valueOf(this.A05), Integer.valueOf(Arrays.hashCode(this.A06))});
    }

    public C103834m2(C103824m1[] c103824m1Arr, int i, int i2, int i3, int i4, int i5, boolean z) {
        this.A03 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = i4;
        this.A02 = i5;
        this.A05 = z;
        this.A06 = c103824m1Arr;
    }
}
