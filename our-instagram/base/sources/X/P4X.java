package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

/* loaded from: classes9.dex */
public final class P4X implements InterfaceC58268PsC {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final long A02;

    public final void A04(Long l, String str, String str2, boolean z) {
        String str3;
        C14360o3.A0B(str2, 2);
        if (z) {
            str3 = "success";
        } else {
            str3 = RealtimeConstants.SEND_FAIL;
        }
        C25531Mh A00 = A00(this, l, "lead_gen_manage_lead_forms_and_cta", "update_selection_mutation", str3, str2);
        A00.A0Q("lead_form_id", AbstractC25233BEq.A0n(str));
        A00.Cht();
    }

    public final void A05(Long l, String str, String str2, boolean z, boolean z2) {
        C14360o3.A0B(str2, 2);
        C25531Mh A00 = A00(this, l, "lead_gen_manage_lead_forms_and_cta", A01("cancel", z, z2), "click", str2);
        A00.A0Q("lead_form_id", AbstractC25233BEq.A0n(str));
        A00.Cht();
    }

    public final void A06(Long l, String str, String str2, boolean z, boolean z2) {
        C14360o3.A0B(str2, 2);
        C25531Mh A00 = A00(this, l, "lead_gen_manage_lead_forms_and_cta", A01("update", z, z2), "click", str2);
        A00.A0Q("lead_form_id", AbstractC25233BEq.A0n(str));
        A00.Cht();
    }

    public final void A07(Long l, String str, boolean z) {
        String str2;
        C14360o3.A0B(str, 1);
        if (z) {
            str2 = "success";
        } else {
            str2 = RealtimeConstants.SEND_FAIL;
        }
        A00(this, l, "lead_gen_create_form", "create_form_mutation", str2, str).Cht();
    }

    public final void A08(Long l, String str, boolean z) {
        String str2;
        C14360o3.A0B(str, 1);
        if (z) {
            str2 = "success";
        } else {
            str2 = RealtimeConstants.SEND_FAIL;
        }
        A00(this, l, "lead_gen_preview_form", "preview_lead_gen_form_tos_query", str2, str).Cht();
    }

    public final void A09(Long l, String str, boolean z) {
        String str2;
        C14360o3.A0B(str, 1);
        if (z) {
            str2 = "success";
        } else {
            str2 = RealtimeConstants.SEND_FAIL;
        }
        A00(this, l, "lead_gen_review_form", "review_lead_gen_form_tos_query", str2, str).Cht();
    }

    public static final C25531Mh A00(P4X p4x, Long l, String str, String str2, String str3, String str4) {
        UserSession userSession = p4x.A01;
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A01(p4x.A00, userSession), "ig_lead_gen_organic_business"), 227);
        AbstractC50524MSc.A0F(A0A, str, str2, str3);
        AbstractC50523MSb.A13(A0A, userSession, str4);
        A0A.A0O("is_from_organic", AbstractC166997dE.A0b());
        A0A.A0Q("business_ig_user_fbidv2", Long.valueOf(AbstractC25232BEp.A0t(l)));
        return A0A;
    }

    public static final String A01(String str, boolean z, boolean z2) {
        StringBuilder A1C;
        String str2;
        if (z) {
            A1C = AbstractC166987dD.A1C();
            if (z2) {
                str2 = "update_cta_and_form_selection_dialog_";
            } else {
                str2 = "update_form_selection_dialog_";
            }
        } else if (z2) {
            A1C = AbstractC166987dD.A1C();
            str2 = "update_cta_selection_dialog_";
        } else {
            return AbstractC43591JPw.A00(1386);
        }
        return MSZ.A0u(str2, str, A1C);
    }

    public static void A02(P4X p4x, Long l, String str, String str2, String str3) {
        A00(p4x, l, str, str2, "click", str3).Cht();
    }

    public static void A03(P4X p4x, Long l, String str, String str2, String str3) {
        A00(p4x, l, str, str2, "impression", str3).Cht();
    }

    public P4X(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        long j;
        Long A0j;
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        String A0k = AbstractC50522MSa.A0k(userSession);
        if (A0k != null && (A0j = AbstractC166997dE.A0j(A0k)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        this.A02 = j;
    }

    @Override // X.InterfaceC58268PsC
    public final void Ci4(Bundle bundle, String str, String str2, String str3, String str4) {
        String str5;
        boolean A1a = AbstractC31175DnJ.A1a(str4);
        if (bundle != null) {
            str5 = bundle.getString("form_id");
        } else {
            str5 = null;
        }
        UserSession userSession = this.A01;
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A00, userSession), "ig_lead_gen_organic_business"), 227);
        AbstractC50524MSc.A0F(A0A, str2, str3, str4);
        AbstractC50523MSb.A13(A0A, userSession, str);
        A0A.A0O("is_from_organic", Boolean.valueOf(A1a));
        A0A.A0Q("business_ig_user_fbidv2", Long.valueOf(this.A02));
        if (str5 != null) {
            A0A.A0Q("lead_form_id", AbstractC166997dE.A0j(str5));
        }
        A0A.Cht();
    }
}
