package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NC9 extends AbstractC61132qb {
    public final Context A00;
    public final UserSession A01;

    public NC9(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Context context = this.A00;
        UserSession userSession = this.A01;
        return new C31824Dyi(context, userSession, AbstractC63302u8.A00(userSession));
    }
}
