package X;

import java.util.Arrays;

/* renamed from: X.5FC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5FC {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C5FC) {
                C5FC c5fc = (C5FC) obj;
                if (this.A01 != c5fc.A01 || this.A00 != c5fc.A00) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        String format = String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00)}, 2));
        C14360o3.A07(format);
        return format;
    }

    public final int hashCode() {
        return ((this.A01 + 31) * 31) + this.A00;
    }

    public C5FC(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
