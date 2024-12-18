package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HHY extends AbstractC61132qb {
    public final Context A00;
    public final AbstractC018607g A01;
    public final UserSession A02;
    public final C39324HYp A03;

    public HHY(Context context, AbstractC018607g abstractC018607g, UserSession userSession, C39324HYp c39324HYp) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = abstractC018607g;
        this.A03 = c39324HYp;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C38323GtI(this.A00, this.A01, this.A02, this.A03);
    }
}
