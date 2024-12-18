package X;

import android.app.Activity;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;
import java.util.ArrayList;

/* renamed from: X.FWn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34832FWn {
    public static final void A00(Activity activity, View.OnClickListener onClickListener, UserSession userSession) {
        ArrayList A1M;
        boolean A1R = AbstractC167007dF.A1R(0, userSession, activity);
        boolean A01 = C2TN.A01(userSession);
        HowItWorksNuxFragment$Row[] howItWorksNuxFragment$RowArr = new HowItWorksNuxFragment$Row[4];
        A01(2131968013, howItWorksNuxFragment$RowArr, R.drawable.instagram_photo_pano_outline_24, 0);
        A01(2131968014, howItWorksNuxFragment$RowArr, R.drawable.instagram_creator_marketplace_pano_outline_24, A1R ? 1 : 0);
        A01(2131968015, howItWorksNuxFragment$RowArr, R.drawable.instagram_delete_pano_outline_24, 2);
        if (A01) {
            A01(2131968016, howItWorksNuxFragment$RowArr, R.drawable.instagram_eye_pano_outline_24, 3);
            A1M = AbstractC16960so.A1M(howItWorksNuxFragment$RowArr);
        } else {
            A01(2131968017, howItWorksNuxFragment$RowArr, R.drawable.instagram_eye_pano_outline_24, 3);
            A1M = AbstractC16960so.A1M(howItWorksNuxFragment$RowArr);
        }
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0g = activity.getString(2131974658);
        A0y.A1J = A1R;
        A0y.A0K = new ViewOnClickListenerC35687FpM(28, activity, onClickListener);
        A0y.A0h = activity.getString(2131972108);
        A0y.A0w = A1R;
        A0y.A00().A02(activity, FWN.A00(userSession, null, null, Integer.valueOf(R.drawable.ig_illustrations_illo_music_pick_refresh), "story_music_pick_disclosure", activity.getString(2131974659), null, A1M));
    }

    public static void A01(Integer num, Object[] objArr, int i, int i2) {
        objArr[i2] = new HowItWorksNuxFragment$Row(num, null, Integer.valueOf(i), null);
    }
}
