package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NCl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52296NCl extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final EnumC142806cg A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        UserSession userSession = this.A01;
        EnumC142806cg enumC142806cg = this.A02;
        AbstractC147826l7 A00 = c147836l8.A00(userSession, enumC142806cg);
        return new C50958MfR(this.A00, userSession, enumC142806cg, A00.A01(), A00.A04, A00.A03());
    }

    public C52296NCl(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC142806cg enumC142806cg) {
        AbstractC167017dG.A1Q(userSession, enumC142806cg);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = enumC142806cg;
    }
}
