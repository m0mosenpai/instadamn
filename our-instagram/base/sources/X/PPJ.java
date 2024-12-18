package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;

/* loaded from: classes9.dex */
public final class PPJ implements Runnable {
    public final /* synthetic */ EnumC53262Nh0 A00;
    public final /* synthetic */ VideoStickerAnythingProcessor A01;

    public PPJ(EnumC53262Nh0 enumC53262Nh0, VideoStickerAnythingProcessor videoStickerAnythingProcessor) {
        this.A01 = videoStickerAnythingProcessor;
        this.A00 = enumC53262Nh0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = this.A01;
        EnumC53262Nh0 enumC53262Nh0 = this.A00;
        videoStickerAnythingProcessor.A05(enumC53262Nh0);
        C006802i.A0p.markerEnd(900937655, (short) 113);
        String A0R = AnonymousClass001.A0R("timeout ", enumC53262Nh0.A01);
        videoStickerAnythingProcessor.A05.removeCallbacksAndMessages(null);
        InterfaceC58097PpM interfaceC58097PpM = videoStickerAnythingProcessor.A06;
        if (interfaceC58097PpM != null) {
            interfaceC58097PpM.DG8(enumC53262Nh0, A0R);
        }
    }
}
