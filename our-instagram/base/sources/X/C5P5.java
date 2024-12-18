package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.exoplayer2.metadata.Metadata;

/* renamed from: X.5P5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5P5 implements TextureView.SurfaceTextureListener, SurfaceHolder.Callback, InterfaceC96274Uk, C5P6, C5P7, C5P8, C5P9, C4TX, InterfaceC96224Uf, C4TY {
    public final /* synthetic */ C5P4 A00;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public C5P5(C5P4 c5p4) {
        this.A00 = c5p4;
    }

    @Override // X.InterfaceC96274Uk
    public final void DTZ(final Metadata metadata, long j) {
        C5P4 c5p4 = this.A00;
        C5P4 c5p42 = C5P4.$redex_init_class;
        C4W7 c4w7 = new C4W7(c5p4.A0B);
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.A01;
            if (i >= entryArr.length) {
                break;
            }
            entryArr[i].E4k(c4w7);
            i++;
        }
        c5p4.A0B = new C4W6(c4w7);
        C4W6 A05 = C5P4.A05(c5p4);
        if (!A05.equals(c5p4.A0A)) {
            c5p4.A0A = A05;
            c5p4.A0h.A02(new InterfaceC116555Pk() { // from class: X.T4k
                @Override // X.InterfaceC116555Pk
                public final void CP5(Object obj) {
                    C5P4 c5p43 = C5P4.$redex_init_class;
                }
            }, 14);
        }
        C5PE c5pe = c5p4.A0h;
        c5pe.A02(new InterfaceC116555Pk() { // from class: X.T4l
            @Override // X.InterfaceC116555Pk
            public final void CP5(Object obj) {
            }
        }, 28);
        c5pe.A01();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C5P4 c5p4 = this.A00;
        C5P4 c5p42 = C5P4.$redex_init_class;
        Surface surface = new Surface(surfaceTexture);
        C5P4.A0H(c5p4, surface);
        c5p4.A08 = surface;
        C5P4.A0E(c5p4, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C5P4 c5p4 = this.A00;
        C5P4.A0H(c5p4, null);
        C5P4.A0E(c5p4, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C5P4.A0E(this.A00, i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C5P4.A0E(this.A00, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C5P4.A0E(this.A00, 0, 0);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C5P4 c5p4 = C5P4.$redex_init_class;
    }
}
