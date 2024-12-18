package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.TextureView;

/* renamed from: X.6nj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class TextureViewSurfaceTextureListenerC149336nj implements TextureView.SurfaceTextureListener {
    public int A00;
    public int A01;
    public SurfaceTexture A02;
    public C149366nm A03;
    public VBo A04;
    public C149286nd A06;
    public Integer A07;
    public Integer A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Context A0I;
    public final TextureView.SurfaceTextureListener A0J;
    public final C149406nr A0K;
    public final C149326ni A0L;
    public final InterfaceC09390do A0M = AbstractC09440dt.A01(C149346nk.A00);
    public InterfaceC149306ng A05 = new InterfaceC149306ng() { // from class: X.6nl
        @Override // X.InterfaceC149306ng
        public final void EmN(String str, String str2) {
        }

        @Override // X.InterfaceC149306ng
        public final void EmP(String str, String str2, Throwable th) {
        }
    };
    public final float[] A0N = {0.0f, 0.0f, 0.0f, 0.0f};

    public final void A00() {
        boolean z;
        SurfaceTexture surfaceTexture = this.A02;
        if (surfaceTexture == null) {
            z = true;
        } else {
            if (this.A04 != null) {
                return;
            }
            double d = VBo.A03;
            VBo vBo = new VBo(this.A0I, surfaceTexture, this, new W4Y(this.A03), this.A05, this.A01, this.A00);
            this.A04 = vBo;
            vBo.start();
            z = false;
        }
        this.A0F = z;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C14360o3.A0B(surfaceTexture, 0);
        this.A0H = true;
        this.A02 = surfaceTexture;
        if (this.A0F) {
            A00();
            this.A0F = false;
        }
        if (this.A0C) {
            if (this.A02 == null) {
                this.A0C = true;
            } else {
                VBo vBo = this.A04;
                if (vBo != null) {
                    vBo.A01();
                } else {
                    A00();
                }
            }
            this.A0C = false;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C14360o3.A0B(surfaceTexture, 0);
        this.A0J.onSurfaceTextureUpdated(surfaceTexture);
    }

    public final void A01() {
        VBo vBo = this.A04;
        if (vBo != null) {
            Handler handler = ((U9K) vBo).A02;
            if (handler != null) {
                handler.sendEmptyMessage(2);
            }
            vBo.A0G = true;
            VBo vBo2 = this.A04;
            if (vBo2 != null) {
                Handler handler2 = ((U9K) vBo2).A02;
                if (handler2 != null) {
                    handler2.sendEmptyMessage(2);
                }
                vBo2.A0G = true;
                this.A04 = null;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        VBo vBo = this.A04;
        if (vBo != null) {
            ((U9K) vBo).A01 = i;
            ((U9K) vBo).A00 = i2;
            Handler handler = ((U9K) vBo).A02;
            if (handler != null) {
                handler.sendEmptyMessage(4);
            }
        }
    }

    public TextureViewSurfaceTextureListenerC149336nj(Context context, TextureView.SurfaceTextureListener surfaceTextureListener, C149326ni c149326ni) {
        this.A0J = surfaceTextureListener;
        this.A0I = context.getApplicationContext();
        this.A03 = new C149366nm(context);
        this.A0L = c149326ni;
        Object value = this.A0M.getValue();
        C14360o3.A07(value);
        this.A0K = new C149406nr(context, new C149396nq((C0JM) value, new C149386np(this)));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        A01();
        this.A02 = null;
        return this.A0H;
    }
}
