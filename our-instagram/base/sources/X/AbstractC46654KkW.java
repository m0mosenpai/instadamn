package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.KkW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46654KkW {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, AbstractC111324zv.A00(11));
        boolean A1a = AbstractC166987dD.A1a(A03);
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A02()).A00;
        InterfaceC103384lE A0H = AbstractC31175DnJ.A0H(c6fw);
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        Context context = C1LZ.A00().A00;
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36313390142523312L)) {
            if (AbstractC46874KoH.A00(userSession).A00 == null) {
                AbstractC46874KoH.A00(userSession).A00();
            }
            C47909LEd c47909LEd = AbstractC46874KoH.A00(userSession).A00;
            if (c47909LEd != null) {
                C47909LEd.A00(c47909LEd, new BQ5(4, c47909LEd, new C50168MDv(15, userSession, A1a), A1a));
                return null;
            }
            return null;
        }
        AbstractC35237FgW.A03(context, AbstractC018607g.A00(C6BQ.A04(c6fq)), userSession, new C49595Lvo(c6fq, interfaceC103384lE, A0H, userSession, 0), "disabled", A1a);
        return null;
    }
}
