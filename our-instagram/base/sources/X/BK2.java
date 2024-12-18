package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes5.dex */
public final class BK2 implements InterfaceC30931Dil {
    public final List A00 = AbstractC166987dD.A1E();
    public final BK3 A01;

    @Override // X.InterfaceC30931Dil
    public final void ED3(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, C57112jm c57112jm, int i) {
        C14360o3.A0B(c57112jm, 0);
        AbstractC167027dH.A13(view, c120985dq, c37644Ghd);
    }

    public BK2(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A01 = new BK3(userSession, interfaceC60442pS);
    }
}
