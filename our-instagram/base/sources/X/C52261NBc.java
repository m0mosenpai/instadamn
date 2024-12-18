package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NBc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52261NBc extends AbstractC61132qb {
    public final UserSession A00;

    public C52261NBc(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C147846l9 A00 = AbstractC147816l6.A00(this.A00);
        return new C50885MeG((O97) A00.A03.getValue(), A00.A02());
    }
}
