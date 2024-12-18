package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public abstract class VR0 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.Number");
        String obj = A03.toString();
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A02()).A00;
        InterfaceC103384lE interfaceC103384lE2 = ((C1344465q) c6fw.A00()).A00;
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        User A02 = AnonymousClass189.A00(userSession).A02(obj);
        if (A02 != null) {
            AbstractC167007dF.A1K(A04, userSession);
            AbstractC129875tr.A00(userSession).A08(A04, new Tx4(9, interfaceC103384lE2, interfaceC103384lE, c6fq), userSession, A02);
            return null;
        }
        C4LM.A02.A02(userSession, new C71111Wo8(1, A04, c6fq, interfaceC103384lE, interfaceC103384lE2, userSession), obj);
        return null;
    }
}
