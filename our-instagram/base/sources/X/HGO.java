package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HGO extends C1P1 {
    public final Context A00;
    public final UserSession A01;
    public final C6WQ A02;

    public HGO(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
        C6WQ c6wq = new C6WQ(context, true);
        this.A02 = c6wq;
        c6wq.A00(context.getString(2131969964));
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-937923061);
        C9GR.A01(this.A00, "update_profile_grid_failed", 2131974293, 1);
        C0f9.A0A(-517127371, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1807171479);
        this.A02.dismiss();
        C0f9.A0A(151192865, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1815627910);
        C0fJ.A00(this.A02);
        C0f9.A0A(2045877101, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Context context;
        int i;
        List coauthorProducers;
        int A03 = C0f9.A03(-2057789706);
        C38876H9y c38876H9y = (C38876H9y) obj;
        int A032 = C0f9.A03(-377014962);
        C14360o3.A0B(c38876H9y, 0);
        C38321qM c38321qM = c38876H9y.A00;
        if (c38321qM != null) {
            UserSession userSession = this.A01;
            c38321qM.AEH(userSession);
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                A2E.A0W();
                A2E.A0c(userSession);
                String id = A2E.getId();
                if (c38321qM.A4j() && C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36323101063130093L) && (coauthorProducers = c38321qM.A0C.getCoauthorProducers()) != null) {
                    Iterator it = coauthorProducers.iterator();
                    while (it.hasNext()) {
                        if (C2TN.A05(userSession, AbstractC25226BEj.A15(it).getId())) {
                            id = userSession.userId;
                        }
                    }
                }
                AbstractC25651Mw.A00(userSession).E4s(new C154976xm(EnumC125765mR.A04, id));
                boolean A6C = c38321qM.A6C();
                if (c38321qM.A1x() == EnumC76383bi.A0C) {
                    if (AbstractC151756sL.A01()) {
                        context = this.A00;
                        AbstractC151756sL.A00().A03();
                        i = 2131955761;
                        if (A6C) {
                            i = 2131955244;
                        }
                    }
                    C0f9.A0A(91311805, A032);
                    C0f9.A0A(-1253438643, A03);
                    return;
                }
                context = this.A00;
                i = 2131955762;
                if (A6C) {
                    i = 2131955245;
                }
                C9GR.A06(context, i);
                C0f9.A0A(91311805, A032);
                C0f9.A0A(-1253438643, A03);
                return;
            }
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A0A(-971218760, A032);
            throw A0g;
        }
        C14360o3.A0F("updatedMedia");
        throw C00O.createAndThrow();
    }
}
