package X;

import android.os.Bundle;
import com.facebook.common.dextricks.DexOptimization;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P4V implements InterfaceC58268PsC {
    public int A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final String A0D;

    @Override // X.InterfaceC58268PsC
    public final void Ci4(Bundle bundle, String str, String str2, String str3, String str4) {
        long j;
        Long A0j;
        C14360o3.A0B(str4, 3);
        UserSession userSession = this.A02;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A01, userSession), "ig_lead_gen_ads_consumer");
        A0f.AAP("flow_name", str2);
        A0f.AAP("flow_step", str3);
        A0f.AAP("event_name", str4);
        A0f.AAP("event_type", DexOptimization.OPT_KEY_CLIENT);
        AbstractC31171DnF.A1G(A0f, str);
        A0f.A7v("is_employee", Boolean.valueOf(C1C0.A00(userSession)));
        String A0k = AbstractC50522MSa.A0k(userSession);
        if (A0k != null && (A0j = AbstractC166997dE.A0j(A0k)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        A0f.A9K("consumer_ig_user_fbidv2", Long.valueOf(j));
        A0f.A7v("has_qualifying_question", Boolean.valueOf(this.A0B));
        A0f.A7v("has_gated_content", Boolean.valueOf(this.A0A));
        A0f.A7v("has_creatives", Boolean.valueOf(this.A09));
        A0f.A7v("is_form_extension", Boolean.valueOf(this.A0C));
        A0f.A9K("lead_form_id", AbstractC37302Gc3.A0W(this.A07));
        A0f.AAP("ad_creation_source", this.A03);
        A0f.A9K("ad_id", AbstractC37302Gc3.A0W(this.A04));
        A0f.AAP("ad_tracking_token", this.A08);
        A0f.A7v("is_dark_mode", Boolean.valueOf(C1H6.A03()));
        A0f.A9K("business_ig_user_fbidv2", AbstractC37302Gc3.A0V(this.A0D));
        if (bundle != null) {
            String string = bundle.getString("question_type");
            if (string != null) {
                A0f.AAP("question_type", string);
            }
            String string2 = bundle.getString("pii_question_type");
            if (string2 != null) {
                A0f.AAP("pii_question_type", string2);
            }
            String string3 = bundle.getString("submission_session_id");
            if (string3 != null) {
                A0f.AAP("submission_session_id", string3);
            }
        }
        String str5 = this.A06;
        if (str5 != null && str5.length() != 0) {
            A0f.AAP("first_question_sticker_question_type", str5);
        }
        AbstractC25232BEp.A1L(A0f, "canonical_correlation_id", AbstractC123905j4.A00);
    }

    public static final C25531Mh A00(P4V p4v, String str, String str2, String str3) {
        long j;
        long j2;
        Long A0j;
        Long A0j2;
        UserSession userSession = p4v.A02;
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A01(p4v.A01, userSession), "ig_lead_gen_ads_consumer"), 225);
        AbstractC50524MSc.A0F(A0A, str, str2, str3);
        AbstractC50523MSb.A13(A0A, userSession, p4v.A05);
        String A0k = AbstractC50522MSa.A0k(userSession);
        if (A0k != null && (A0j2 = AbstractC166997dE.A0j(A0k)) != null) {
            j = A0j2.longValue();
        } else {
            j = 0;
        }
        A0A.A0Q("consumer_ig_user_fbidv2", Long.valueOf(j));
        A0A.A0O("has_qualifying_question", Boolean.valueOf(p4v.A0B));
        A0A.A0O("has_gated_content", Boolean.valueOf(p4v.A0A));
        A0A.A0O("has_creatives", Boolean.valueOf(p4v.A09));
        A0A.A0O("is_form_extension", Boolean.valueOf(p4v.A0C));
        String str4 = p4v.A07;
        if (str4 != null && (A0j = AbstractC166997dE.A0j(str4)) != null) {
            j2 = A0j.longValue();
        } else {
            j2 = 0;
        }
        A0A.A0Q("lead_form_id", Long.valueOf(j2));
        A0A.A0Q("ad_id", Long.valueOf(AbstractC50522MSa.A0C(p4v.A04)));
        A0A.A0R("ad_tracking_token", p4v.A08);
        A0A.A0R("ad_creation_source", p4v.A03);
        A0A.A0Q("multi_submit_ad_index", AbstractC31171DnF.A0V(p4v.A00));
        A0A.A0O("is_dark_mode", Boolean.valueOf(C1H6.A03()));
        A0A.A0R("first_question_sticker_question_type", p4v.A06);
        return A0A;
    }

    public P4V(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        AbstractC167017dG.A1U(str4, str5);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A04 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A03 = str4;
        this.A05 = str5;
        this.A0B = z;
        this.A0A = z2;
        this.A09 = z3;
        this.A0C = z4;
        this.A0D = str6;
        this.A06 = str7;
        this.A00 = -1;
    }
}
