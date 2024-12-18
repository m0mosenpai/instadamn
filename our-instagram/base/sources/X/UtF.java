package X;

import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import com.facebook.rsys.videorender.gen.VideoRenderProxy;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* loaded from: classes11.dex */
public final class UtF extends VideoRenderProxy {
    public VideoRenderApi A00;

    @Override // com.facebook.rsys.videorender.gen.VideoRenderProxy
    public final void renderFrame(RSVideoFrame rSVideoFrame, Object obj, int i) {
        VideoFrame videoFrame;
        try {
            if (obj instanceof InterfaceC71847X7f) {
                UAG uag = (UAG) ((InterfaceC71847X7f) obj);
                C14360o3.A0B(rSVideoFrame, 0);
                if (!uag.A05 && uag.A04) {
                    rSVideoFrame.registerFrameRenderedCallback();
                    uag.A05 = true;
                }
                rSVideoFrame.onFrameReadyToRender();
                if (uag.A04) {
                    VideoFrame videoFrame2 = rSVideoFrame.getVideoFrame();
                    C14360o3.A07(videoFrame2);
                    videoFrame = new C71829X6l(rSVideoFrame, videoFrame2);
                } else {
                    videoFrame = rSVideoFrame.getVideoFrame();
                }
                C14360o3.A0A(videoFrame);
                uag.A0C.onFrame(videoFrame);
                return;
            }
            if (obj instanceof VideoSink) {
                ((VideoSink) obj).onFrame(rSVideoFrame.getVideoFrame());
                return;
            }
            String str = null;
            if (obj != null) {
                str = obj.getClass().getTypeName();
            }
            throw AbstractC167007dF.A0c("Invalid type for renderTarget: ", str);
        } catch (Throwable th) {
            C0K8.A0J("WebrtcVideoRenderProxy", "Error rendering frame", th);
            throw th;
        }
    }

    @Override // com.facebook.rsys.videorender.gen.VideoRenderProxy
    public final void setApi(VideoRenderApi videoRenderApi) {
        this.A00 = videoRenderApi;
    }
}
