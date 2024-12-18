package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.instagram.ui.widget.textureview.ScalingTextureView;

/* renamed from: X.4a9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4a9 extends AbstractC97724aA implements TextureView.SurfaceTextureListener {
    public final Surface A00;
    public final View A01;
    public final ScalingTextureView A02;
    public final boolean A03;
    public final SurfaceTexture A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4a9(ScalingTextureView scalingTextureView, C4QT c4qt, int i) {
        super(c4qt, i);
        SurfaceTexture surfaceTexture;
        C14360o3.A0B(scalingTextureView, 2);
        this.A02 = scalingTextureView;
        AbstractC97734aB.A00("TextureVideoViewController.init()", new C9EK(this, 46));
        this.A01 = scalingTextureView;
        boolean isAvailable = scalingTextureView.isAvailable();
        this.A03 = isAvailable;
        Surface surface = null;
        if (isAvailable && (surfaceTexture = scalingTextureView.getSurfaceTexture()) != null) {
            surface = new Surface(surfaceTexture);
        }
        this.A00 = surface;
        this.A04 = scalingTextureView.getSurfaceTexture();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C14360o3.A0B(surfaceTexture, 0);
        AbstractC97734aB.A00("TextureVideoViewController.onSurfaceAvailable()", new C9FG(this, i, surfaceTexture, i2, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C14360o3.A0B(surfaceTexture, 0);
        if (super.A00.A0N(this, surfaceTexture)) {
            return true;
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C4QT c4qt = super.A00;
        C4SE c4se = c4qt.A0O;
        if (c4se != null && c4qt.A0M == C3Q0.PLAYING) {
            C95264Qm c95264Qm = c4qt.A0o;
            C4S7 c4s7 = c4se.A0B;
            c95264Qm.EIq(C4QT.A00(c4s7, c4qt), c4s7.A03);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        super.A00.DrP();
    }
}
