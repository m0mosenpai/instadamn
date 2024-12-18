package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.F0b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34022F0b {
    public static final void A00(UserSession userSession, InterfaceC60442pS interfaceC60442pS, User user, Integer num, String str, String str2) {
        int i;
        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, AbstractC111324zv.A00(4171));
        c82713mZ.A4Q = userSession.userId;
        c82713mZ.A7K = user.getId();
        switch (num.intValue()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }
        c82713mZ.A0F = i;
        c82713mZ.A62 = str;
        if (str2 != null) {
            c82713mZ.A61 = str;
            c82713mZ.A7Q = str2;
        }
        if (!C5I7.A00(userSession, c82713mZ, interfaceC60442pS, C05F.A01)) {
            AbstractC31173DnH.A1S(c82713mZ.A00(), userSession);
        }
    }
}
