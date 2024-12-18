package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* loaded from: classes11.dex */
public abstract class WE1 {
    public static C19260xA A00(Hashtag hashtag) {
        C11520jB c11520jB = new C11520jB();
        if (hashtag != null) {
            A03(c11520jB, hashtag);
        }
        return c11520jB.A00();
    }

    public static void A02(C19280xC c19280xC, EnumC68206VFy enumC68206VFy, int i) {
        c19280xC.A07(AbstractC129005sL.A00, enumC68206VFy.toString());
        c19280xC.A0B("tab_index", Long.valueOf(i));
    }

    public static void A03(C11520jB c11520jB, Hashtag hashtag) {
        c11520jB.A04(AbstractC129005sL.A02, hashtag.getId());
        c11520jB.A04(AbstractC129005sL.A03, hashtag.getName());
        c11520jB.A04(AbstractC129005sL.A01, AbstractC1120253r.A02(hashtag));
    }

    public static void A01(C19280xC c19280xC, UserSession userSession) {
        C0x9 A00;
        C72603Nh c72603Nh;
        C55782hJ A002 = C55772hI.A00(userSession);
        String str = A002.A05;
        int i = 0;
        if (str != null && (c72603Nh = (C72603Nh) A002.A0L.get(str)) != null) {
            i = c72603Nh.A00;
        }
        c19280xC.A08(Integer.valueOf(i), AbstractC111324zv.A00(474));
        C55782hJ A003 = C55772hI.A00(userSession);
        String str2 = A003.A05;
        if (str2 == null) {
            A00 = null;
        } else {
            A00 = C55782hJ.A00(A003, str2);
        }
        c19280xC.A06(A00, "nav_stack");
    }
}
