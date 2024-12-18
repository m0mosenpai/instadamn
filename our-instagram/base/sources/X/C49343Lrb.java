package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Lrb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49343Lrb implements MQ6 {
    @Override // X.MQ6
    public final void ADY(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C45093JxN c45093JxN, C49574LvT c49574LvT, C47424KxF c47424KxF) {
        C14360o3.A0B(context, 0);
        AbstractC25233BEq.A0v(1, c47424KxF, c45093JxN, userSession);
        List list = c45093JxN.A0P;
        L5Y l5y = c47424KxF.A00;
        ArrayList A00 = AbstractC141386aH.A00(context, userSession, l5y.A0K, l5y.A0R, list, false);
        if (A00.size() > 1) {
            l5y.A0Q.A05(userSession, A00);
        }
    }

    @Override // X.MQ6
    public final boolean AFU(Context context, UserSession userSession, C45093JxN c45093JxN) {
        C14360o3.A0B(c45093JxN, 1);
        C101594hU c101594hU = c45093JxN.A07;
        if (c101594hU != null) {
            return AbstractC141386aH.A01(c101594hU.A00);
        }
        return false;
    }
}
