package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;

/* renamed from: X.PKk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56840PKk implements Runnable {
    public final /* synthetic */ VideoStickerAnythingProcessor A00;

    public RunnableC56840PKk(VideoStickerAnythingProcessor videoStickerAnythingProcessor) {
        this.A00 = videoStickerAnythingProcessor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = this.A00;
        C1ON c1on = videoStickerAnythingProcessor.A09;
        if (c1on != null) {
            AbstractC24481Hr abstractC24481Hr = c1on.A04;
            if (!abstractC24481Hr.A0C() && !abstractC24481Hr.A0B() && !abstractC24481Hr.A0D()) {
                C1ON c1on2 = videoStickerAnythingProcessor.A09;
                if (c1on2 != null) {
                    c1on2.run();
                    return;
                }
                return;
            }
        }
        C0f5 AEp = C18950wb.A01.AEp("VideoStickerAnythingProcessor", 817892340);
        AEp.ABW("VideoStickerAnythingProcessor", "webpDownloadTask is finished");
        AEp.report();
    }
}
