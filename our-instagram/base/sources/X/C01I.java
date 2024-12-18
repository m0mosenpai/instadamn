package X;

/* renamed from: X.01I, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C01I {
    public int A00;
    public int[] A01;

    public final int A00(int i) {
        if (i >= 0 && i < this.A00) {
            return this.A01[i];
        }
        throw new IndexOutOfBoundsException(AnonymousClass001.A02(i, this.A00 - 1, "Index ", " must be in 0.."));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C01I)) {
            return false;
        }
        C01I c01i = (C01I) obj;
        int i = c01i.A00;
        int i2 = this.A00;
        if (i != i2) {
            return false;
        }
        int[] iArr = this.A01;
        int[] iArr2 = c01i.A01;
        C17u A0C = C17s.A0C(0, i2);
        int i3 = A0C.A00;
        int i4 = A0C.A01;
        if (i3 <= i4) {
            while (iArr[i3] == iArr2[i3]) {
                if (i3 != i4) {
                    i3++;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int[] iArr = this.A01;
        int i = this.A00;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3] * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.A01;
        int i = this.A00;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                int i3 = iArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(i3);
                i2++;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public C01I(int i) {
        int[] iArr;
        if (i == 0) {
            iArr = C01P.A00;
        } else {
            iArr = new int[i];
        }
        this.A01 = iArr;
    }
}
