package X;

import android.graphics.Point;
import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;
import org.webrtc.SurfaceTextureHelper;

/* loaded from: classes4.dex */
public final class AGA {
    public float A00;
    public int A01;
    public Point A02;
    public final A6A A03;

    public static final void A00(AGA aga, float f, int i) {
        if (f != 0.0f && i != 0) {
            Point point = aga.A02;
            int i2 = i;
            float f2 = i;
            if (f > 1.0f) {
                i = (int) (f2 / f);
            } else {
                i2 = (int) (f2 * f);
            }
            if (point != null) {
                int i3 = point.x;
                if (i3 > 0) {
                    i2 -= i2 % i3;
                }
                int i4 = point.y;
                if (i4 > 0) {
                    i -= i % i4;
                }
            }
            if (i2 > 0 && i > 0) {
                IgLiteCameraProxy igLiteCameraProxy = aga.A03.A00;
                igLiteCameraProxy.A01 = i2;
                igLiteCameraProxy.A00 = i;
                OXE.A00.A00("IgLiteCameraProxy", AnonymousClass001.A02(i2, i, "onCalculatedSizeChanged width=", " height="));
                SurfaceTextureHelper surfaceTextureHelper = igLiteCameraProxy.A09;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.setTextureSize(i2, i);
                }
            }
        }
    }

    public AGA(A6A a6a) {
        this.A03 = a6a;
    }
}
