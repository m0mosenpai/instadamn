package X;

import android.app.Activity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;

/* loaded from: classes6.dex */
public abstract class FBT {
    public static final void A00(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, BottomSheetFragment bottomSheetFragment) {
        C14360o3.A0B(userSession, 0);
        HowItWorksNuxFragment$Row howItWorksNuxFragment$Row = new HowItWorksNuxFragment$Row(2131973768, 2131973767, Integer.valueOf(R.drawable.instagram_camera_pano_outline_24), null);
        int i = 2131973769;
        if (C18U.A06(C06090Tz.A06, userSession, 36321627889346194L)) {
            i = 2131973770;
        }
        EIS A01 = FWN.A01(userSession, interfaceC11380iw.getModuleName(), AbstractC16960so.A1M(howItWorksNuxFragment$Row, AbstractC31175DnJ.A0Q(2131973771, Integer.valueOf(i), R.drawable.instagram_direct_pano_outline_24), AbstractC31175DnJ.A0Q(2131973773, 2131973772, R.drawable.instagram_circle_check_pano_outline_24), AbstractC31175DnJ.A0Q(2131973775, 2131973774, R.drawable.instagram_eye_pano_outline_24)));
        if (bottomSheetFragment != null) {
            C189478aR c189478aR = bottomSheetFragment.A02;
            if (c189478aR != null) {
                C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                AbstractC25226BEj.A1M(activity, A0y, 2131973776);
                c189478aR.A0F(A01, A0y);
                return;
            }
            return;
        }
        C189448aO A0y2 = AbstractC25225BEi.A0y(userSession);
        AbstractC25226BEj.A1M(activity, A0y2, 2131973776);
        AbstractC31173DnH.A0w(activity, A01, A0y2);
    }
}
