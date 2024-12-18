package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.JYk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43797JYk {
    public final UserSession A00;

    public C43797JYk(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final void A00(EnumC44115Jef enumC44115Jef, InterfaceC11380iw interfaceC11380iw, C43797JYk c43797JYk, Map map) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, c43797JYk.A00), "direct_inbox_folders");
        if (A0f.isSampled()) {
            A0f.A8R(enumC44115Jef, "action");
            A0f.AAP("extra_client_data", AbstractC31175DnJ.A0d(map));
            A0f.Cht();
        }
    }
}
