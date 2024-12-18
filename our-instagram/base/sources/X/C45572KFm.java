package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KFm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45572KFm extends AbstractC61132qb {
    public final UserSession A00;

    public C45572KFm(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Kns, java.lang.Object] */
    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C47382KwX c47382KwX = new C47382KwX(userSession);
        ?? obj = new Object();
        C14360o3.A0B(userSession, 0);
        Context A0F = AbstractC25225BEi.A0F(userSession);
        return new C44551Jmv(userSession, obj, c47382KwX, (C7Ef) userSession.A01(C49299Lqt.class, new MEB(22, A0F, new C50363MLp(47, A0F, userSession), userSession, C40121td.A0G.A01(A0F, userSession), C7FC.A00(userSession))));
    }
}
