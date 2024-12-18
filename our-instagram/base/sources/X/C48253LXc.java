package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LXc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48253LXc implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "BrandedContentCampaignRepository";
    public final UserSession A00;
    public final C40701ud A01;
    public final InterfaceC19630xq A02;
    public final C05A A03;
    public final C05A A04;
    public final C0UO A05;
    public final C0UO A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public C48253LXc(UserSession userSession, C40701ud c40701ud, InterfaceC19630xq interfaceC19630xq) {
        this.A00 = userSession;
        this.A01 = c40701ud;
        this.A02 = interfaceC19630xq;
        C008002u A1H = AbstractC25225BEi.A1H(new C51758Mth(null, 3, 10, false));
        this.A04 = A1H;
        this.A06 = AbstractC208910l.A02(A1H);
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A03 = A1A;
        this.A05 = AbstractC208910l.A02(A1A);
    }
}
