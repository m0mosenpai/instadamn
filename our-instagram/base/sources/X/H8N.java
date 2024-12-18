package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class H8N extends AbstractC37585Ggg {
    public final String A00;
    public final String A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final InterfaceC11380iw A05;
    public final C18920wW A06;
    public final UserSession A07;
    public final C41181vS A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    @Override // X.JI9
    public final void ClL(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A06, "instagram_ads_feedback_interface_response");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A0z(A0f, this.A03);
            AbstractC37585Ggg.A01(A0f, this, this.A04);
            AbstractC37585Ggg.A03(A0f, AbstractC25232BEp.A1F("is_product_tag_data_available", this.A09, A00(A0f, this), AbstractC166987dD.A1L("is_social_context_data_available", this.A0A)));
            A0f.AAP("answer_id", str);
            AbstractC37301Gc2.A11(A0f, this.A02);
            AbstractC37301Gc2.A19(A0f, this.A0B);
        }
    }

    @Override // X.JI9
    public final void CmG(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A06, "instagram_ads_feedback_interface_undo");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A0z(A0f, this.A03);
            AbstractC37585Ggg.A01(A0f, this, this.A04);
            AbstractC37585Ggg.A03(A0f, AbstractC25232BEp.A1F("is_product_tag_data_available", this.A09, A00(A0f, this), AbstractC166987dD.A1L("is_social_context_data_available", this.A0A)));
            A0f.AAP("answer_id", str);
            AbstractC37301Gc2.A11(A0f, this.A02);
            AbstractC37301Gc2.A19(A0f, this.A0B);
        }
    }

    public static C09530e4 A00(InterfaceC02590Ai interfaceC02590Ai, H8N h8n) {
        interfaceC02590Ai.AAP("afi_type", AFI_TYPE.A07.A00);
        interfaceC02590Ai.AAP("ad_tracking_token", h8n.A01);
        return new C09530e4("ads_category", h8n.A00);
    }

    @Override // X.JI9
    public final void Ck6() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A06, "instagram_ads_feedback_interface_impression");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A0z(A0f, this.A03);
            AbstractC37585Ggg.A01(A0f, this, this.A04);
            AbstractC37585Ggg.A03(A0f, AbstractC25232BEp.A1F("is_product_tag_data_available", this.A09, A00(A0f, this), AbstractC166987dD.A1L("is_social_context_data_available", this.A0A)));
            AbstractC37301Gc2.A11(A0f, this.A02);
            AbstractC37301Gc2.A19(A0f, this.A0B);
        }
    }

    @Override // X.JI9
    public final void Cm9(long j) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A06, "instagram_ads_feedback_interface_timespent");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A0z(A0f, this.A03);
            AbstractC37585Ggg.A01(A0f, this, this.A04);
            AbstractC37585Ggg.A03(A0f, AbstractC25232BEp.A1F("is_product_tag_data_available", this.A09, A00(A0f, this), AbstractC166987dD.A1L("is_social_context_data_available", this.A0A)));
            AbstractC37301Gc2.A11(A0f, this.A02);
            A0f.AAP("client_session_id", this.A0B);
            A0f.A8I("timespent", AbstractC37302Gc3.A0S(j));
            A0f.Cht();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r1 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public H8N(X.InterfaceC11380iw r4, com.instagram.common.session.UserSession r5, X.C41181vS r6, java.lang.String r7, long r8) {
        /*
            r3 = this;
            r3.<init>()
            r3.A07 = r5
            r3.A0B = r7
            r3.A05 = r4
            r3.A08 = r6
            X.0wW r0 = X.AbstractC37302Gc3.A0I(r4, r5)
            r3.A06 = r0
            X.1qM r2 = r6.A0b
            if (r2 == 0) goto L6e
            java.lang.String r0 = X.AbstractC41071vF.A07(r5, r2)
            if (r0 == 0) goto L6e
            java.lang.Long r0 = X.AbstractC166997dE.A0j(r0)
            if (r0 == 0) goto L6e
            long r0 = r0.longValue()
        L25:
            r3.A03 = r0
            java.lang.String r0 = X.AbstractC41071vF.A06(r5, r2)
            java.lang.String r1 = ""
            if (r0 != 0) goto L30
            r0 = r1
        L30:
            r3.A01 = r0
            if (r2 == 0) goto L3b
            java.lang.String r0 = r2.A2Y()
            if (r0 == 0) goto L3b
            r1 = r0
        L3b:
            r3.A00 = r1
            r3.A02 = r8
            if (r2 == 0) goto L50
            X.1rF r0 = r2.A0C
            X.3vo r0 = r0.BUx()
            if (r0 == 0) goto L50
            X.4sH r1 = r0.B7j()
            r0 = 1
            if (r1 != 0) goto L51
        L50:
            r0 = 0
        L51:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.A0A = r0
            java.lang.Boolean r0 = r6.A0N()
            boolean r0 = r0.booleanValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.A09 = r0
            java.lang.String r0 = r5.userId
            long r0 = java.lang.Long.parseLong(r0)
            r3.A04 = r0
            return
        L6e:
            r0 = 0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8N.<init>(X.0iw, com.instagram.common.session.UserSession, X.1vS, java.lang.String, long):void");
    }
}
