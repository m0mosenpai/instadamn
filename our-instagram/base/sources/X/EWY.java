package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EWY extends AbstractC61132qb {
    public final UserSession A00;
    public final EnumC33379EpC A01;
    public final String A02;
    public final boolean A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C31810DyU(userSession, this.A01, AnonymousClass189.A00(userSession), this.A02, this.A03);
    }

    public EWY(UserSession userSession, EnumC33379EpC enumC33379EpC, String str, boolean z) {
        AbstractC167027dH.A13(userSession, str, enumC33379EpC);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = enumC33379EpC;
        this.A03 = z;
    }
}
