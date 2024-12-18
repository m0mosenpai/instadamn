package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.zero.cms.ZeroCmsTextView;

/* renamed from: X.FYh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34872FYh {
    public static void A00(UserSession userSession, C114875Gx c114875Gx) {
        boolean z = !C3FU.A01(userSession, AbstractC23021Ah.A00(userSession));
        TextView textView = c114875Gx.A04;
        if (textView != null) {
            int i = 2131977218;
            if (z) {
                i = 2131977219;
            }
            textView.setText(i);
        }
        LinearLayout linearLayout = c114875Gx.A03;
        ViewOnClickListenerC35678FpD.A00(linearLayout, 13, userSession);
        ZeroCmsTextView zeroCmsTextView = c114875Gx.A06;
        if (zeroCmsTextView != null) {
            zeroCmsTextView.A00 = C54732fW.A00(userSession);
            String str = zeroCmsTextView.A01;
            if (str != null) {
                zeroCmsTextView.setText(str, AbstractC31174DnI.A0u(zeroCmsTextView));
            }
        }
        AbstractC25651Mw.A00(userSession).A01(c114875Gx.A05, C36096FwW.class);
        if (C3FU.A02(userSession, AbstractC111324zv.A00(4593))) {
            Context context = linearLayout.getContext();
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                String str2 = C26661Qv.A00(userSession).C98().A06;
                if (TextUtils.isEmpty(str2)) {
                    str2 = activity.getString(2131977206);
                }
                String A0f = AbstractC167007dF.A0f(activity, str2, 2131977223);
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                if (A00.A01.getInt("zero_rating_video_setting_banner_tooltip", 0) < 1) {
                    linearLayout.postDelayed(new RunnableC36973GQq(activity, linearLayout, userSession, A00, A0f), 1000L);
                }
            }
        }
    }

    public static void A01(UserSession userSession, C114875Gx c114875Gx) {
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        A00.A02(c114875Gx.A05, C36096FwW.class);
    }
}
