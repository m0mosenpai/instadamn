package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class I28 {
    public static final void A00(Context context, View view, EnumC71343Hv enumC71343Hv, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        C71313Hs.A00(userSession).A05(view, enumC71343Hv);
        C71313Hs A00 = C71313Hs.A00(userSession);
        InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) interfaceC11380iw;
        C75113Zb c75113Zb = new C75113Zb();
        if (c38321qM.A5M()) {
            c75113Zb.A0B(0);
        }
        A00.A0A(view, new C79623hD(new C86933u7(context, c75113Zb, userSession, c38321qM), userSession, c38321qM, interfaceC60442pS));
    }
}
