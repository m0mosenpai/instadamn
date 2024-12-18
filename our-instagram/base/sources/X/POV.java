package X;

import android.widget.SeekBar;

/* loaded from: classes9.dex */
public final class POV implements Runnable {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC55534OlS A00;

    public POV(TextureViewSurfaceTextureListenerC55534OlS textureViewSurfaceTextureListenerC55534OlS) {
        this.A00 = textureViewSurfaceTextureListenerC55534OlS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC55534OlS textureViewSurfaceTextureListenerC55534OlS = this.A00;
        float f = textureViewSurfaceTextureListenerC55534OlS.A0C.A01;
        SeekBar seekBar = textureViewSurfaceTextureListenerC55534OlS.A06;
        int A08 = (int) ((f * AbstractC166987dD.A08(seekBar)) + 0.5f);
        C50743Max c50743Max = textureViewSurfaceTextureListenerC55534OlS.A09;
        c50743Max.A07 = textureViewSurfaceTextureListenerC55534OlS.A08.getBitmap(A08, seekBar.getHeight());
        c50743Max.invalidateSelf();
        seekBar.invalidate();
    }
}
