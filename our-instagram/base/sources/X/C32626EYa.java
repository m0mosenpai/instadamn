package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.EYa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32626EYa extends AbstractC66422zJ {
    public final Context A00;
    public final UserSession A01;

    public C32626EYa(UserSession userSession, Context context) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.channel_education_cta_button_headline, viewGroup, false);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        UserSession userSession = this.A01;
        Context context = this.A00;
        C14360o3.A0A(inflate);
        return new C31989E3r(context, inflate, userSession);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        EnumC33508Erh enumC33508Erh;
        C36210FyO c36210FyO = (C36210FyO) interfaceC66482zP;
        C31989E3r c31989E3r = (C31989E3r) c3oo;
        AbstractC167017dG.A1N(c36210FyO, c31989E3r);
        c31989E3r.A04.setImageResource(c36210FyO.A01);
        IgTextView igTextView = c31989E3r.A03;
        Context context = igTextView.getContext();
        AbstractC166987dD.A1P(C02G.A01(context), igTextView, c36210FyO.A02);
        igTextView.setVisibility(0);
        int intValue = c36210FyO.A04.intValue();
        IgTextView igTextView2 = c31989E3r.A01;
        Context context2 = c31989E3r.A00;
        AbstractC166987dD.A1P(C02G.A01(context2), igTextView2, intValue);
        igTextView2.setVisibility(0);
        int intValue2 = c36210FyO.A05.intValue();
        IgTextView igTextView3 = c31989E3r.A02;
        AbstractC166987dD.A1P(C02G.A01(context2), igTextView3, intValue2);
        igTextView3.setVisibility(0);
        int intValue3 = c36210FyO.A03.intValue();
        IgdsButton igdsButton = c31989E3r.A06;
        igdsButton.setText(intValue3);
        ViewOnClickListenerC35683FpI.A00(igdsButton, 45, c36210FyO, c31989E3r);
        igdsButton.setVisibility(0);
        C142846ck c142846ck = c31989E3r.A05;
        String str2 = c36210FyO.A07;
        String str3 = c36210FyO.A06;
        String str4 = c36210FyO.A08;
        String str5 = c36210FyO.A09;
        int i = c36210FyO.A00;
        C25531Mh A0I = AbstractC31172DnG.A0I(c142846ck);
        if (AbstractC25226BEj.A1Z(A0I)) {
            AbstractC31175DnJ.A1B(A0I, c142846ck);
            AbstractC31174DnI.A1K(A0I, "creator_education_details_rendered");
            switch (str2.hashCode()) {
                case -2001117250:
                    if (str2.equals("share_last_message")) {
                        str = "share_last_message_button";
                        break;
                    }
                    str = "send_message_education_button";
                    break;
                case -493687518:
                    if (str2.equals("create_poll")) {
                        str = "create_poll_button";
                        break;
                    }
                    str = "send_message_education_button";
                    break;
                case 354039290:
                    if (str2.equals("voice_message")) {
                        str = "unique_content_education_button";
                        break;
                    }
                    str = "send_message_education_button";
                    break;
                case 996503074:
                    if (str2.equals("keep_sharing")) {
                        str = "see_sharing_options_button";
                        break;
                    }
                    str = "send_message_education_button";
                    break;
                case 1718164945:
                    if (str2.equals("create_spotlight")) {
                        str = "create_spotlight_button";
                        break;
                    }
                    str = "send_message_education_button";
                    break;
                default:
                    str = "send_message_education_button";
                    break;
            }
            A0I.A0o(str);
            AbstractC31174DnI.A1H(A0I, c142846ck, AbstractC31179DnN.A0a(A0I, "best_practices_education", str4, str5, i));
            if (str3.equals("thread_view")) {
                enumC33508Erh = EnumC33508Erh.THREAD_VIEW;
            } else if (str3.equals("channel_insights")) {
                enumC33508Erh = EnumC33508Erh.CHANNEL_INSIGHTS;
            } else {
                enumC33508Erh = EnumC33508Erh.THREAD_DETAILS;
            }
            A0I.A0M(enumC33508Erh, "entrypoint");
            A0I.Cht();
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36210FyO.class;
    }
}
