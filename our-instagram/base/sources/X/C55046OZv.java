package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.OZv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55046OZv {
    public static final C55046OZv A00 = new Object();

    public final void A01(Activity activity, Bundle bundle, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC60442pS interfaceC60442pS, OUJ ouj, String str) {
        AbstractC167027dH.A12(activity, userSession, str);
        String str2 = ouj.A01;
        String str3 = ouj.A05;
        String str4 = ouj.A00;
        if (str2 != null) {
            Intent intent = new Intent(AbstractC111324zv.A00(727));
            intent.setData(AbstractC08820cl.A03(str2));
            C12260kU.A0E(activity, intent);
        } else if (str4 != null) {
            A00(bundle, userSession, interfaceC60442pS, str, str4);
            C12260kU.A0G(activity, AbstractC25227BEk.A0B(str4));
        } else {
            if (str3 == null) {
                return;
            }
            A00(bundle, userSession, interfaceC60442pS, str, str3);
            C63397SjR c63397SjR = new C63397SjR(activity, userSession, C2Fb.A2D, AbstractC08820cl.A03(str3).toString(), false);
            c63397SjR.A0S = interfaceC11380iw.getModuleName();
            c63397SjR.A0A();
        }
    }

    public static final void A00(Bundle bundle, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        int i = bundle.getInt("carouselIndex");
        int i2 = bundle.getInt("mediaPosition");
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, str);
        if (A0h != null) {
            Integer valueOf = Integer.valueOf(i);
            C5SE c5se = new C5SE(userSession, A0h);
            c5se.A00 = i;
            c5se.A01 = i2;
            C32U.A04(null, null, null, null, userSession, c5se, A0h, interfaceC60442pS, null, null, null, null, null, null, null, null, valueOf, null, null, "lead_confirmation_page", "webclick", str2, null, null, null, null, null, i2);
        }
    }
}
