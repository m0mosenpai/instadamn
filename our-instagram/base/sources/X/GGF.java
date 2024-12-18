package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class GGF implements GYK {
    @Override // X.GYK
    public final void Crs(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(context, 0);
        AbstractC167017dG.A1P(userSession, fragmentActivity);
        AbstractC167007dF.A17(AbstractC31176DnK.A0e(userSession), "has_tapped_on_shopping_bag_menu_option");
        C1XJ.A00.A0p(fragmentActivity, EnumC39651Hig.A06, EnumC39644HiZ.PROFILE, EnumC39650Hif.A04, EnumC39649Hie.A04, userSession, null, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE, "settings", null, null, null, false);
    }
}
