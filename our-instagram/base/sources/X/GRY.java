package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.DirectInviteContactViewModel;

/* loaded from: classes6.dex */
public final class GRY implements InterfaceC09250da, InterfaceC16620sF {
    public final int A00;
    public final Object A01;

    @Override // X.InterfaceC16620sF
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC132405yL interfaceC132405yL;
        int i;
        if (this.A00 != 0) {
            String str = (String) obj;
            Boolean bool = (Boolean) obj2;
            C31370Dqa c31370Dqa = ((C31721DwQ) this.A01).A0j;
            if (c31370Dqa != null) {
                c31370Dqa.A04(bool.booleanValue(), null, null, str);
            }
            return C0eB.A00;
        }
        C36010Fv8 c36010Fv8 = (C36010Fv8) this.A01;
        DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) obj;
        View view = (View) obj2;
        Context context = c36010Fv8.A07;
        UserSession userSession = c36010Fv8.A0D;
        boolean A01 = C54P.A01(context, userSession);
        EnumC33510Erj enumC33510Erj = EnumC33510Erj.DIRECT_MESSAGE_SEARCH;
        if (A01) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0N(userSession), "inline_contact_list_impression");
            if (A0f.isSampled()) {
                AbstractC31176DnK.A1H(enumC33510Erj, A0f, AbstractC31178DnM.A0b());
                AbstractC35249Fgi.A00(A0f, true);
            }
            interfaceC132405yL = c36010Fv8.A0I;
            i = 43;
        } else {
            AbstractC35249Fgi.A05(enumC33510Erj, userSession, A01);
            interfaceC132405yL = c36010Fv8.A0I;
            i = 6;
        }
        interfaceC132405yL.CkL(view, directInviteContactViewModel, i, directInviteContactViewModel.A00, directInviteContactViewModel.A03, directInviteContactViewModel.A04);
        return null;
    }

    public GRY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
