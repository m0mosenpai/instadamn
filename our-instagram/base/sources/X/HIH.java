package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes7.dex */
public final class HIH extends AbstractC66412zI {
    public final UserSession A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.upcoming_event_cta_row_item, false);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(A0D, new C38431GvE(A0D)), "null cannot be cast to non-null type com.instagram.upcomingevents.bottomsheet.adapter.definition.UpcomingEventReminderCtaViewBinder.ViewHolder");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        Context context;
        int i;
        C42338Ip0 c42338Ip0 = (C42338Ip0) interfaceC66482zP;
        C38431GvE c38431GvE = (C38431GvE) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c42338Ip0, c38431GvE);
        UserSession userSession = this.A00;
        boolean A1U = AbstractC167007dF.A1U(userSession);
        IgdsListCell igdsListCell = c38431GvE.A00;
        C40986IDh c40986IDh = c42338Ip0.A01;
        int A0H = AbstractC166987dD.A0H(c42338Ip0.A00.A00);
        if (A0H != A1U) {
            if (A0H == A1a) {
                igdsListCell.A05(R.drawable.instagram_alert_new_pano_outline_24);
                context = igdsListCell.getContext();
                i = 2131976237;
            } else {
                throw B4Z.A00();
            }
        } else {
            igdsListCell.A05(R.drawable.instagram_alert_check_new_pano_outline_24);
            context = igdsListCell.getContext();
            i = 2131976238;
        }
        igdsListCell.A0I(AbstractC166997dE.A0p(context, i));
        igdsListCell.A0C(new ViewOnClickListenerC77633dn(userSession, null, null, new C57746PjZ(c40986IDh, 37), A1a));
        c40986IDh.A00.A08(igdsListCell);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42338Ip0.class;
    }

    public HIH(UserSession userSession) {
        this.A00 = userSession;
    }
}
