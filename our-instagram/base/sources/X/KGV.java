package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGV extends AbstractC61132qb {
    public final Activity A00;
    public final Context A01;
    public final AbstractC018607g A02;
    public final UserSession A03;

    public KGV(Activity activity, Context context, AbstractC018607g abstractC018607g, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = context;
        this.A00 = activity;
        this.A02 = abstractC018607g;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A03;
        return new C44535Jmf(this.A00, this.A02, userSession, new C47541Kz9(userSession, this.A01));
    }
}
