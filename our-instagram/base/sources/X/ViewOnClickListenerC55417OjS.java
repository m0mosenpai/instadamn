package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;
import com.instagram.common.session.UserSession;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.OjS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55417OjS implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public ViewOnClickListenerC55417OjS(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj4;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        AutofillData autofillData;
        int i;
        int i2;
        int i3;
        String str;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-2002680798);
                IgRadioGroup igRadioGroup = (IgRadioGroup) this.A03;
                CardDetails cardDetails = null;
                if (igRadioGroup != null && (i3 = igRadioGroup.A00) != -1) {
                    autofillData = (AutofillData) igRadioGroup.requireViewById(i3).getTag();
                } else {
                    autofillData = null;
                }
                IgRadioGroup igRadioGroup2 = (IgRadioGroup) this.A04;
                if (igRadioGroup2 != null && (i2 = igRadioGroup2.A00) != -1) {
                    cardDetails = ((Q5H) igRadioGroup2.requireViewById(i2)).A00;
                }
                QE7 qe7 = (QE7) this.A01;
                C63380Siu c63380Siu = qe7.A01;
                if (c63380Siu != null) {
                    c63380Siu.A0I(AbstractC61731Rsm.A00(autofillData, cardDetails));
                }
                C5G6 c5g6 = qe7.A00;
                if (c5g6 != null) {
                    C62620SJd c62620SJd = c5g6.A00;
                    c62620SJd.A0B.A00 = true;
                    AbstractC61716RsX.A00(c62620SJd, autofillData, cardDetails, (Integer) this.A02);
                }
                qe7.A07();
                i = -436915421;
                break;
            case 1:
                A05 = C0f9.A05(360917193);
                C8Y5 c8y5 = (C8Y5) this.A04;
                c8y5.A00 = false;
                UserSession userSession = c8y5.A04;
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                List list = (List) this.A02;
                String str2 = ((C47Z) this.A03).A32;
                String str3 = c8y5.A03.A00;
                AbstractC167017dG.A1P(abstractC59962oe, list);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(abstractC59962oe, userSession), "instagram_bc_ads_ppl_boost_eligibility_error");
                AbstractC31171DnF.A1B(A0f, "instagram_bc_ad_ppl_boost_eligibility_error_surface_edit");
                A0f.AAk("error_codes", list);
                AbstractC50523MSb.A10(A0f, str2, str3);
                A0f.Cht();
                AbstractC167017dG.A0y(c8y5.A02, C3DN.A00);
                i = -1252064642;
                break;
            case 2:
                A05 = C0f9.A05(-673839719);
                C8Y5 c8y52 = (C8Y5) this.A04;
                c8y52.A00 = true;
                UserSession userSession2 = c8y52.A04;
                AbstractC59962oe abstractC59962oe2 = (AbstractC59962oe) this.A01;
                List list2 = (List) this.A02;
                String str4 = ((C47Z) this.A03).A32;
                String str5 = c8y52.A03.A00;
                AbstractC167007dF.A1D(abstractC59962oe2, 1, list2);
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(abstractC59962oe2, userSession2), "instagram_bc_ads_ppl_boost_eligibility_error");
                AbstractC31171DnF.A1B(A0f2, "instagram_bc_ad_ppl_boost_eligibility_error_surface_share_anyway");
                A0f2.AAk("error_codes", list2);
                AbstractC50523MSb.A10(A0f2, str4, str5);
                A0f2.Cht();
                AbstractC167017dG.A0y(c8y52.A02, C3DN.A00);
                i = -494522950;
                break;
            case 3:
                A05 = C0f9.A05(1239692066);
                C191578eE c191578eE = (C191578eE) this.A04;
                c191578eE.A06.A1O((EnumC50631MWs) this.A02, (Boolean) this.A03, "PANAVIDEO_NOTIFICATION_OK");
                C191578eE.A06(c191578eE);
                ((C189478aR) this.A01).A0L(null);
                i = 762291367;
                break;
            case 4:
                A05 = C0f9.A05(-71480199);
                if (AbstractC166987dD.A0H(this.A04) != 2) {
                    ((N7M) this.A02).A03(null, (C56323Ozk) this.A03, true);
                } else {
                    AbstractC167017dG.A0y((Activity) this.A01, C3DN.A00);
                }
                i = -106318604;
                break;
            case 5:
                A05 = C0f9.A05(-1086461311);
                UserSession userSession3 = (UserSession) this.A04;
                EnumC201098ur enumC201098ur = EnumC201098ur.ACCEPT;
                C38321qM c38321qM = ((C54563O8p) this.A03).A01;
                C55202OeD.A04(enumC201098ur, userSession3, c38321qM.getId(), null);
                C79923hh.A05((Fragment) this.A01, C79923hh.A00(C82G.A0b, new C55878OrS(this.A02, 1), userSession3, c38321qM, C05F.A15), userSession3);
                i = 1825677289;
                break;
            case 6:
                A05 = C0f9.A05(-38512516);
                UserSession userSession4 = (UserSession) this.A04;
                EnumC201098ur enumC201098ur2 = EnumC201098ur.ACCEPT;
                C38321qM c38321qM2 = ((C54564O8q) this.A03).A01;
                C55202OeD.A02(enumC201098ur2, userSession4, c38321qM2.getId());
                C79923hh.A05((Fragment) this.A01, C79923hh.A00(C82G.A0b, new C55878OrS(this.A02, 1), userSession4, c38321qM2, C05F.A15), userSession4);
                i = -916120056;
                break;
            case 7:
                A05 = C0f9.A05(463143529);
                TaggingActivity taggingActivity = (TaggingActivity) this.A04;
                if (taggingActivity.CLc()) {
                    taggingActivity.Elk();
                } else {
                    TagsInteractiveLayout tagsInteractiveLayout = (TagsInteractiveLayout) this.A03;
                    tagsInteractiveLayout.A08(((MediaSuggestedProductTag) this.A02).A00);
                    Product product = (Product) this.A01;
                    if (product.A02()) {
                        C08790ch A00 = AbstractC018607g.A00(taggingActivity);
                        UserSession A0r = AbstractC166987dD.A0r(taggingActivity.A0o);
                        String str6 = product.A0H;
                        User user = product.A0B;
                        if (user == null || (str = AbstractC76433bn.A00(user)) == null) {
                            str = "";
                        }
                        ISX.A01(taggingActivity, A00, A0r, new C42863Ixd(taggingActivity, tagsInteractiveLayout, product), str6, str);
                    } else {
                        TagsInteractiveLayout.A01(tagsInteractiveLayout, product, false);
                        TaggingActivity.A0M(taggingActivity, product);
                    }
                }
                i = -491482893;
                break;
            case 8:
                A05 = C0f9.A05(1686363175);
                FragmentActivity A0C = AbstractC31172DnG.A0C(this.A04);
                UserSession userSession5 = (UserSession) this.A03;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                User user2 = (User) this.A02;
                C14360o3.A0B(userSession5, 2);
                FYZ.A01(A0C, interfaceC11380iw, userSession5, null, user2, "post_live_moderation", null, null);
                i = -665519881;
                break;
            case 9:
                A05 = C0f9.A05(1141266201);
                FragmentActivity A0C2 = AbstractC31172DnG.A0C(this.A04);
                UserSession userSession6 = (UserSession) this.A03;
                InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) this.A01;
                User user3 = (User) this.A02;
                C14360o3.A0B(userSession6, 2);
                FYZ.A01(A0C2, interfaceC11380iw2, userSession6, null, user3, "post_live_moderation", null, null);
                i = 1946558807;
                break;
            default:
                A05 = C0f9.A05(1410956856);
                Context context = (Context) this.A01;
                C193328hC A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131965733);
                A0I.A09(2131965732);
                InterfaceC58161PqQ interfaceC58161PqQ = (InterfaceC58161PqQ) this.A02;
                A0I.A0J(new Og5(5, context, interfaceC58161PqQ, this.A04, this.A03), 2131956564);
                A0I.A06();
                AbstractC166987dD.A1W(A0I);
                interfaceC58161PqQ.Cyo();
                i = 1717130476;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
