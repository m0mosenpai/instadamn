package X;

import android.location.Location;
import android.util.Base64;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class U20 implements InterfaceC190488c6 {
    public String A00;
    public final String A01;
    public final String A02;
    public final InterfaceC11380iw A03;
    public final C18920wW A04;
    public final UserSession A05;
    public final U21 A06;
    public final String A07;

    @Override // X.InterfaceC190488c6
    public final void Ciy(Integer num, String str, String str2, String str3, String str4) {
        C14360o3.A0B(num, 3);
        C18920wW c18920wW = this.A04;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_search_echo_click");
        if (A00.isSampled()) {
            A00.AAP("search_type", AbstractC66135U1c.A00(num));
            A00.AAP("click_type", str);
            A00.AAP("query_text", str3);
            A00.AAP("rank_token", str2);
            A00(A00, this, "search_session_id", this.A00);
            A00.AAP("prior_serp_session_id", this.A07);
            U21 u21 = this.A06;
            if (u21 != null) {
                A00.AAk("recommendations_shown_entity_ids", u21.A02);
                A00.AAk("recommendations_shown_entity_names", u21.A03);
                A00.AAk("recommendations_shown_entity_types", u21.A04);
            }
            AbstractC37302Gc3.A0t(A00);
            A00.AAP(CacheBehaviorLogger.SOURCE, "typeahead");
            A00.AAP("click_id", str4);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC190488c6
    public final void CjR(C66166U2h c66166U2h, Integer num, Integer num2, String str, String str2, String str3, String str4, int i) {
    }

    @Override // X.InterfaceC190488c6
    public final void CjS(C66166U2h c66166U2h, Integer num, String str, String str2, String str3, String str4, String str5, int i) {
    }

    @Override // X.InterfaceC190488c6
    public final void CkP(String str, String str2) {
        C14360o3.A0B(str2, 1);
        C18920wW c18920wW = this.A04;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "keyword_see_more_click");
        if (A00.isSampled()) {
            A00.AAP("search_session_id", this.A00);
            A00.AAP("rank_token", str);
            A00(A00, this, "query_text", str2);
            AbstractC25233BEq.A17(A00, "prior_serp_session_id", this.A07);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC190488c6
    public final /* synthetic */ void ClZ(C66166U2h c66166U2h, Integer num, Integer num2, String str, String str2, int i) {
        AbstractC25229BEm.A1I(num, 4, num2);
        Cla(c66166U2h, num, num2, str, str2, null, null, null, i);
    }

    @Override // X.InterfaceC190488c6
    public final void Cla(C66166U2h c66166U2h, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, int i) {
        String str6;
        String str7;
        Location lastLocation;
        AbstractC167007dF.A1G(num, 3, num2);
        C18920wW c18920wW = this.A04;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "search_results_page");
        if (A00.isSampled()) {
            C66166U2h.A00(A00, c66166U2h, num, i);
            A00.AAP("click_type", c66166U2h.A01);
            A00.AAP("query_text", str);
            A00.AAP("rank_token", str2);
            A00.AAP("search_session_id", this.A00);
            A00.AAP("selected_id_text", c66166U2h.A05);
            A00.AAP("selected_follow_status", c66166U2h.A02);
            A00.AAP("selected_source_type", c66166U2h.A07);
            UserSession userSession = this.A05;
            C1VW c1vw = C1VW.A00;
            if (c1vw != null && (lastLocation = c1vw.getLastLocation(userSession, "SearchLogger")) != null) {
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("locsig_ig_search_DO_NOT_USE_THIS,%s,%s", Double.valueOf(lastLocation.getLatitude()), Double.valueOf(lastLocation.getLongitude()));
                C14360o3.A07(formatStrLocaleSafe);
                str6 = Base64.encodeToString(MSY.A1a(formatStrLocaleSafe), 0);
            } else {
                str6 = null;
            }
            A00.AAP("encoded_latlon_privacy_sensitive_do_not_use", str6);
            A00(A00, this, "shopping_session_id", null);
            A00.AAP("prior_serp_session_id", this.A07);
            switch (num2.intValue()) {
                case 0:
                    str7 = "POPULAR";
                    break;
                case 1:
                    str7 = "NORMAL";
                    break;
                default:
                    str7 = "";
                    break;
            }
            A00.AAP("keyword_context", str7);
            U21 u21 = this.A06;
            if (u21 != null) {
                A00.AAk("recommendations_shown_entity_ids", u21.A02);
                A00.AAk("recommendations_shown_entity_names", u21.A03);
                A00.AAk("recommendations_shown_entity_types", u21.A04);
            }
            AbstractC37302Gc3.A0t(A00);
            A00.AAP(CacheBehaviorLogger.SOURCE, str3);
            A00.AAP("click_id", str5);
            A00.A7v("has_social_context", Boolean.valueOf(c66166U2h.A08));
            A00.AAP(AbstractC111324zv.A00(75), c66166U2h.A06);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC190488c6
    public final void Clc(C66166U2h c66166U2h, Integer num, String str, String str2, String str3, int i) {
    }

    @Override // X.InterfaceC190488c6
    public final void Cin(String str, String str2) {
        C18920wW c18920wW = this.A04;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_search_clear_query_x_icon_tap");
        String str3 = C1QM.A00.A02.A00;
        if (A00.isSampled() && str3 != null) {
            A00.AAP("nav_chain", str3);
            A00.AAP("search_session_id", this.A00);
            A00.AAP("rank_token", str);
            A00.AAP("query_text", str2);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC190488c6
    public final void ClV() {
        C18920wW c18920wW = this.A04;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_search_user_clicked_search_button");
        if (A00.isSampled()) {
            A00.A9K(AbstractC111324zv.A00(1368), AbstractC25228BEl.A13(this.A05.userId));
            AbstractC31175DnJ.A14(A00, this.A03);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC190488c6
    public final void ClW(String str) {
        C18920wW c18920wW = this.A04;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_search_boost_disclosure_click");
        if (A00.isSampled()) {
            A00.AAP("search_session_id", this.A00);
            A00.AAP("prior_serp_session_id", this.A07);
            A00.AAP("prior_query_text", this.A02);
            AbstractC25233BEq.A17(A00, "prior_module", this.A01);
            A00.AAP("query_text", str);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC190488c6
    public final void ClX(String str) {
        C18920wW c18920wW = this.A04;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_search_boost_disclosure_impression");
        if (A00.isSampled()) {
            A00.AAP("search_session_id", this.A00);
            A00.AAP("prior_serp_session_id", this.A07);
            A00.AAP("prior_query_text", this.A02);
            AbstractC25233BEq.A17(A00, "prior_module", this.A01);
            A00.AAP("query_text", str);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC190488c6
    public final void ClY() {
        C18920wW c18920wW = this.A04;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_search_glyphs_shown");
        if (A00.isSampled()) {
            A00.AAP("search_session_id", this.A00);
            A00.AAP("prior_serp_session_id", this.A07);
            A00.AAP("prior_query_text", this.A02);
            AbstractC25233BEq.A17(A00, "prior_module", this.A01);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC190488c6
    public final void Cld(C66182U2x c66182U2x, String str, String str2) {
        C18920wW c18920wW = this.A04;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_search_results");
        if (A00.isSampled()) {
            A00.AAP("search_session_id", this.A00);
            A00.AAP("query_text", str);
            A00.AAP("rank_token", str2);
            A00.AAk("results_list", c66182U2x.A02);
            A00.AAk("results_list_names", c66182U2x.A03);
            A00.AAk("results_type_list", c66182U2x.A08);
            A00.AAk("results_source_list", c66182U2x.A07);
            A00.AAk("results_has_social_context", c66182U2x.A00);
            A00.AAk("results_social_context_type", c66182U2x.A06);
            A00.AAP("prior_module", this.A01);
            A00.AAP("prior_query_text", this.A02);
            AbstractC25233BEq.A17(A00, "prior_serp_session_id", this.A07);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC190488c6
    public final void Cle() {
        C18920wW c18920wW = this.A04;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_search_session_initiated");
        if (A00.isSampled()) {
            A00.AAP("search_session_id", this.A00);
            A00.AAP("shopping_session_id", null);
            AbstractC25233BEq.A17(A00, "prior_module", this.A01);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC190488c6
    public final void Clg() {
        C18920wW c18920wW = this.A04;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_search_typeahead_session_initiated");
        if (A00.isSampled()) {
            A00.AAP("search_session_id", this.A00);
            A00.AAP("shopping_session_id", null);
            AbstractC25233BEq.A17(A00, "prior_module", this.A01);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC190488c6
    public final void CmS(C66182U2x c66182U2x, String str, String str2, String str3) {
        C18920wW c18920wW = this.A04;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "search_viewport_view");
        if (A00.isSampled()) {
            A00.AAk("results_list", c66182U2x.A02);
            A00.AAk("results_list_names", c66182U2x.A03);
            A00.AAk("results_source_list", c66182U2x.A07);
            A00.AAk("results_type_list", c66182U2x.A08);
            A00.AAk("results_has_social_context", c66182U2x.A00);
            A00.AAk("results_social_context_type", c66182U2x.A06);
            A00.AAP("search_session_id", this.A00);
            A00.AAk("results_section_list", c66182U2x.A05);
            A00.AAk("results_position_list", c66182U2x.A04);
            A00.AAP("query_text", str);
            A00.AAP("rank_token", str2);
            A00(A00, this, "shopping_session_id", null);
            A00.AAP("prior_serp_session_id", this.A07);
            A00.AAk("results_keyword_context_list", c66182U2x.A01);
            U21 u21 = this.A06;
            if (u21 != null) {
                A00.AAk("recommendations_shown_entity_ids", u21.A02);
                A00.AAk("recommendations_shown_entity_names", u21.A03);
                A00.AAk("recommendations_shown_entity_types", u21.A04);
            }
            AbstractC25233BEq.A17(A00, CacheBehaviorLogger.SOURCE, str3);
            A00.Cht();
        }
    }

    public U20(InterfaceC11380iw interfaceC11380iw, UserSession userSession, U21 u21, String str, String str2, String str3, String str4) {
        this.A03 = interfaceC11380iw;
        this.A00 = str;
        this.A05 = userSession;
        this.A06 = u21;
        this.A01 = str2;
        this.A02 = str3;
        this.A07 = str4;
        this.A04 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, U20 u20, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP("prior_module", u20.A01);
        interfaceC02590Ai.AAP("prior_query_text", u20.A02);
    }

    @Override // X.InterfaceC190488c6
    public final void Clb(String str, String str2, String str3, String str4, String str5, int i) {
        AbstractC167027dH.A13(str2, str3, str4);
        C18920wW c18920wW = this.A04;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "search_results_dismiss");
        if (A00.isSampled()) {
            A00.AAP("selected_id", str2);
            A00.AAP("selected_type", str4);
            A00.A9K("selected_position", Long.valueOf(i));
            A00.AAP("selected_section", str5);
            A00.AAP("search_session_id", this.A00);
            A00.AAP("rank_token", str);
            A00.AAP("selected_id_text", str3);
            A00(A00, this, "shopping_session_id", null);
            AbstractC25233BEq.A17(A00, "prior_serp_session_id", this.A07);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC190488c6
    public final void Clf() {
        this.A00 = AbstractC166997dE.A0n();
        Cle();
    }
}
