package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.3mY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82703mY {
    public static C82713mZ A00(Activity activity, UserSession userSession, InterfaceC38371qR interfaceC38371qR, InterfaceC60442pS interfaceC60442pS, Integer num, String str, String str2, String str3, String str4, String str5, int i, long j, boolean z) {
        C82713mZ A03 = A03(userSession, interfaceC38371qR, interfaceC60442pS, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
        A03.A6r = str;
        A03.A6Q = str2;
        A03.A00 = j;
        A03.A0T(Integer.valueOf(i));
        A03.A4m = str4;
        A03.A6h = str5;
        A03.A1W = Boolean.valueOf(z);
        A03.A11 = AnonymousClass729.A00(userSession).A00;
        A03.A6S = str3;
        if (!AbstractC75423a9.A02(interfaceC38371qR.BQN(), interfaceC60442pS) && activity != null) {
            A03.A0C(activity, userSession);
        }
        if (num != null) {
            A03.A08(num.intValue());
        }
        String str6 = C1QM.A00.A02.A00;
        if (str6 != null) {
            A03.A6C = str6;
        }
        return A03;
    }

    public static C82713mZ A03(UserSession userSession, InterfaceC38371qR interfaceC38371qR, InterfaceC60442pS interfaceC60442pS, String str) {
        if (interfaceC38371qR instanceof C38321qM) {
            C38321qM BQN = interfaceC38371qR.BQN();
            C82713mZ A04 = A04(BQN, interfaceC60442pS, str);
            A04.A0G(userSession, BQN);
            return A04;
        }
        if (interfaceC38371qR instanceof C40971v4) {
            C40971v4 c40971v4 = (C40971v4) interfaceC38371qR;
            C82713mZ A042 = A04(c40971v4, interfaceC60442pS, str);
            A042.A0K(userSession, c40971v4);
            return A042;
        }
        throw new IllegalArgumentException("Unsupported type of ModelWithMedia");
    }

    public static C82713mZ A01(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C40971v4 c40971v4, C1M1 c1m1, Integer num, String str) {
        if (!AbstractC75423a9.A00(c40971v4, interfaceC60442pS)) {
            return null;
        }
        C82713mZ A04 = A04(c40971v4, interfaceC60442pS, str);
        A04.A0I(userSession, c38321qM, c40971v4);
        if (num != null) {
            A04.A09(num.intValue());
        }
        if (c1m1 == null) {
            return A04;
        }
        A04.A70 = c1m1.getSessionId();
        return A04;
    }

    public static C82713mZ A02(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1, Integer num, Integer num2, String str) {
        if (!AbstractC75423a9.A00(c38321qM, interfaceC60442pS)) {
            return null;
        }
        C82713mZ A04 = A04(c38321qM, interfaceC60442pS, str);
        A04.A0G(userSession, c38321qM);
        if (num != null) {
            A04.A09(num.intValue());
        }
        if (num2 != null) {
            A04.A07 = num2.intValue();
        }
        if (c1m1 == null) {
            return A04;
        }
        A04.A70 = c1m1.getSessionId();
        return A04;
    }

    public static C82713mZ A04(C1NI c1ni, InterfaceC60442pS interfaceC60442pS, String str) {
        String str2;
        if (AbstractC75423a9.A02(c1ni, interfaceC60442pS)) {
            str2 = "instagram_ad_";
        } else {
            str2 = "instagram_organic_";
        }
        return new C82713mZ(interfaceC60442pS, AnonymousClass001.A0R(str2, str));
    }
}
