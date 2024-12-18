package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: X.5fY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class TextureViewSurfaceTextureListenerC121805fY implements TextureView.SurfaceTextureListener {
    public Surface A00;
    public boolean A01;
    public final InterfaceC121765fU A02;
    public final C4RP A03;
    public final C4RP A04;
    public final C121745fS A05;

    public TextureViewSurfaceTextureListenerC121805fY(C4RP c4rp, C4RP c4rp2, C121745fS c121745fS, InterfaceC121765fU interfaceC121765fU) {
        C14360o3.A0B(c121745fS, 2);
        this.A03 = c4rp;
        this.A05 = c121745fS;
        this.A02 = interfaceC121765fU;
        this.A04 = c4rp2;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C14360o3.A0B(surfaceTexture, 0);
        Surface surface = new Surface(surfaceTexture);
        this.A00 = surface;
        this.A02.DrL(surfaceTexture, surface, i, i2);
        this.A03.A09(surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C14360o3.A0B(surfaceTexture, 0);
        InterfaceC121765fU interfaceC121765fU = this.A02;
        Surface surface = this.A00;
        interfaceC121765fU.DrM(surfaceTexture, surface);
        this.A03.A0E(new JWJ(new RunnableC65804TuM(surfaceTexture, surface, this)));
        this.A00 = null;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C14360o3.A0B(surfaceTexture, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C95484Ri c95484Ri;
        C14360o3.A0B(surfaceTexture, 0);
        if (!this.A01) {
            this.A01 = true;
            this.A02.DM6(surfaceTexture, this.A00);
        }
        this.A02.onSurfaceTextureUpdated(surfaceTexture);
        C4RP c4rp = this.A04;
        if (c4rp.A0G.A01 && (c95484Ri = c4rp.A05) != null) {
            synchronized (c95484Ri) {
            }
        }
    }
}
