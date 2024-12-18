package X;

import android.view.View;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.I9q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40892I9q {
    public static final void A00(View view, UserSession userSession, Reel reel, C41181vS c41181vS, C147236jz c147236jz) {
        AbstractC167007dF.A1F(c41181vS, 2, view);
        if (Systrace.A0E(1L)) {
            C0fO.A01("StoriesViewerPlaceholderCoordinator.renderPlaceHolderItem", -1665935612);
        }
        try {
            if (C18U.A06(C06090Tz.A05, userSession, 36324101790379912L)) {
                J7H j7h = J7H.A00;
                J7D j7d = J7D.A00;
                C14360o3.A0B(j7h, 0);
                C14360o3.A0B(j7d, 1);
                j7d.invoke(j7h.invoke(userSession, reel, c41181vS, c147236jz), view);
            }
            if (AbstractC144976gH.A01(userSession)) {
                C57235PbJ c57235PbJ = C57235PbJ.A00;
                C57232PbG c57232PbG = C57232PbG.A00;
                C14360o3.A0B(c57235PbJ, 0);
                C14360o3.A0B(c57232PbG, 1);
                c57232PbG.invoke(c57235PbJ.invoke(userSession, reel, c41181vS, c147236jz), view);
            }
            if (AbstractC144976gH.A00(userSession)) {
                J7I j7i = J7I.A00;
                J7E j7e = J7E.A00;
                C14360o3.A0B(j7i, 0);
                C14360o3.A0B(j7e, 1);
                j7e.invoke(j7i.invoke(userSession, reel, c41181vS, c147236jz), view);
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(1899340627);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-636993262);
            }
            throw th;
        }
    }
}
