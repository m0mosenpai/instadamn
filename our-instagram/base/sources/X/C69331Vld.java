package X;

import android.opengl.Matrix;
import com.facebook.R;

/* renamed from: X.Vld, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69331Vld {
    public C81H A00;
    public final C180337zN A01 = AbstractC69834VwK.A00();
    public final C179877yd A02;
    public final float[] A03;
    public final float[] A04;
    public final float[] A05;

    public C69331Vld(C179877yd c179877yd) {
        float[] fArr = new float[16];
        this.A03 = fArr;
        float[] fArr2 = new float[16];
        this.A05 = fArr2;
        float[] fArr3 = new float[16];
        this.A04 = fArr3;
        this.A02 = c179877yd;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.A00 = this.A02.A01(R.raw.video_transcode_vs, R.raw.video_transcode_fs_rgba);
    }
}
