package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.FZf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34893FZf {
    public static final C19270xB A00 = AbstractC31171DnF.A0D("direct_thread");

    public static final void A00(View view, UserSession userSession, InterfaceC148366m6 interfaceC148366m6, C2EE c2ee) {
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        String BaA = c2ee.BaA();
        if (BaA == null) {
            BaA = "";
        }
        AbstractC31177DnL.A1M(AbstractC166987dD.A0w(A002), "direct_open_to_collab_nux/", BaA, true);
        view.setVisibility(8);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(A00, userSession), "ig_creator_connections_events");
        AbstractC31171DnF.A1B(A0f, "dismiss");
        A0f.AAP("target", AbstractC111324zv.A00(4305));
        A0f.A8R(EnumC33488ErN.DIRECT_THREAD, "screen");
        A0f.A8R(AbstractC100604fP.A00(userSession), "project");
        A0f.Cht();
        interfaceC148366m6.DWL();
    }
}
