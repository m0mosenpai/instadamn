package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.GfP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37507GfP implements BDR {
    public final Fragment A00;
    public final C38R A01;
    public final C37502GfK A02;

    @Override // X.BDR
    public final String CDA(C38321qM c38321qM) {
        C37502GfK c37502GfK = this.A02;
        Context requireContext = this.A00.requireContext();
        AbstractC40989IDk A00 = ((ILU) c37502GfK.A09.getValue()).A00(c38321qM);
        if (A00 instanceof C39429HbD) {
            return AbstractC166997dE.A0p(requireContext, 2131972137);
        }
        if (A00 instanceof C39430HbE) {
            return AbstractC166997dE.A0p(requireContext, 2131976848);
        }
        String BNT = c38321qM.A0C.BNT();
        if (BNT != null && BNT.length() > 0 && !BNT.equals(requireContext.getString(2131976237))) {
            return BNT;
        }
        return AbstractC166997dE.A0p(requireContext, 2131968946);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BDR
    public final void Dwy(C38321qM c38321qM, C75113Zb c75113Zb) {
        C37502GfK c37502GfK = this.A02;
        Fragment fragment = this.A00;
        AbstractC40989IDk A00 = ((ILU) c37502GfK.A09.getValue()).A00(c38321qM);
        if (A00 instanceof C39430HbE) {
            A00.A00.A02(c38321qM, c75113Zb);
            return;
        }
        if (A00 instanceof C39429HbD) {
            A00.A00.A03(c38321qM, c75113Zb, "cta_bar_set_online_reminder");
            return;
        }
        C37502GfK c37502GfK2 = A00.A00;
        UserSession userSession = c37502GfK2.A01;
        C2Fb c2Fb = C2Fb.A4C;
        C37952Gmu c37952Gmu = new C37952Gmu(fragment, userSession, new C5SE(userSession, c38321qM), c37502GfK2.A02, c2Fb);
        c37952Gmu.A0J = c38321qM;
        int i = -1;
        if (c38321qM.A5M()) {
            i = 0;
        }
        c37952Gmu.A09 = i;
        c37952Gmu.A0d = AbstractC75103Za.A09(c38321qM, c75113Zb);
        c37952Gmu.A0c = AbstractC75103Za.A0A(c75113Zb);
        C37953Gmv.A02(c37952Gmu);
        UpcomingEvent A2B = c38321qM.A2B(userSession);
        if (A2B == null || !(fragment instanceof InterfaceC11380iw)) {
            return;
        }
        new C146076i5((InterfaceC11380iw) fragment, userSession, c37502GfK2.A03).A04(A2B, c38321qM.getId(), "offsite_link_click", "cta_bar_offsite_link");
    }

    @Override // X.BDR
    public final void EDo(View view, C38321qM c38321qM) {
        this.A01.A00(view, c38321qM);
    }

    public C37507GfP(Fragment fragment, C38R c38r, C37502GfK c37502GfK) {
        AbstractC167017dG.A1R(c37502GfK, c38r);
        this.A00 = fragment;
        this.A02 = c37502GfK;
        this.A01 = c38r;
    }
}
