package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OBF {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;

    public OBF(AbstractC59962oe abstractC59962oe, UserSession userSession, NYQ nyq, C56804PIv c56804PIv, C54497O5z c54497O5z, String str) {
        C14360o3.A0B(userSession, 2);
        this.A01 = userSession;
        C57532Pg6 A00 = C57532Pg6.A00(c56804PIv, this, 24);
        InterfaceC09390do A002 = C57541PgF.A00(C57541PgF.A01(abstractC59962oe, 45), EnumC09460dv.A02, 46);
        this.A02 = AbstractC25225BEi.A0a(C57541PgF.A01(A002, 47), A00, C57532Pg6.A00(null, A002, 23), AbstractC25225BEi.A1D(C50988Mfv.class));
        this.A00 = abstractC59962oe.requireContext();
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A02);
        PZ1.A01(A0Z, str, AbstractC141776au.A00(A0Z), 31);
        JQ0.A11(abstractC59962oe, new PZ3(nyq, c54497O5z, this, null, 34), ((C50988Mfv) this.A02.getValue()).A08);
    }
}
