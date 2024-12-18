package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NCn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52298NCn extends AbstractC61132qb {
    public final UserSession A00;
    public final EnumC142806cg A01;
    public final boolean A02;

    public C52298NCn(UserSession userSession, EnumC142806cg enumC142806cg, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = enumC142806cg;
        this.A02 = z;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        UserSession userSession = this.A00;
        EnumC142806cg enumC142806cg = this.A01;
        AbstractC147826l7 A00 = c147836l8.A00(userSession, enumC142806cg);
        return new C50971Mfe(userSession, enumC142806cg, (C54817OKs) A00.A07.getValue(), A00.A01(), A00.A04, A00.A02(), A00.A03(), AbstractC109224vo.A06(userSession, enumC142806cg, true, this.A02), AbstractC109224vo.A04(userSession), C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36326017345795640L));
    }
}
