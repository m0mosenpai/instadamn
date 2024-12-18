package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GET implements GYB {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final FLA A02;

    public GET(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(abstractC59962oe, 1);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A02 = new FLA(abstractC59962oe, userSession);
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        FLA fla = this.A02;
        fla.A00 = new GSi(fla, 3);
        AbstractC35216Fg9.A02(fla.A02, fla, 19);
    }
}
