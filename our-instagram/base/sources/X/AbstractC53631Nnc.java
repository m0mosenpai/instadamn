package X;

import android.os.Handler;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;
import java.util.List;

/* renamed from: X.Nnc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53631Nnc {
    public final void A04(OLS ols, OJO ojo) {
        Handler handler;
        Runnable ps1;
        OLU olu;
        if (this instanceof VideoStickerAnythingProcessorV2) {
            VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = (VideoStickerAnythingProcessorV2) this;
            Object obj = ols.A00;
            if ((obj instanceof OLU) && (olu = (OLU) obj) != null) {
                videoStickerAnythingProcessorV2.A0G = olu.A01;
                OLe oLe = olu.A00;
                List list = oLe.A01;
                boolean z = oLe.A02;
                String str = videoStickerAnythingProcessorV2.A0E;
                if (str != null) {
                    videoStickerAnythingProcessorV2.A0E = str;
                    handler = MSY.A09(videoStickerAnythingProcessorV2.A0I);
                    ps1 = new PS3(videoStickerAnythingProcessorV2, list, z);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            if (this instanceof VideoStickerAnythingProcessor) {
                throw C00O.createAndThrow();
            }
            C51398Mn5 c51398Mn5 = (C51398Mn5) this;
            handler = c51398Mn5.A00;
            ps1 = new PS1(c51398Mn5, ols, ojo);
        }
        handler.post(ps1);
    }

    public final void A05(EnumC53262Nh0 enumC53262Nh0) {
        if (this instanceof VideoStickerAnythingProcessorV2) {
            VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = (VideoStickerAnythingProcessorV2) this;
            C14360o3.A0B(enumC53262Nh0, 0);
            if (enumC53262Nh0 == EnumC53262Nh0.A0C) {
                videoStickerAnythingProcessorV2.A01 = 0;
                C1ON c1on = videoStickerAnythingProcessorV2.A0A;
                if (c1on != null) {
                    c1on.onCancel();
                }
                videoStickerAnythingProcessorV2.A03.removeCallbacksAndMessages(null);
                return;
            }
            return;
        }
        if (!(this instanceof VideoStickerAnythingProcessor)) {
            return;
        }
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = (VideoStickerAnythingProcessor) this;
        C14360o3.A0B(enumC53262Nh0, 0);
        if (enumC53262Nh0 != EnumC53262Nh0.A0C) {
            return;
        }
        videoStickerAnythingProcessor.A02 = 0;
        C1ON c1on2 = videoStickerAnythingProcessor.A09;
        if (c1on2 != null) {
            c1on2.onCancel();
        }
        videoStickerAnythingProcessor.A09 = null;
        videoStickerAnythingProcessor.A04.removeCallbacksAndMessages(null);
    }
}
