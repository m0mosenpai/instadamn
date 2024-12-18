package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bvz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27020Bvz extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    public C27020Bvz(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        return new C25860BcF((C27261C1e) userSession.A01(C27261C1e.class, new C37017GSy(userSession, 34)), this.A01);
    }
}
