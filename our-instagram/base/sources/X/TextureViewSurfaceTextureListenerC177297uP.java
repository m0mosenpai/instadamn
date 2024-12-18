package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* renamed from: X.7uP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class TextureViewSurfaceTextureListenerC177297uP implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ C177277uN A00;

    public TextureViewSurfaceTextureListenerC177297uP(C177277uN c177277uN) {
        this.A00 = c177277uN;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C177277uN c177277uN = this.A00;
        c177277uN.A01 = i;
        c177277uN.A00 = i2;
        C175007qa c175007qa = c177277uN.A02;
        if (!c175007qa.A0G) {
            c175007qa.A03();
            C175007qa c175007qa2 = c177277uN.A02;
            c175007qa2.A0R.A00(c175007qa2.A0S).Dic(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A02.A0I(new C197028nX(surfaceTexture, this), "onSurfaceTextureDestroyed");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C177277uN c177277uN = this.A00;
        c177277uN.A01 = i;
        c177277uN.A00 = i2;
        C175007qa c175007qa = c177277uN.A02;
        if (!c175007qa.A0G) {
            c175007qa.A0R.A00(c175007qa.A0S).Dib(i, i2);
            c177277uN.A02.A05();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C177277uN c177277uN = this.A00;
        C174797qF c174797qF = c177277uN.A03;
        if (c174797qF != null) {
            C8HT c8ht = c174797qF.A00;
            if (c8ht != null) {
                c8ht.DrO();
            }
            c177277uN.A03 = null;
        }
        c177277uN.A02.A0N.CtC();
        C196998nU.A00().A03();
    }
}
