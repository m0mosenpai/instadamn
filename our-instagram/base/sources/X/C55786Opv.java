package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;

/* renamed from: X.Opv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55786Opv implements XE9 {
    public final /* synthetic */ VideoStickerAnythingProcessor A00;

    @Override // X.XE9
    public final /* bridge */ /* synthetic */ void DG3(Object obj) {
        C14360o3.A0B(obj, 0);
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = this.A00;
        String A0n = AbstractC167017dG.A0n(obj, "Failed video upload: ", AbstractC166987dD.A1C());
        videoStickerAnythingProcessor.A05.removeCallbacksAndMessages(null);
        InterfaceC58097PpM interfaceC58097PpM = videoStickerAnythingProcessor.A06;
        if (interfaceC58097PpM != null) {
            interfaceC58097PpM.DG8(null, A0n);
        }
    }

    @Override // X.XE9
    public final void Dbk(float f) {
    }

    public C55786Opv(VideoStickerAnythingProcessor videoStickerAnythingProcessor) {
        this.A00 = videoStickerAnythingProcessor;
    }

    @Override // X.XE9
    public final /* bridge */ /* synthetic */ void D22(Object obj) {
        VideoStickerAnythingProcessor.A03(AbstractC167007dF.A0n("cancel_reason", "upload_cancelled"));
        C006802i.A0p.markerEnd(900937655, (short) 4);
    }

    @Override // X.XE9
    public final void onStart() {
        System.currentTimeMillis();
    }

    @Override // X.XE9
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        obj.toString();
        System.currentTimeMillis();
    }
}
