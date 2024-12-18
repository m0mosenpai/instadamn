package X;

import android.app.Activity;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AKj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23125AKj {
    public static final C23108AGw A00(AA2 aa2) {
        C23108AGw c23108AGw = new C23108AGw();
        c23108AGw.A03 = aa2.A02;
        c23108AGw.A0A = C05F.A01;
        c23108AGw.A06 = new C221629qR(aa2.A00, aa2.A01);
        c23108AGw.A04 = aa2.A04;
        c23108AGw.A02 = aa2.A03;
        c23108AGw.A0Q = false;
        c23108AGw.A0R = false;
        return c23108AGw;
    }

    public static final C8FC A01(C84823qW c84823qW) {
        return new C8FC((C8D0) new C221629qR(c84823qW.A03, c84823qW.A04), (C8FD) null, (C89G) null, C05F.A01, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, 1.0f, 2.0f, -1.0f, c84823qW.A02, c84823qW.A01 * 360.0f, 7, true, false, true, false, true, false, false, true, true, true, true, true, false, false);
    }

    public static final void A02(Activity activity, View.OnClickListener onClickListener, UserSession userSession) {
        ArrayList A1M;
        int i;
        boolean A1R = AbstractC167007dF.A1R(0, userSession, activity);
        boolean A01 = C2TN.A01(userSession);
        int i2 = 2131974737;
        if (!A01) {
            i2 = 2131974740;
        }
        HowItWorksNuxFragment$Row[] howItWorksNuxFragment$RowArr = new HowItWorksNuxFragment$Row[3];
        A03(2131974739, howItWorksNuxFragment$RowArr, R.drawable.instagram_circle_check_pano_outline_24, 0);
        if (A01) {
            A03(2131974736, howItWorksNuxFragment$RowArr, R.drawable.instagram_user_circle_pano_outline_24, A1R ? 1 : 0);
            A03(2131974738, howItWorksNuxFragment$RowArr, R.drawable.instagram_eye_pano_outline_24, 2);
            A1M = AbstractC16960so.A1M(howItWorksNuxFragment$RowArr);
            if (C18U.A06(C06090Tz.A05, userSession, 36319909902753603L)) {
                i = 2131974734;
                A1M.add(new HowItWorksNuxFragment$Row(Integer.valueOf(i), null, Integer.valueOf(R.drawable.instagram_delete_pano_outline_24), null));
            }
        } else {
            A03(2131974736, howItWorksNuxFragment$RowArr, R.drawable.instagram_user_circle_pano_outline_24, A1R ? 1 : 0);
            A03(Integer.valueOf(i2), howItWorksNuxFragment$RowArr, R.drawable.instagram_story_pano_outline_24, 2);
            A1M = AbstractC16960so.A1M(howItWorksNuxFragment$RowArr);
            if (C18U.A06(C06090Tz.A05, userSession, 36319909902753603L)) {
                i = 2131974735;
                A1M.add(new HowItWorksNuxFragment$Row(Integer.valueOf(i), null, Integer.valueOf(R.drawable.instagram_delete_pano_outline_24), null));
            }
        }
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0g = activity.getString(2131974732);
        c189448aO.A1J = A1R;
        c189448aO.A0K = new ViewOnClickListenerC35683FpI(28, activity, onClickListener);
        c189448aO.A0h = activity.getString(2131972108);
        c189448aO.A0w = A1R;
        c189448aO.A00().A02(activity, FWN.A00(userSession, null, null, null, "story_templates_disclosure", activity.getString(2131974748), null, A1M));
    }

    public static void A03(Integer num, Object[] objArr, int i, int i2) {
        objArr[i2] = new HowItWorksNuxFragment$Row(num, null, Integer.valueOf(i), null);
    }
}
