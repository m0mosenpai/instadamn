package X;

import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;

/* renamed from: X.Opw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55787Opw implements XE9 {
    public final /* synthetic */ VideoStickerAnythingProcessorV2 A00;

    @Override // X.XE9
    public final /* bridge */ /* synthetic */ void DG3(Object obj) {
        C14360o3.A0B(obj, 0);
        VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = this.A00;
        String A0n = AbstractC167017dG.A0n(obj, "Failed video upload: ", AbstractC166987dD.A1C());
        InterfaceC58097PpM interfaceC58097PpM = videoStickerAnythingProcessorV2.A04;
        if (interfaceC58097PpM != null) {
            interfaceC58097PpM.DG8(null, A0n);
        }
    }

    @Override // X.XE9
    public final void Dbk(float f) {
    }

    public C55787Opw(VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2) {
        this.A00 = videoStickerAnythingProcessorV2;
    }

    @Override // X.XE9
    public final /* bridge */ /* synthetic */ void D22(Object obj) {
        OML oml = this.A00.A06;
        if (oml != null) {
            oml.A00("upload_cancelled");
        }
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
