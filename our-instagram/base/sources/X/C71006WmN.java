package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.WmN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71006WmN implements InterfaceC190488c6 {
    public final String A00;
    public final C18920wW A01;
    public final UserSession A02;
    public final C68843Vcz A03;
    public final Boolean A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    @Override // X.InterfaceC190488c6
    public final void Ciy(Integer num, String str, String str2, String str3, String str4) {
    }

    @Override // X.InterfaceC190488c6
    public final void CjR(C66166U2h c66166U2h, Integer num, Integer num2, String str, String str2, String str3, String str4, int i) {
        C14360o3.A0B(num, 3);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_serp_results_button_click");
        if (A00.isSampled()) {
            A00.AAP("serp_session_id", this.A08);
            C66166U2h.A00(A00, c66166U2h, num, i);
            A00(A00, this, c66166U2h, str2, str);
            A00.A7v("is_mixed_serp_content", Boolean.valueOf(C51042Mgs.A01(this.A03.A00.A07()).A0M));
            A00.AAP("selected_follow_status", c66166U2h.A02);
            A00.AAP("selected_source_type", c66166U2h.A07);
            A00.AAP("prior_serp_session_id", this.A06);
            AbstractC25233BEq.A17(A00, "prior_module", this.A05);
            A00.AAP(CacheBehaviorLogger.SOURCE, this.A09);
            A00.AAP("serp_button_click_type", str4);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC190488c6
    public final void CjS(C66166U2h c66166U2h, Integer num, String str, String str2, String str3, String str4, String str5, int i) {
        C14360o3.A0B(num, 3);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_serp_results_click");
        if (A00.isSampled()) {
            A00.AAP("serp_session_id", this.A08);
            A00.AAP("search_type", AbstractC66135U1c.A00(num));
            A00.AAP("selected_id", c66166U2h.A03);
            A00.A9K("selected_position", AbstractC167007dF.A0d());
            A00.AAP("selected_type", c66166U2h.A04);
            A00(A00, this, c66166U2h, str2, str);
            A00.AAP("selected_follow_status", null);
            A00.AAP("selected_source_type", c66166U2h.A07);
            A00.AAP("prior_serp_session_id", this.A06);
            A00.AAP("shopping_session_id", null);
            AbstractC25233BEq.A17(A00, "typecode", str4);
            A00.AAP("click_id", str5);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC190488c6
    public final void CkP(String str, String str2) {
    }

    @Override // X.InterfaceC190488c6
    public final void ClV() {
    }

    @Override // X.InterfaceC190488c6
    public final /* synthetic */ void ClW(String str) {
    }

    @Override // X.InterfaceC190488c6
    public final /* synthetic */ void ClX(String str) {
    }

    @Override // X.InterfaceC190488c6
    public final /* synthetic */ void ClY() {
    }

    @Override // X.InterfaceC190488c6
    public final /* synthetic */ void ClZ(C66166U2h c66166U2h, Integer num, Integer num2, String str, String str2, int i) {
        AbstractC25229BEm.A1I(num, 4, num2);
        Cla(c66166U2h, num, num2, str, str2, null, null, null, i);
    }

    @Override // X.InterfaceC190488c6
    public final void Cla(C66166U2h c66166U2h, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, int i) {
        C14360o3.A0B(num, 3);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_serp_results_click");
        if (A00.isSampled()) {
            A00.AAP("serp_session_id", this.A08);
            C66166U2h.A00(A00, c66166U2h, num, i);
            A00(A00, this, c66166U2h, str2, str);
            A00.AAP("serp_button_click_type", str4);
            A00.AAP("selected_follow_status", c66166U2h.A02);
            A00.AAP("selected_source_type", c66166U2h.A07);
            AbstractC25233BEq.A17(A00, "prior_serp_session_id", this.A06);
            A00.A7v("is_mixed_serp_content", Boolean.valueOf(C51042Mgs.A01(this.A03.A00.A07()).A0M));
            A00.AAP(CacheBehaviorLogger.SOURCE, this.A09);
            A00.AAP("click_id", str5);
            A00.A7v("is_tag", this.A04);
            A00.AAP("tag_navigation_source", this.A0A);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC190488c6
    public final void Clb(String str, String str2, String str3, String str4, String str5, int i) {
    }

    @Override // X.InterfaceC190488c6
    public final void Clc(C66166U2h c66166U2h, Integer num, String str, String str2, String str3, int i) {
        C14360o3.A0B(num, 3);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_serp_results_impression");
        if (A00.isSampled()) {
            A00.AAP("serp_session_id", this.A08);
            C66166U2h.A00(A00, c66166U2h, num, i);
            A00.AAP("serp_button_click_type", str3);
            A00(A00, this, c66166U2h, str2, str);
            A00.AAP("selected_follow_status", null);
            A00.AAP("selected_source_type", c66166U2h.A07);
            A00.AAP("prior_serp_session_id", this.A06);
            A00.A7v("is_mixed_serp_content", Boolean.valueOf(C51042Mgs.A01(this.A03.A00.A07()).A0M));
            AbstractC37302Gc3.A0t(A00);
            A00.AAP(CacheBehaviorLogger.SOURCE, this.A09);
            A00.A7v("is_tag", this.A04);
            A00.AAP("tag_navigation_source", this.A0A);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC190488c6
    public final void Cld(C66182U2x c66182U2x, String str, String str2) {
    }

    @Override // X.InterfaceC190488c6
    public final void Clf() {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC190488c6
    public final void Clg() {
    }

    @Override // X.InterfaceC190488c6
    public final void CmS(C66182U2x c66182U2x, String str, String str2, String str3) {
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, C71006WmN c71006WmN, C66166U2h c66166U2h, String str, String str2) {
        interfaceC02590Ai.A9K("selected_sub_type", c66166U2h.A00);
        interfaceC02590Ai.AAP("search_session_id", c71006WmN.A00);
        interfaceC02590Ai.AAP("rank_token", str);
        interfaceC02590Ai.AAP("query_text", str2);
        interfaceC02590Ai.AAP("selected_id_text", c66166U2h.A05);
    }

    @Override // X.InterfaceC190488c6
    public final void Cin(String str, String str2) {
        C18920wW c18920wW = this.A01;
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
    public final void Cle() {
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_serp_session_initiated");
        if (A00.isSampled()) {
            A00.AAP("search_session_id", this.A00);
            A00.AAP("serp_session_id", this.A08);
            A00.AAP("query_text", this.A07);
            A00.AAP("prior_module", this.A05);
            AbstractC25233BEq.A17(A00, "prior_serp_session_id", this.A06);
            A00.AAP(CacheBehaviorLogger.SOURCE, this.A09);
            A00.AAP("serp_type", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
            A00.A7v("is_tag", this.A04);
            A00.AAP("tag_navigation_source", this.A0A);
            A00.Cht();
        }
    }

    public C71006WmN(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C68843Vcz c68843Vcz, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A02 = userSession;
        this.A00 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A09 = str6;
        this.A03 = c68843Vcz;
        this.A04 = bool;
        this.A0A = str7;
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
