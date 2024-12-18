package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FDG {
    public static final void A00(UserSession userSession, String str, InterfaceC16820sZ interfaceC16820sZ) {
        Long A0k;
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "igwb_screenshot_capture");
        Object invoke = interfaceC16820sZ.invoke();
        if (invoke != null) {
            EnumC33366Eoz enumC33366Eoz = EnumC33366Eoz.A03;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (invoke == enumC33366Eoz) {
                if (!C18U.A06(c06090Tz, userSession, 36323036638620537L)) {
                    return;
                }
            } else if (!C18U.A06(c06090Tz, userSession, 36323036638489463L)) {
                return;
            }
            String str2 = userSession.userId;
            C14360o3.A0B(str2, 0);
            long j = 0;
            A0f.A9K("user_igid", Long.valueOf(AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, str2))));
            if (str != null && (A0k = AbstractC003100w.A0k(10, str)) != null) {
                j = A0k.longValue();
            }
            A0f.A9K("account_viewed_igid", Long.valueOf(j));
            AbstractC31171DnF.A1E(A0f, AbstractC167007dF.A0h(invoke.toString()));
            A0f.Cht();
        }
    }
}
