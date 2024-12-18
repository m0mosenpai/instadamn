package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PH7 implements InterfaceC58304Psw {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewStub A01;
    public final /* synthetic */ OL4 A02;

    @Override // X.InterfaceC57996Png
    public final /* bridge */ /* synthetic */ void Dd7(Object obj) {
        InterfaceC58187Pqt interfaceC58187Pqt = (InterfaceC58187Pqt) obj;
        C14360o3.A0B(interfaceC58187Pqt, 0);
        OL4 ol4 = this.A02;
        UserSession userSession = ol4.A06;
        AbstractC59962oe abstractC59962oe = ol4.A04;
        ViewStub viewStub = this.A01;
        View view = this.A00;
        Context A0L = AbstractC166997dE.A0L(view);
        ol4.A01 = interfaceC58187Pqt.Csg(viewStub, abstractC59962oe, userSession, AbstractC166997dE.A0b(), C57532Pg6.A00(A0L, ol4, 9));
        ol4.A00(false);
        InterfaceC25209BDh interfaceC25209BDh = ol4.A01;
        if (interfaceC25209BDh != null) {
            interfaceC25209BDh.EYK(ol4.A07);
        }
        View requireViewById = view.requireViewById(R.id.iglive_sup_toggle_container);
        ol4.A00 = requireViewById;
        interfaceC58187Pqt.Cse(requireViewById, abstractC59962oe, userSession, C57532Pg6.A00(A0L, ol4, 9));
        ol4.A02 = interfaceC58187Pqt.Csn(abstractC59962oe, userSession);
        interfaceC58187Pqt.Csb(abstractC59962oe, userSession, C57532Pg6.A00(A0L, ol4, 9));
        interfaceC58187Pqt.Csf(abstractC59962oe, userSession, null, C57532Pg6.A00(A0L, ol4, 9));
        C37101o8.A00(AbstractC195888lY.A00()).A00(ol4.A03, userSession, new PH0(ol4, 3), "sup:SupDelegate|SupLiveDelegate_ADD_CB");
    }

    public PH7(View view, ViewStub viewStub, OL4 ol4) {
        this.A02 = ol4;
        this.A01 = viewStub;
        this.A00 = view;
    }
}
