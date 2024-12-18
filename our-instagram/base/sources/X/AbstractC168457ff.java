package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7ff, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC168457ff {
    public static final Integer A00(EnumC168447fe enumC168447fe) {
        C14360o3.A0B(enumC168447fe, 0);
        int ordinal = enumC168447fe.ordinal();
        if (ordinal != 10) {
            if (ordinal != 11) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                    return C05F.A01;
                }
                return C05F.A00;
            }
            return C05F.A0N;
        }
        return C05F.A0C;
    }

    public static final void A01(Activity activity, C07T c07t, C51759Mti c51759Mti, C18920wW c18920wW, UserSession userSession, InterfaceC171787l8 interfaceC171787l8) {
        C14360o3.A0B(c07t, 0);
        C14360o3.A0B(c51759Mti, 1);
        C14360o3.A0B(c18920wW, 3);
        A02(activity, c07t, c18920wW, userSession, (C38321qM) c51759Mti.A00, interfaceC171787l8, (Integer) c51759Mti.A01, C16930sl.A00);
    }

    public static final void A02(Activity activity, C07T c07t, C18920wW c18920wW, UserSession userSession, C38321qM c38321qM, InterfaceC171787l8 interfaceC171787l8, Integer num, List list) {
        C14360o3.A0B(num, 1);
        C14360o3.A0B(list, 3);
        C14360o3.A0B(c38321qM, 4);
        C24205AoS c24205AoS = new C24205AoS(interfaceC171787l8);
        boolean z = false;
        C3DN A00 = C3DN.A00.A00(activity);
        if (A00 != null && ((C3DP) A00).A0h) {
            z = true;
        }
        C57312k6 A002 = AbstractC57302k5.A00(c07t);
        C9DX c9dx = new C9DX(activity, c18920wW, userSession, null, c38321qM, interfaceC171787l8, c24205AoS, num, list, null, z);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dx, A002);
    }

    public static final boolean A03(EnumC168447fe enumC168447fe) {
        C14360o3.A0B(enumC168447fe, 0);
        return AbstractC16960so.A1Q(EnumC168447fe.A0C, EnumC168447fe.A0B, EnumC168447fe.A0G, EnumC168447fe.A0F, EnumC168447fe.A09, EnumC168447fe.A0A, EnumC168447fe.A0E, EnumC168447fe.A07).contains(enumC168447fe);
    }
}
