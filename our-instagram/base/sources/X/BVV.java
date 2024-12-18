package X;

import android.app.Activity;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class BVV {
    public static final void A00(Activity activity, ComposeView composeView, InterfaceC11380iw interfaceC11380iw, UserSession userSession, CR3 cr3, C26269Bjc c26269Bjc) {
        C14360o3.A0B(activity, 0);
        AbstractC25233BEq.A0v(1, userSession, interfaceC11380iw, c26269Bjc);
        C14360o3.A0B(cr3, 5);
        C30177DRh c30177DRh = new C30177DRh(49, userSession, activity, interfaceC11380iw, c26269Bjc);
        C132355yE c132355yE = new C132355yE(c30177DRh, new C29912DHa(14, cr3, interfaceC11380iw, activity), BVU.A00);
        C132385yJ c132385yJ = new C132385yJ(c132355yE, c30177DRh);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        int i = 0;
        for (Object obj : c26269Bjc.A08) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            A1I.put(((InterfaceC132245y2) AbstractC001800i.A0I((List) ((MUG) obj).A03)).Bet().A03, Integer.valueOf(i));
            i = i2;
        }
        composeView.setContent(C5UA.A04(new BVZ(userSession, new BVW(interfaceC11380iw, userSession, c26269Bjc.A03, c26269Bjc.A05, A1I), activity, interfaceC11380iw, cr3, c30177DRh, c132355yE, c26269Bjc, c132385yJ, 1), -1292421227, true));
    }
}
