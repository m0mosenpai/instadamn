package X;

import instagram.features.clips.edit.ClipsEditMetadataController;

/* renamed from: X.ESz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32499ESz extends C1P1 {
    public final /* synthetic */ ClipsEditMetadataController A00;

    public C32499ESz(ClipsEditMetadataController clipsEditMetadataController) {
        this.A00 = clipsEditMetadataController;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1418780880);
        ClipsEditMetadataController clipsEditMetadataController = this.A00;
        if (clipsEditMetadataController.A0c) {
            C9GR.A0F(clipsEditMetadataController.A0q.getActivity(), "save_cover_photo_failed", 2131961661);
        }
        ClipsEditMetadataController.A0G(clipsEditMetadataController, false);
        C0f9.A0A(1677200169, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-973626599);
        int A032 = C0f9.A03(1005668262);
        ClipsEditMetadataController clipsEditMetadataController = this.A00;
        ClipsEditMetadataController.A0G(clipsEditMetadataController, false);
        ClipsEditMetadataController.A0A(clipsEditMetadataController);
        C0f9.A0A(371864285, A032);
        C0f9.A0A(-1651024330, A03);
    }
}
