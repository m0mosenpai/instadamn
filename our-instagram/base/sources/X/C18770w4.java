package X;

import java.util.Arrays;

/* renamed from: X.0w4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18770w4 extends C01I {
    public final int A01(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.A00)) {
            int[] iArr = this.A01;
            int i3 = iArr[i];
            if (i != i2 - 1) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i2 - i4);
            }
            this.A00--;
            return i3;
        }
        throw new IndexOutOfBoundsException(AnonymousClass001.A02(i, this.A00 - 1, "Index ", " must be in 0.."));
    }

    public final void A04(int i, int i2) {
        if (i >= 0 && i < this.A00) {
            this.A01[i] = i2;
            return;
        }
        throw new IndexOutOfBoundsException(AnonymousClass001.A02(i, this.A00 - 1, "set index ", " must be between 0 .. "));
    }

    public C18770w4() {
        super(16);
    }

    public final void A02(int i) {
        A03(this.A00 + 1);
        int[] iArr = this.A01;
        int i2 = this.A00;
        iArr[i2] = i;
        this.A00 = i2 + 1;
    }

    public final void A03(int i) {
        int[] iArr = this.A01;
        int length = iArr.length;
        if (length < i) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i, (length * 3) / 2));
            C14360o3.A07(copyOf);
            this.A01 = copyOf;
        }
    }
}
