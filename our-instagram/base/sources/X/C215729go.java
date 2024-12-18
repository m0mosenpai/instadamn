package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;

/* renamed from: X.9go, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215729go extends AbstractC61132qb {
    public final Context A00;
    public final UserSession A01;

    public C215729go(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        QuickSnapRepository A00 = AbstractC191088d4.A00(userSession, C40121td.A0G.A01(this.A00, userSession));
        C14360o3.A0B(userSession, 0);
        return new C3CY(userSession, AbstractC191128dA.A00(userSession), (O8R) userSession.A01(O8R.class, new C25027B5z(userSession, 7)), A00);
    }
}
