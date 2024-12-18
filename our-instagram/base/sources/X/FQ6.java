package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FQ6 {
    public final EN0 A00;
    public final Context A01;
    public final AbstractC018607g A02;
    public final UserSession A03;

    public final void A00() {
        C25621Ms A0M = AbstractC31177DnL.A0M(this.A03);
        A0M.A0B("commerce/purchase_protection/");
        A0M.A0R(EC6.class, C34843FXa.class);
        Context context = this.A01;
        AbstractC018607g abstractC018607g = this.A02;
        C1ON A0N = A0M.A0N();
        C31714DwJ.A00(A0N, this, 4);
        C1GJ.A00(context, abstractC018607g, A0N);
    }

    public FQ6(Context context, AbstractC018607g abstractC018607g, UserSession userSession, EN0 en0) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = abstractC018607g;
        this.A00 = en0;
    }
}
