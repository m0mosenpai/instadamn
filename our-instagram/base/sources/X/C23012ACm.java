package X;

/* renamed from: X.ACm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23012ACm {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C23012ACm c23012ACm = (C23012ACm) obj;
            if (this.A04 != c23012ACm.A04 || this.A03 != c23012ACm.A03) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((int) this.A04) * 31) + ((int) this.A03);
    }

    public final String toString() {
        String format = String.format("<S t=\"%d\" d=\"%d\"/>", Long.valueOf(this.A04), Long.valueOf(this.A03));
        if (this.A05) {
            return AnonymousClass001.A0R(format, " (p) ");
        }
        return format;
    }

    public C23012ACm(int i, int i2, int i3, long j, long j2, boolean z) {
        this.A04 = j;
        this.A03 = j2;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = z;
        this.A00 = i3;
    }
}
