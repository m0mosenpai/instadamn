package com.facebook.rsys.rtc;

import com.facebook.simplejni.NativeHolder;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.RefCounted;
import org.webrtc.VideoFrame;

/* loaded from: classes11.dex */
public class RSVideoFrame implements RefCounted {
    public final NativeHolder mNativeHolder;
    public final AtomicInteger refCount = new AtomicInteger(1);

    public RSVideoFrame(VideoFrame videoFrame) {
        this.mNativeHolder = initNativeHolder(videoFrame, true, -1);
    }

    public static native NativeHolder initNativeHolder(VideoFrame videoFrame, boolean z, int i);

    public native VideoFrame getVideoFrame();

    public native void onFrameReadyToRender();

    public native void onFrameRendered();

    public native void registerFrameRenderedCallback();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof RSVideoFrame)) {
            return getVideoFrame().buffer.equals(((RSVideoFrame) obj).getVideoFrame().buffer);
        }
        return false;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        if (this.refCount.decrementAndGet() == 0) {
            NativeHolder nativeHolder = this.mNativeHolder;
            synchronized (nativeHolder) {
                nativeHolder.mDestructor.destruct();
            }
        }
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.refCount.incrementAndGet();
    }

    public RSVideoFrame(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
