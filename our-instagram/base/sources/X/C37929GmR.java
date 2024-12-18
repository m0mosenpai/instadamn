package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GmR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37929GmR extends AbstractC116895Qv {
    public final /* synthetic */ C154066wG A00;

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        C14360o3.A0B(c37818GkY, 0);
        C154066wG c154066wG = this.A00;
        UserSession userSession = c154066wG.A02;
        List list = c37818GkY.A09;
        String str = c154066wG.A03;
        if (!C18U.A06(AbstractC25225BEi.A0j(list, 1), userSession, 36318479681067206L) || !AbstractC116865Qp.A02(str).A02()) {
            list = AbstractC37761Gja.A01(userSession, str, list, AbstractC16960so.A1Q(EnumC129395t1.A0G, EnumC129395t1.A02));
        }
        c154066wG.A00(c37818GkY.A01.BbA(), c154066wG.A01, list, c37818GkY.A0D);
    }

    public C37929GmR(C154066wG c154066wG) {
        this.A00 = c154066wG;
    }
}
