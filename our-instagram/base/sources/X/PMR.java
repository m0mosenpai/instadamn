package X;

import android.app.Activity;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;

/* loaded from: classes9.dex */
public final class PMR implements Runnable {
    public final /* synthetic */ N6J A00;

    public PMR(N6J n6j) {
        this.A00 = n6j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N6J n6j = this.A00;
        Activity rootActivity = n6j.getRootActivity();
        if (rootActivity != null) {
            C47Z A04 = NJR.A04(n6j);
            if (A04 == null) {
                AbstractC12120kG.A07(N6J.__redex_internal_original_name, "pendingMedia is null in maybeQuickPublishPendingMedia", null);
                return;
            }
            if (N6J.A04(n6j) == null || !ClipsSharingDraftViewModel.A02(n6j)) {
                return;
            }
            C128175qm A00 = ClipsSharingDraftViewModel.A00(n6j);
            if (n6j.A0A == null) {
                n6j.A0A = AbstractC31174DnI.A0i(rootActivity);
            }
            boolean z = A00.A17;
            UserSession A0r = AbstractC166987dD.A0r(n6j.A0U);
            C50966MfZ c50966MfZ = n6j.A07;
            if (c50966MfZ == null) {
                C14360o3.A0F("clipsShareSheetViewModel");
                throw C00O.createAndThrow();
            }
            AbstractC55107ObO.A01(rootActivity, (MediaCroppingCoordinates) c50966MfZ.A01.A00("PROFILE_CROP_COORDINATES_KEY"), A0r, A00, new C56313Oza(rootActivity, n6j, A04), n6j, A04, null, z, false);
        }
    }
}
