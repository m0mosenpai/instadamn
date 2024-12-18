package org.webrtc;

import X.AbstractC65702TsY;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.webrtc.EglBase;
import org.webrtc.EglBase10Impl;
import org.webrtc.RenderSynchronizer;

/* loaded from: classes11.dex */
public class EglThread implements RenderSynchronizer.Listener {
    public final EglBase.EglConnection eglConnection;
    public final HandlerWithExceptionCallbacks handler;
    public final ReleaseMonitor releaseMonitor;
    public final RenderSynchronizer renderSynchronizer;
    public final List pendingRenderUpdates = new ArrayList();
    public boolean renderWindowOpen = true;

    /* loaded from: classes11.dex */
    public class HandlerWithExceptionCallbacks extends Handler {
        public final Object callbackLock;
        public final List exceptionCallbacks;

        public void addExceptionCallback(Runnable runnable) {
            synchronized (this.callbackLock) {
                this.exceptionCallbacks.add(runnable);
            }
        }

        public void removeExceptionCallback(Runnable runnable) {
            synchronized (this.callbackLock) {
                this.exceptionCallbacks.remove(runnable);
            }
        }

        public HandlerWithExceptionCallbacks(Looper looper) {
            super(looper);
            this.callbackLock = new Object();
            this.exceptionCallbacks = new ArrayList();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x0025
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        @Override // android.os.Handler
        public void dispatchMessage(android.os.Message r5) {
            /*
                r4 = this;
                super.dispatchMessage(r5)     // Catch: java.lang.Exception -> L4
                goto L28
            L4:
                r3 = move-exception
                java.lang.String r1 = "EglThread"
                java.lang.String r0 = "Exception on EglThread"
                org.webrtc.Logging.e(r1, r0, r3)
                java.lang.Object r2 = r4.callbackLock
                monitor-enter(r2)
                java.util.List r0 = r4.exceptionCallbacks     // Catch: java.lang.Throwable -> L25
                java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L25
            L15:
                boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
                if (r0 == 0) goto L26
                java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L25
                java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L25
                r0.run()     // Catch: java.lang.Throwable -> L25
                goto L15
            L25:
                r3 = move-exception
            L26:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L25
                throw r3
            L28:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglThread.HandlerWithExceptionCallbacks.dispatchMessage(android.os.Message):void");
        }
    }

    /* loaded from: classes11.dex */
    public interface ReleaseMonitor {
        boolean onRelease(EglThread eglThread);
    }

    /* loaded from: classes11.dex */
    public interface RenderUpdate {
        void update(boolean z);
    }

    public static EglThread create(ReleaseMonitor releaseMonitor, EglBase.Context context, int[] iArr) {
        return create(releaseMonitor, context, iArr, null);
    }

    public static /* synthetic */ boolean lambda$create$1(EglThread eglThread) {
        return true;
    }

    /* renamed from: lambda$onRenderWindowClose$3$org-webrtc-EglThread, reason: not valid java name */
    public /* synthetic */ void m121lambda$onRenderWindowClose$3$orgwebrtcEglThread() {
        this.renderWindowOpen = false;
    }

    /* renamed from: lambda$onRenderWindowOpen$2$org-webrtc-EglThread, reason: not valid java name */
    public /* synthetic */ void m122lambda$onRenderWindowOpen$2$orgwebrtcEglThread() {
        this.renderWindowOpen = true;
        Iterator it = this.pendingRenderUpdates.iterator();
        while (it.hasNext()) {
            ((RenderUpdate) it.next()).update(false);
        }
        this.pendingRenderUpdates.clear();
    }

    public static /* synthetic */ EglBase.EglConnection lambda$create$0(EglBase.Context context, int[] iArr) {
        if (context == null) {
            return new EglBase10Impl.EglConnection(null, iArr);
        }
        return EglBase.EglConnection.CC.create(context, iArr);
    }

    public void addExceptionCallback(Runnable runnable) {
        this.handler.addExceptionCallback(runnable);
    }

    public EglBase createEglBaseWithSharedConnection() {
        return EglBase.CC.create(this.eglConnection);
    }

    public Handler getHandler() {
        return this.handler;
    }

    @Override // org.webrtc.RenderSynchronizer.Listener
    public void onRenderWindowClose() {
        this.handler.post(new Runnable() { // from class: org.webrtc.EglThread$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                EglThread.this.renderWindowOpen = false;
            }
        });
    }

    @Override // org.webrtc.RenderSynchronizer.Listener
    public void onRenderWindowOpen() {
        this.handler.post(new Runnable() { // from class: org.webrtc.EglThread$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                EglThread.this.m122lambda$onRenderWindowOpen$2$orgwebrtcEglThread();
            }
        });
    }

    public void release() {
        if (this.releaseMonitor.onRelease(this)) {
            RenderSynchronizer renderSynchronizer = this.renderSynchronizer;
            if (renderSynchronizer != null) {
                renderSynchronizer.removeListener(this);
            }
            HandlerWithExceptionCallbacks handlerWithExceptionCallbacks = this.handler;
            final EglBase.EglConnection eglConnection = this.eglConnection;
            eglConnection.getClass();
            handlerWithExceptionCallbacks.post(new Runnable() { // from class: org.webrtc.EglThread$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    EglBase.EglConnection.this.release();
                }
            });
            this.handler.getLooper().quitSafely();
        }
    }

    public void removeExceptionCallback(Runnable runnable) {
        this.handler.removeExceptionCallback(runnable);
    }

    public void scheduleRenderUpdate(RenderUpdate renderUpdate) {
        if (this.renderWindowOpen) {
            renderUpdate.update(true);
        } else {
            this.pendingRenderUpdates.add(renderUpdate);
        }
    }

    public EglThread(ReleaseMonitor releaseMonitor, HandlerWithExceptionCallbacks handlerWithExceptionCallbacks, EglBase.EglConnection eglConnection, RenderSynchronizer renderSynchronizer) {
        this.releaseMonitor = releaseMonitor;
        this.handler = handlerWithExceptionCallbacks;
        this.eglConnection = eglConnection;
        this.renderSynchronizer = renderSynchronizer;
        if (renderSynchronizer != null) {
            renderSynchronizer.registerListener(this);
        }
    }

    public static EglThread create(ReleaseMonitor releaseMonitor, final EglBase.Context context, final int[] iArr, RenderSynchronizer renderSynchronizer) {
        HandlerWithExceptionCallbacks handlerWithExceptionCallbacks = new HandlerWithExceptionCallbacks(AbstractC65702TsY.A0G("EglThread"));
        EglBase.EglConnection eglConnection = (EglBase.EglConnection) ThreadUtils.invokeAtFrontUninterruptibly(handlerWithExceptionCallbacks, new Callable() { // from class: org.webrtc.EglThread$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return EglThread.lambda$create$0(EglBase.Context.this, iArr);
            }
        });
        if (releaseMonitor == null) {
            releaseMonitor = new ReleaseMonitor() { // from class: org.webrtc.EglThread$$ExternalSyntheticLambda3
                @Override // org.webrtc.EglThread.ReleaseMonitor
                public final boolean onRelease(EglThread eglThread) {
                    return true;
                }
            };
        }
        return new EglThread(releaseMonitor, handlerWithExceptionCallbacks, eglConnection, renderSynchronizer);
    }
}
