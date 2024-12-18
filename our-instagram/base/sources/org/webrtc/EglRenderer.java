package org.webrtc;

import X.AbstractC166997dE;
import X.AbstractC31175DnJ;
import X.AbstractC43594JPz;
import X.AbstractC58317Pt9;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AnonymousClass001;
import X.MSV;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLException;
import android.view.Surface;
import com.facebook.common.dextricks.Constants;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.EglThread;
import org.webrtc.GlUtil;
import org.webrtc.RendererCommon;

/* loaded from: classes11.dex */
public class EglRenderer implements VideoSink {
    public static final long LOG_INTERVAL_SEC = 10;
    public static final String TAG = "EglRenderer";
    public final GlTextureFrameBuffer bitmapTextureFramebuffer;
    public final Matrix drawMatrix;
    public RendererCommon.GlDrawer drawer;
    public EglBase eglBase;
    public final Runnable eglExceptionCallback;
    public final EglSurfaceCreation eglSurfaceCreationRunnable;
    public EglThread eglThread;
    public volatile ErrorCallback errorCallback;
    public final Object fpsReductionLock;
    public final VideoFrameDrawer frameDrawer;
    public final ListenerManager frameDrawnListenersWithContext;
    public final ArrayList frameListeners;
    public final Object frameLock;
    public int framesDropped;
    public int framesReceived;
    public int framesRendered;
    public float layoutAspectRatio;
    public final Object layoutLock;
    public final Runnable logStatisticsRunnable;
    public long minRenderPeriodNs;
    public boolean mirrorHorizontally;
    public boolean mirrorVertically;
    public final String name;
    public long nextFrameTimeNs;
    public VideoFrame pendingFrame;
    public final ArrayList renderListeners;
    public long renderSwapBufferTimeNs;
    public long renderTimeNs;
    public int rotationDegrees;
    public final Object statisticsLock;
    public long statisticsStartTimeNs;
    public final Object threadLock;
    public boolean usePresentationTimeStamp;

    /* loaded from: classes11.dex */
    public class EglSurfaceCreation implements Runnable {
        public Object surface;

        @Override // java.lang.Runnable
        public synchronized void run() {
            EglBase eglBase;
            if (this.surface != null && (eglBase = EglRenderer.this.eglBase) != null && !eglBase.hasSurface()) {
                Object obj = this.surface;
                if (obj instanceof Surface) {
                    EglRenderer.this.eglBase.createSurface((Surface) obj);
                } else if (obj instanceof SurfaceTexture) {
                    EglRenderer.this.eglBase.createSurface((SurfaceTexture) obj);
                } else {
                    throw AbstractC43594JPz.A0o(obj, MSV.A00(800), new StringBuilder());
                }
                EglRenderer.this.eglBase.makeCurrent();
                GLES20.glPixelStorei(3317, 1);
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }

        public EglSurfaceCreation() {
        }
    }

    /* loaded from: classes11.dex */
    public interface ErrorCallback {
        void onGlOutOfMemory();

        void onNoSurface();

        void onRenderThreadNotInitialized();
    }

    /* loaded from: classes11.dex */
    public interface FrameDrawnListenerWithContext {
        void onFrameDrawn(VideoFrame videoFrame);
    }

    /* loaded from: classes11.dex */
    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    /* loaded from: classes11.dex */
    public class ListenerManager {
        public final ArrayList listenerList;

        public ListenerManager() {
            this.listenerList = new ArrayList();
        }

        public void addListener(final Object obj) {
            EglRenderer.this.postToRenderThread(new Runnable() { // from class: org.webrtc.EglRenderer$ListenerManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    EglRenderer.ListenerManager.this.m119lambda$addListener$0$orgwebrtcEglRenderer$ListenerManager(obj);
                }
            });
        }

        public void clear() {
            this.listenerList.clear();
        }

        /* renamed from: lambda$addListener$0$org-webrtc-EglRenderer$ListenerManager, reason: not valid java name */
        public /* synthetic */ void m119lambda$addListener$0$orgwebrtcEglRenderer$ListenerManager(Object obj) {
            this.listenerList.add(obj);
        }

        /* renamed from: lambda$removeListener$1$org-webrtc-EglRenderer$ListenerManager, reason: not valid java name */
        public /* synthetic */ void m120lambda$removeListener$1$orgwebrtcEglRenderer$ListenerManager(CountDownLatch countDownLatch, Object obj) {
            countDownLatch.countDown();
            Iterator it = this.listenerList.iterator();
            while (it.hasNext()) {
                if (it.next() == obj) {
                    it.remove();
                }
            }
        }

        public void removeListener(final Object obj) {
            final CountDownLatch A15 = AbstractC58319PtB.A15();
            synchronized (EglRenderer.this.threadLock) {
                EglThread eglThread = EglRenderer.this.eglThread;
                if (eglThread == null) {
                    return;
                }
                if (Thread.currentThread() != eglThread.handler.getLooper().getThread()) {
                    EglRenderer.this.postToRenderThread(new Runnable() { // from class: org.webrtc.EglRenderer$ListenerManager$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            EglRenderer.ListenerManager.this.m120lambda$removeListener$1$orgwebrtcEglRenderer$ListenerManager(A15, obj);
                        }
                    });
                    ThreadUtils.awaitUninterruptibly(A15);
                    return;
                }
                throw new RuntimeException("removeListener must not be called on the render thread.");
            }
        }
    }

    /* loaded from: classes11.dex */
    public interface RenderListener {
        void onRender(long j);
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f, glDrawer, false);
    }

    /* renamed from: lambda$release$0$org-webrtc-EglRenderer, reason: not valid java name */
    public /* synthetic */ void m114lambda$release$0$orgwebrtcEglRenderer(CountDownLatch countDownLatch) {
        GLES20.glUseProgram(0);
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.renderListeners.clear();
        this.frameListeners.clear();
        countDownLatch.countDown();
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    /* loaded from: classes11.dex */
    public class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
        }
    }

    public EglRenderer(String str) {
        this(str, new VideoFrameDrawer());
    }

    private String averageTimeAsString(long j, int i) {
        if (i <= 0) {
            return "NA";
        }
        return AnonymousClass001.A0A(TimeUnit.NANOSECONDS.toMicros(j / i), " us");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearSurfaceOnRenderThread, reason: merged with bridge method [inline-methods] */
    public void m113lambda$clearImage$5$orgwebrtcEglRenderer(float f, float f2, float f3, float f4) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null && eglBase.hasSurface()) {
            this.eglBase.makeCurrent();
            GLES20.glClearColor(f, f2, f3, f4);
            GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            this.eglBase.swapBuffers();
        }
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    private void logE(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        sb.append(" ");
        AbstractC58320PtC.A1N(this.name, " ", str, sb);
        Logging.e(TAG, sb.toString(), th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logStatistics() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long nanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            long j = nanoTime - this.statisticsStartTimeNs;
            if (j > 0 && (this.minRenderPeriodNs != Long.MAX_VALUE || this.framesReceived != 0)) {
                float nanos = ((float) (this.framesRendered * TimeUnit.SECONDS.toNanos(1L))) / ((float) j);
                StringBuilder sb = new StringBuilder();
                sb.append("Duration: ");
                sb.append(TimeUnit.NANOSECONDS.toMillis(j));
                sb.append(" ms. Frames received: ");
                sb.append(this.framesReceived);
                sb.append(". Dropped: ");
                sb.append(this.framesDropped);
                sb.append(". Rendered: ");
                sb.append(this.framesRendered);
                sb.append(". Render fps: ");
                sb.append(decimalFormat.format(nanos));
                sb.append(". Average render time: ");
                sb.append(averageTimeAsString(this.renderTimeNs, this.framesRendered));
                sb.append(". Average swapBuffer time: ");
                sb.append(averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered));
                logD(AbstractC166997dE.A0x(".", sb));
                resetStatistics(nanoTime);
            }
        }
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        FrameListener frameListener;
        Bitmap bitmap;
        if (!this.frameListeners.isEmpty()) {
            this.drawMatrix.reset();
            this.drawMatrix.preTranslate(0.5f, 0.5f);
            Matrix matrix = this.drawMatrix;
            float f = 1.0f;
            if (this.mirrorHorizontally) {
                f = -1.0f;
            }
            float f2 = 1.0f;
            if (this.mirrorVertically) {
                f2 = -1.0f;
            }
            matrix.preScale(f, f2);
            this.drawMatrix.preScale(1.0f, -1.0f);
            this.drawMatrix.preTranslate(-0.5f, -0.5f);
            Iterator it = this.frameListeners.iterator();
            while (it.hasNext()) {
                FrameListenerAndParams frameListenerAndParams = (FrameListenerAndParams) it.next();
                if (z || !frameListenerAndParams.applyFpsReduction) {
                    it.remove();
                    int rotatedWidth = (int) (frameListenerAndParams.scale * videoFrame.getRotatedWidth());
                    int rotatedHeight = (int) (frameListenerAndParams.scale * videoFrame.getRotatedHeight());
                    if (rotatedWidth != 0 && rotatedHeight != 0) {
                        this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                        GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.frameBufferId);
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.textureId, 0);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                        GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
                        this.frameDrawer.drawFrame(videoFrame, frameListenerAndParams.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                        GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                        GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, allocateDirect);
                        GLES20.glBindFramebuffer(36160, 0);
                        GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                        bitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                        bitmap.copyPixelsFromBuffer(allocateDirect);
                        frameListener = frameListenerAndParams.listener;
                    } else {
                        frameListener = frameListenerAndParams.listener;
                        bitmap = null;
                    }
                    frameListener.onFrame(bitmap);
                }
            }
        }
    }

    private void notifyFrameDrawnListeners(VideoFrame videoFrame) {
        Iterator it = this.frameDrawnListenersWithContext.listenerList.iterator();
        while (it.hasNext()) {
            ((FrameDrawnListenerWithContext) it.next()).onFrameDrawn(videoFrame);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postToRenderThread(Runnable runnable) {
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread != null) {
                eglThread.handler.post(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderFrameOnRenderThread() {
        boolean z;
        float f;
        float f2;
        float f3;
        synchronized (this.frameLock) {
            VideoFrame videoFrame = this.pendingFrame;
            if (videoFrame == null) {
                return;
            }
            this.pendingFrame = null;
            EglBase eglBase = this.eglBase;
            if (eglBase != null && eglBase.hasSurface()) {
                try {
                    this.eglBase.makeCurrent();
                    synchronized (this.fpsReductionLock) {
                        long j = this.minRenderPeriodNs;
                        if (j != Long.MAX_VALUE) {
                            if (j > 0) {
                                long nanoTime = System.nanoTime();
                                long j2 = this.nextFrameTimeNs;
                                if (nanoTime < j2) {
                                    logD("Skipping frame rendering - fps reduction is active.");
                                } else {
                                    long j3 = j2 + j;
                                    this.nextFrameTimeNs = j3;
                                    this.nextFrameTimeNs = Math.max(j3, nanoTime);
                                }
                            }
                            z = true;
                        }
                        z = false;
                    }
                    long nanoTime2 = System.nanoTime();
                    float rotatedWidth = videoFrame.getRotatedWidth() / videoFrame.getRotatedHeight();
                    synchronized (this.layoutLock) {
                        f = this.layoutAspectRatio;
                        if (f == 0.0f) {
                            f = rotatedWidth;
                        }
                    }
                    float f4 = 1.0f;
                    if (rotatedWidth > f) {
                        f3 = f / rotatedWidth;
                        f2 = 1.0f;
                    } else {
                        f2 = rotatedWidth / f;
                        f3 = 1.0f;
                    }
                    this.drawMatrix.reset();
                    this.drawMatrix.preTranslate(0.5f, 0.5f);
                    Matrix matrix = this.drawMatrix;
                    float f5 = 1.0f;
                    if (this.mirrorHorizontally) {
                        f5 = -1.0f;
                    }
                    if (this.mirrorVertically) {
                        f4 = -1.0f;
                    }
                    matrix.preScale(f5, f4);
                    this.drawMatrix.preScale(f3, f2);
                    this.drawMatrix.preTranslate(-0.5f, -0.5f);
                    this.drawMatrix.preRotate(this.rotationDegrees, 0.5f, 0.5f);
                    try {
                        if (z) {
                            try {
                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
                                this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, 0, 0, this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight());
                                long nanoTime3 = System.nanoTime();
                                swapBuffersOnRenderThread(videoFrame, nanoTime3);
                                synchronized (this.statisticsLock) {
                                    this.framesRendered++;
                                    this.renderTimeNs += nanoTime3 - nanoTime2;
                                }
                            } catch (GlUtil.GlOutOfMemoryException e) {
                                logE("Error while drawing frame", e);
                                ErrorCallback errorCallback = this.errorCallback;
                                if (errorCallback != null) {
                                    errorCallback.onGlOutOfMemory();
                                }
                                this.drawer.release();
                                this.frameDrawer.release();
                                this.bitmapTextureFramebuffer.release();
                            }
                        }
                        notifyCallbacks(videoFrame, z);
                    } finally {
                        videoFrame.release();
                    }
                } catch (GLException e2) {
                    logE("Error while eglMakeCurrent", e2);
                }
            } else {
                logD("Dropping frame - No surface");
                ErrorCallback errorCallback2 = this.errorCallback;
                if (errorCallback2 != null) {
                    errorCallback2.onNoSurface();
                }
            }
        }
    }

    private void resetStatistics(long j) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0L;
            this.renderSwapBufferTimeNs = 0L;
        }
    }

    private void swapBuffersOnRenderThread(final VideoFrame videoFrame, final long j) {
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread != null) {
                eglThread.scheduleRenderUpdate(new EglThread.RenderUpdate() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda2
                    @Override // org.webrtc.EglThread.RenderUpdate
                    public final void update(boolean z) {
                        EglRenderer.this.m118lambda$swapBuffersOnRenderThread$6$orgwebrtcEglRenderer(videoFrame, j, z);
                    }
                });
            }
        }
    }

    public void addFrameDrawnListener(FrameDrawnListenerWithContext frameDrawnListenerWithContext) {
        this.frameDrawnListenersWithContext.addListener(frameDrawnListenerWithContext);
    }

    public void addRenderListener(RenderListener renderListener) {
        this.renderListeners.add(renderListener);
    }

    public void clearImage(final float f, final float f2, final float f3, final float f4) {
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread != null) {
                eglThread.handler.postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.this.m113lambda$clearImage$5$orgwebrtcEglRenderer(f, f2, f3, f4);
                    }
                });
            }
        }
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void init(EglThread eglThread, RendererCommon.GlDrawer glDrawer, boolean z) {
        synchronized (this.threadLock) {
            if (this.eglThread == null) {
                logD("Initializing EglRenderer");
                this.eglThread = eglThread;
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z;
                eglThread.addExceptionCallback(this.eglExceptionCallback);
                this.eglBase = EglBase.CC.create(eglThread.eglConnection);
                eglThread.handler.post(this.eglSurfaceCreationRunnable);
                resetStatistics(System.nanoTime());
                eglThread.handler.postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(10L));
            } else {
                throw AbstractC31175DnJ.A0V(this.name, "Already initialized");
            }
        }
    }

    /* renamed from: lambda$addFrameListener$1$org-webrtc-EglRenderer, reason: not valid java name */
    public /* synthetic */ void m112lambda$addFrameListener$1$orgwebrtcEglRenderer(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer, z));
    }

    /* renamed from: lambda$releaseEglSurface$4$org-webrtc-EglRenderer, reason: not valid java name */
    public /* synthetic */ void m115lambda$releaseEglSurface$4$orgwebrtcEglRenderer(Runnable runnable) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    /* renamed from: lambda$swapBuffersOnRenderThread$6$org-webrtc-EglRenderer, reason: not valid java name */
    public /* synthetic */ void m118lambda$swapBuffersOnRenderThread$6$orgwebrtcEglRenderer(VideoFrame videoFrame, long j, boolean z) {
        if (!z) {
            EglBase eglBase = this.eglBase;
            if (eglBase != null && eglBase.hasSurface()) {
                this.eglBase.makeCurrent();
            } else {
                return;
            }
        }
        boolean z2 = this.usePresentationTimeStamp;
        EglBase eglBase2 = this.eglBase;
        if (z2) {
            eglBase2.swapBuffers(videoFrame.timestampNs);
        } else {
            eglBase2.swapBuffers();
        }
        Iterator it = this.renderListeners.iterator();
        while (it.hasNext()) {
            ((RenderListener) it.next()).onRender(System.nanoTime());
        }
        notifyFrameDrawnListeners(videoFrame);
        synchronized (this.statisticsLock) {
            this.renderSwapBufferTimeNs += System.nanoTime() - j;
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        synchronized (this.threadLock) {
            if (this.eglThread == null) {
                logD("Dropping frame - Not initialized or already released.");
                ErrorCallback errorCallback = this.errorCallback;
                if (errorCallback != null) {
                    errorCallback.onRenderThreadNotInitialized();
                }
                return;
            }
            synchronized (this.frameLock) {
                VideoFrame videoFrame2 = this.pendingFrame;
                z = false;
                if (videoFrame2 != null) {
                    z = true;
                    videoFrame2.release();
                }
                this.pendingFrame = videoFrame;
                videoFrame.retain();
                this.eglThread.handler.post(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.this.renderFrameOnRenderThread();
                    }
                });
            }
            if (z) {
                synchronized (this.statisticsLock) {
                    this.framesDropped++;
                }
            }
        }
    }

    public void printStackTrace() {
        Thread thread;
        StackTraceElement[] stackTrace;
        int length;
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread != null && (thread = eglThread.handler.getLooper().getThread()) != null && (length = (stackTrace = thread.getStackTrace()).length) > 0) {
                logW("EglRenderer stack trace:");
                int i = 0;
                do {
                    logW(stackTrace[i].toString());
                    i++;
                } while (i < length);
            }
        }
    }

    public void release() {
        logD("Releasing.");
        final CountDownLatch A15 = AbstractC58319PtB.A15();
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread == null) {
                logD(AbstractC58317Pt9.A00(455));
                return;
            }
            eglThread.handler.removeCallbacks(this.logStatisticsRunnable);
            this.eglThread.removeExceptionCallback(this.eglExceptionCallback);
            this.eglThread.handler.postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    EglRenderer.this.m114lambda$release$0$orgwebrtcEglRenderer(A15);
                }
            });
            this.eglThread.release();
            this.eglThread = null;
            ThreadUtils.awaitUninterruptibly(A15);
            synchronized (this.frameLock) {
                VideoFrame videoFrame = this.pendingFrame;
                if (videoFrame != null) {
                    videoFrame.release();
                    this.pendingFrame = null;
                }
            }
            logD("Releasing done.");
        }
    }

    public void releaseEglSurface(final Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread != null) {
                eglThread.handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                this.eglThread.handler.postAtFrontOfQueue(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.this.m115lambda$releaseEglSurface$4$orgwebrtcEglRenderer(runnable);
                    }
                });
            } else {
                runnable.run();
            }
        }
    }

    public void removeFrameDrawnListener(FrameDrawnListenerWithContext frameDrawnListenerWithContext) {
        this.frameDrawnListenersWithContext.removeListener(frameDrawnListenerWithContext);
    }

    public void setFpsReduction(float f) {
        long nanos;
        logD(AnonymousClass001.A0N("setFpsReduction: ", f));
        synchronized (this.fpsReductionLock) {
            long j = this.minRenderPeriodNs;
            if (f <= 0.0f) {
                nanos = Long.MAX_VALUE;
            } else {
                nanos = ((float) TimeUnit.SECONDS.toNanos(1L)) / f;
            }
            this.minRenderPeriodNs = nanos;
            if (nanos != j) {
                this.nextFrameTimeNs = System.nanoTime();
            }
        }
    }

    public void setLayoutAspectRatio(float f) {
        logD(AnonymousClass001.A0N("setLayoutAspectRatio: ", f));
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f;
        }
    }

    public void setMirror(boolean z) {
        logD(AnonymousClass001.A1D("setMirrorHorizontally: ", z));
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z;
        }
    }

    public void setMirrorVertically(boolean z) {
        logD(AnonymousClass001.A1D("setMirrorVertically: ", z));
        synchronized (this.layoutLock) {
            this.mirrorVertically = z;
        }
    }

    public void setRotation(int i) {
        logD(AnonymousClass001.A0O("setRotation: ", i));
        synchronized (this.layoutLock) {
            this.rotationDegrees = i;
        }
    }

    private void logD(String str) {
        hashCode();
        boolean z = Logging.loggingEnabled;
    }

    private void logW(String str) {
        hashCode();
        boolean z = Logging.loggingEnabled;
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    /* renamed from: lambda$removeFrameListener$2$org-webrtc-EglRenderer, reason: not valid java name */
    public /* synthetic */ void m116lambda$removeFrameListener$2$orgwebrtcEglRenderer(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (((FrameListenerAndParams) it.next()).listener == frameListener) {
                it.remove();
            }
        }
    }

    /* renamed from: lambda$removeRenderListener$3$org-webrtc-EglRenderer, reason: not valid java name */
    public /* synthetic */ void m117lambda$removeRenderListener$3$orgwebrtcEglRenderer(CountDownLatch countDownLatch, RenderListener renderListener) {
        countDownLatch.countDown();
        Iterator it = this.renderListeners.iterator();
        while (it.hasNext()) {
            if (it.next() == renderListener) {
                it.remove();
            }
        }
    }

    public void removeFrameListener(final FrameListener frameListener) {
        final CountDownLatch A15 = AbstractC58319PtB.A15();
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread == null) {
                return;
            }
            if (Thread.currentThread() != eglThread.handler.getLooper().getThread()) {
                postToRenderThread(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.this.m116lambda$removeFrameListener$2$orgwebrtcEglRenderer(A15, frameListener);
                    }
                });
                ThreadUtils.awaitUninterruptibly(A15);
                return;
            }
            throw new RuntimeException("removeFrameListener must not be called on the render thread.");
        }
    }

    public void removeRenderListener(final RenderListener renderListener) {
        final CountDownLatch A15 = AbstractC58319PtB.A15();
        synchronized (this.threadLock) {
            EglThread eglThread = this.eglThread;
            if (eglThread == null) {
                return;
            }
            if (Thread.currentThread() != eglThread.handler.getLooper().getThread()) {
                postToRenderThread(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.this.m117lambda$removeRenderListener$3$orgwebrtcEglRenderer(A15, renderListener);
                    }
                });
                ThreadUtils.awaitUninterruptibly(A15);
                return;
            }
            throw new RuntimeException("removeRenderListener must not be called on the render thread.");
        }
    }

    public void setErrorCallback(ErrorCallback errorCallback) {
        this.errorCallback = errorCallback;
    }

    public EglRenderer(String str, VideoFrameDrawer videoFrameDrawer) {
        this.threadLock = new Object();
        this.eglExceptionCallback = new Runnable() { // from class: org.webrtc.EglRenderer.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (EglRenderer.this.threadLock) {
                    EglRenderer.this.eglThread = null;
                }
            }
        };
        this.frameListeners = new ArrayList();
        this.renderListeners = new ArrayList();
        this.frameDrawnListenersWithContext = new ListenerManager();
        this.fpsReductionLock = new Object();
        this.drawMatrix = new Matrix();
        this.frameLock = new Object();
        this.layoutLock = new Object();
        this.rotationDegrees = 0;
        this.statisticsLock = new Object();
        this.bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
        this.logStatisticsRunnable = new Runnable() { // from class: org.webrtc.EglRenderer.2
            @Override // java.lang.Runnable
            public void run() {
                EglRenderer.this.logStatistics();
                synchronized (EglRenderer.this.threadLock) {
                    EglRenderer eglRenderer = EglRenderer.this;
                    EglThread eglThread = eglRenderer.eglThread;
                    if (eglThread != null) {
                        eglThread.handler.removeCallbacks(eglRenderer.logStatisticsRunnable);
                        EglRenderer eglRenderer2 = EglRenderer.this;
                        eglRenderer2.eglThread.handler.postDelayed(eglRenderer2.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(10L));
                    }
                }
            }
        };
        this.eglSurfaceCreationRunnable = new EglSurfaceCreation();
        this.name = str;
        this.frameDrawer = videoFrameDrawer;
    }

    public void addFrameListener(final FrameListener frameListener, final float f, final RendererCommon.GlDrawer glDrawer, final boolean z) {
        postToRenderThread(new Runnable() { // from class: org.webrtc.EglRenderer$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                EglRenderer.this.m112lambda$addFrameListener$1$orgwebrtcEglRenderer(glDrawer, frameListener, f, z);
            }
        });
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, RenderSynchronizer renderSynchronizer) {
        init(context, iArr, glDrawer, false, renderSynchronizer);
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        addFrameListener(frameListener, f, null, false);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z, RenderSynchronizer renderSynchronizer) {
        init(EglThread.create(null, context, iArr, renderSynchronizer), glDrawer, z);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z) {
        init(EglThread.create(null, context, iArr, null), glDrawer, z);
    }
}
