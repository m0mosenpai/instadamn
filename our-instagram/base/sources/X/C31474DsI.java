package X;

import com.instagram.avatars.graphql.AvatarCustomizationOptionsRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.DsI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31474DsI extends AbstractC61132qb {
    public final UserSession A00;

    public C31474DsI(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        EnumC143276dS enumC143276dS;
        String str;
        AvatarCustomizationOptionsRepository avatarCustomizationOptionsRepository;
        UserSession userSession = this.A00;
        C149736oQ c149736oQ = EnumC143276dS.A01;
        EnumC143286dT enumC143286dT = EnumC143286dT.A0E;
        if (AbstractC31248DoW.A00(userSession)) {
            enumC143276dS = EnumC143276dS.A0C;
        } else {
            enumC143276dS = EnumC143276dS.A0B;
        }
        String A00 = c149736oQ.A00(enumC143276dS, enumC143286dT, userSession, false);
        C14360o3.A0B(userSession, 0);
        AvatarCustomizationOptionsRepository avatarCustomizationOptionsRepository2 = AbstractC33575Esn.A00;
        if (avatarCustomizationOptionsRepository2 != null) {
            str = avatarCustomizationOptionsRepository2.A02;
        } else {
            str = null;
        }
        if (!C14360o3.A0K(str, A00) || (avatarCustomizationOptionsRepository = AbstractC33575Esn.A00) == null) {
            avatarCustomizationOptionsRepository = new AvatarCustomizationOptionsRepository(userSession, A00);
            AbstractC33575Esn.A00 = avatarCustomizationOptionsRepository;
        }
        return new C31475DsJ(avatarCustomizationOptionsRepository, userSession);
    }
}
