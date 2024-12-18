package X;

import java.io.Serializable;

/* renamed from: X.WpY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71186WpY implements Serializable {
    public static final C71186WpY A02 = new C71186WpY(new int[0]);
    public final int A00;
    public final int[] A01;

    public C71186WpY(int[] array) {
        int length = array.length;
        this.A01 = array;
        this.A00 = length;
    }

    public final boolean equals(Object object) {
        C71186WpY c71186WpY;
        int i;
        int i2;
        if (object != this) {
            if ((object instanceof C71186WpY) && (i = this.A00) == (i2 = (c71186WpY = (C71186WpY) object).A00)) {
                for (int i3 = 0; i3 < i; i3++) {
                    C18C.A01(i3, i);
                    int i4 = this.A01[i3];
                    C18C.A01(i3, i2);
                    if (i4 == c71186WpY.A01[i3]) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + this.A01[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.A00;
        int i2 = 0;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.A01;
        while (true) {
            sb.append(iArr[i2]);
            i2++;
            if (i2 < i) {
                sb.append(", ");
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
