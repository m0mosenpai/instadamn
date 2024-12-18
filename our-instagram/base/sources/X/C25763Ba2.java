package X;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;

/* renamed from: X.Ba2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25763Ba2 extends C62Y {
    public float A00;
    public Shader A01;
    public final Matrix A02 = new Matrix();
    public final float A03;
    public final List A04;

    @Override // X.C62Y
    public final Shader A01(long j) {
        LinearGradient A00 = AbstractC25292BHl.A00(this.A04, null, 0, AbstractC119395aw.A00(0.0f, 0.0f), AbstractC119395aw.A00(0.0f, this.A03));
        A00.setLocalMatrix(this.A02);
        this.A01 = A00;
        return A00;
    }

    public C25763Ba2(List list, float f) {
        this.A04 = list;
        this.A03 = f;
    }
}
