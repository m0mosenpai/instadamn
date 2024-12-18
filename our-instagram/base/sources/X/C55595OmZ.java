package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;

/* renamed from: X.OmZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55595OmZ implements InterfaceC58014Pny {
    public final /* synthetic */ VideoStickerAnythingProcessor A00;
    public final /* synthetic */ java.net.URI A01;

    public C55595OmZ(VideoStickerAnythingProcessor videoStickerAnythingProcessor, java.net.URI uri) {
        this.A00 = videoStickerAnythingProcessor;
        this.A01 = uri;
    }

    @Override // X.InterfaceC58014Pny
    public final void E1v(int i) {
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = this.A00;
        if (videoStickerAnythingProcessor.A02 > 0) {
            int i2 = videoStickerAnythingProcessor.A00;
            if (i2 < 8) {
                videoStickerAnythingProcessor.A00 = i2 * 2;
            }
            VideoStickerAnythingProcessor.A01(videoStickerAnythingProcessor);
            return;
        }
        videoStickerAnythingProcessor.Dcb(EnumC53262Nh0.A0C, AnonymousClass001.A0O("Failed while polling, status code", i));
    }

    @Override // X.InterfaceC58014Pny
    public final void E1w(byte[] bArr) {
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = this.A00;
        InterfaceC58097PpM interfaceC58097PpM = videoStickerAnythingProcessor.A06;
        if (interfaceC58097PpM != null) {
            interfaceC58097PpM.E1x(AbstractC166987dD.A19(this.A01), new C57514Pfo(videoStickerAnythingProcessor, 28), bArr);
        }
        if (videoStickerAnythingProcessor.A0E) {
            String str = videoStickerAnythingProcessor.A0D;
            if (str != null) {
                videoStickerAnythingProcessor.A0D = str;
                String str2 = videoStickerAnythingProcessor.A0C;
                if (str2 != null) {
                    videoStickerAnythingProcessor.A04.post(new PPK(videoStickerAnythingProcessor, str2));
                    return;
                }
                return;
            }
            return;
        }
        videoStickerAnythingProcessor.A05.removeCallbacksAndMessages(null);
    }
}
