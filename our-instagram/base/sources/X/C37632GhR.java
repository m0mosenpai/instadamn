package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GhR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37632GhR implements InterfaceC41501vz {
    public final /* synthetic */ C37540Gfw A00;

    public C37632GhR(C37540Gfw c37540Gfw) {
        this.A00 = c37540Gfw;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        UserSession userSession;
        UpcomingEvent A2B;
        int A03 = C0f9.A03(201679633);
        C42242InS c42242InS = (C42242InS) obj;
        int A032 = C0f9.A03(337573692);
        C14360o3.A0B(c42242InS, 0);
        UpcomingEvent upcomingEvent = c42242InS.A00;
        C37540Gfw c37540Gfw = this.A00;
        List A0J = C37546Gg2.A03(c37540Gfw.A20).A0J();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj2 : A0J) {
            if (C76253bV.A00((C120985dq) obj2, c37540Gfw.A0Y)) {
                A1E.add(obj2);
            }
        }
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            C120985dq A0A = AbstractC37300Gc1.A0A(it);
            C38321qM c38321qM = A0A.A02;
            if (c38321qM != null && (A2B = c38321qM.A2B((userSession = c37540Gfw.A0Y))) != null && C14360o3.A0K(upcomingEvent.getId(), A2B.getId())) {
                AbstractC39459Hbl abstractC39459Hbl = c37540Gfw.A0q;
                EnumC39550HdM enumC39550HdM = abstractC39459Hbl.C09(A0A).A0B;
                EnumC39550HdM A00 = AbstractC37652Ghl.A00(A0A, userSession, upcomingEvent, false);
                if (enumC39550HdM != EnumC39550HdM.A04 && A00 != EnumC39550HdM.A06) {
                    abstractC39459Hbl.EcV(A0A, A00);
                }
            }
        }
        C0f9.A0A(-1278313878, A032);
        C0f9.A0A(2005927683, A03);
    }
}
