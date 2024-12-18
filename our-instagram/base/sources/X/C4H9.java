package X;

import java.util.Arrays;

/* renamed from: X.4H9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4H9 {
    public final long A00;
    public final String A01;
    public final java.util.Set A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4H9 c4h9 = (C4H9) obj;
            if (this.A00 != c4h9.A00 || !C2I7.A00(this.A01, c4h9.A01) || !C2I7.A00(this.A02, c4h9.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), this.A01, this.A02});
    }

    public C4H9(String str, java.util.Set set, long j) {
        this.A00 = j;
        this.A01 = str;
        this.A02 = set;
    }
}
