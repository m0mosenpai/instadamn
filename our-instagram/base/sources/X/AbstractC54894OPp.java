package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OPp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54894OPp {
    public static final void A00(Context context, DialogInterface.OnDismissListener onDismissListener, AbstractC018607g abstractC018607g, UserSession userSession, C38321qM c38321qM, Reel reel, C3G2 c3g2) {
        int i;
        int i2;
        int i3;
        C14360o3.A0B(userSession, 4);
        Reel A0M = ReelStore.A03(userSession).A0M(userSession.userId);
        if (A0M != null) {
            boolean A1B = A0M.A1B(c38321qM);
            boolean A1X = AbstractC167007dF.A1X(reel.A09, HighlightReelTypeStr.A06);
            if (c38321qM.Cff()) {
                i = 2131972326;
                if (reel.A0l()) {
                    i = 2131972327;
                }
                i2 = 2131972323;
                i3 = 2131972324;
                if (A1B) {
                    i3 = 2131972325;
                }
            } else if (A1X) {
                i = 2131972332;
                i2 = 2131972330;
                i3 = 2131972331;
            } else {
                i = 2131972285;
                if (reel.A0l()) {
                    i = 2131972286;
                }
                i2 = 2131972282;
                i3 = 2131972283;
                if (A1B) {
                    i3 = 2131972284;
                }
            }
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            A0I.A0A(i);
            A0I.A09(i3);
            A0I.A0s(true);
            A0I.A0t(true);
            A0I.A0J(new DialogInterfaceOnClickListenerC35369Fik(4, context, abstractC018607g, userSession, c38321qM, reel, c3g2), i2);
            A0I.A0D(new DialogInterfaceOnClickListenerC41836Ifq(onDismissListener, 24));
            A0I.A0g(onDismissListener);
            AbstractC166987dD.A1W(A0I);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A01(EBB ebb, UserSession userSession, Reel reel, List list) {
        InterfaceC41141vN c3dh;
        boolean A1a = AbstractC167017dG.A1a(ebb, userSession);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC31172DnG.A0i(it).A4O(AbstractC37301Gc2.A0i(reel));
        }
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        C37771pE c37771pE = ebb.A00;
        if (c37771pE == null) {
            ReelStore.A03(userSession).A0c(reel.getId());
            c3dh = new C142656cR(reel);
        } else {
            c3dh = new C3DH(ReelStore.A03(userSession).A0I(c37771pE, A1a));
        }
        A00.A05(c3dh);
    }
}
