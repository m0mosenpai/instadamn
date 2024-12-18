package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import java.util.List;

/* renamed from: X.Aca, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23580Aca implements BDI {
    public final /* synthetic */ ClipsCreationDraftViewModel A00;

    public C23580Aca(ClipsCreationDraftViewModel clipsCreationDraftViewModel) {
        this.A00 = clipsCreationDraftViewModel;
    }

    @Override // X.BDI
    public final void DnM(List list) {
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A00;
        AbstractC166987dD.A1Z(new PZJ(clipsCreationDraftViewModel, list, null, 45), AbstractC141776au.A00(clipsCreationDraftViewModel));
    }

    @Override // X.BDI
    public final void onFailure() {
        this.A00.A0Q.Egh(new C8A8(AbstractC166997dE.A0b()));
    }

    @Override // X.BDI
    public final void onSuccess() {
        this.A00.A0R.Egh(new C8A8(AbstractC166997dE.A0b()));
    }
}
