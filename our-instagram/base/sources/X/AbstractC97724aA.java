package X;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.4aA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC97724aA {
    public C4QT A00;
    public final int A01;

    public final Bitmap A01() {
        if (this instanceof C4a9) {
            ScalingTextureView scalingTextureView = ((C4a9) this).A02;
            return scalingTextureView.getBitmap(scalingTextureView.A02 / 2, scalingTextureView.A01 / 2);
        }
        return null;
    }

    public final View A02() {
        if (this instanceof C4a9) {
            return ((C4a9) this).A01;
        }
        return ((SurfaceHolderCallbackC98844c4) this).A03;
    }

    public final void A03() {
        if (this instanceof C4a9) {
            ScalingTextureView scalingTextureView = ((C4a9) this).A02;
            scalingTextureView.A02 = 0;
            scalingTextureView.A01 = 0;
            scalingTextureView.setTransform(null);
        }
    }

    public final void A04(Object obj) {
        Surface surface;
        if (this instanceof C4a9) {
            ((SurfaceTexture) obj).release();
        } else {
            if (!(obj instanceof Surface) || (surface = (Surface) obj) == null) {
                return;
            }
            surface.release();
        }
    }

    public final boolean A05() {
        if (this instanceof C4a9) {
            return ((C4a9) this).A03;
        }
        return ((SurfaceHolderCallbackC98844c4) this).A05;
    }

    public AbstractC97724aA(C4QT c4qt, int i) {
        this.A01 = i;
        this.A00 = c4qt;
    }

    public void A06(InterfaceC74623Ww interfaceC74623Ww) {
        View A02 = A02();
        if (A02.getParent() != interfaceC74623Ww) {
            interfaceC74623Ww.addView(A02, this.A01);
        }
    }
}
