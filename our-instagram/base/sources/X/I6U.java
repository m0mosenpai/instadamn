package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;

/* loaded from: classes7.dex */
public abstract class I6U {
    public static final C1ON A00(UserSession userSession, FeaturedProductPermissionStatus featuredProductPermissionStatus, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(str, 1);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("commerce/community/featured_products/permission_update/");
        A0c.A9s("permission_id", str);
        A0c.A9s("permission_status", featuredProductPermissionStatus.A00);
        C1ON A0e = AbstractC25227BEk.A0e(A0c, HAE.class, ISQ.class);
        A0e.A00 = new C39028HGe(interfaceC16820sZ, userSession, interfaceC16660sJ, str, 3);
        return A0e;
    }
}
