package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;

/* renamed from: X.Ahp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23896Ahp implements InterfaceC25188BCl {
    public final /* synthetic */ ClipsCreationDraftViewModel A00;
    public final /* synthetic */ C128175qm A01;

    @Override // X.InterfaceC25188BCl
    public final void onSuccess() {
    }

    public C23896Ahp(ClipsCreationDraftViewModel clipsCreationDraftViewModel, C128175qm c128175qm) {
        this.A00 = clipsCreationDraftViewModel;
        this.A01 = c128175qm;
    }

    @Override // X.InterfaceC25188BCl
    public final void onFailure() {
        this.A00.A0B.A0A(new C8A8(this.A01));
    }
}
