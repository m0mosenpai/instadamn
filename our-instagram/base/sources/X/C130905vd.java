package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.5vd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130905vd {
    public final void A01(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C41551w4 c41551w4, C1PZ c1pz, Integer num, String str, String str2, String str3, int i, int i2, boolean z) {
        C14360o3.A0B(c41551w4, 2);
        C14360o3.A0B(num, 9);
        C82713mZ c82713mZ = new C82713mZ(A00(userSession, c41551w4, str2, str3), interfaceC60442pS, AnonymousClass001.A0R("instagram_netego_", str));
        c82713mZ.A48 = Long.valueOf(c1pz.A09);
        c82713mZ.A06(c1pz.A01);
        c82713mZ.A49 = Long.valueOf(c1pz.A0A);
        c82713mZ.A0A(c1pz.A04);
        Reel reel = c41551w4.A0H;
        c82713mZ.A0O(reel.A0b);
        c82713mZ.A45 = Long.valueOf(reel.A01);
        c82713mZ.A4D = Long.valueOf(i);
        c82713mZ.A4E = Long.valueOf(c1pz.A02);
        c82713mZ.A0Q = i2;
        c82713mZ.A2x = num;
        c82713mZ.A1q = Boolean.valueOf(c1pz.A0H);
        c82713mZ.A20 = Boolean.valueOf(z);
        Integer num2 = C05F.A00;
        Integer num3 = c1pz.A0C;
        if (num2 == num3) {
            c82713mZ.A0G = c1pz.A03;
            c82713mZ.A87 = c1pz.A00();
        } else if (C05F.A01 == num3) {
            c82713mZ.A08 = c1pz.A03;
            if (!c1pz.A00().isEmpty()) {
                c82713mZ.A7W = (String) c1pz.A00().get(0);
            }
        }
        C3R6.A06(c82713mZ, reel);
        C32U.A0I(userSession, c82713mZ, interfaceC60442pS, C05F.A01);
    }

    public static final C130915ve A00(UserSession userSession, C41551w4 c41551w4, String str, String str2) {
        return new C130915ve(userSession, c41551w4.A0H, str, str2, c41551w4.A01, c41551w4.A0E);
    }
}
