package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;

/* renamed from: X.Aw7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24666Aw7 implements Runnable {
    public final /* synthetic */ ClipsCreationDraftViewModel A00;
    public final /* synthetic */ C128175qm A01;

    public RunnableC24666Aw7(ClipsCreationDraftViewModel clipsCreationDraftViewModel, C128175qm c128175qm) {
        this.A00 = clipsCreationDraftViewModel;
        this.A01 = c128175qm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ClipsCreationDraftViewModel clipsCreationDraftViewModel = this.A00;
        clipsCreationDraftViewModel.A08.A0A(new C8A8(this.A01));
        clipsCreationDraftViewModel.A03 = false;
    }
}
