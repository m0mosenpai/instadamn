package X;

import com.instagram.common.session.UserSession;
import com.instagram.shopping.intf.ProductDetailsPageArguments;
import com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo;

/* loaded from: classes7.dex */
public abstract class IQ2 {
    public static final UserSession A00(C6FG c6fg, String str) {
        C14360o3.A0B(c6fg, 0);
        AbstractC12990ll A0A = C6BQ.A0A(c6fg);
        if (!(A0A instanceof UserSession)) {
            A0A = null;
        }
        String A0R = AnonymousClass001.A0R("Unable to get User Session for RenderUnit ", str);
        C14360o3.A0B(A0R, 1);
        if (A0A == null) {
            AbstractC25241Le.A02("CPDP_MVP", A0R);
        }
        return (UserSession) A0A;
    }

    public static final C41727Idy A01(C41121IIm c41121IIm, UserSession userSession, InterfaceC60442pS interfaceC60442pS, JI6 ji6, String str) {
        C14360o3.A0B(str, 3);
        ProductDetailsPageArguments productDetailsPageArguments = c41121IIm.A00;
        String str2 = productDetailsPageArguments.A0Q;
        String str3 = productDetailsPageArguments.A0H;
        String str4 = c41121IIm.A01;
        String str5 = c41121IIm.A02;
        ShoppingSearchLoggingInfo shoppingSearchLoggingInfo = productDetailsPageArguments.A05;
        return new C41727Idy(productDetailsPageArguments.A02, userSession, interfaceC60442pS, productDetailsPageArguments.A04, shoppingSearchLoggingInfo, ji6, str, str2, str3, str4, str5, "v0.1", productDetailsPageArguments.A0G);
    }
}
