package X;

import android.content.Context;
import com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.6Qi, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6Qi {
    public static final void A00(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC60442pS, 3);
        C82713mZ A04 = AbstractC82703mY.A04(c38321qM, interfaceC60442pS, "gesture");
        A04.A0G(userSession, c38321qM);
        A04.A7A = "bottom_sheet";
        A04.A7T = str;
        C32U.A0H(userSession, A04, interfaceC60442pS);
    }

    public static final boolean A01(Context context, UserSession userSession, C38321qM c38321qM, int i) {
        InterfaceC104894o0 BG6;
        EnumC906041v enumC906041v;
        AndroidLink A02 = AbstractC905941u.A02(context, userSession, c38321qM, i, false);
        InterfaceC39541sb injected = c38321qM.A0C.getInjected();
        if (injected == null || (BG6 = injected.BG6()) == null) {
            return false;
        }
        if (A02 != null) {
            enumC906041v = AbstractC114965Hm.A01(A02);
        } else {
            enumC906041v = null;
        }
        if (enumC906041v != EnumC906041v.AD_DESTINATION_WEB || BG6.BG7() == IGPBIAProfileBrowseTypeEnum.A04 || !C18U.A06(C06090Tz.A06, userSession, 36318818980665860L)) {
            return false;
        }
        return true;
    }
}
