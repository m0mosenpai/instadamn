package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* loaded from: classes11.dex */
public final class WL2 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ UAE A00;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C14360o3.A0B(surfaceTexture, 0);
        UAE uae = this.A00;
        HeroPlayerSetting heroPlayerSetting = UAE.A0A;
        int i3 = uae.A07;
        Surface surface = new Surface(surfaceTexture);
        uae.A01 = surface;
        uae.A08.A0D(surface);
        InterfaceC71850X7i interfaceC71850X7i = uae.A04;
        if (interfaceC71850X7i != null) {
            C70167WEj c70167WEj = ((WYT) interfaceC71850X7i).A00;
            int i4 = c70167WEj.A00 % 2;
            if (i3 == i4 && !c70167WEj.A05) {
                UAE uae2 = c70167WEj.A0D[i4];
                uae2.setAlpha(1.0f);
                uae2.bringToFront();
                C4RQ c4rq = uae2.A08;
                c4rq.A08();
                if (c4rq.A08() >= 0) {
                    uae2.A01();
                }
                uae2.A00();
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public WL2(UAE uae) {
        this.A00 = uae;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        UAE uae = this.A00;
        HeroPlayerSetting heroPlayerSetting = UAE.A0A;
        uae.A08.A0D(null);
        Surface surface = uae.A01;
        if (surface != null) {
            surface.release();
            return false;
        }
        return false;
    }
}
