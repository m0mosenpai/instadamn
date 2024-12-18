package X;

import com.facebook.rsys.rtc.RSVideoFrame;
import org.webrtc.VideoFrame;

/* renamed from: X.X6l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71829X6l extends VideoFrame {
    public final RSVideoFrame A00;

    public C71829X6l(RSVideoFrame rSVideoFrame, VideoFrame videoFrame) {
        super(videoFrame.buffer, videoFrame.rotation, videoFrame.timestampNs);
        this.A00 = rSVideoFrame;
    }

    @Override // org.webrtc.VideoFrame, org.webrtc.RefCounted
    public final void release() {
        this.A00.release();
    }

    @Override // org.webrtc.VideoFrame, org.webrtc.RefCounted
    public final void retain() {
        this.A00.retain();
    }
}
