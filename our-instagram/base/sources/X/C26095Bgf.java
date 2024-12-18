package X;

import android.graphics.Path;

/* renamed from: X.Bgf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26095Bgf extends C0T6 implements InterfaceC30926Did {
    public final int A00;
    public final long A01;

    public C26095Bgf(long j, int i) {
        this.A00 = i;
        this.A01 = j;
    }

    @Override // X.InterfaceC30926Did
    public final void ACE(Path path, C28225CcV c28225CcV) {
        int i = this.A00;
        C14360o3.A0B(path, 0);
        long j = this.A01;
        long j2 = AbstractC27755CLw.A00;
        float A00 = AbstractC25231BEo.A00(j);
        float A002 = AbstractC25232BEp.A00(j);
        if (i != 0) {
            path.moveTo(A00, A002);
        } else {
            path.lineTo(A00, A002);
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else {
            if (this == obj) {
                return true;
            }
            i = 0;
        }
        if (obj instanceof C26095Bgf) {
            C26095Bgf c26095Bgf = (C26095Bgf) obj;
            if (c26095Bgf.A00 == i) {
                long j = this.A01;
                long j2 = c26095Bgf.A01;
                long j3 = AbstractC27755CLw.A00;
                if (j == j2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = AbstractC27755CLw.A00;
        return AbstractC25228BEl.A03(j);
    }
}
