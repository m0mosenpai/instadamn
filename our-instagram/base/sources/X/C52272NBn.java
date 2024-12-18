package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.NBn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52272NBn extends AbstractC61132qb {
    public final Context A00;
    public final UserSession A01;

    public C52272NBn(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        return new C50881MeC(AbstractC149796oY.A00(this.A00, userSession), userSession);
    }
}
