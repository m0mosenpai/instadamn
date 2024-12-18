package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HHO extends AbstractC61132qb {
    public final Context A00;
    public final UserSession A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50878Me9(AbstractC166987dD.A0O(this.A00), this.A01);
    }

    public HHO(UserSession userSession, Context context) {
        AbstractC167017dG.A1P(userSession, context);
        this.A01 = userSession;
        this.A00 = context;
    }
}
