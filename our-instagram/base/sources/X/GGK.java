package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class GGK implements GYK {
    @Override // X.GYK
    public final void Crs(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        EnumC2050795x enumC2050795x;
        AbstractC167017dG.A1P(userSession, fragmentActivity);
        AccountFamily A0H = AbstractC31176DnK.A0H(C2049995m.A01(userSession), userSession);
        if (A0H == null) {
            C0w9.A03(AbstractC111324zv.A00(287), AbstractC111324zv.A00(1815));
            enumC2050795x = EnumC2050795x.UNKNOWN;
        } else {
            enumC2050795x = A0H.A00;
            enumC2050795x.getClass();
        }
        FBM.A00(fragmentActivity, enumC2050795x, AbstractC31171DnF.A0D(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE), userSession);
    }
}
