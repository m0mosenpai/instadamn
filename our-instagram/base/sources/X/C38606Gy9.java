package X;

/* renamed from: X.Gy9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38606Gy9 extends C0T6 {
    public final boolean A01 = true;
    public final long A00 = 1;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38606Gy9) {
                C38606Gy9 c38606Gy9 = (C38606Gy9) obj;
                if (this.A01 != c38606Gy9.A01 || this.A00 != c38606Gy9.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = (AbstractC25225BEi.A08(this.A01) + ((int) (0 >>> 32))) * 31;
        long j = this.A00;
        return A08 + ((int) (j ^ (j >>> 32)));
    }
}
