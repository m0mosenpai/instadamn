package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.OiG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC55354OiG implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C50643MXf A00;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C14360o3.A0B(surfaceTexture, 0);
        C50643MXf c50643MXf = this.A00;
        if (c50643MXf.A06 != null) {
            AbstractC12120kG.A07(C50643MXf.__redex_internal_original_name, "surface should be null", null);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        c50643MXf.A06 = surface;
        InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
        if (interfaceC58267PsB == null) {
            return;
        }
        interfaceC58267PsB.setSurface(surface);
        C54671OCx c54671OCx = c50643MXf.A09;
        if (c54671OCx == null || c54671OCx.A02 == null || !C50643MXf.A0D(c50643MXf)) {
            return;
        }
        C50643MXf.A04(c54671OCx, c50643MXf);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC55354OiG(C50643MXf c50643MXf) {
        this.A00 = c50643MXf;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C50643MXf c50643MXf = this.A00;
        InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
        if (interfaceC58267PsB != null) {
            interfaceC58267PsB.release();
            c50643MXf.A0B = null;
        }
        Surface surface = c50643MXf.A06;
        if (surface != null) {
            surface.release();
            c50643MXf.A06 = null;
            return true;
        }
        return true;
    }
}
