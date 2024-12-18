package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.F1h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34054F1h {
    public static final void A00(Context context, UserSession userSession, String str, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z, boolean z2, boolean z3) {
        boolean A1a = AbstractC167017dG.A1a(userSession, context);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0L("direct_v2/threads/%s/toggle_enable_instamadillo/", str);
        A0c.A0I("enable_instamadillo", z);
        A0c.A0I(AbstractC111324zv.A00(2640), z2);
        A0c.A0I("is_proton", z3);
        if (!z) {
            j = 0;
        }
        A0c.A0E("instamadillo_msg_type_bit_flag", j);
        C1ON A0e = AbstractC25227BEk.A0e(A0c, C32207EDg.class, C34793FUv.class);
        A0e.A00 = new C32545EUv(A1a ? 1 : 0, context, interfaceC16660sJ, z2);
        C1GJ.A03(A0e);
    }
}
