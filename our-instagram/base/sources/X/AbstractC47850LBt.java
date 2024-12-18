package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LBt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47850LBt {
    public static final void A00(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC148366m6 interfaceC148366m6, C45078Jx7 c45078Jx7) {
        C14360o3.A0B(interfaceC148366m6, 4);
        View findViewById = view.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            AbstractC34082F2k.A00(findViewById);
            if (c45078Jx7 != null) {
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                long j = c45078Jx7.A00;
                String valueOf = String.valueOf(j);
                EnumC72377XcD enumC72377XcD = c45078Jx7.A01;
                String name = enumC72377XcD.name();
                C14360o3.A0B(name, 1);
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
                A0w.E77(AnonymousClass001.A0u("proactive_warning_banner_dismissed/userid/", valueOf, "/flowtype/", name), true);
                A0w.apply();
                JUk jUk = new JUk(interfaceC11380iw, userSession);
                jUk.A01(EnumC72433Xdd.A06, enumC72377XcD, c45078Jx7.A0C, j);
                JUk.A00(EnumC46292KeO.PROACTIVE_WARNING_BANNER_DISMISS, jUk);
            }
            interfaceC148366m6.DWL();
        }
    }

    public static final boolean A01(Context context, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC148366m6 interfaceC148366m6, C7IK c7ik, C45078Jx7 c45078Jx7) {
        ViewStub A07;
        int color;
        SpannableStringBuilder A0H;
        boolean A1a = AbstractC31175DnJ.A1a(view);
        AbstractC167017dG.A1T(c45078Jx7, interfaceC148366m6);
        if (!AbstractC47020Kqd.A00(userSession, c45078Jx7, A1a) || (A07 = AbstractC31171DnF.A07(view, R.id.image_nux_banner_viewstub)) == null) {
            return false;
        }
        View inflate = A07.inflate();
        if (c7ik != null) {
            color = c7ik.A02;
        } else {
            color = context.getColor(R.color.black_55_transparent);
        }
        inflate.setBackgroundColor(color);
        TextView A0e = AbstractC166987dD.A0e(inflate, R.id.title);
        A0e.setText(c45078Jx7.A0D);
        A0e.setFocusableInTouchMode(A1a);
        if (c7ik == null) {
            AbstractC166987dD.A1O(context, A0e, AbstractC53242c7.A0E(context));
            AbstractC31172DnG.A1B(context, inflate.findViewById(R.id.divider), AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_button_on_media));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.message);
        AbstractC25227BEk.A11(textView);
        String str = c45078Jx7.A08;
        if (str != null && str.length() != 0) {
            A0H = AbstractC31178DnM.A09(c45078Jx7.A06, str);
            C14360o3.A07(A0H);
            AnonymousClass773.A03(A0H, new C46065KaM(context, view, interfaceC11380iw, userSession, interfaceC148366m6, c45078Jx7, context.getColor(AbstractC53242c7.A0C(context))), str);
        } else {
            A0H = AbstractC25225BEi.A0H(c45078Jx7.A06);
        }
        textView.setText(A0H);
        if (c7ik == null) {
            AbstractC31177DnL.A0q(context, textView, R.attr.igds_color_secondary_text_on_media);
        }
        AbstractC166997dE.A19(context, AbstractC31176DnK.A0D(inflate, R.id.icon), R.drawable.ig_illustrations_qp_warning2_refresh);
        View findViewById = inflate.findViewById(R.id.dismiss_button);
        C0fQ.A00(new ViewOnClickListenerC44304Jhv(3, interfaceC11380iw, inflate, interfaceC148366m6, userSession, c45078Jx7), findViewById);
        findViewById.setVisibility(0);
        AbstractC167007dF.A0x(inflate.findViewById(R.id.bottom_divider));
        interfaceC148366m6.DWN();
        JUk jUk = new JUk(interfaceC11380iw, userSession);
        jUk.A01(EnumC72433Xdd.A06, c45078Jx7.A01, c45078Jx7.A0C, c45078Jx7.A00);
        JUk.A00(EnumC46292KeO.PROACTIVE_WARNING_BANNER_SHOWN, jUk);
        return true;
    }
}
