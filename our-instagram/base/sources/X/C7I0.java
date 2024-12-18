package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;

/* renamed from: X.7I0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7I0 {
    public Integer A00;
    public boolean A01;
    public final Activity A02;
    public final Context A03;
    public final View A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final InterfaceC148366m6 A07;
    public final String A08;

    public static final void A00(UserSession userSession, C7I0 c7i0, C2EE c2ee) {
        Integer num;
        long A01;
        String str;
        String str2;
        ViewStub viewStub;
        Integer num2;
        Number number;
        Number number2;
        Integer num3;
        ViewStub viewStub2;
        Context context = c7i0.A03;
        Activity activity = c7i0.A02;
        String A00 = MSV.A00(0);
        C14360o3.A0C(activity, A00);
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        View view = c7i0.A04;
        InterfaceC148366m6 interfaceC148366m6 = c7i0.A07;
        InterfaceC11380iw interfaceC11380iw = c7i0.A05;
        C14360o3.A0B(fragmentActivity, 2);
        if (c2ee.BI1() == 0 && view.findViewById(R.id.nux_banner) == null) {
            SmartSuggestion Bxt = c2ee.Bxt();
            if (Bxt != null) {
                num3 = Bxt.A03;
            } else {
                num3 = null;
            }
            if (num3 == C05F.A0u) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36319046613867419L) && AbstractC2056298m.A00(userSession).A00.getLong("armadillo_biz_tools_upsell_banner_impression_count", 0L) < C18U.A01(c06090Tz, userSession, 36600521590640547L) && (System.currentTimeMillis() / 1000) - AbstractC2056298m.A00(userSession).A00.getLong("armadillo_biz_tools_upsell_banner_last_impression_timestamp", 0L) > C18U.A01(c06090Tz, userSession, 36600521590706084L) && (viewStub2 = (ViewStub) view.findViewById(R.id.nux_banner_viewstub)) != null) {
                    View inflate = viewStub2.inflate();
                    ((TextView) inflate.findViewById(R.id.title)).setText(context.getText(2131953194));
                    ((TextView) inflate.findViewById(R.id.message)).setText(context.getText(2131953193));
                    View findViewById = inflate.findViewById(R.id.action_button_container);
                    TextView textView = (TextView) inflate.findViewById(R.id.left_button);
                    textView.setTextAppearance(context, R.style.IgPrimaryButton);
                    textView.setBackgroundResource(R.drawable.primary_button_selector_panavision_soft_update);
                    textView.setTypeface(null, 1);
                    textView.setText(context.getText(2131953192));
                    C0fQ.A00(new ViewOnClickListenerC35621FoC(view, fragmentActivity, interfaceC11380iw, userSession, interfaceC148366m6, c2ee), textView);
                    inflate.findViewById(R.id.right_button).setVisibility(8);
                    C0fQ.A00(new ViewOnClickListenerC35622FoD(view, fragmentActivity, interfaceC11380iw, userSession, interfaceC148366m6, c2ee), inflate.findViewById(R.id.dismiss_button));
                    findViewById.setVisibility(0);
                    C2056398n A002 = AbstractC2056298m.A00(userSession);
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    InterfaceC19630xq interfaceC19630xq = A002.A00;
                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                    ARD.E7G("armadillo_biz_tools_upsell_banner_impression_count", interfaceC19630xq.getLong("armadillo_biz_tools_upsell_banner_impression_count", 0L) + 1);
                    ARD.apply();
                    InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                    ARD2.E7G("armadillo_biz_tools_upsell_banner_last_impression_timestamp", currentTimeMillis);
                    ARD2.apply();
                    AbstractC34050F1d.A00(interfaceC11380iw, userSession, "thread_armadillo_biz_tools_upsell_banner_impression", c2ee.C7I());
                    interfaceC148366m6.DWN();
                    num2 = C05F.A0A;
                    c7i0.A00 = num2;
                }
            }
        }
        C14360o3.A0C(activity, A00);
        if (c2ee.BI1() != 0 || view.findViewById(R.id.nux_banner) != null) {
            return;
        }
        SmartSuggestion Bxt2 = c2ee.Bxt();
        if (Bxt2 != null) {
            num = Bxt2.A03;
        } else {
            num = null;
        }
        if (num != C05F.A0u) {
            return;
        }
        C06090Tz c06090Tz2 = C06090Tz.A05;
        if (!C18U.A06(c06090Tz2, userSession, 36316594187538961L)) {
            return;
        }
        int A012 = (int) C18U.A01(c06090Tz2, userSession, 36598069165165675L);
        InterfaceC19610xo ARD3 = AbstractC2056298m.A00(userSession).A00.ARD();
        ARD3.E7D("ctd_upsell_banner_qe_user_group", A012);
        ARD3.apply();
        C9BW Atx = c2ee.Atx();
        if (Atx != null && (number2 = (Number) Atx.A01) != null) {
            A01 = number2.intValue();
        } else {
            A01 = C18U.A01(c06090Tz2, userSession, 36598069164313701L);
        }
        InterfaceC19630xq interfaceC19630xq2 = AbstractC2056298m.A00(userSession).A00;
        if (A012 != 1) {
            if (A012 != 2) {
                str = "ctd_upsell_banner_impression_count_v2";
            } else {
                str = "ctd_upsell_two_banner_impression_count";
            }
        } else {
            str = "ctd_upsell_one_banner_impression_count";
        }
        if (interfaceC19630xq2.getLong(str, 0L) >= A01) {
            return;
        }
        long A013 = C18U.A01(c06090Tz2, userSession, 36598069164379238L);
        C9BW Atx2 = c2ee.Atx();
        if (Atx2 != null && (number = (Number) Atx2.A00) != null) {
            A013 = SandboxRepository.CACHE_TTL * number.intValue();
        }
        long currentTimeMillis2 = System.currentTimeMillis() / 1000;
        InterfaceC19630xq interfaceC19630xq3 = AbstractC2056298m.A00(userSession).A00;
        if (A012 != 1) {
            if (A012 != 2) {
                str2 = "ctd_upsell_banner_last_impression_timestamp_v2";
            } else {
                str2 = "ctd_upsell_two_banner_last_impression_timestamp";
            }
        } else {
            str2 = "ctd_upsell_one_banner_last_impression_timestamp";
        }
        if (currentTimeMillis2 - interfaceC19630xq3.getLong(str2, 0L) <= A013 || (viewStub = (ViewStub) view.findViewById(R.id.nux_banner_viewstub)) == null) {
            return;
        }
        View inflate2 = viewStub.inflate();
        int i = AbstractC2056298m.A00(userSession).A00.getInt("ctd_upsell_banner_qe_user_group", 0);
        if (i == 1) {
            i = 1;
            AbstractC35056FcT.A00(context, view, fragmentActivity, interfaceC11380iw, userSession, interfaceC148366m6, c2ee, true);
        } else {
            View findViewById2 = view.findViewById(R.id.nux_banner);
            if (findViewById2 != null) {
                ((TextView) findViewById2.findViewById(R.id.title)).setText(context.getText(2131957303));
                ((TextView) findViewById2.findViewById(R.id.message)).setText(context.getText(2131957302));
                View findViewById3 = findViewById2.findViewById(R.id.action_button_container);
                TextView textView2 = (TextView) findViewById2.findViewById(R.id.left_button);
                textView2.setText(context.getText(2131957304));
                C0fQ.A00(new ViewOnClickListenerC35635FoU(context, view, fragmentActivity, interfaceC11380iw, userSession, interfaceC148366m6, c2ee), textView2);
                TextView textView3 = (TextView) findViewById2.findViewById(R.id.right_button);
                textView3.setText(context.getText(2131957307));
                C0fQ.A00(new ViewOnClickListenerC35636FoV(view, fragmentActivity, interfaceC11380iw, userSession, interfaceC148366m6, c2ee, i), textView3);
                findViewById3.setVisibility(0);
            }
            A0T.A00(interfaceC11380iw, userSession, "thread_ctd_upsell_first_banner_impression", c2ee.C7I());
        }
        C0fQ.A00(new ViewOnClickListenerC35634FoT(view, fragmentActivity, interfaceC11380iw, userSession, interfaceC148366m6, c2ee, i), inflate2.findViewById(R.id.dismiss_button));
        C2056398n A003 = AbstractC2056298m.A00(userSession);
        long currentTimeMillis3 = System.currentTimeMillis() / 1000;
        C9CJ c9cj = (C9CJ) C2056398n.A0c.get(Integer.valueOf(i));
        if (c9cj != null) {
            InterfaceC19630xq interfaceC19630xq4 = A003.A00;
            String str3 = c9cj.A00;
            long j = interfaceC19630xq4.getLong(str3, 0L);
            InterfaceC19610xo ARD4 = interfaceC19630xq4.ARD();
            ARD4.E7G(str3, j + 1);
            ARD4.apply();
            InterfaceC19610xo ARD5 = interfaceC19630xq4.ARD();
            ARD5.E7G(c9cj.A01, currentTimeMillis3);
            ARD5.apply();
        }
        interfaceC148366m6.DWN();
        num2 = C05F.A06;
        c7i0.A00 = num2;
    }

    public C7I0(Activity activity, Context context, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC148366m6 interfaceC148366m6, String str) {
        this.A06 = userSession;
        this.A02 = activity;
        this.A03 = context;
        this.A04 = view;
        this.A07 = interfaceC148366m6;
        this.A05 = interfaceC11380iw;
        this.A08 = str;
    }
}
