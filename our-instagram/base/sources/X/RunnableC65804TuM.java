package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.TuM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC65804TuM implements Runnable {
    public final /* synthetic */ SurfaceTexture A00;
    public final /* synthetic */ Surface A01;
    public final /* synthetic */ TextureViewSurfaceTextureListenerC121805fY A02;

    public RunnableC65804TuM(SurfaceTexture surfaceTexture, Surface surface, TextureViewSurfaceTextureListenerC121805fY textureViewSurfaceTextureListenerC121805fY) {
        this.A01 = surface;
        this.A02 = textureViewSurfaceTextureListenerC121805fY;
        this.A00 = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Surface surface = this.A01;
        if (surface != null) {
            surface.release();
        }
        this.A00.release();
    }
}
