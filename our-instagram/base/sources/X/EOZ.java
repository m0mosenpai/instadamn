package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EOZ extends C69503VpY {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public EOZ(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
    }

    @Override // X.C69503VpY
    public final void A00(UserSession userSession) {
        if (this.A00 != 0) {
            C32547EUx c32547EUx = (C32547EUx) this.A01;
            if (userSession == null) {
                userSession = (UserSession) this.A03;
            }
            c32547EUx.A03(userSession, (User) this.A02);
            return;
        }
        AbstractC31525Dt9.A04((Activity) this.A01, (android.net.Uri) this.A03, (InterfaceC11380iw) this.A02, userSession);
    }
}
