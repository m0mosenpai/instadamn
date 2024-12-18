package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NCk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52295NCk extends AbstractC61132qb {
    public final float A00;
    public final UserSession A01;
    public final EnumC142806cg A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        UserSession userSession = this.A01;
        return new C50925Meu(c147836l8.A00(userSession, this.A02).A03(), this.A00, AbstractC109224vo.A03(userSession));
    }

    public C52295NCk(UserSession userSession, EnumC142806cg enumC142806cg, float f) {
        AbstractC167017dG.A1P(userSession, enumC142806cg);
        this.A01 = userSession;
        this.A02 = enumC142806cg;
        this.A00 = f;
    }
}
