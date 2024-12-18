package X;

import android.graphics.Matrix;

/* renamed from: X.Bgu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26110Bgu extends C0T6 implements InterfaceC30927Die {
    public final float A00;
    public final float A01;

    @Override // X.InterfaceC30927Die
    public final void ACD(Matrix matrix) {
        C14360o3.A0B(matrix, 0);
        matrix.postTranslate(this.A00, this.A01);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26110Bgu) {
                C26110Bgu c26110Bgu = (C26110Bgu) obj;
                if (Float.compare(this.A00, c26110Bgu.A00) != 0 || Float.compare(this.A01, c26110Bgu.A01) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A01(AbstractC25235BEs.A02(this.A00), this.A01);
    }

    public C26110Bgu(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
