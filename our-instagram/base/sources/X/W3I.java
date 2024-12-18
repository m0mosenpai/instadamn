package X;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.facebook.live.livestreaming.opengl.EglCore;
import com.instagram.ui.widget.textureview.CircularTextureView;

/* loaded from: classes11.dex */
public final class W3I {
    public int A00;
    public SurfaceTexture A01;
    public EglCore A02;
    public C68911VeB A03;
    public C69693Vto A04;
    public volatile int A08;
    public volatile int A09;
    public volatile C69165Viu A0B;
    public final float[] A07 = new float[16];
    public Integer A05 = C05F.A01;
    public volatile Rect A0A = new Rect();
    public volatile boolean A0C = false;
    public final U9D A06 = new U9D(AbstractC65702TsY.A0G("VideoRendererThread"), this);

    public static void A00(W3I w3i) {
        C69165Viu c69165Viu = w3i.A0B;
        if (c69165Viu != null) {
            CircularTextureView circularTextureView = c69165Viu.A02;
            int i = c69165Viu.A00;
            int i2 = c69165Viu.A01;
            circularTextureView.A05 = false;
            TextureView.SurfaceTextureListener surfaceTextureListener = circularTextureView.A03;
            if (surfaceTextureListener != null && circularTextureView.A01()) {
                SurfaceTexture surfaceTexture = circularTextureView.getSurfaceTexture();
                surfaceTexture.getClass();
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
        }
        C69693Vto c69693Vto = w3i.A04;
        if (c69693Vto != null) {
            c69693Vto.A01();
            w3i.A04 = null;
        }
        SurfaceTexture surfaceTexture2 = w3i.A01;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            w3i.A01 = null;
        }
        C68911VeB c68911VeB = w3i.A03;
        if (c68911VeB != null) {
            if (c68911VeB.A00 != null) {
                c68911VeB.A00 = null;
            }
            w3i.A03 = null;
        }
        EglCore eglCore = w3i.A02;
        if (eglCore != null) {
            eglCore.A00();
            w3i.A02 = null;
        }
    }
}
