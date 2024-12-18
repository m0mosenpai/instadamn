package X;

import android.opengl.GLES20;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.YFd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73480YFd implements YP4 {
    public C22978ABc A02;
    public final XO3 A03;
    public final XO2 A04;
    public final XOI A05;
    public final C72867Xpa A06;
    public final C72867Xpa A07;
    public static final byte[] A09 = {1, 1, 1, 1, -1, 1, 0, 1, 1, -1, 1, 0, -1, -1, 0, 0};
    public static final byte[] A08 = {1, -1, 1, 1, -1, -1, 0, 1, 1, 1, 1, 0, -1, 1, 0, 0};
    public Y13 A01 = Y13.A08;
    public float A00 = 1.0f;

    @Override // X.YP4
    public final void E5r() {
    }

    public static void A00() {
        C209089Mq.A04("before donetargeting");
        GLES20.glBindFramebuffer(36160, 0);
        C209089Mq.A04("after donetargeting");
    }

    public static void A01(C73480YFd c73480YFd) {
        C209089Mq.A04("before target drawbacking for drawing");
        GLES20.glBindFramebuffer(36160, c73480YFd.A05.A00);
        C209089Mq.A04("target drawbacking for drawing");
    }

    public final void A03(YP4 yp4) {
        if (yp4 != null) {
            yp4.E5r();
            A01(this);
            yp4.AQO();
            A00();
        }
    }

    @Override // X.YP4
    public final void AQO() {
        int i = this.A05.A02;
        C72867Xpa c72867Xpa = this.A07;
        this.A01.A00();
        XO2 xo2 = this.A04;
        if (xo2 != null) {
            xo2.A01(16777215, this.A00);
        }
        XO3 xo3 = this.A03;
        xo3.A02("uTexture", i);
        xo3.A00();
        GLES20.glBindBuffer(34962, 0);
        c72867Xpa.A00();
        GLES20.glDrawArrays(5, 0, 4);
        c72867Xpa.A01();
    }

    public C73480YFd(C22978ABc c22978ABc, int i, int i2) {
        this.A02 = c22978ABc;
        this.A05 = c22978ABc.A01.Bob().Cto(i, i2);
        C73481YFe c73481YFe = (C73481YFe) c22978ABc.A00(C73481YFe.class);
        this.A03 = c73481YFe.A00;
        this.A04 = c73481YFe.A01;
        this.A07 = c73481YFe.A03;
        this.A06 = c73481YFe.A02;
    }

    public final void A02() {
        A01(this);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        A00();
    }
}
