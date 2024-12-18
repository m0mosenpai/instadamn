package X;

import android.graphics.Point;
import android.view.TextureView;
import android.view.View;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;

/* loaded from: classes11.dex */
public final class UAG extends TextureView implements RendererCommon.RendererEvents, InterfaceC71847X7f {
    public int A00;
    public int A01;
    public XB0 A02;
    public InterfaceC16820sZ A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public float A07;
    public RendererCommon.ScalingType A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final TextureViewSurfaceTextureListenerC71827X6g A0C;
    public final EglRenderer.FrameDrawnListenerWithContext A0D;
    public final List A0E;
    public final RendererCommon.VideoLayoutMeasure A0F;

    @Override // android.view.View
    public final void addOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        C14360o3.A0B(onAttachStateChangeListener, 0);
        List list = this.A0E;
        if (!list.contains(onAttachStateChangeListener)) {
            list.add(onAttachStateChangeListener);
            if (this.A0B) {
                onAttachStateChangeListener.onViewAttachedToWindow(this);
            }
        }
    }

    @Override // android.view.View
    public final void removeOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        C14360o3.A0B(onAttachStateChangeListener, 0);
        if (this.A0B) {
            onAttachStateChangeListener.onViewDetachedFromWindow(this);
        }
        this.A0E.remove(onAttachStateChangeListener);
    }

    public final void setFirstFrameRendered(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        this.A03 = interfaceC16820sZ;
    }

    public static final void A00(UAG uag) {
        int i;
        int i2;
        RendererCommon.VideoLayoutMeasure videoLayoutMeasure;
        RendererCommon.ScalingType scalingType = uag.A08;
        if (scalingType != null) {
            videoLayoutMeasure = uag.A0F;
        } else {
            if (uag.A09 && (i = uag.A01) > 0 && (i2 = uag.A00) > 0) {
                float f = i / i2;
                videoLayoutMeasure = uag.A0F;
                if (f < 1.33f) {
                    scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
                } else {
                    scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                }
            }
            uag.requestLayout();
        }
        videoLayoutMeasure.setScalingType(scalingType, scalingType);
        uag.requestLayout();
    }

    public static /* synthetic */ void A01(UAG uag, EglBase.Context context) {
        int[] iArr = EglBase.CONFIG_PLAIN;
        RendererCommon.GlDrawer drawer = uag.getDrawer();
        ThreadUtils.checkIsOnMainThread();
        if (!uag.A06) {
            uag.A01 = 0;
            uag.A00 = 0;
            TextureViewSurfaceTextureListenerC71827X6g textureViewSurfaceTextureListenerC71827X6g = uag.A0C;
            textureViewSurfaceTextureListenerC71827X6g.A00(context, uag, iArr, drawer);
            if (uag.A04) {
                textureViewSurfaceTextureListenerC71827X6g.addFrameDrawnListener(uag.A0D);
            }
            uag.A06 = true;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.VMl, java.lang.Object] */
    private final RendererCommon.GlDrawer getDrawer() {
        RendererCommon.GlDrawer glRectDrawer;
        if (this.A0A) {
            float f = this.A07;
            FloatBuffer floatBuffer = AbstractC71761X1a.A0I;
            glRectDrawer = new AbstractC71761X1a(new Object(), f);
        } else {
            glRectDrawer = new GlRectDrawer();
        }
        return glRectDrawer;
    }

    public final InterfaceC16820sZ getFirstFrameRendered() {
        return this.A03;
    }

    public final RendererCommon.ScalingType getScalingType() {
        return this.A08;
    }

    public final XB0 getVideoSizeChangeListener() {
        return this.A02;
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public final void onFirstFrameRendered() {
        this.A03.invoke();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        r3.A01 = r2;
        r3.A00 = r4;
        r2 = new X.RunnableC71518WvN(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r2.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        post(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0015, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0008, code lost:
    
        if (r6 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
    
        if (r6 == 180) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
    
        if (r6 == 180) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r3.A01 != r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        if (r3.A00 == r4) goto L35;
     */
    @Override // org.webrtc.RendererCommon.RendererEvents
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFrameResolutionChanged(int r4, int r5, int r6) {
        /*
            r3 = this;
            r0 = 180(0xb4, float:2.52E-43)
            if (r6 == 0) goto L7
            r2 = r5
            if (r6 != r0) goto La
        L7:
            r2 = r4
            if (r6 == 0) goto L31
        La:
            if (r6 == r0) goto L31
        Lc:
            int r0 = r3.A01
            if (r0 != r2) goto L15
            int r1 = r3.A00
            r0 = 0
            if (r1 == r4) goto L16
        L15:
            r0 = 1
        L16:
            r3.A01 = r2
            r3.A00 = r4
            X.WvN r2 = new X.WvN
            r2.<init>(r3, r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            if (r1 != r0) goto L33
            r2.run()
            return
        L31:
            r4 = r5
            goto Lc
        L33:
            r3.post(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAG.onFrameResolutionChanged(int, int, int):void");
    }

    public final void setAutoAdjustScalingType(boolean z) {
        this.A09 = z;
        A00(this);
    }

    public final void setMirror(boolean z) {
        this.A0C.setMirror(z);
    }

    public final void setScalingType(RendererCommon.ScalingType scalingType) {
        if (this.A08 != scalingType) {
            this.A08 = scalingType;
            A00(this);
        }
    }

    public final void setVideoSizeChangeListener(XB0 xb0) {
        this.A02 = xb0;
        if (xb0 != null) {
            xb0.Dzt(this.A01, this.A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        if (r3 != 1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UAG(android.content.Context r7, com.instagram.common.session.UserSession r8) {
        /*
            r6 = this;
            r6.<init>(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.A0E = r0
            X.X6g r1 = new X.X6g
            r1.<init>()
            r6.A0C = r1
            org.webrtc.RendererCommon$VideoLayoutMeasure r0 = new org.webrtc.RendererCommon$VideoLayoutMeasure
            r0.<init>()
            r6.A0F = r0
            X.X4g r0 = X.C71779X4g.A00
            r6.A03 = r0
            r6.setSurfaceTextureListener(r1)
            if (r8 == 0) goto L81
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36320502607782489(0x81094e00002259, double:3.032570327862176E-306)
            boolean r0 = X.C18U.A06(r5, r8, r0)
            r6.A04 = r0
            java.lang.String r0 = "activity"
            java.lang.Object r1 = r7.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.app.ActivityManager"
            X.C14360o3.A0C(r1, r0)
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            android.content.pm.ConfigurationInfo r0 = r1.getDeviceConfigurationInfo()
            X.C14360o3.A07(r0)
            java.lang.String r0 = r0.getGlEsVersion()
            X.C14360o3.A07(r0)
            java.lang.Double r0 = X.AnonymousClass010.A0m(r0)
            if (r0 == 0) goto L81
            double r3 = r0.doubleValue()
            r1 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L81
            r0 = 36602699139388158(0x8209f6000612fe, double:3.211032550763827E-306)
            long r3 = X.C18U.A01(r5, r8, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1 = 1
            if (r0 == 0) goto L6f
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L70
        L6f:
            r1 = 0
        L70:
            r6.A0A = r1
            r0 = 36602699139453695(0x8209f6000712ff, double:3.2110325508052726E-306)
            long r2 = X.C18U.A01(r5, r8, r0)
            float r1 = (float) r2
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            r6.A07 = r1
        L81:
            X.X1R r0 = X.X1R.A00
            r6.A0D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAG.<init>(android.content.Context, com.instagram.common.session.UserSession):void");
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1699045186);
        super.onAttachedToWindow();
        this.A0B = true;
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            ((View.OnAttachStateChangeListener) it.next()).onViewAttachedToWindow(this);
        }
        C0f9.A0D(-1051281600, A06);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(636752973);
        super.onDetachedFromWindow();
        this.A0B = false;
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            ((View.OnAttachStateChangeListener) it.next()).onViewDetachedFromWindow(this);
        }
        C0f9.A0D(-1780035321, A06);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ThreadUtils.checkIsOnMainThread();
        this.A0C.setLayoutAspectRatio((i3 - i) / (i4 - i2));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        Point measure = this.A0F.measure(i, i2, this.A01, this.A00);
        setMeasuredDimension(measure.x, measure.y);
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (getSurfaceTextureListener() != null) {
            C0w9.A03("TextureViewRenderer", "Setting surface texture listener again.");
        }
        super.setSurfaceTextureListener(surfaceTextureListener);
    }
}
