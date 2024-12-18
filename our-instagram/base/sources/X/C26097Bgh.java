package X;

import android.graphics.Path;

/* renamed from: X.Bgh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26097Bgh extends C0T6 implements InterfaceC30926Did {
    public final float A00;
    public final long A01;

    @Override // X.InterfaceC30926Did
    public final void ACE(Path path, C28225CcV c28225CcV) {
        C14360o3.A0B(path, 0);
        long j = this.A01;
        long j2 = AbstractC27755CLw.A00;
        path.addCircle(AbstractC25231BEo.A00(j), AbstractC25232BEp.A00(j), this.A00, Path.Direction.CW);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26097Bgh) {
                C26097Bgh c26097Bgh = (C26097Bgh) obj;
                long j = this.A01;
                long j2 = c26097Bgh.A01;
                long j3 = AbstractC27755CLw.A00;
                if (j != j2 || Float.compare(this.A00, c26097Bgh.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = AbstractC27755CLw.A00;
        return AbstractC25226BEj.A01(AbstractC25235BEs.A03(j), this.A00);
    }

    public C26097Bgh(long j, float f) {
        this.A01 = j;
        this.A00 = f;
    }
}
