package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class N89 extends AbstractC193068gm {
    public final /* synthetic */ C50570MUb A00;
    public final /* synthetic */ C45078Jx7 A01;

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
    }

    public N89(C50570MUb c50570MUb, C45078Jx7 c45078Jx7) {
        this.A00 = c50570MUb;
        this.A01 = c45078Jx7;
    }

    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C66246U5q c66246U5q = (C66246U5q) obj;
        C14360o3.A0B(c66246U5q, 0);
        C50570MUb c50570MUb = this.A00;
        FragmentActivity fragmentActivity = c50570MUb.A00;
        if (!fragmentActivity.getSupportFragmentManager().A0G) {
            UserSession userSession = c50570MUb.A02;
            AbstractC79383gk.A01(new GOC(C62862tP.A01(null, fragmentActivity, c50570MUb.A01, userSession), c66246U5q));
            AbstractC23021Ah.A00(userSession).A0x(String.valueOf(this.A01.A00));
        }
    }
}
