package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.F0c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34023F0c {
    public static final void A00(Activity activity, Context context, UserSession userSession, Integer num, String str) {
        Intent A03;
        String A00;
        AbstractC167007dF.A1E(userSession, 1, str);
        String str2 = userSession.token;
        C14360o3.A0B(str2, 0);
        Bundle A09 = AbstractC31176DnK.A09(str2);
        AbstractC31171DnF.A13(A09, "professional_account_onboarding_checklist");
        A09.putBoolean(AbstractC111324zv.A00(433), true);
        A09.putBoolean(AbstractC111324zv.A00(434), true);
        User A0Y = AbstractC166997dE.A0Y(userSession);
        int intValue = num.intValue();
        Intent A04 = AbstractC31171DnF.A04();
        if (intValue != 5) {
            A04.putExtra("EXTRA_PROFILE_SHARE_WITH_FOA_DISABLED", true);
            A04.putExtra("EXTRA_PROFILE_SHARE_USER_ID", A0Y.getId());
            A04.putExtra("EXTRA_PROFILE_SHARE_PREFILL_MESSAGE", AbstractC31178DnM.A0c(context, A0Y, 2131964668));
            A03 = AbstractC31172DnG.A0l().A03(context, 268468224);
            A00 = "EXTRA_PROFILE_SHARE_INTENT";
        } else {
            A04.putExtra("StoryHandlerActivity.EXTRA_STORY_SHARE_WITH_TOOL_TIP_ENABLED", true);
            A03 = AbstractC31172DnG.A0l().A03(context, 268468224);
            A00 = MSV.A00(855);
        }
        A03.putExtra(A00, A04);
        A09.putParcelable(AbstractC111324zv.A00(444), A03);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0d = str;
        C189478aR A002 = A0y.A00();
        ENI eni = new ENI();
        eni.setArguments(A09);
        A002.A02(activity, eni);
    }
}
