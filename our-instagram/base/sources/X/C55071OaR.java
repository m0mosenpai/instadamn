package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OaR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55071OaR {
    public C51123MiS A00;
    public List A01;
    public boolean A02;
    public final UserSession A03;
    public final OD1 A04;
    public final C40701ud A05;
    public final java.util.Set A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16820sZ A08;
    public final Context A09;
    public final InterfaceC16820sZ A0A;

    public static final void A01(C55071OaR c55071OaR, O2P o2p, List list) {
        c55071OaR.A06.addAll(list);
        List A00 = A00(c55071OaR);
        if (A00 == null || A00.isEmpty()) {
            c55071OaR.A07.invoke();
        }
        List A002 = A00(c55071OaR);
        OD1 od1 = c55071OaR.A04;
        if (od1.A00.getVisibility() == 0 && A002 != null && !A002.isEmpty()) {
            od1.A01.setVisibility(0);
            RecyclerView recyclerView = od1.A03;
            AbstractC31174DnI.A16(c55071OaR.A09, recyclerView, 1, false);
            C51123MiS c51123MiS = new C51123MiS(o2p, A002);
            c55071OaR.A00 = c51123MiS;
            recyclerView.setAdapter(c51123MiS);
            recyclerView.setVisibility(0);
            c55071OaR.A0A.invoke();
        }
    }

    public static final List A00(C55071OaR c55071OaR) {
        List list = c55071OaR.A01;
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                AbstractC25228BEl.A1Q(obj, A1E, AbstractC001800i.A0u(c55071OaR.A06, ((Hashtag) obj).getName()) ? 1 : 0);
            }
            return AbstractC001800i.A0a(AbstractC001800i.A0k(A1E));
        }
        return null;
    }

    public final void A02() {
        if (!this.A02) {
            OD1 od1 = this.A04;
            AbstractC31171DnF.A1M(od1.A04);
            od1.A02.setVisibility(0);
            this.A02 = true;
        }
    }

    public C55071OaR(Context context, UserSession userSession, OD1 od1, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        AbstractC167017dG.A1R(userSession, od1);
        this.A09 = context;
        this.A03 = userSession;
        this.A04 = od1;
        this.A07 = interfaceC16820sZ;
        this.A08 = interfaceC16820sZ2;
        this.A0A = interfaceC16820sZ3;
        this.A05 = AbstractC40691uc.A01(userSession);
        this.A06 = AbstractC31171DnF.A0l();
    }
}
