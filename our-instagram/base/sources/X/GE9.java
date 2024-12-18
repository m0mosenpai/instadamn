package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class GE9 implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        Bundle A0E = AbstractC31174DnI.A0E(uri, 0);
        AbstractC31173DnH.A1A(uri, A0E, "media_id");
        AbstractC31173DnH.A1A(uri, A0E, "coupon_offer_id");
        AbstractC31172DnG.A1I(uri, A0E, "is_cta_ctwa_aymt");
        AbstractC31172DnG.A1I(uri, A0E, "is_ctwa_coupon_aymt");
        AbstractC31172DnG.A1I(uri, A0E, "is_cta_lead_ads_aymt");
        AbstractC31173DnH.A1A(uri, A0E, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        AbstractC31173DnH.A1A(uri, A0E, "aymt_channel");
        AbstractC31173DnH.A1A(uri, A0E, "dummy_param_random_uuid");
        AbstractC31172DnG.A1I(uri, A0E, "has_relaunched_from_main_activity");
        AbstractC35275FhA.A09(A0E, this.A00.requireActivity(), this.A01);
    }

    public GE9(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
