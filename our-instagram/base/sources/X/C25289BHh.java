package X;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;

/* renamed from: X.BHh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25289BHh extends C62Y {
    public Shader A01;
    public final BHN A03;
    public final Matrix A02 = new Matrix();
    public long A00 = 9205357640488583168L;

    public C25289BHh(BHN bhn) {
        this.A03 = bhn;
    }

    @Override // X.C62Y
    public final Shader A01(long j) {
        float A02 = C5YC.A02(j);
        BHN bhn = this.A03;
        long j2 = bhn.A01;
        long A00 = AbstractC119395aw.A00(A02 * C119365at.A01(j2), C5YC.A00(j) * C119365at.A02(j2));
        float A022 = C5YC.A02(j);
        long j3 = bhn.A00;
        LinearGradient A002 = AbstractC25292BHl.A00(bhn.A03, bhn.A02, 0, A00, AbstractC119395aw.A00(A022 * C119365at.A01(j3), C5YC.A00(j) * C119365at.A02(j3)));
        this.A01 = A002;
        this.A00 = j;
        A002.getLocalMatrix(this.A02);
        return A002;
    }
}
