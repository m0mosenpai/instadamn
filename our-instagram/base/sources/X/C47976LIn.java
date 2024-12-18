package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.LIn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47976LIn {
    public final UserSession A00;

    public final void A02(EnumC46242KdI enumC46242KdI, DirectThreadKey directThreadKey, Integer num, String str, String str2, String str3) {
        Integer num2;
        AbstractC25229BEm.A1I(str, 3, str3);
        boolean A1X = AbstractC167007dF.A1X(enumC46242KdI, EnumC46242KdI.A05);
        boolean A1X2 = AbstractC167007dF.A1X(enumC46242KdI, EnumC46242KdI.A04);
        String str4 = directThreadKey.A00;
        C60I c60i = C60H.A02;
        UserSession userSession = this.A00;
        c60i.A00(userSession, userSession.userId, new MM1(this, str2, str, "Removed", str4, A1X2, A1X));
        if (C18U.A06(C06090Tz.A05, userSession, 2342161871148227240L)) {
            String str5 = userSession.userId;
            Integer num3 = C05F.A01;
            C43735JVu c43735JVu = new C43735JVu(directThreadKey, Boolean.valueOf(A1X), Boolean.valueOf(A1X2), num3, str, str5, str3, str2);
            C43724JVj c43724JVj = (C43724JVj) AbstractC43605JQl.A00.getValue();
            if (num == num3) {
                num2 = C05F.A0N;
            } else {
                num2 = C05F.A0C;
            }
            C43724JVj.A02(userSession, c43735JVu, c43724JVj, num2);
        }
    }

    public final void A03(C83403nh c83403nh, C2ED c2ed, L0J l0j) {
        String A0h;
        C44920JuY c44920JuY;
        C14360o3.A0B(c2ed, 0);
        String C7I = c2ed.C7I();
        if (c83403nh.A1S()) {
            A0h = c83403nh.A0g();
        } else {
            A0h = c83403nh.A0h();
        }
        A00(c83403nh, this, C7I, A0h, "Insert");
        if (A01(c83403nh, this)) {
            if (l0j instanceof C46029KYu) {
                c44920JuY = ((C46029KYu) l0j).A00;
            } else {
                c44920JuY = null;
            }
            C43724JVj c43724JVj = (C43724JVj) AbstractC43605JQl.A00.getValue();
            UserSession userSession = this.A00;
            C43724JVj.A02(userSession, new C43735JVu(c44920JuY, c83403nh, c2ed, C05F.A01, userSession.userId), c43724JVj, C05F.A00);
        }
    }

    public static final void A00(C83403nh c83403nh, C47976LIn c47976LIn, String str, String str2, String str3) {
        boolean z = c83403nh.A2P;
        boolean A1T = c83403nh.A1T();
        String str4 = c83403nh.A1h;
        C60I c60i = C60H.A02;
        UserSession userSession = c47976LIn.A00;
        c60i.A00(userSession, userSession.userId, new MM1(c47976LIn, str4, str2, str3, str, A1T, z));
    }

    public static final boolean A01(C83403nh c83403nh, C47976LIn c47976LIn) {
        UserSession userSession = c47976LIn.A00;
        InterfaceC09390do interfaceC09390do = AbstractC43605JQl.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36320326514254190L) && ((!c83403nh.A2P || !C18U.A06(c06090Tz, userSession, 36320326514188653L)) && ((!c83403nh.A1T() || !C18U.A06(c06090Tz, userSession, 36320326514319727L)) && !C18U.A06(c06090Tz, userSession, 36320326514450801L)))) {
            return false;
        }
        return true;
    }

    public C47976LIn(UserSession userSession) {
        this.A00 = userSession;
    }
}
