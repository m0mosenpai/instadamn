package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;
import com.instagram.pendingmedia.service.common.ParsingSyncHttpService;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class PPL implements Runnable {
    public final /* synthetic */ VideoStickerAnythingProcessorV2 A00;
    public final /* synthetic */ C26461Qb A01;

    public PPL(VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2, C26461Qb c26461Qb) {
        this.A00 = videoStickerAnythingProcessorV2;
        this.A01 = c26461Qb;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1tm, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = this.A00;
        C54600OAb A01 = ParsingSyncHttpService.A01(this.A01, videoStickerAnythingProcessorV2.A0L, new Object());
        C3JY c3jy = A01.A00;
        if (c3jy != null && c3jy.A02 == 200) {
            OML oml = videoStickerAnythingProcessorV2.A06;
            if (oml != null) {
                oml.A02("configure_sticker_finished", C57284Pc6.A00);
            }
            InterfaceC58097PpM interfaceC58097PpM = videoStickerAnythingProcessorV2.A04;
            if (interfaceC58097PpM != null) {
                interfaceC58097PpM.DiG();
            }
            OML oml2 = videoStickerAnythingProcessorV2.A06;
            if (oml2 != null) {
                oml2.A03.execute(new RunnableC56839PKj(oml2));
                OIF oif = oml2.A02;
                AbstractC25230BEn.A1N(oif, oif.A02, 16);
                return;
            }
            return;
        }
        EnumC53262Nh0 enumC53262Nh0 = EnumC53262Nh0.A05;
        InterfaceC40801un interfaceC40801un = A01.A01;
        N3A n3a = (N3A) interfaceC40801un;
        if (n3a != null && (num = n3a.A02) != null && num.intValue() > 0) {
            enumC53262Nh0.A00 = new OLG(num);
            C40781ul c40781ul = (C40781ul) interfaceC40801un;
            if (c40781ul != null) {
                c40781ul.getErrorMessage();
            }
        } else {
            IOException iOException = A01.A02;
            if (iOException != null) {
                iOException.toString();
            }
        }
        OML oml3 = videoStickerAnythingProcessorV2.A06;
        if (oml3 == null) {
            return;
        }
        oml3.A01("configure_sticker_start");
    }
}
