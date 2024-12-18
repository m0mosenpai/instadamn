package X;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IeB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41739IeB {
    public static int A00;
    public static final C41739IeB A01 = new Object();

    public static final void A02(C38521Gwh c38521Gwh, int i, int i2) {
        AbstractC37302Gc3.A0r(c38521Gwh.A0E, i, i2);
        AbstractC37302Gc3.A0r(c38521Gwh.A0H, i, i2);
    }

    public static final C09530e4 A00(UserSession userSession, C38321qM c38321qM, C38521Gwh c38521Gwh, int i, int i2) {
        float A0m = c38321qM.A0m();
        if (c38321qM.Cff() || (c38321qM.A5x() && C18U.A06(C06090Tz.A05, userSession, 2342155883966498221L))) {
            C06090Tz c06090Tz = C06090Tz.A06;
            if (A0m <= ((float) C18U.A00(c06090Tz, userSession, 37157299682345006L)) && C18U.A06(c06090Tz, userSession, 2342155883965842854L)) {
                if (!C18U.A06(c06090Tz, userSession, 2342155883965973927L)) {
                    c38521Gwh.A05.setBackgroundColor(Color.parseColor(c38321qM.A0C.getDominantColor()));
                }
                i = (int) (i * 0.8d);
                return AbstractC166987dD.A1L(Integer.valueOf(i), Integer.valueOf(i2));
            }
        }
        if (c38321qM.A0m() >= C18U.A00(C06090Tz.A06, userSession, 37157299683328047L) && C18U.A06(C06090Tz.A05, userSession, 2342155883966956979L)) {
            AbstractC37302Gc3.A0r(c38521Gwh.A05, i, i2);
            i2 = (int) (i2 / c38321qM.A0m());
        }
        return AbstractC166987dD.A1L(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static final void A01(Context context, View view, EnumC71343Hv enumC71343Hv, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        C71313Hs.A00(userSession).A05(view, enumC71343Hv);
        C71313Hs A002 = C71313Hs.A00(userSession);
        InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) interfaceC11380iw;
        C75113Zb c75113Zb = new C75113Zb();
        if (c38321qM.A5M()) {
            c75113Zb.A0B(0);
        }
        A002.A0A(view, new C79623hD(new C86933u7(context, c75113Zb, userSession, c38321qM), userSession, c38321qM, interfaceC60442pS));
    }
}
