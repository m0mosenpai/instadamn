package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes11.dex */
public final class WMS implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public WMS(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        String str2;
        IgSimpleImageView igSimpleImageView;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(569073568);
                C67715Uwg c67715Uwg = (C67715Uwg) this.A01;
                String str3 = this.A02;
                C67715Uwg.A03(c67715Uwg, "payouthub_transactions_filter_choose_option_click", str3);
                c67715Uwg.A04.A0B(str3);
                i = 1996335237;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(-86797085);
                AbstractC61604RqT A07 = C2FP.A07();
                ContextThemeWrapper contextThemeWrapper = ((UEy) this.A01).A00;
                if (contextThemeWrapper == null) {
                    str = "viewContext";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                A07.A01(contextThemeWrapper, this.A02);
                i = -373021924;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(-1489960820);
                V1M v1m = (V1M) this.A01;
                V1M.A01(v1m);
                W8y w8y = (W8y) v1m.A05.getValue();
                String str4 = (String) v1m.A07.getValue();
                if (str4 != null) {
                    String str5 = this.A02;
                    C14360o3.A0B(str5, 1);
                    w8y.A00.A00("ig_cg_bottomsheet_primary_cta_click", w8y.A02);
                    if (str5.equals("3pd_trial_inline_opt_in")) {
                        W8y.A01(w8y, false);
                    } else if (str5.equals("3pd_trial_open_setting_screen")) {
                        if (str4.equals("3pd_trial_control")) {
                            str2 = "ig_3pd_trial_control_megaphone";
                        } else if (str4.equals("3pd_trial_go_to_settings")) {
                            str2 = "ig_3pd_trial_30_day_megaphone";
                        }
                        W8y.A00(w8y, str2);
                    } else if (str5.equals("3pd_trial_inline_opt_out")) {
                        W8y.A01(w8y, true);
                    } else {
                        if (str5.equals("fewer_ads_test_group_cta")) {
                            str2 = "ig_fewer_ads_megaphone";
                        } else if (str5.equals("fewer_ads_control_group_cta")) {
                            str2 = "ig_fewer_ads_megaphone_control";
                        } else if (str5.equals("activity_feed_notification_3PD_inline_opt_in")) {
                            W8y.A01(w8y, false);
                            AbstractC59962oe abstractC59962oe = w8y.A01;
                            C9GR.A09(abstractC59962oe.requireActivity(), abstractC59962oe.requireActivity().getString(2131952209));
                        }
                        W8y.A00(w8y, str2);
                    }
                    InterfaceC09390do interfaceC09390do = v1m.A0E;
                    if (((C66394UFf) interfaceC09390do.getValue()).A06) {
                        C66394UFf c66394UFf = (C66394UFf) interfaceC09390do.getValue();
                        C05A c05a = c66394UFf.A05;
                        String str6 = c66394UFf.A02;
                        c05a.Egh(AbstractC166987dD.A1J(new C66637URb(new C51760Mtj(7, WEN.A02(str6, true), WEN.A00(str6, true), WEN.A01(str6, true)), new W1S(null))));
                        IgdsBottomButtonLayout igdsBottomButtonLayout = v1m.A00;
                        str = "button";
                        if (igdsBottomButtonLayout != null) {
                            igdsBottomButtonLayout.setDividerVisible(false);
                            IgdsBottomButtonLayout igdsBottomButtonLayout2 = v1m.A00;
                            if (igdsBottomButtonLayout2 != null) {
                                igdsBottomButtonLayout2.setPrimaryAction(null, null);
                                IgdsBottomButtonLayout igdsBottomButtonLayout3 = v1m.A00;
                                if (igdsBottomButtonLayout3 != null) {
                                    igdsBottomButtonLayout3.setSecondaryAction(null, null);
                                }
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    V1M.A00(v1m, v1m, false);
                    i = -560421657;
                    C0f9.A0C(i, A05);
                    return;
                }
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0C(1200144167, A05);
                throw A0g;
            case 3:
                A05 = C0f9.A05(-5112636);
                AB0 ab0 = ((C69574Vrd) this.A01).A01;
                if (ab0 != null) {
                    ab0.A00(this.A02);
                }
                i = -2110778123;
                C0f9.A0C(i, A05);
                return;
            case 4:
                int A052 = C0f9.A05(-1282553800);
                C69655Vsw c69655Vsw = (C69655Vsw) this.A01;
                c69655Vsw.A03.A0G(VG4.A0e, "edit_audience_link");
                UserSession userSession = c69655Vsw.A07;
                if (C18U.A06(C06090Tz.A05, userSession, 36320936399545345L)) {
                    FragmentActivity fragmentActivity = c69655Vsw.A02;
                    PromoteData promoteData = c69655Vsw.A05;
                    C6PZ.A02(fragmentActivity, promoteData.A0i, new C70608Wdm(c69655Vsw), userSession, promoteData.A1S, this.A02, promoteData.A2W);
                } else {
                    AbstractC65702TsY.A0q();
                    C67872V0d c67872V0d = new C67872V0d();
                    Bundle bundle = new Bundle();
                    bundle.putString("audience_id", this.A02);
                    c67872V0d.setArguments(bundle);
                    AbstractC31177DnL.A16(c67872V0d, c69655Vsw.A02, c69655Vsw.A05.A0y);
                }
                C0f9.A0C(1089636844, A052);
                return;
            case 5:
                A05 = C0f9.A05(-277658075);
                C23852Ah4 c23852Ah4 = (C23852Ah4) this.A01;
                C24015Akt c24015Akt = new C24015Akt(new C106074qN(this.A02, false));
                c23852Ah4.A01 = c24015Akt;
                AAH aah = c23852Ah4.A00;
                if (aah != null && (igSimpleImageView = aah.A02) != null) {
                    igSimpleImageView.setImageDrawable(new C220899pD(c23852Ah4.A03, c24015Akt, true, false));
                }
                i = 1349965936;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(1757199794);
                C45477KBp c45477KBp = (C45477KBp) this.A01;
                LE1 le1 = c45477KBp.A00;
                if (le1 == null) {
                    str = "logger";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                LE1.A00(le1, "igd_campaign_card_action_button_click", AbstractC167007dF.A0n("ad_action_type", "boost_again"));
                AbstractC69888VxF.A00().A0B(VRF.A00().A00(c45477KBp.requireActivity(), (UserSession) c45477KBp.A04.getValue(), this.A02, "inbox_campaign_message_list"));
                i = 376863372;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(519593910);
                C67883V0o c67883V0o = (C67883V0o) this.A01;
                FragmentActivity requireActivity = c67883V0o.requireActivity();
                UserSession userSession2 = c67883V0o.A05;
                if (userSession2 == null) {
                    str = "userSession";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C63397SjR A0y = AbstractC25228BEl.A0y(requireActivity, userSession2, C2Fb.A49, this.A02);
                A0y.A0S = "quick promotion";
                A0y.A0A();
                i = -764593723;
                C0f9.A0C(i, A05);
                return;
            default:
                return;
        }
    }
}
