package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.Bgk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26100Bgk extends C0T6 implements InterfaceC30926Did {
    public final float A00;
    public final long A01;
    public final long A02;

    @Override // X.InterfaceC30926Did
    public final void ACE(Path path, C28225CcV c28225CcV) {
        C14360o3.A0B(path, 0);
        long j = this.A02;
        long j2 = AbstractC27755CLw.A00;
        RectF A01 = C28369CfV.A01(AbstractC25227BEk.A01(j), AbstractC25232BEp.A00(j), this.A01);
        float f = this.A00;
        path.addRoundRect(A01, f, f, Path.Direction.CW);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26100Bgk) {
                C26100Bgk c26100Bgk = (C26100Bgk) obj;
                long j = this.A02;
                long j2 = c26100Bgk.A02;
                long j3 = AbstractC27755CLw.A00;
                if (j != j2 || this.A01 != c26100Bgk.A01 || Float.compare(this.A00, c26100Bgk.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A02;
        long j2 = AbstractC27755CLw.A00;
        return AbstractC25226BEj.A01(AbstractC167007dF.A07(this.A01, AbstractC25227BEk.A03(j)), this.A00);
    }

    public C26100Bgk(float f, long j, long j2) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = f;
    }
}
