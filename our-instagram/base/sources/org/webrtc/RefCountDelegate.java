package org.webrtc;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public class RefCountDelegate implements RefCounted {
    public final AtomicInteger refCount = new AtomicInteger(1);
    public final Runnable releaseCallback;

    @Override // org.webrtc.RefCounted
    public void release() {
        Runnable runnable;
        if (this.refCount.decrementAndGet() == 0 && (runnable = this.releaseCallback) != null) {
            runnable.run();
        }
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.refCount.incrementAndGet();
    }

    public RefCountDelegate(Runnable runnable) {
        this.releaseCallback = runnable;
    }
}
