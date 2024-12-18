package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Kmy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46803Kmy {
    public static final boolean A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, KT0 kt0, InterfaceC164967Zl interfaceC164967Zl) {
        C14360o3.A0B(kt0, 0);
        C14360o3.A0B(interfaceC164967Zl, 3);
        C45088JxI c45088JxI = kt0.A02;
        if (!AbstractC46806Kn1.A00(interfaceC164967Zl, kt0.BSy(), kt0.BCt()) && c45088JxI != null) {
            String str = c45088JxI.A04;
            EnumC40111tc enumC40111tc = c45088JxI.A01;
            String str2 = c45088JxI.A02;
            String str3 = c45088JxI.A06;
            boolean z = c45088JxI.A08;
            String str4 = c45088JxI.A03;
            ((InterfaceC165147a3) interfaceC164967Zl).CrG(enumC40111tc, str, str2, str3, str4, c45088JxI.A05, c45088JxI.A00, z);
            String str5 = c45088JxI.A07;
            C14360o3.A0B(str5, 2);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC11380iw, userSession, str4, 3), "coauthor_direct_invite_click");
            if (A0f.isSampled()) {
                AbstractC25236BEt.A0r(A0f, str5);
                A0f.AAK(C4SX.A00(str4), "media_owner_id");
                A0f.AAK(C4SX.A00(userSession.userId), AbstractC111324zv.A00(1894));
                A0f.Cht();
            }
        }
        return true;
    }
}
