package X;

import android.os.Bundle;
import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P4U implements InterfaceC58268PsC {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final String A02;
    public final long A03;

    public P4U(PromoteData promoteData, InterfaceC11380iw interfaceC11380iw) {
        String str;
        long j;
        Long A0j;
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A00 = interfaceC11380iw;
        UserSession userSession = promoteData.A0y;
        this.A01 = userSession;
        if (promoteData.A2j) {
            str = promoteData.A1E;
        } else {
            str = null;
        }
        this.A02 = str;
        C14360o3.A06(userSession);
        String A0k = AbstractC50522MSa.A0k(userSession);
        if (A0k != null && (A0j = AbstractC166997dE.A0j(A0k)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        this.A03 = j;
    }

    public static final C25531Mh A00(P4U p4u, Long l, String str, String str2, String str3) {
        UserSession userSession = p4u.A01;
        C14360o3.A06(userSession);
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A01(p4u.A00, userSession), "ig_lead_gen_ads_business"), 224);
        AbstractC50524MSc.A0F(A0A, str, str2, str3);
        AbstractC50523MSb.A13(A0A, userSession, AbstractC167007dF.A0h(LeadGenEntryPoint.A06.A00));
        A0A.A0O("is_from_organic", AbstractC166997dE.A0a());
        A0A.A0Q("business_ig_user_fbidv2", Long.valueOf(AbstractC25232BEp.A0t(l)));
        A0A.A0O("has_continue", null);
        A0A.A0O("has_seen_warning_msg", null);
        A0A.A0Q("total_budget_of_warning", null);
        A0A.A0Q("duration_in_days_of_warning_budget", null);
        A0A.A0Q("total_budget_of_submit", null);
        A0A.A0Q("duration_in_days_of_submit_budget", null);
        A0A.A0Q("default_recommended_daily_budget", null);
        A0A.A0Q("default_recommended_duration_in_days", null);
        A0A.A0R("aymt_channel", p4u.A02);
        return A0A;
    }

    @Override // X.InterfaceC58268PsC
    public final void Ci4(Bundle bundle, String str, String str2, String str3, String str4) {
        Boolean bool;
        Boolean bool2;
        Long l;
        Long l2;
        Long l3;
        boolean A1b = AbstractC43593JPy.A1b(str4);
        UserSession userSession = this.A01;
        C14360o3.A06(userSession);
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A00, userSession), "ig_lead_gen_ads_business"), 224);
        AbstractC50524MSc.A0F(A0A, str2, str3, str4);
        AbstractC50523MSb.A13(A0A, userSession, str);
        A0A.A0O("is_from_organic", Boolean.valueOf(A1b));
        A0A.A0Q("business_ig_user_fbidv2", Long.valueOf(this.A03));
        Long l4 = null;
        if (bundle != null) {
            bool = AbstractC31174DnI.A0n(bundle, "has_user_continue");
        } else {
            bool = null;
        }
        A0A.A0O("has_continue", bool);
        if (bundle != null) {
            bool2 = AbstractC31174DnI.A0n(bundle, "has_seen_warning");
        } else {
            bool2 = null;
        }
        A0A.A0O("has_seen_warning_msg", bool2);
        if (bundle != null) {
            l = Long.valueOf(bundle.getLong("total_budget_of_warning"));
        } else {
            l = null;
        }
        A0A.A0Q("total_budget_of_warning", l);
        if (bundle != null) {
            l2 = Long.valueOf(bundle.getLong("duration_of_warning"));
        } else {
            l2 = null;
        }
        A0A.A0Q("duration_in_days_of_warning_budget", l2);
        if (bundle != null) {
            l3 = Long.valueOf(bundle.getLong("total_budget"));
        } else {
            l3 = null;
        }
        A0A.A0Q("total_budget_of_submit", l3);
        if (bundle != null) {
            l4 = Long.valueOf(bundle.getLong("duration"));
        }
        A0A.A0Q("duration_in_days_of_submit_budget", l4);
        A0A.A0R("aymt_channel", this.A02);
        A0A.Cht();
    }
}
