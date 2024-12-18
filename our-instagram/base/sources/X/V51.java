package X;

import android.content.Context;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V51 extends AbstractC61132qb {
    public final Context A00;
    public final PromoteData A01;
    public final PromoteState A02;
    public final UserSession A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new UFN(this.A00, this.A01, this.A02, this.A03);
    }

    public V51(Context context, PromoteData promoteData, PromoteState promoteState, UserSession userSession) {
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = promoteData;
        this.A02 = promoteState;
    }
}
