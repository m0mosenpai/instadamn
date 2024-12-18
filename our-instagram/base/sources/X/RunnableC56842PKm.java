package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;

/* renamed from: X.PKm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56842PKm implements Runnable {
    public final /* synthetic */ VideoStickerAnythingProcessorV2 A00;

    public RunnableC56842PKm(VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2) {
        this.A00 = videoStickerAnythingProcessorV2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1ON c1on = this.A00.A0A;
        if (c1on != null) {
            c1on.run();
        } else {
            C14360o3.A0F("webpDownloadTask");
            throw C00O.createAndThrow();
        }
    }
}
