package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes10.dex */
public final class QFL extends UAC implements TextureView.SurfaceTextureListener, InterfaceC65542TmH {
    public Surface A00;
    public Integer A01;

    @Override // X.InterfaceC65542TmH
    public final void onHostDestroy() {
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostPause() {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00 = new Surface(surfaceTexture);
        A00();
    }

    private void A00() {
        int i;
        int A03 = C0f9.A03(13212300);
        Surface surface = this.A00;
        if (surface != null && surface.isValid()) {
            try {
                Canvas lockCanvas = this.A00.lockCanvas(null);
                lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                Integer num = this.A01;
                if (num != null) {
                    lockCanvas.drawColor(num.intValue());
                }
                new Paint();
                throw AbstractC166987dD.A15("size");
            } catch (IllegalArgumentException | IllegalStateException e) {
                C0I2.A03("ReactNative", AnonymousClass001.A0R(AbstractC31173DnH.A0q(e), " in Surface.unlockCanvasAndPost"));
                i = 1864906832;
            }
        } else {
            i = 19521282;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.InterfaceC65542TmH
    public final void onHostResume() {
        A00();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Context context = getContext();
        if (context instanceof R3N) {
            ((Q21) context).A0B(this);
        }
        Surface surface = this.A00;
        if (surface != null) {
            surface.release();
            this.A00 = null;
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.A01 = Integer.valueOf(i);
    }
}
