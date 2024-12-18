package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P4W implements InterfaceC58268PsC {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final Long A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r5 == null) goto L6;
     */
    @Override // X.InterfaceC58268PsC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ci4(android.os.Bundle r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r8 = this;
            r0 = 3
            X.C14360o3.A0B(r13, r0)
            r1 = 0
            if (r9 == 0) goto L86
            java.lang.String r0 = "form_id"
            java.lang.String r6 = r9.getString(r0)
            java.lang.String r0 = "is_standard_form"
            boolean r7 = r9.getBoolean(r0)
            java.lang.String r0 = "question_type"
            java.lang.String r5 = r9.getString(r0)
            if (r5 != 0) goto L1d
        L1b:
            java.lang.String r5 = ""
        L1d:
            com.instagram.common.session.UserSession r3 = r8.A01
            X.0iw r0 = r8.A00
            X.0wW r2 = X.AbstractC12220kQ.A01(r0, r3)
            java.lang.String r0 = "ig_lead_gen_organic_consumer"
            X.0Ai r2 = X.AbstractC166987dD.A0f(r2, r0)
            r0 = 228(0xe4, float:3.2E-43)
            X.1Mh r4 = X.AbstractC31171DnF.A0A(r2, r0)
            X.AbstractC50524MSc.A0F(r4, r11, r12, r13)
            java.lang.String r0 = r8.A04
            X.AbstractC50523MSb.A13(r4, r3, r0)
            java.lang.String r0 = X.AbstractC50522MSa.A0k(r3)
            if (r0 == 0) goto L83
            java.lang.Long r0 = X.AbstractC166997dE.A0j(r0)
            if (r0 == 0) goto L83
            long r2 = r0.longValue()
        L49:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "consumer_ig_user_fbidv2"
            r4.A0Q(r0, r2)
            java.lang.Long r2 = r8.A02
            java.lang.String r0 = "business_ig_user_fbidv2"
            r4.A0Q(r0, r2)
            java.lang.String r0 = r8.A03
            r3 = 10
            java.lang.Long r2 = X.AbstractC003100w.A0k(r3, r0)
            java.lang.String r0 = "business_ig_user_id"
            r4.A0Q(r0, r2)
            if (r6 == 0) goto L6c
            java.lang.Long r1 = X.AbstractC003100w.A0k(r3, r6)
        L6c:
            java.lang.String r0 = "lead_form_id"
            r4.A0Q(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "is_generic_form"
            r4.A0O(r0, r1)
            java.lang.String r0 = "question_type"
            r4.A0R(r0, r5)
            r4.Cht()
            return
        L83:
            r2 = 0
            goto L49
        L86:
            r6 = r1
            r7 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P4W.Ci4(android.os.Bundle, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final C25531Mh A00(P4W p4w, String str, String str2) {
        long j;
        Long A0j;
        UserSession userSession = p4w.A01;
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A01(p4w.A00, userSession), "ig_lead_gen_organic_consumer"), 228);
        AbstractC50524MSc.A0F(A0A, "lead_gen_consumer", str, str2);
        AbstractC50523MSb.A13(A0A, userSession, p4w.A04);
        String A0k = AbstractC50522MSa.A0k(userSession);
        if (A0k != null && (A0j = AbstractC166997dE.A0j(A0k)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        A0A.A0Q("consumer_ig_user_fbidv2", Long.valueOf(j));
        A0A.A0Q("business_ig_user_fbidv2", p4w.A02);
        A0A.A0Q("business_ig_user_id", AbstractC166997dE.A0j(p4w.A03));
        return A0A;
    }

    public static void A02(P4W p4w, String str, String str2, String str3, boolean z) {
        C25531Mh A00 = A00(p4w, str, "impression");
        A00.A0Q("lead_form_id", AbstractC003100w.A0k(10, str2));
        A00.A0R("question_type", str3);
        A00.A0O("is_generic_form", Boolean.valueOf(z));
        A00.Cht();
    }

    public P4W(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Long l, String str, String str2) {
        AbstractC167017dG.A1S(str, str2);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = l;
        this.A03 = str;
        this.A04 = str2;
    }

    public static void A01(P4W p4w, String str, String str2, String str3, boolean z) {
        C25531Mh A00 = A00(p4w, str, str2);
        A00.A0Q("lead_form_id", AbstractC003100w.A0k(10, str3));
        A00.A0O("is_generic_form", Boolean.valueOf(z));
        A00.Cht();
    }
}
