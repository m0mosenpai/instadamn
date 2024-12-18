package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import com.instagram.pendingmedia.service.common.ParsingSyncHttpService;

/* loaded from: classes9.dex */
public final class PPI implements Runnable {
    public final /* synthetic */ VideoStickerAnythingProcessor A00;
    public final /* synthetic */ C26461Qb A01;

    public PPI(VideoStickerAnythingProcessor videoStickerAnythingProcessor, C26461Qb c26461Qb) {
        this.A00 = videoStickerAnythingProcessor;
        this.A01 = c26461Qb;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1tm, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        String A0v;
        Integer num;
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = this.A00;
        C54600OAb A01 = ParsingSyncHttpService.A01(this.A01, videoStickerAnythingProcessor.A0K, new Object());
        C3JY c3jy = A01.A00;
        if (c3jy != null && c3jy.A02 == 200) {
            videoStickerAnythingProcessor.Dca(EnumC53262Nh0.A06);
            InterfaceC58097PpM interfaceC58097PpM = videoStickerAnythingProcessor.A06;
            if (interfaceC58097PpM != null) {
                interfaceC58097PpM.DiG();
            }
            C006802i.A0p.markerEnd(900937655, (short) 2);
            videoStickerAnythingProcessor.A05.removeCallbacksAndMessages(null);
            return;
        }
        EnumC53262Nh0 enumC53262Nh0 = EnumC53262Nh0.A05;
        InterfaceC40801un interfaceC40801un = A01.A01;
        N3A n3a = (N3A) interfaceC40801un;
        if (n3a != null && (num = n3a.A02) != null && num.intValue() > 0) {
            enumC53262Nh0.A00 = new OLG(num);
            C40781ul c40781ul = (C40781ul) interfaceC40801un;
            if (c40781ul == null || (A0v = c40781ul.getErrorMessage()) == null) {
                A0v = "Fail to save cutout stickers because of reaching maximum number of cutout stickers";
            }
        } else {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("configure sticker failed ");
            A0v = AbstractC166997dE.A0v(A01.A02, A1C);
        }
        videoStickerAnythingProcessor.Dcb(enumC53262Nh0, A0v);
    }
}
