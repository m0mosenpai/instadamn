package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.3u6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC86923u6 {
    public static final void A00(Context context, View view, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 3);
        C14360o3.A0B(c75113Zb, 4);
        C14360o3.A0B(interfaceC60442pS, 5);
        C71313Hs A00 = C71313Hs.A00(userSession);
        C14360o3.A07(A00);
        if (c38321qM.A5M()) {
            if (!c38321qM.A4m()) {
                A00.A06(view, EnumC71343Hv.A05, c75113Zb.A03);
            }
        } else {
            A00.A05(view, EnumC71343Hv.A05);
        }
        A00.A0A(view, new C79623hD(new C86933u7(context, c75113Zb, userSession, c38321qM), userSession, c38321qM, interfaceC60442pS));
    }
}
