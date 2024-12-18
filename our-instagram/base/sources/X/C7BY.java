package X;

import android.graphics.Matrix;
import android.graphics.Shader;

/* renamed from: X.7BY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BY implements InterfaceC161477Li {
    public int A00;
    public final Matrix A01 = new Matrix();
    public final Shader A02;

    @Override // X.InterfaceC161477Li
    public final void Eg1(int i) {
        if (i != this.A00) {
            this.A00 = i;
            Matrix matrix = this.A01;
            matrix.setTranslate(0.0f, -i);
            this.A02.setLocalMatrix(matrix);
        }
    }

    public C7BY(Shader shader) {
        this.A02 = shader;
    }
}
