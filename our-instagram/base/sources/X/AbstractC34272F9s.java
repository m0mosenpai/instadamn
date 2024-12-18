package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.nux.impl.dynamicflow.onboarding.OnboardingActivity;

/* renamed from: X.F9s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34272F9s {
    public static final void A00(UserSession userSession, Context context, boolean z) {
        C14360o3.A0B(userSession, 1);
        Intent intent = AbstractC31171DnF.A04().setClass(context, OnboardingActivity.class);
        C14360o3.A07(intent);
        intent.putExtra("IS_SIGN_UP_FLOW", true);
        AbstractC31173DnH.A18(intent, userSession);
        C12260kU.A0C(context, intent);
        if (z && (context instanceof Activity)) {
            ((Activity) context).overridePendingTransition(R.anim.cds_slide_in_right, R.anim.cds_slide_out_left);
        }
    }
}
