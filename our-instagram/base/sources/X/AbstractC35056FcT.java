package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.FcT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35056FcT {
    public static final void A00(Context context, View view, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC148366m6 interfaceC148366m6, C2EE c2ee, boolean z) {
        String str;
        View findViewById = view.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            findViewById.setVisibility(8);
            TextView A0e = AbstractC166987dD.A0e(findViewById, R.id.title);
            int i = 2131957308;
            if (z) {
                i = 2131957309;
            }
            AbstractC31173DnH.A12(context, A0e, i);
            findViewById.findViewById(R.id.message).setVisibility(8);
            View findViewById2 = findViewById.findViewById(R.id.action_button_container);
            TextView A0e2 = AbstractC166987dD.A0e(findViewById, R.id.left_button);
            AbstractC31173DnH.A12(context, A0e2, 2131957305);
            A0e2.setTextAppearance(context, R.style.IgPrimaryButton);
            A0e2.setBackgroundResource(R.drawable.primary_button_selector_panavision_soft_update);
            A0e2.setTypeface(null, 1);
            C0fQ.A00(new LPV(0, view, fragmentActivity, interfaceC11380iw, userSession, interfaceC148366m6, c2ee, z), A0e2);
            TextView textView = (TextView) findViewById.findViewById(R.id.right_button);
            AbstractC31173DnH.A12(context, textView, 2131957306);
            C0fQ.A00(new ViewOnClickListenerC35642Foc(context, view, fragmentActivity, interfaceC11380iw, userSession, interfaceC148366m6, c2ee, 0, z), textView);
            findViewById2.setVisibility(0);
            findViewById.setVisibility(0);
            String C7I = c2ee.C7I();
            if (z) {
                str = "thread_ctd_upsell_single_create_messaging_ads_banner_impression";
            } else {
                str = "thread_ctd_upsell_second_banner_impression";
            }
            A0T.A00(interfaceC11380iw, userSession, str, C7I);
        }
    }

    public static final void A01(View view, InterfaceC148366m6 interfaceC148366m6) {
        View findViewById = view.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            AbstractC34082F2k.A00(findViewById);
            interfaceC148366m6.DWL();
        }
    }

    public static final void A02(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C2EE c2ee) {
        F0J.A00().A01(fragmentActivity, userSession, AbstractC43591JPw.A00(144));
        A0T.A00(interfaceC11380iw, userSession, "thread_ctd_upsell_launch_boost_flow", c2ee.C7I());
    }
}
