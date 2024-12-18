package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;

/* renamed from: X.Oma, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55596Oma implements InterfaceC58014Pny {
    public final /* synthetic */ VideoStickerAnythingProcessorV2 A00;
    public final /* synthetic */ java.net.URI A01;

    public C55596Oma(VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2, java.net.URI uri) {
        this.A00 = videoStickerAnythingProcessorV2;
        this.A01 = uri;
    }

    @Override // X.InterfaceC58014Pny
    public final void E1v(int i) {
        VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = this.A00;
        if (videoStickerAnythingProcessorV2.A01 > 0) {
            int i2 = videoStickerAnythingProcessorV2.A00;
            if (i2 < 8) {
                videoStickerAnythingProcessorV2.A00 = i2 * 2;
            }
            VideoStickerAnythingProcessorV2.A01(videoStickerAnythingProcessorV2);
            return;
        }
        OML oml = videoStickerAnythingProcessorV2.A06;
        if (oml == null) {
            return;
        }
        oml.A01("polling_start");
    }

    @Override // X.InterfaceC58014Pny
    public final void E1w(byte[] bArr) {
        String str;
        VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = this.A00;
        InterfaceC58097PpM interfaceC58097PpM = videoStickerAnythingProcessorV2.A04;
        if (interfaceC58097PpM != null) {
            interfaceC58097PpM.E1x(AbstractC166987dD.A19(this.A01), new C57514Pfo(videoStickerAnythingProcessorV2, 29), bArr);
        }
        if (videoStickerAnythingProcessorV2.A0G && (str = videoStickerAnythingProcessorV2.A0E) != null) {
            videoStickerAnythingProcessorV2.A0E = str;
            String str2 = videoStickerAnythingProcessorV2.A0D;
            if (str2 != null) {
                videoStickerAnythingProcessorV2.A03.post(new PPM(videoStickerAnythingProcessorV2, str2));
            }
        }
    }
}
