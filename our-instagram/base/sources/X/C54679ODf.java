package X;

import android.content.Context;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;
import com.instagram.common.session.UserSession;

/* renamed from: X.ODf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54679ODf {
    public VideoStickerAnythingProcessor A00;
    public VideoStickerAnythingProcessorV2 A01;
    public InterfaceC16660sJ A02;
    public final OmY A03;
    public final UserSession A04;
    public final C53640Nnl A05;

    public C54679ODf(Context context, UserSession userSession) {
        long j;
        AbstractC167017dG.A1P(context, userSession);
        this.A04 = userSession;
        boolean A03 = AbstractC23121AKf.A03(userSession);
        C53640Nnl A00 = AbstractC53654Nnz.A00();
        if (A03) {
            j = 360;
        } else {
            j = 720;
        }
        A00.A03 = j;
        A00.A02 = 30L;
        A00.A00 = 30.0d;
        A00.A01 = 15;
        this.A05 = A00;
        this.A00 = new VideoStickerAnythingProcessor(context, A00, userSession);
        VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = new VideoStickerAnythingProcessorV2(context, A00, userSession);
        this.A01 = videoStickerAnythingProcessorV2;
        this.A03 = new OmY(A00, videoStickerAnythingProcessorV2, C05F.A01);
        this.A00.A06 = new C48118LRs(this);
        this.A01.A04 = new C48119LRt(this);
    }
}
