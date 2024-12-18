package X;

import org.webrtc.EglRenderer;
import org.webrtc.VideoFrame;

/* loaded from: classes11.dex */
public final class X1R implements EglRenderer.FrameDrawnListenerWithContext {
    public static final X1R A00 = new X1R();

    @Override // org.webrtc.EglRenderer.FrameDrawnListenerWithContext
    public final void onFrameDrawn(VideoFrame videoFrame) {
        if (videoFrame instanceof C71829X6l) {
            ((C71829X6l) videoFrame).A00.onFrameRendered();
        }
    }
}
