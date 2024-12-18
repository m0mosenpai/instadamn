package X;

import java.util.Arrays;

/* renamed from: X.6AR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6AR {
    public final int A00;
    public final int A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C6AR c6ar = (C6AR) obj;
            if (this.A00 == c6ar.A00 && this.A01 == c6ar.A01) {
                String str = this.A02;
                if (str.length() != 0) {
                    return str.equals(c6ar.A02);
                }
                if (c6ar.A02.length() != 0) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A02});
    }

    public C6AR(int i, int i2, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }
}
