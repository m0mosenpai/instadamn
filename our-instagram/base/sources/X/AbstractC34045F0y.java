package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.F0y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34045F0y {
    public static final void A00(Activity activity, C25814BbV c25814BbV, UserSession userSession, InterfaceC60442pS interfaceC60442pS, User user, InterfaceC37213GaO interfaceC37213GaO, String str, String str2, JSONObject jSONObject) {
        boolean A1b = AbstractC25233BEq.A1b(activity, c25814BbV, userSession);
        AbstractC25234BEr.A0k(3, str, user, interfaceC37213GaO, jSONObject);
        C14360o3.A0B(interfaceC60442pS, 8);
        C29418Cxp c29418Cxp = new C29418Cxp(c25814BbV, user, str, str2);
        C189448aO A0X = AbstractC31177DnL.A0X(userSession, A1b);
        A0X.A0x = A1b;
        A0X.A03 = 0.7f;
        A0X.A0U = new C29385CxI(c25814BbV, 0);
        C189478aR A0x = AbstractC25228BEl.A0x(activity, C3DN.A00);
        C28151Xt c28151Xt = C28151Xt.A02;
        if (c28151Xt != null && c28151Xt.A00() != null) {
            C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
            String moduleName = interfaceC60442pS.getModuleName();
            EnumC33371Ep4 enumC33371Ep4 = EnumC33371Ep4.A07;
            C14360o3.A0B(moduleName, 3);
            C35188Ffg.A01(activity, null, null, A01, userSession, A0x, A0X, user, interfaceC37213GaO, enumC33371Ep4, c29418Cxp, moduleName, null, jSONObject, false);
        }
    }
}
