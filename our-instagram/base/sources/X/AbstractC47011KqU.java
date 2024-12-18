package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KqU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47011KqU {
    public static void A00(UserSession userSession, C31191eO c31191eO, C2r0 c2r0, InterfaceC83713oG interfaceC83713oG, String str, String str2, int i, boolean z) {
        String str3 = str2;
        if ((interfaceC83713oG == null || C4GR.A06(i)) && !c2r0.A05(((C1OW) c31191eO).A05)) {
            String A06 = c31191eO.A06();
            if (str2 == null) {
                str3 = c31191eO.A04.A03();
            }
            if (str != null && str.length() != 0 && !str.equals("0")) {
                new C7M5(userSession).A03(interfaceC83713oG, A06, str, str3, z);
                if (c2r0.A01.get(str3) != null) {
                    AbstractC47012KqV.A00(userSession).A00(null, str3);
                }
            }
        }
    }
}
