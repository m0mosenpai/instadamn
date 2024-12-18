package X;

import com.facebook.common.math.matrix.Matrix4;

/* loaded from: classes4.dex */
public final class A71 {
    public final Matrix4 A00;
    public final BDM A01;

    public A71(Integer num, int i, int i2) {
        BDM c23784Afv;
        if (num.intValue() != 1) {
            c23784Afv = new C23783Afu(i, i2);
        } else {
            c23784Afv = new C23784Afv(0.5f);
        }
        BDM bdm = c23784Afv;
        this.A01 = bdm;
        float CAj = bdm.CAj() * 2.0f;
        float BqS = bdm.BqS();
        float f = (-1.0f) + BqS + (0.0f * 2.0f);
        float BqT = bdm.BqT();
        float f2 = (1.0f - BqT) - CAj;
        Matrix4 matrix4 = new Matrix4();
        matrix4.A02(BqS, BqT);
        Matrix4 matrix42 = new Matrix4();
        Matrix4 matrix43 = new Matrix4();
        matrix43.A03(f, f2, 0.0f);
        matrix42.A05(matrix4.A01);
        matrix43.A05(matrix42.A01);
        this.A00 = matrix43;
    }
}
