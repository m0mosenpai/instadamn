package X;

import java.util.Arrays;

/* renamed from: X.50B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C50B {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Integer A04;
    public Integer A05;

    public C50B(int i, int i2) {
        this.A00 = i;
        this.A02 = i2;
        this.A05 = null;
        this.A04 = null;
        this.A01 = 0;
        this.A03 = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50B)) {
            return false;
        }
        C50B c50b = (C50B) obj;
        return this.A00 == c50b.A00 && this.A02 == c50b.A02 && C2I7.A00(this.A05, c50b.A05) && C2I7.A00(this.A04, c50b.A04) && this.A01 == c50b.A01 && this.A03 == c50b.A03;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A02), this.A05, this.A04, Integer.valueOf(this.A01), Integer.valueOf(this.A03)});
    }

    public C50B() {
    }
}
