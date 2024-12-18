package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingNavigationInfo;

/* loaded from: classes7.dex */
public final class IHF {
    public final C57112jm A00;
    public final C63622uj A01;
    public final C39124HJw A02;

    public IHF(C38678GzJ c38678GzJ, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, ShoppingNavigationInfo shoppingNavigationInfo, String str) {
        AbstractC167017dG.A1Q(userSession, c57112jm);
        this.A00 = c57112jm;
        this.A01 = new C63622uj();
        this.A02 = new C39124HJw(c38678GzJ, interfaceC11380iw, AbstractC37302Gc3.A0J(userSession), userSession, shoppingNavigationInfo, str);
    }
}
