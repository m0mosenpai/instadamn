package X;

import android.app.Activity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PGA implements InterfaceC57990Pna {
    public final /* synthetic */ C82G A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ C41181vS A02;
    public final /* synthetic */ C146836jL A03;

    public PGA(C82G c82g, AbstractC59962oe abstractC59962oe, C41181vS c41181vS, C146836jL c146836jL) {
        this.A03 = c146836jL;
        this.A02 = c41181vS;
        this.A01 = abstractC59962oe;
        this.A00 = c82g;
    }

    @Override // X.InterfaceC57990Pna
    public final void afterSelection(boolean z) {
        if (z) {
            String A0p = AbstractC25231BEo.A0p();
            C146836jL c146836jL = this.A03;
            c146836jL.A09.Dlh(this.A02, A0p);
            AbstractC59962oe abstractC59962oe = this.A01;
            if (c146836jL.A01 && abstractC59962oe.getContext() != null) {
                CallerContext callerContext = NVk.A02;
                C55088Oal.A01(abstractC59962oe.requireContext(), C05F.A0N, 0);
                return;
            }
            return;
        }
        Activity rootActivity = this.A01.getRootActivity();
        if (rootActivity == null) {
            return;
        }
        C146836jL c146836jL2 = this.A03;
        C41181vS c41181vS = this.A02;
        C82G c82g = this.A00;
        UserSession userSession = c146836jL2.A07;
        C82H c82h = C82H.A02;
        boolean z2 = c146836jL2.A01;
        C55165OdT.A00(rootActivity, c146836jL2.A04, c82g, c82h, userSession, c41181vS, c146836jL2.A08, c146836jL2.A09, z2);
    }
}
