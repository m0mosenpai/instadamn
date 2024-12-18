package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OBI {
    public final Context A00;
    public final PJ4 A01;
    public final InterfaceC09390do A02;

    public OBI(View view, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        C57542PgG c57542PgG = new C57542PgG(userSession, 43);
        InterfaceC09390do A01 = C57542PgG.A01(new C57542PgG(abstractC59962oe, 40), EnumC09460dv.A02, 41);
        this.A02 = AbstractC25225BEi.A0a(new C57542PgG(A01, 42), c57542PgG, C57530Pg4.A00(null, A01, 8), AbstractC25225BEi.A1D(C50927Mew.class));
        Context requireContext = abstractC59962oe.requireContext();
        this.A00 = requireContext;
        PJ4 pj4 = new PJ4(requireContext);
        pj4.A05.setText(AbstractC166997dE.A0p(requireContext, 2131954754));
        this.A01 = pj4;
        JQ0.A11(abstractC59962oe, new PZ3(view, abstractC59962oe, this, null, 36), ((C50927Mew) this.A02.getValue()).A04);
    }
}
