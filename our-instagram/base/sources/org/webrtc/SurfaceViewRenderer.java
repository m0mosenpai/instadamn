package org.webrtc;

import X.AnonymousClass001;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;

/* loaded from: classes11.dex */
public class SurfaceViewRenderer extends SurfaceView implements SurfaceHolder.Callback, RendererCommon.RendererEvents, VideoSink {
    public static final String TAG = "SurfaceViewRenderer";
    public final SurfaceEglRenderer eglRenderer;
    public boolean enableFixedSize;
    public RendererCommon.RendererEvents rendererEvents;
    public final String resourceName;
    public int rotatedFrameHeight;
    public int rotatedFrameWidth;
    public int surfaceHeight;
    public int surfaceWidth;
    public final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public void addFrameDrawnListener(EglRenderer.FrameDrawnListenerWithContext frameDrawnListenerWithContext) {
        this.eglRenderer.addFrameDrawnListener(frameDrawnListenerWithContext);
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f, glDrawer);
    }

    public void clearImage() {
        this.eglRenderer.clearImage();
    }

    public void disableFpsReduction() {
        this.eglRenderer.disableFpsReduction();
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, RenderSynchronizer renderSynchronizer) {
        init(context, rendererEvents, EglBase.CONFIG_PLAIN, new GlRectDrawer(), renderSynchronizer);
    }

    /* renamed from: lambda$onFrameResolutionChanged$0$org-webrtc-SurfaceViewRenderer, reason: not valid java name */
    public /* synthetic */ void m134lambda$onFrameResolutionChanged$0$orgwebrtcSurfaceViewRenderer(int i, int i2) {
        this.rotatedFrameWidth = i;
        this.rotatedFrameHeight = i2;
        updateSurfaceSize();
        requestLayout();
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFirstFrameRendered();
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        this.eglRenderer.onFrame(videoFrame);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        postOrRun(new org.webrtc.SurfaceViewRenderer$$ExternalSyntheticLambda0(r2, r1, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x000f, code lost:
    
        if (r5 != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if (r5 == 180) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r5 != 180) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
    
        r3 = r4;
     */
    @Override // org.webrtc.RendererCommon.RendererEvents
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFrameResolutionChanged(final int r3, int r4, int r5) {
        /*
            r2 = this;
            org.webrtc.RendererCommon$RendererEvents r0 = r2.rendererEvents
            if (r0 == 0) goto L7
            r0.onFrameResolutionChanged(r3, r4, r5)
        L7:
            r0 = 180(0xb4, float:2.52E-43)
            if (r5 == 0) goto Le
            r1 = r4
            if (r5 != r0) goto L11
        Le:
            r1 = r3
            if (r5 == 0) goto L13
        L11:
            if (r5 != r0) goto L14
        L13:
            r3 = r4
        L14:
            org.webrtc.SurfaceViewRenderer$$ExternalSyntheticLambda0 r0 = new org.webrtc.SurfaceViewRenderer$$ExternalSyntheticLambda0
            r0.<init>()
            r2.postOrRun(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.SurfaceViewRenderer.onFrameResolutionChanged(int, int, int):void");
    }

    public void pauseVideo() {
        this.eglRenderer.pauseVideo();
    }

    public void release() {
        this.eglRenderer.release();
    }

    public void removeFrameDrawnListener(EglRenderer.FrameDrawnListenerWithContext frameDrawnListenerWithContext) {
        this.eglRenderer.removeFrameDrawnListener(frameDrawnListenerWithContext);
    }

    public void removeFrameListener(EglRenderer.FrameListener frameListener) {
        this.eglRenderer.removeFrameListener(frameListener);
    }

    public void setFpsReduction(float f) {
        this.eglRenderer.setFpsReduction(f);
    }

    public void setMirror(boolean z) {
        this.eglRenderer.setMirror(z);
    }

    public void setRotation(int i) {
        this.eglRenderer.setRotation(i);
    }

    public SurfaceViewRenderer(Context context) {
        super(context);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(resourceName);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    private void logD(String str) {
        boolean z = Logging.loggingEnabled;
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (this.enableFixedSize && this.rotatedFrameWidth != 0 && this.rotatedFrameHeight != 0 && getWidth() != 0 && getHeight() != 0) {
            float width = getWidth() / getHeight();
            int i = this.rotatedFrameWidth;
            float f = i;
            int i2 = this.rotatedFrameHeight;
            float f2 = i2;
            if (f / f2 > width) {
                i = (int) (f2 * width);
            } else {
                i2 = (int) (f / width);
            }
            int min = Math.min(getWidth(), i);
            int min2 = Math.min(getHeight(), i2);
            StringBuilder sb = new StringBuilder();
            sb.append("updateSurfaceSize. Layout size: ");
            sb.append(getWidth());
            sb.append("x");
            sb.append(getHeight());
            sb.append(", frame size: ");
            sb.append(this.rotatedFrameWidth);
            sb.append("x");
            sb.append(this.rotatedFrameHeight);
            sb.append(", requested surface size: ");
            sb.append(min);
            sb.append("x");
            sb.append(min2);
            sb.append(", old surface size: ");
            int i3 = this.surfaceWidth;
            sb.append(i3);
            sb.append("x");
            int i4 = this.surfaceHeight;
            sb.append(i4);
            logD(sb.toString());
            if (min != i3 || min2 != i4) {
                this.surfaceWidth = min;
                this.surfaceHeight = min2;
                getHolder().setFixedSize(min, min2);
                return;
            }
            return;
        }
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        getHolder().setSizeFromLayout();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio((i3 - i) / (i4 - i2));
        updateSurfaceSize();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        Point measure = this.videoLayoutMeasure.measure(i, i2, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(measure.x, measure.y);
        logD(AnonymousClass001.A02(measure.x, measure.y, "onMeasure(). New size: ", "x"));
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        updateSurfaceSize();
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType);
        requestLayout();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
    }

    public SurfaceViewRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(resourceName);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f) {
        this.eglRenderer.addFrameListener(frameListener, f);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, this, iArr, glDrawer);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType, RendererCommon.ScalingType scalingType2) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType2);
        requestLayout();
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer, RenderSynchronizer renderSynchronizer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, this, iArr, glDrawer, renderSynchronizer);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents) {
        init(context, rendererEvents, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }
}
