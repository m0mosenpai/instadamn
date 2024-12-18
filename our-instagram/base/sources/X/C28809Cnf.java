package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.Cnf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28809Cnf implements C5AH {
    public final Path A01;
    public C60Y A00 = C60W.A00();
    public final float[] A02 = C5AJ.A06();

    @Override // X.C5AH
    public final AbstractC119385av AMh(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583, long j) {
        AbstractC167007dF.A1D(anonymousClass583, 1, interfaceC1128957x);
        ((C60X) this.A00).A03.rewind();
        Path path = this.A01;
        this.A00 = new C60X(path);
        float[] fArr = this.A02;
        C5AJ.A02(fArr);
        RectF A0X = AbstractC166987dD.A0X();
        path.computeBounds(A0X, true);
        float max = Math.max(A0X.width(), A0X.height());
        C5AJ.A03(fArr, C5YC.A02(j) / max, C5YC.A00(j) / max);
        C5AJ.A04(fArr, -A0X.left, -A0X.top);
        C60X c60x = (C60X) this.A00;
        Matrix matrix = c60x.A00;
        if (matrix == null) {
            matrix = new Matrix();
            c60x.A00 = matrix;
        }
        AbstractC130975vl.A00(matrix, fArr);
        Path path2 = c60x.A03;
        Matrix matrix2 = c60x.A00;
        C14360o3.A0A(matrix2);
        path2.transform(matrix2);
        return new C119405ax(this.A00);
    }

    public C28809Cnf(Path path) {
        this.A01 = path;
    }
}
