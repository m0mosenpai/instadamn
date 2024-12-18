package X;

import java.util.Arrays;

/* renamed from: X.08M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C08M {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C08M)) {
                return false;
            }
            C08M c08m = (C08M) obj;
            if (this.A00 != c08m.A00 || this.A03 != c08m.A03 || this.A01 != c08m.A01 || this.A02 != c08m.A02) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Long.valueOf(this.A03), Integer.valueOf(this.A01), Long.valueOf(this.A02)});
    }

    public C08M(int i, int i2, long j, long j2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = j;
        this.A02 = j2;
    }
}
