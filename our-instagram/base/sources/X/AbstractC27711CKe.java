package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.model.WallLaunchConfig;

/* renamed from: X.CKe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27711CKe {
    public static final C26763Brk A00(UserSession userSession, WallLaunchConfig wallLaunchConfig) {
        C14360o3.A0B(userSession, 0);
        C26763Brk c26763Brk = new C26763Brk();
        Bundle A00 = AbstractC61636Rr0.A00(AbstractC25230BEn.A1b(AbstractC111324zv.A00(1931), wallLaunchConfig));
        AbstractC60492pY.A04(A00, userSession);
        c26763Brk.setArguments(A00);
        return c26763Brk;
    }
}
