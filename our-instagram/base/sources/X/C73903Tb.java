package X;

import com.facebook.odin.model.Matrix;
import java.util.List;

/* renamed from: X.3Tb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73903Tb extends C0T6 implements InterfaceC73913Tc {
    public final Matrix A00;
    public final Matrix A01;
    public final List A02;
    public final float[] A03;
    public final float[] A04;
    public final float[] A05;
    public final int[] A06;
    public final Matrix[] A07;
    public final float[][] A08;

    public C73903Tb(Matrix matrix, Matrix matrix2, List list, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, Matrix[] matrixArr, float[][] fArr4) {
        C14360o3.A0B(iArr, 2);
        C14360o3.A0B(fArr, 3);
        C14360o3.A0B(fArr3, 6);
        C14360o3.A0B(matrixArr, 7);
        C14360o3.A0B(fArr4, 8);
        C14360o3.A0B(matrix, 9);
        C14360o3.A0B(matrix2, 10);
        this.A02 = list;
        this.A06 = iArr;
        this.A03 = fArr;
        this.A04 = fArr2;
        this.A05 = fArr3;
        this.A07 = matrixArr;
        this.A08 = fArr4;
        this.A00 = matrix;
        this.A01 = matrix2;
    }

    @Override // X.InterfaceC73913Tc
    public final String BXI() {
        return "range";
    }

    @Override // X.InterfaceC73913Tc
    public final float[] CEL(int i) {
        return new float[0];
    }

    @Override // X.InterfaceC73913Tc
    public final float[] Afj(int i) {
        return this.A00.A00[i - 1];
    }

    @Override // X.InterfaceC73913Tc
    public final float[] Afk(int i) {
        return this.A01.A00[i - 1];
    }

    @Override // X.InterfaceC73913Tc
    public final float[] Afx(int i) {
        return this.A08[i - 1];
    }

    @Override // X.InterfaceC73913Tc
    public final List BUN() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC73913Tc
    public final int[] BWg() {
        return this.A06;
    }

    @Override // X.InterfaceC73913Tc
    public final List BfN() {
        return this.A02;
    }

    @Override // X.InterfaceC73913Tc
    public final Matrix CHU(int i) {
        return this.A07[i - 1];
    }

    @Override // X.InterfaceC73913Tc
    public final float[] BQK(int i) {
        return this.A03;
    }

    @Override // X.InterfaceC73913Tc
    public final float[] CEK(int i) {
        return this.A05;
    }
}
