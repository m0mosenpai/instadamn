package X;

import android.content.Context;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.IhR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41889IhR implements View.OnClickListener {
    public final /* synthetic */ C148146lk A00;

    public ViewOnClickListenerC41889IhR(C148146lk c148146lk) {
        this.A00 = c148146lk;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1825079812);
        C148146lk c148146lk = this.A00;
        C148126li c148126li = c148146lk.A0a;
        C41181vS c41181vS = c148146lk.A0B;
        Integer num = C05F.A01;
        c148126li.A00(c41181vS, num, "unknown", c148146lk.A01, c148146lk.A0J);
        UserSession userSession = c148146lk.A0W;
        if (C18U.A06(C06090Tz.A05, userSession, 36325416050570290L)) {
            c148126li.A00(c148146lk.A0B, num, "unknown", c148146lk.A01, c148146lk.A0J);
            Context context = c148146lk.A0T;
            HashMap A1G = AbstractC166987dD.A1G();
            HashMap A1G2 = AbstractC166987dD.A1G();
            HashMap A1G3 = AbstractC166987dD.A1G();
            new BitSet(0);
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
            A0C.A03 = new HDT(c148146lk, 1);
            C66277U6x A02 = C66277U6x.A02(AbstractC111324zv.A00(810), AbstractC191768eY.A01(A1G), A1G2);
            AbstractC31178DnM.A1M(A02, -1);
            A02.A03 = null;
            A02.A02 = null;
            A02.A04 = null;
            A02.A08(A1G3);
            A02.A05(context, A0C);
            c148146lk.A0d.invoke();
        }
        C0f9.A0C(150828994, A05);
    }
}
