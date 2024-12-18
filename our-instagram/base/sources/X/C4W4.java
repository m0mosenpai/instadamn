package X;

/* renamed from: X.4W4, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4W4 {
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4W4)) {
            return false;
        }
        C4W4 c4w4 = (C4W4) obj;
        return this.A01 == c4w4.A01 && this.A00 == c4w4.A00 && this.A03 == c4w4.A03 && this.A02 == c4w4.A02 && this.A04 == c4w4.A04;
    }

    public final int hashCode() {
        long j = this.A01;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A00;
        return ((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }

    public C4W4(C96624Vx c96624Vx) {
        this.A01 = c96624Vx.A01;
        this.A00 = c96624Vx.A00;
        this.A03 = c96624Vx.A03;
        this.A02 = c96624Vx.A02;
        this.A04 = c96624Vx.A04;
    }
}
