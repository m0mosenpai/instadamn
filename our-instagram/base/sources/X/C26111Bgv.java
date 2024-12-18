package X;

import android.graphics.Matrix;

/* renamed from: X.Bgv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26111Bgv extends C0T6 implements InterfaceC30927Die {
    public final float A00;
    public final float A01;
    public final int A02;
    public final long A03;

    public C26111Bgv(float f, float f2, int i, long j) {
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = j;
    }

    @Override // X.InterfaceC30927Die
    public final void ACD(Matrix matrix) {
        int i = this.A02;
        C14360o3.A0B(matrix, 0);
        if (i != 0) {
            float f = this.A00;
            float f2 = this.A01;
            long j = this.A03;
            long j2 = AbstractC27755CLw.A00;
            matrix.postSkew(f, f2, AbstractC25231BEo.A00(j), AbstractC25232BEp.A00(j));
            return;
        }
        float f3 = this.A00;
        float f4 = this.A01;
        long j3 = this.A03;
        long j4 = AbstractC27755CLw.A00;
        matrix.postScale(f3, f4, AbstractC25231BEo.A00(j3), AbstractC25232BEp.A00(j3));
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A02 != 0) {
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
        if (obj instanceof C26111Bgv) {
            C26111Bgv c26111Bgv = (C26111Bgv) obj;
            if (c26111Bgv.A02 == i && Float.compare(this.A00, c26111Bgv.A00) == 0 && Float.compare(this.A01, c26111Bgv.A01) == 0) {
                long j = this.A03;
                long j2 = c26111Bgv.A03;
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
        int A00 = AbstractC166997dE.A00(AbstractC25235BEs.A02(this.A00), this.A01);
        long j = this.A03;
        long j2 = AbstractC27755CLw.A00;
        return A00 + AbstractC25228BEl.A03(j);
    }
}
