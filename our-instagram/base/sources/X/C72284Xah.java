package X;

import android.opengl.GLES20;

/* renamed from: X.Xah, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72284Xah extends AbstractC73479YFc {
    public static XO3 A02;
    public static XO2 A03;
    public static VBE A04;
    public static C72867Xpa A05;
    public static final float[] A06 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public float A00;
    public int A01;

    @Override // X.YP4
    public final void AQO() {
        Y13 y13;
        A02.A00();
        GLES20.glBindBuffer(34962, A04.A03);
        A05.A00();
        YQ3 yq3 = this.A03;
        C18C.A07(yq3, AbstractC111324zv.A00(2741));
        AbstractC73478YFb abstractC73478YFb = (AbstractC73478YFb) yq3;
        if (abstractC73478YFb instanceof C72281Xae) {
            y13 = Y13.A06;
        } else {
            y13 = abstractC73478YFb.A06;
        }
        y13.A00();
        GLES20.glDrawArrays(5, 0, 4);
        A05.A01();
        GLES20.glBindBuffer(34962, 0);
    }

    @Override // X.AbstractC73479YFc
    public final void A01(YQ3 yq3) {
        int i;
        float f;
        super.A01(yq3);
        if (yq3 != null) {
            i = ((AbstractC73478YFb) yq3).A03;
        } else {
            i = 0;
        }
        this.A01 = i;
        if (yq3 != null) {
            f = yq3.AbQ() / 255.0f;
        } else {
            f = 0.0f;
        }
        this.A00 = f;
    }
}
