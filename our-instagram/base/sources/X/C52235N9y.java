package X;

import com.facebook.react.modules.dialog.DialogModule;
import instagram.features.clips.edit.ClipsEditMetadataController;

/* renamed from: X.N9y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52235N9y extends C1P1 {
    public final /* synthetic */ ClipsEditMetadataController A00;

    public C52235N9y(ClipsEditMetadataController clipsEditMetadataController) {
        this.A00 = clipsEditMetadataController;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1886805198);
        C0f5 AEp = C18950wb.A01.AEp("ClipsEditMetadataController", 817902720);
        AEp.ABW(DialogModule.KEY_MESSAGE, "failed to load media");
        AEp.report();
        C0f9.A0A(744345110, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1053333433);
        ClipsEditMetadataController.A0G(this.A00, false);
        C0f9.A0A(1363010306, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1123043908);
        ClipsEditMetadataController.A0G(this.A00, true);
        C0f9.A0A(-456847576, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(2067836507);
        C74293Vk c74293Vk = (C74293Vk) obj;
        int A032 = C0f9.A03(-924139173);
        C14360o3.A0B(c74293Vk, 0);
        C38321qM A0x = AbstractC25225BEi.A0x(c74293Vk.A06, 0);
        if (A0x != null) {
            ClipsEditMetadataController clipsEditMetadataController = this.A00;
            AbstractC37301Gc2.A1O(clipsEditMetadataController.A0s, A0x);
            ClipsEditMetadataController.A04(A0x, clipsEditMetadataController);
        }
        C0f9.A0A(1832935880, A032);
        C0f9.A0A(1760612513, A03);
    }
}
