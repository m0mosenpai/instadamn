package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HHZ extends AbstractC61132qb {
    public final Context A00;
    public final AbstractC018607g A01;
    public final UserSession A02;
    public final C39325HYq A03;

    public HHZ(Context context, AbstractC018607g abstractC018607g, UserSession userSession, C39325HYq c39325HYq) {
        AbstractC167007dF.A1F(userSession, 1, c39325HYq);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = abstractC018607g;
        this.A03 = c39325HYq;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C38328GtN(this.A00, this.A01, this.A02, this.A03);
    }
}
