package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.reels.store.ReelStore;

/* loaded from: classes9.dex */
public final class PS0 implements Runnable {
    public final /* synthetic */ EBB A00;
    public final /* synthetic */ C52229N9s A01;

    public PS0(EBB ebb, C52229N9s c52229N9s) {
        this.A01 = c52229N9s;
        this.A00 = ebb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EBB ebb = this.A00;
        C37771pE c37771pE = ebb.A00;
        C52229N9s c52229N9s = this.A01;
        if (c37771pE == null) {
            Context context = c52229N9s.A00;
            C9GR.A03(context, context.getString(2131976159), "onPublishHighlightTapped_unknown_error_occured", 0);
            return;
        }
        C148566mR c148566mR = c52229N9s.A03;
        UserSession userSession = c148566mR.A03;
        ReelStore A03 = ReelStore.A03(userSession);
        Reel A0I = A03.A0I(ebb.A00, true);
        Reel reel = c52229N9s.A01;
        A03.A0c(reel.getId());
        if (reel.A0P == ReelType.A0d) {
            InterfaceC11380iw interfaceC11380iw = c148566mR.A02;
            C14360o3.A0B(userSession, 1);
            int size = reel.A0O(userSession).size();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_shopping_shop_highlight_created");
            if (A0f.isSampled()) {
                A0f.A8p("result_count", Integer.valueOf(size));
                A0f.Cht();
            }
        }
        AbstractC25651Mw.A00(userSession).A05(new C3DH(A0I));
        c148566mR.A04.CqT();
    }
}
