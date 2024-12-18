package X;

import com.instagram.common.session.UserSession;
import com.instagram.rtc.analytics.RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class F3R {
    public static final void A00(AbstractC59962oe abstractC59962oe, UserSession userSession, C7T2 c7t2, C7T3 c7t3, boolean z) {
        GO0 go0;
        AbstractC167007dF.A1F(userSession, 0, c7t3);
        RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId A00 = AbstractC55155OdJ.A00(abstractC59962oe.requireContext(), userSession, c7t2, c7t3);
        AbstractC55155OdJ.A02(abstractC59962oe.requireContext(), null, userSession, c7t2, c7t3);
        ArrayList A1E = AbstractC166987dD.A1E();
        List BSH = c7t2.BSH();
        Iterator it = BSH.iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            if (A15.CYY()) {
                String A07 = AbstractC101904i3.A07(A15);
                C14360o3.A07(A07);
                A1E.add(A07);
            }
        }
        FQ2 A002 = F77.A00(userSession);
        RunnableC36979GQw runnableC36979GQw = new RunnableC36979GQw(abstractC59962oe, userSession, c7t2, A00, c7t3, z);
        if (AbstractC25226BEj.A1b(A1E) && (c7t2.CX1() || C18U.A06(C06090Tz.A05, userSession, 36313579120691368L))) {
            if (C18U.A06(C06090Tz.A05, userSession, 36315868338065050L)) {
                go0 = new GO0(userSession, A00);
            } else {
                go0 = null;
            }
            C36004Fv2.A00(abstractC59962oe.requireContext(), userSession, go0, runnableC36979GQw, A1E);
            return;
        }
        abstractC59962oe.requireContext();
        if (A002.A00(abstractC59962oe, runnableC36979GQw, c7t2.C7I(), BSH, c7t2.CVQ())) {
            return;
        }
        runnableC36979GQw.run();
    }
}
