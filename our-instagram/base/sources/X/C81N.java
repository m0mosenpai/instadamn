package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* renamed from: X.81N, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C81N {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public SurfaceTexture A04;
    public ImageReader A05;
    public Surface A06;
    public SurfaceHolder.Callback A07;
    public TextureView.SurfaceTextureListener A08;
    public InterfaceC25169BBp A09;
    public boolean A0A;
    public SurfaceControl A0B;
    public final SurfaceView A0C;
    public final MultiListenerTextureView A0D;
    public final C185658Lk A0E;
    public final Consumer A0F;

    public C81N(final SurfaceView surfaceView) {
        C14360o3.A0B(surfaceView, 1);
        this.A01 = 1.0f;
        this.A0F = new Consumer() { // from class: X.8Lj
            @Override // java.util.function.Consumer
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                Display display = (Display) obj;
                C14360o3.A0B(display, 0);
                if (Build.VERSION.SDK_INT >= 34) {
                    C81N.this.A01 = display.getHdrSdrRatio();
                }
                C81N c81n = C81N.this;
                InterfaceC25169BBp interfaceC25169BBp = c81n.A09;
                if (interfaceC25169BBp != null) {
                    interfaceC25169BBp.DKG(c81n.A01);
                }
            }
        };
        this.A0C = surfaceView;
        this.A0D = null;
        this.A0E = new C185658Lk(null);
        SurfaceHolder.Callback callback = new SurfaceHolder.Callback() { // from class: X.9LB
            public boolean A00;

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C14360o3.A0B(surfaceHolder, 0);
                C81N c81n = this;
                c81n.A03 = i2;
                c81n.A02 = i3;
                if (this.A00) {
                    this.A00 = false;
                } else if (Build.VERSION.SDK_INT >= 34) {
                    surfaceDestroyed(surfaceHolder);
                } else {
                    c81n.A0E.Dr3(i2, i3);
                    return;
                }
                C185658Lk c185658Lk = c81n.A0E;
                Surface surface = surfaceHolder.getSurface();
                C14360o3.A07(surface);
                c185658Lk.Dr6(surface, i2, i3);
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                this.A00 = true;
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                SurfaceControl surfaceControl;
                Display display;
                this.A00 = false;
                C81N c81n = this;
                c81n.A0E.DrA();
                if (Build.VERSION.SDK_INT >= 34) {
                    surfaceControl = c81n.A0B;
                    if (surfaceControl != null) {
                        new SurfaceControl.Transaction().reparent(surfaceControl, null).setBufferSize(surfaceControl, 0, 0).apply();
                        surfaceControl.release();
                    }
                    c81n.A0B = null;
                    ImageReader imageReader = c81n.A05;
                    if (imageReader != null) {
                        imageReader.close();
                    }
                    c81n.A05 = null;
                    if (c81n.A0A && (display = surfaceView.getDisplay()) != null) {
                        display.unregisterHdrSdrRatioChangedListener(c81n.A0F);
                    }
                }
                c81n.A06 = null;
            }
        };
        surfaceView.getHolder().addCallback(callback);
        this.A07 = callback;
    }

    public final void A08(InterfaceC185668Ll interfaceC185668Ll) {
        SurfaceView surfaceView;
        SurfaceHolder holder;
        MultiListenerTextureView multiListenerTextureView;
        C14360o3.A0B(interfaceC185668Ll, 0);
        this.A0E.A00.add(interfaceC185668Ll);
        TextureView.SurfaceTextureListener surfaceTextureListener = this.A08;
        if (surfaceTextureListener != null && (multiListenerTextureView = this.A0D) != null) {
            multiListenerTextureView.A02(surfaceTextureListener);
        }
        SurfaceHolder.Callback callback = this.A07;
        if (callback != null && (surfaceView = this.A0C) != null && (holder = surfaceView.getHolder()) != null) {
            holder.addCallback(callback);
        }
    }

    public static final void A01(C81N c81n) {
        SurfaceControl surfaceControl;
        ImageReader imageReader = c81n.A05;
        if (imageReader != null && Build.VERSION.SDK_INT >= 34 && (surfaceControl = c81n.A0B) != null) {
            Image image = null;
            try {
                image = imageReader.acquireNextImage();
                SyncFence fence = image.getFence();
                C14360o3.A07(fence);
                float f = c81n.A00;
                if (f <= 0.0f) {
                    f = c81n.A01;
                }
                new SurfaceControl.Transaction().setDataSpace(surfaceControl, 411107328).setExtendedRangeBrightness(surfaceControl, f, 3.0f).setBuffer(surfaceControl, image.getHardwareBuffer(), fence, new C24941B1p(image, c81n)).apply();
            } catch (Throwable unused) {
                if (image != null) {
                    image.close();
                }
            }
        }
    }

    public final Bitmap A03(Bitmap bitmap) {
        Bitmap bitmap2;
        if (bitmap != null) {
            MultiListenerTextureView multiListenerTextureView = this.A0D;
            if (multiListenerTextureView == null || (bitmap2 = multiListenerTextureView.getBitmap(bitmap)) == null) {
                Surface A04 = A04();
                if (A04 != null) {
                    try {
                        PixelCopy.request(A04, bitmap, new APu(bitmap), new Handler(Looper.getMainLooper()));
                        return bitmap;
                    } catch (Throwable th) {
                        AbstractC12120kG.A07("ConstrainedViewHolder", "getSurfaceBitmap failed", th);
                    }
                }
                return bitmap;
            }
            return bitmap2;
        }
        return null;
    }

    public final Surface A04() {
        Surface surface;
        MultiListenerTextureView multiListenerTextureView;
        if (this.A06 != null && (multiListenerTextureView = this.A0D) != null && (!multiListenerTextureView.isAvailable() || !C14360o3.A0K(multiListenerTextureView.getSurfaceTexture(), this.A04))) {
            Surface surface2 = this.A06;
            if (surface2 != null) {
                surface2.release();
            }
            this.A06 = null;
            this.A04 = null;
        }
        if (this.A06 == null) {
            MultiListenerTextureView multiListenerTextureView2 = this.A0D;
            if (multiListenerTextureView2 != null && multiListenerTextureView2.isAvailable()) {
                this.A06 = new Surface(multiListenerTextureView2.getSurfaceTexture());
                this.A04 = multiListenerTextureView2.getSurfaceTexture();
            }
            SurfaceView surfaceView = this.A0C;
            if (surfaceView != null && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                if (Build.VERSION.SDK_INT >= 34 && this.A03 > 0 && this.A02 > 0) {
                    SurfaceControl build = new SurfaceControl.Builder().setName("ConstrainedView").build();
                    C14360o3.A07(build);
                    new SurfaceControl.Transaction().reparent(build, surfaceView.getSurfaceControl()).setVisibility(build, true).apply();
                    this.A0B = build;
                    ImageReader newInstance = ImageReader.newInstance(this.A03, this.A02, 1, 2, 2816L);
                    C14360o3.A07(newInstance);
                    newInstance.setOnImageAvailableListener(new APH(this), null);
                    this.A06 = newInstance.getSurface();
                    this.A05 = newInstance;
                    Display display = surfaceView.getDisplay();
                    if (this.A0A && display != null && display.isHdrSdrRatioAvailable()) {
                        float hdrSdrRatio = display.getHdrSdrRatio();
                        this.A01 = hdrSdrRatio;
                        InterfaceC25169BBp interfaceC25169BBp = this.A09;
                        if (interfaceC25169BBp != null) {
                            interfaceC25169BBp.DKG(hdrSdrRatio);
                        }
                        display.registerHdrSdrRatioChangedListener(new Executor() { // from class: X.B1e
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                C14360o3.A0B(runnable, 0);
                                runnable.run();
                            }
                        }, this.A0F);
                    }
                } else {
                    this.A06 = surface;
                }
            }
        }
        return this.A06;
    }

    public final View A05() {
        View view = this.A0D;
        if (view == null && (view = this.A0C) == null) {
            throw new IllegalStateException("No View");
        }
        return view;
    }

    public final MultiListenerTextureView A06() {
        MultiListenerTextureView multiListenerTextureView = this.A0D;
        if (multiListenerTextureView != null) {
            return multiListenerTextureView;
        }
        throw new IllegalStateException("No TextureView");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(X.InterfaceC16660sJ r6) {
        /*
            r5 = this;
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r0 = r5.A0D
            if (r0 == 0) goto L1b
            android.graphics.Bitmap r0 = r0.getBitmap()
            if (r0 != 0) goto L17
        La:
            int r2 = r5.A03
            int r1 = r5.A02
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            X.C14360o3.A07(r0)
        L17:
            r6.invoke(r0)
            return
        L1b:
            android.view.SurfaceView r4 = r5.A0C
            if (r4 == 0) goto La
            int r2 = r5.A03     // Catch: java.lang.Throwable -> L3e
            int r1 = r5.A02     // Catch: java.lang.Throwable -> L3e
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L3e
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch: java.lang.Throwable -> L3e
            X.C14360o3.A07(r3)     // Catch: java.lang.Throwable -> L3e
            X.APw r2 = new X.APw     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r3, r6)     // Catch: java.lang.Throwable -> L3e
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L3e
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Throwable -> L3e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3e
            android.view.PixelCopy.request(r4, r3, r2, r0)     // Catch: java.lang.Throwable -> L3e
            return
        L3e:
            r2 = move-exception
            java.lang.String r1 = "ConstrainedViewHolder"
            java.lang.String r0 = "getSurfaceBitmap with callback failed"
            X.AbstractC12120kG.A07(r1, r0, r2)
            int r2 = r5.A03
            int r1 = r5.A02
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            X.C14360o3.A07(r0)
            r6.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81N.A09(X.0sJ):void");
    }

    public final boolean A0A() {
        Display display;
        if (Build.VERSION.SDK_INT < 34 || this.A0C == null || (display = A05().getDisplay()) == null || !display.isHdrSdrRatioAvailable()) {
            return false;
        }
        return true;
    }

    public final boolean A0B() {
        if (this.A0C != null && Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        return false;
    }

    public final void A07(float f) {
        if (A05() instanceof InterfaceC25168BBo) {
            ((Activity) AbstractC13320mI.A01(A05().getContext(), Activity.class)).runOnUiThread(new RunnableC24589Auk(this, f));
        }
    }

    public C81N(MultiListenerTextureView multiListenerTextureView) {
        C14360o3.A0B(multiListenerTextureView, 1);
        this.A01 = 1.0f;
        this.A0F = new Consumer() { // from class: X.8Lj
            @Override // java.util.function.Consumer
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                Display display = (Display) obj;
                C14360o3.A0B(display, 0);
                if (Build.VERSION.SDK_INT >= 34) {
                    C81N.this.A01 = display.getHdrSdrRatio();
                }
                C81N c81n = C81N.this;
                InterfaceC25169BBp interfaceC25169BBp = c81n.A09;
                if (interfaceC25169BBp != null) {
                    interfaceC25169BBp.DKG(c81n.A01);
                }
            }
        };
        this.A0D = multiListenerTextureView;
        this.A0C = null;
        this.A0E = new C185658Lk(null);
        TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: X.8Lm
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C14360o3.A0B(surfaceTexture, 0);
                C81N c81n = C81N.this;
                c81n.A03 = i;
                c81n.A02 = i2;
                c81n.A0E.Dr6(new Surface(surfaceTexture), i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C81N c81n = C81N.this;
                c81n.A0E.DrA();
                Surface surface = c81n.A06;
                if (surface != null) {
                    surface.release();
                }
                c81n.A06 = null;
                c81n.A04 = null;
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C81N c81n = C81N.this;
                c81n.A03 = i;
                c81n.A02 = i2;
                c81n.A0E.Dr3(i, i2);
            }
        };
        multiListenerTextureView.setOpaque(false);
        multiListenerTextureView.A02(surfaceTextureListener);
        this.A08 = surfaceTextureListener;
    }
}
