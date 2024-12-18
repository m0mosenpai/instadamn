package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* loaded from: classes7.dex */
public final class ILA {
    public final UserSession A00;

    public final void A00(Context context, InterfaceC43415JGf interfaceC43415JGf, Product product) {
        C14360o3.A0B(context, 0);
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131972289);
        A0I.A0L(new DialogInterfaceOnClickListenerC41805IfL(2, interfaceC43415JGf, this, product), 2131972288);
        A0I.A03();
        A0I.A04();
        AbstractC166987dD.A1W(A0I);
    }

    public ILA(UserSession userSession) {
        this.A00 = userSession;
    }
}
