package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NCB extends AbstractC61132qb {
    public final UserSession A00;
    public final EnumC142806cg A01;

    public NCB(UserSession userSession, EnumC142806cg enumC142806cg) {
        C14360o3.A0B(enumC142806cg, 2);
        this.A00 = userSession;
        this.A01 = enumC142806cg;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C52817NZa A00 = AbstractC54266Nym.A00(this.A00, this.A01);
        return new C50884MeF((C54817OKs) A00.A07.getValue(), A00.A02(), AbstractC166987dD.A0y().A0X());
    }
}
