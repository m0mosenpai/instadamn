package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NC3 extends AbstractC61132qb {
    public final Context A00;
    public final UserSession A01;

    public NC3(UserSession userSession, Context context) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = context;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        Context context = this.A00;
        AbstractC167017dG.A1N(userSession, context);
        return new C50893MeO(new HYH(userSession, context));
    }
}
