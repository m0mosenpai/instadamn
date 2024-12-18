package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NCA extends AbstractC61132qb {
    public final UserSession A00;
    public final EnumC142806cg A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C147846l9 c147846l9;
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        UserSession userSession = this.A00;
        EnumC142806cg enumC142806cg = this.A01;
        AbstractC147826l7 A00 = c147836l8.A00(userSession, enumC142806cg);
        OLC A02 = A00.A02();
        MTU A03 = A00.A03();
        O97 o97 = null;
        if ((A00 instanceof C147846l9) && (c147846l9 = (C147846l9) A00) != null) {
            o97 = (O97) c147846l9.A03.getValue();
        }
        return new C50916Mel(enumC142806cg, o97, A02, A03, AbstractC109224vo.A04(userSession), AbstractC109224vo.A03(userSession));
    }

    public NCA(UserSession userSession, EnumC142806cg enumC142806cg) {
        AbstractC167017dG.A1P(userSession, enumC142806cg);
        this.A00 = userSession;
        this.A01 = enumC142806cg;
    }
}
