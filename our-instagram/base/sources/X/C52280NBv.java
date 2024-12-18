package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NBv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52280NBv extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    public C52280NBv(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50890MeL(this.A00, this.A01);
    }
}
