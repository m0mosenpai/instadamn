package X;

import android.graphics.Matrix;

/* renamed from: X.Bgt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26109Bgt extends C0T6 implements InterfaceC30927Die {
    public final float A00;
    public final long A01;

    @Override // X.InterfaceC30927Die
    public final void ACD(Matrix matrix) {
        C14360o3.A0B(matrix, 0);
        float f = this.A00;
        long j = this.A01;
        long j2 = AbstractC27755CLw.A00;
        matrix.postRotate(f, AbstractC25231BEo.A00(j), AbstractC25232BEp.A00(j));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26109Bgt) {
                C26109Bgt c26109Bgt = (C26109Bgt) obj;
                if (Float.compare(this.A00, c26109Bgt.A00) == 0) {
                    long j = this.A01;
                    long j2 = c26109Bgt.A01;
                    long j3 = AbstractC27755CLw.A00;
                    if (j == j2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A02 = AbstractC25235BEs.A02(this.A00);
        long j = this.A01;
        long j2 = AbstractC27755CLw.A00;
        return A02 + AbstractC25228BEl.A03(j);
    }

    public C26109Bgt(long j, float f) {
        this.A00 = f;
        this.A01 = j;
    }
}
