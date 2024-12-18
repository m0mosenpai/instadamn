package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.FaU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34944FaU {
    public final UserSession A00;
    public final C57112jm A01 = AbstractC31180DnO.A0N();
    public final AbstractC33235ElU A02;

    public static void A00(C34944FaU c34944FaU, Map map) {
        AbstractC33235ElU abstractC33235ElU = c34944FaU.A02;
        C6WQ A0T = AbstractC31180DnO.A0T(abstractC33235ElU);
        AbstractC31176DnK.A13(abstractC33235ElU.requireActivity(), A0T);
        C0fJ.A00(A0T);
        AbstractC192798gL A04 = C192108fB.A04(c34944FaU.A00, "com.instagram.portable.settings.help.open_screen_async_action", map);
        C32394EOv.A00(A04, c34944FaU, A0T, 14);
        abstractC33235ElU.schedule(A04);
    }

    public C34944FaU(UserSession userSession, AbstractC33235ElU abstractC33235ElU) {
        this.A00 = userSession;
        this.A02 = abstractC33235ElU;
    }
}
