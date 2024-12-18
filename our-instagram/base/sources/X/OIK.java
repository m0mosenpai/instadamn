package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OIK {
    public final UserSession A00;
    public final C40701ud A01;
    public final String A02;

    public OIK(UserSession userSession, C40701ud c40701ud, String str) {
        C14360o3.A0B(c40701ud, 2);
        this.A00 = userSession;
        this.A01 = c40701ud;
        this.A02 = str;
    }

    public final InterfaceC19390xP A00() {
        UserSession userSession = this.A00;
        String str = this.A02;
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        String A00 = AbstractC43591JPw.A00(323);
        A0q.A06();
        String A0g = AnonymousClass001.A0g("creators/", A00, "async_get_content_appreciation_settings/");
        C14360o3.A07(A0g);
        A0q.A0E = A0g;
        A0q.A0R(H8U.class, INu.class);
        C1ON A0T = AbstractC31172DnG.A0T(A0q, AbstractC50529MSi.A01(), str);
        C14360o3.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.ContentAppreciationSettingsResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.ContentAppreciationSettingsResponse>>");
        return JX4.A04(new MBr(this, null, 35), JX4.A00(new MCC(2, null), JX4.A01(new MCC(1, null), A0T.A03(909209444))));
    }
}
