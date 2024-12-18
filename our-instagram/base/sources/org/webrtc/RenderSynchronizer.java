package org.webrtc;

import X.AbstractC167007dF;
import android.os.Handler;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class RenderSynchronizer {
    public static final float DEFAULT_TARGET_FPS = 30.0f;
    public static final String TAG = "RenderSynchronizer";
    public Choreographer choreographer;
    public boolean isListening;
    public long lastOpenedTimeNanos;
    public long lastRefreshTimeNanos;
    public final List listeners;
    public final Object lock;
    public final Handler mainThreadHandler;
    public boolean renderWindowOpen;
    public final long targetFrameIntervalNanos;

    /* loaded from: classes11.dex */
    public interface Listener {
        void onRenderWindowClose();

        void onRenderWindowOpen();
    }

    private void closeRenderWindow() {
        this.renderWindowOpen = false;
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).onRenderWindowClose();
        }
    }

    private void openRenderWindow() {
        this.renderWindowOpen = true;
        Iterator it = this.listeners.iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).onRenderWindowOpen();
        }
    }

    public void onDisplayRefreshCycleBegin(long j) {
        synchronized (this.lock) {
            if (this.listeners.isEmpty()) {
                boolean z = Logging.loggingEnabled;
                this.isListening = false;
                return;
            }
            this.choreographer.postFrameCallback(new RenderSynchronizer$$ExternalSyntheticLambda0(this));
            long j2 = j - this.lastOpenedTimeNanos;
            long j3 = j - this.lastRefreshTimeNanos;
            this.lastRefreshTimeNanos = j;
            long j4 = j2 - this.targetFrameIntervalNanos;
            if (Math.abs(j4) < Math.abs(j4 + j3)) {
                this.lastOpenedTimeNanos = j;
                openRenderWindow();
            } else {
                if (!this.renderWindowOpen) {
                    return;
                }
                closeRenderWindow();
            }
        }
    }

    /* renamed from: lambda$registerListener$1$org-webrtc-RenderSynchronizer */
    public /* synthetic */ void m127lambda$registerListener$1$orgwebrtcRenderSynchronizer() {
        this.choreographer.postFrameCallback(new RenderSynchronizer$$ExternalSyntheticLambda0(this));
    }

    public void registerListener(Listener listener) {
        this.listeners.add(listener);
        synchronized (this.lock) {
            if (!this.isListening) {
                boolean z = Logging.loggingEnabled;
                this.isListening = true;
                this.mainThreadHandler.post(new Runnable() { // from class: org.webrtc.RenderSynchronizer$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        RenderSynchronizer.this.m127lambda$registerListener$1$orgwebrtcRenderSynchronizer();
                    }
                });
            }
        }
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public RenderSynchronizer(float f) {
        this.lock = new Object();
        this.listeners = new CopyOnWriteArrayList();
        this.targetFrameIntervalNanos = Math.round(((float) TimeUnit.SECONDS.toNanos(1L)) / f);
        Handler A0J = AbstractC167007dF.A0J();
        this.mainThreadHandler = A0J;
        A0J.post(new Runnable() { // from class: org.webrtc.RenderSynchronizer$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                RenderSynchronizer.this.m126lambda$new$0$orgwebrtcRenderSynchronizer();
            }
        });
        boolean z = Logging.loggingEnabled;
    }

    /* renamed from: lambda$new$0$org-webrtc-RenderSynchronizer */
    public /* synthetic */ void m126lambda$new$0$orgwebrtcRenderSynchronizer() {
        this.choreographer = Choreographer.getInstance();
    }

    public RenderSynchronizer() {
        this(30.0f);
    }
}
