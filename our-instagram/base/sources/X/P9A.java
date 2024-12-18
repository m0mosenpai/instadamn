package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P9A implements InterfaceC57981PnR {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C41551w4 A01;
    public final /* synthetic */ C145836hg A02;
    public final /* synthetic */ C146346iX A03;
    public final /* synthetic */ InterfaceC146296iS A04;

    public P9A(UserSession userSession, C41551w4 c41551w4, C145836hg c145836hg, C146346iX c146346iX, InterfaceC146296iS interfaceC146296iS) {
        this.A00 = userSession;
        this.A04 = interfaceC146296iS;
        this.A03 = c146346iX;
        this.A01 = c41551w4;
        this.A02 = c145836hg;
    }

    @Override // X.InterfaceC57981PnR
    public final void E0Q(View view, C3G4 c3g4) {
        C14360o3.A0B(view, 0);
        UserSession userSession = this.A00;
        C41181vS A00 = c3g4.A00(userSession);
        if (A00 == null) {
            C0f5 AEp = C18950wb.A01.AEp("LOCKED_OR_EMPTY_STATE", 817891683);
            AEp.ABW("LOCKED_OR_EMPTY_STATE", "thumbnail reel item should never be null");
            AEp.report();
            return;
        }
        InterfaceC146296iS interfaceC146296iS = this.A04;
        C141596ac C00 = interfaceC146296iS.C00(A00);
        int i = C00.A0I;
        C146346iX c146346iX = this.A03;
        C141596ac C002 = interfaceC146296iS.C00(A00);
        c146346iX.A00(view, new C56201OxA(userSession, this.A01, c3g4, this.A02, C00), A00, new C41551w4(userSession, c3g4.A03, false, null, null, C16910sj.A00, i, System.currentTimeMillis(), false), C002, C05F.A00, i);
    }
}
