package X;

import android.graphics.Path;

/* renamed from: X.Bgj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26099Bgj extends C0T6 implements InterfaceC30926Did {
    public final long A00;
    public final long A01;
    public final long A02;

    @Override // X.InterfaceC30926Did
    public final void ACE(Path path, C28225CcV c28225CcV) {
        C14360o3.A0B(path, 0);
        long j = this.A00;
        long j2 = AbstractC27755CLw.A00;
        float A01 = AbstractC25227BEk.A01(j);
        float A00 = AbstractC25232BEp.A00(j);
        long j3 = this.A01;
        float A012 = AbstractC25227BEk.A01(j3);
        float A002 = AbstractC25232BEp.A00(j3);
        long j4 = this.A02;
        path.cubicTo(A01, A00, A012, A002, AbstractC25227BEk.A01(j4), AbstractC25232BEp.A00(j4));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26099Bgj) {
                C26099Bgj c26099Bgj = (C26099Bgj) obj;
                long j = this.A00;
                long j2 = c26099Bgj.A00;
                long j3 = AbstractC27755CLw.A00;
                if (j != j2 || this.A01 != c26099Bgj.A01 || this.A02 != c26099Bgj.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = AbstractC27755CLw.A00;
        int A07 = AbstractC167007dF.A07(this.A01, AbstractC25227BEk.A03(j));
        long j3 = this.A02;
        return A07 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public C26099Bgj(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
    }
}
