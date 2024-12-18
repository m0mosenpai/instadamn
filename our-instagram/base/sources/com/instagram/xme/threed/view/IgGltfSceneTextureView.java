package com.instagram.xme.threed.view;

import X.AbstractC149296nf;
import X.AbstractC149416ns;
import X.C0f9;
import X.C0fX;
import X.C14360o3;
import X.C149326ni;
import X.C149406nr;
import X.C149476ny;
import X.InterfaceC149306ng;
import X.TextureViewSurfaceTextureListenerC149336nj;
import X.U9K;
import X.VBo;
import X.WIR;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.hardware.SensorManager;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;

/* loaded from: classes3.dex */
public final class IgGltfSceneTextureView extends AbstractC149296nf implements InterfaceC149306ng {
    public TextureViewSurfaceTextureListenerC149336nj A00;
    public boolean A01;
    public boolean A02;
    public final TextureViewSurfaceTextureListenerC149336nj A03;
    public final TextureView.SurfaceTextureListener A04;
    public final C149326ni A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgGltfSceneTextureView(Context context) {
        super(context, null, 0);
        C14360o3.A0B(context, 1);
        TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: X.6nh
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.A04 = surfaceTextureListener;
        C149326ni c149326ni = new C149326ni(this);
        this.A05 = c149326ni;
        Context context2 = getContext();
        C14360o3.A07(context2);
        this.A03 = new TextureViewSurfaceTextureListenerC149336nj(context2, surfaceTextureListener, c149326ni);
        setSurfaceTextureListener(surfaceTextureListener);
        setOpaque(false);
    }

    @Override // X.InterfaceC149306ng
    public final void EmN(String str, String str2) {
    }

    @Override // X.InterfaceC149306ng
    public final void EmP(String str, String str2, Throwable th) {
    }

    public final void setErrorReportCallback(InterfaceC149306ng interfaceC149306ng) {
        C14360o3.A0B(interfaceC149306ng, 0);
        this.A03.A05 = interfaceC149306ng;
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        TextureViewSurfaceTextureListenerC149336nj textureViewSurfaceTextureListenerC149336nj = null;
        if (surfaceTextureListener != null) {
            textureViewSurfaceTextureListenerC149336nj = this.A00;
            if (textureViewSurfaceTextureListenerC149336nj == null || textureViewSurfaceTextureListenerC149336nj.A0J != surfaceTextureListener) {
                textureViewSurfaceTextureListenerC149336nj = this.A03;
                this.A00 = textureViewSurfaceTextureListenerC149336nj;
            }
        } else {
            TextureViewSurfaceTextureListenerC149336nj textureViewSurfaceTextureListenerC149336nj2 = this.A00;
            if (textureViewSurfaceTextureListenerC149336nj2 != null) {
                textureViewSurfaceTextureListenerC149336nj2.A01();
                this.A00 = textureViewSurfaceTextureListenerC149336nj;
            }
        }
        super.setSurfaceTextureListener(textureViewSurfaceTextureListenerC149336nj);
    }

    public final void A00() {
        TextureViewSurfaceTextureListenerC149336nj textureViewSurfaceTextureListenerC149336nj = this.A00;
        if (textureViewSurfaceTextureListenerC149336nj != null) {
            if (textureViewSurfaceTextureListenerC149336nj.A02 == null) {
                textureViewSurfaceTextureListenerC149336nj.A0C = true;
                return;
            }
            VBo vBo = textureViewSurfaceTextureListenerC149336nj.A04;
            if (vBo != null) {
                vBo.A01();
            } else {
                textureViewSurfaceTextureListenerC149336nj.A00();
            }
        }
    }

    public final boolean getHandleTouch() {
        return this.A01;
    }

    public final TextureViewSurfaceTextureListenerC149336nj getRenderTarget() {
        return this.A03;
    }

    public final void setSensorEnabled(boolean z) {
        VBo vBo;
        Handler handler;
        TextureViewSurfaceTextureListenerC149336nj textureViewSurfaceTextureListenerC149336nj = this.A00;
        if (textureViewSurfaceTextureListenerC149336nj != null && (vBo = textureViewSurfaceTextureListenerC149336nj.A04) != null && (handler = ((U9K) vBo).A02) != null) {
            int i = 6;
            if (z) {
                i = 5;
            }
            handler.sendEmptyMessage(i);
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-198822209);
        super.onSizeChanged(i, i2, i3, i4);
        TextureViewSurfaceTextureListenerC149336nj textureViewSurfaceTextureListenerC149336nj = this.A03;
        textureViewSurfaceTextureListenerC149336nj.A01 = i;
        textureViewSurfaceTextureListenerC149336nj.A00 = i2;
        Matrix matrix = new Matrix();
        matrix.setScale(2.0f, 2.0f);
        matrix.postTranslate(0.0f, i2 * (-1.0f));
        setTransform(matrix);
        C0f9.A0D(454823003, A06);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int A05 = C0f9.A05(2132170171);
        C14360o3.A0B(motionEvent, 0);
        if (this.A01) {
            TextureViewSurfaceTextureListenerC149336nj textureViewSurfaceTextureListenerC149336nj = this.A03;
            if (textureViewSurfaceTextureListenerC149336nj.A04 == null) {
                z = false;
            } else {
                C149406nr c149406nr = textureViewSurfaceTextureListenerC149336nj.A0K;
                int action = motionEvent.getAction() & 255;
                if (action != 1 && action != 3) {
                    C149476ny c149476ny = c149406nr.A02;
                    GestureDetector gestureDetector = c149476ny.A01;
                    if (gestureDetector == null) {
                        gestureDetector = new GestureDetector(c149476ny.A00, c149476ny.A02);
                        c149476ny.A01 = gestureDetector;
                    }
                    if (!gestureDetector.onTouchEvent(motionEvent)) {
                        if (c149406nr.A03.A00(motionEvent)) {
                            c149406nr.A01 = true;
                        } else {
                            AbstractC149416ns abstractC149416ns = c149406nr.A00;
                            if (!abstractC149416ns.A01(motionEvent)) {
                                if (abstractC149416ns.A05) {
                                    c149406nr.A01 = true;
                                }
                                z = c149406nr.A01;
                            }
                        }
                    }
                } else {
                    c149406nr.A01 = false;
                    C149476ny c149476ny2 = c149406nr.A02;
                    GestureDetector gestureDetector2 = c149476ny2.A01;
                    if (gestureDetector2 == null) {
                        gestureDetector2 = new GestureDetector(c149476ny2.A00, c149476ny2.A02);
                        c149476ny2.A01 = gestureDetector2;
                    }
                    gestureDetector2.onTouchEvent(motionEvent);
                    c149406nr.A03.A00(motionEvent);
                    c149406nr.A00.A01(motionEvent);
                }
                z = true;
            }
            C0f9.A0C(1062883202, A05);
            return z;
        }
        C0f9.A0C(879060290, A05);
        return false;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        int A06 = C0f9.A06(743860007);
        super.onWindowFocusChanged(z);
        if (z) {
            if (this.A02) {
                TextureViewSurfaceTextureListenerC149336nj textureViewSurfaceTextureListenerC149336nj = this.A03;
                VBo vBo = textureViewSurfaceTextureListenerC149336nj.A04;
                if (vBo != null) {
                    vBo.A01();
                }
                textureViewSurfaceTextureListenerC149336nj.A0E = true;
            }
            this.A02 = false;
        } else {
            TextureViewSurfaceTextureListenerC149336nj textureViewSurfaceTextureListenerC149336nj2 = this.A03;
            this.A02 = textureViewSurfaceTextureListenerC149336nj2.A0E;
            VBo vBo2 = textureViewSurfaceTextureListenerC149336nj2.A04;
            if (vBo2 != null) {
                vBo2.A0H = true;
                WIR wir = vBo2.A0E;
                SensorManager sensorManager = wir.A01;
                if (sensorManager != null) {
                    C0fX.A00(wir, sensorManager);
                }
            }
            textureViewSurfaceTextureListenerC149336nj2.A0E = false;
        }
        C0f9.A0D(113920429, A06);
    }

    public final void setHandleTouch(boolean z) {
        this.A01 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgGltfSceneTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
        TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: X.6nh
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i22) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i22) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.A04 = surfaceTextureListener;
        C149326ni c149326ni = new C149326ni(this);
        this.A05 = c149326ni;
        Context context2 = getContext();
        C14360o3.A07(context2);
        this.A03 = new TextureViewSurfaceTextureListenerC149336nj(context2, surfaceTextureListener, c149326ni);
        setSurfaceTextureListener(surfaceTextureListener);
        setOpaque(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgGltfSceneTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
        TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: X.6nh
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i22) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i22) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }
        };
        this.A04 = surfaceTextureListener;
        C149326ni c149326ni = new C149326ni(this);
        this.A05 = c149326ni;
        Context context2 = getContext();
        C14360o3.A07(context2);
        this.A03 = new TextureViewSurfaceTextureListenerC149336nj(context2, surfaceTextureListener, c149326ni);
        setSurfaceTextureListener(surfaceTextureListener);
        setOpaque(false);
    }
}
