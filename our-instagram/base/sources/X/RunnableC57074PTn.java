package X;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.os.Build;

/* renamed from: X.PTn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57074PTn implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C197368o7 A01;
    public final /* synthetic */ OEN A02;
    public final /* synthetic */ OJJ A03;
    public final /* synthetic */ OZr A04;
    public final /* synthetic */ C197728oj A05;

    public RunnableC57074PTn(Bitmap bitmap, C197368o7 c197368o7, OEN oen, OJJ ojj, OZr oZr, C197728oj c197728oj) {
        this.A01 = c197368o7;
        this.A05 = c197728oj;
        this.A00 = bitmap;
        this.A04 = oZr;
        this.A02 = oen;
        this.A03 = ojj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Gainmap gainmap;
        C197368o7 c197368o7 = this.A01;
        Bitmap A00 = c197368o7.A00();
        if (A00 != null && Build.VERSION.SDK_INT >= 34) {
            C197728oj c197728oj = this.A05;
            if (c197728oj.A04.A00) {
                gainmap = new Gainmap(A00.copy(Bitmap.Config.ALPHA_8, false));
                A00.recycle();
            } else {
                gainmap = new Gainmap(A00);
            }
            gainmap.setDisplayRatioForFullHdr(c197728oj.A05.A00);
            float[] fArr = (float[]) c197728oj.A07.A00;
            gainmap.setEpsilonHdr(fArr[0], fArr[1], fArr[2]);
            float[] fArr2 = (float[]) c197728oj.A08.A00;
            gainmap.setEpsilonSdr(fArr2[0], fArr2[1], fArr2[2]);
            float[] fArr3 = (float[]) c197728oj.A09.A00;
            gainmap.setGamma(fArr3[0], fArr3[1], fArr3[2]);
            gainmap.setMinDisplayRatioForHdrTransition(c197728oj.A06.A00);
            float[] fArr4 = (float[]) c197728oj.A0A.A00;
            gainmap.setRatioMax(fArr4[0], fArr4[1], fArr4[2]);
            float[] fArr5 = (float[]) c197728oj.A0B.A00;
            gainmap.setRatioMin(fArr5[0], fArr5[1], fArr5[2]);
            this.A00.setGainmap(gainmap);
        }
        OZr.A00(this.A00, c197368o7, this.A02, this.A03, this.A04);
    }
}
