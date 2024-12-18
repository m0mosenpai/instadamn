package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.OiH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class TextureViewSurfaceTextureListenerC55355OiH implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C52135N5j A00;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C14360o3.A0B(surfaceTexture, 0);
        C52135N5j c52135N5j = this.A00;
        if (c52135N5j.A05 == null) {
            Surface surface = new Surface(surfaceTexture);
            c52135N5j.A05 = surface;
            InterfaceC58267PsB interfaceC58267PsB = c52135N5j.A0E;
            if (interfaceC58267PsB != null) {
                interfaceC58267PsB.setSurface(surface);
                C54671OCx c54671OCx = c52135N5j.A0B;
                if (c54671OCx != null && c54671OCx.A02 != null) {
                    C52135N5j.A01(c54671OCx, c52135N5j);
                    return;
                }
                return;
            }
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC55355OiH(C52135N5j c52135N5j) {
        this.A00 = c52135N5j;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C52135N5j c52135N5j = this.A00;
        InterfaceC58267PsB interfaceC58267PsB = c52135N5j.A0E;
        if (interfaceC58267PsB != null) {
            interfaceC58267PsB.release();
            c52135N5j.A0E = null;
        }
        Surface surface = c52135N5j.A05;
        if (surface != null) {
            surface.release();
            c52135N5j.A05 = null;
            return true;
        }
        return true;
    }
}
