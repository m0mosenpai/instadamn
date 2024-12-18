package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;

/* renamed from: X.Fuz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36001Fuz implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "IGBloksActionFanClubViewWelcomeStoryImpl";

    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        if (!(A03 instanceof String)) {
            A03 = null;
        }
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(c6fw.A00, 1);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C25671My A00 = AbstractC25651Mw.A00(A0W);
        BQ2 bq2 = new BQ2(0, c6fq, A0t);
        C6BQ.A0K(c6fq, new C42275Inz(2, bq2, A00));
        A00.A01(bq2, C57452kK.class);
        if (C14360o3.A0K(A03, "pending")) {
            Reel reel = C1Ns.A00(A0W).A00;
            C14360o3.A0A(reel);
            A01(A04, A0W, reel);
            return null;
        }
        C25621Ms A0M = AbstractC31177DnL.A0M(A0W);
        A0M.A0B("media/infos/");
        A0M.A9s("media_ids", AbstractC25226BEj.A1H(", ", AbstractC166987dD.A1J(A03), null));
        new C154796xU(A04, AbstractC018607g.A00(A04), A0W).A03(AbstractC31172DnG.A0R(null, A0M, C74293Vk.class, C74313Vm.class, false), new C32951Eei(0, A04, A0W));
        return null;
    }

    public static final void A01(Activity activity, UserSession userSession, Reel reel) {
        C141586ab A0U = AbstractC31171DnF.A0U();
        A0U.A02(userSession, reel.getId(), AbstractC166987dD.A1J(reel));
        int i = 0;
        A0U.A09(AbstractC16960so.A1M(reel.getId()));
        A0U.A0A(AbstractC16960so.A1M(reel.getId()));
        A0U.A02 = new C70873Fz();
        Integer num = reel.A0e;
        if (num != null) {
            i = num.intValue();
        }
        A0U.A04(Integer.valueOf(i));
        A0U.A03(C3G2.A0r);
        AbstractC31177DnL.A1P(A0U);
        AbstractC25228BEl.A1G(activity, A0U.A00(), userSession, TransparentModalActivity.class, "reel_viewer");
    }
}
