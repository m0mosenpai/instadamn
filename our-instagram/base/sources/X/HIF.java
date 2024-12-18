package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes7.dex */
public final class HIF extends AbstractC66412zI {
    public final UserSession A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.upcoming_event_cta_row_item, false);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(A0D, new C38450GvX(A0D)), "null cannot be cast to non-null type com.instagram.upcomingevents.bottomsheet.adapter.definition.UpcomingEventOffsiteLinkRowItemViewBinder.ViewHolder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        View view;
        IgdsButton igdsButton;
        C42310IoY c42310IoY = (C42310IoY) interfaceC66482zP;
        C38450GvX c38450GvX = (C38450GvX) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c42310IoY, c38450GvX);
        UserSession userSession = this.A00;
        boolean A1U = AbstractC167007dF.A1U(userSession);
        C40987IDi c40987IDi = c42310IoY.A01;
        JWd jWd = c42310IoY.A00;
        int A0H = AbstractC166987dD.A0H(jWd.A00);
        if (A0H != A1a) {
            if (A0H == A1U) {
                IgdsListCell igdsListCell = c38450GvX.A01;
                igdsListCell.A05(R.drawable.instagram_link_pano_outline_24);
                Context context = igdsListCell.getContext();
                igdsListCell.setIconColorContrib(AbstractC53242c7.A06(context));
                igdsListCell.A0I(jWd.A01);
                igdsListCell.setTitleTextColorContrib(AbstractC53242c7.A06(context));
                igdsListCell.setTitleMaxLines(A1a ? 1 : 0);
                igdsListCell.A0C(new ViewOnClickListenerC77633dn(userSession, null, null, new C57746PjZ(c40987IDi, 36), A1a));
                view = c38450GvX.A00;
                igdsButton = igdsListCell;
            } else {
                throw B4Z.A00();
            }
        } else {
            IgdsButton igdsButton2 = c38450GvX.A00;
            if (jWd.A02 && !C14640oc.A00()) {
                igdsButton2.setOverridePrismVariant(C1QL.A03);
            }
            igdsButton2.setStyle(EnumC99704do.A03);
            IA2.A00(igdsButton2, R.drawable.instagram_link_pano_outline_24);
            igdsButton2.setText(jWd.A01);
            C0fQ.A00(new ViewOnClickListenerC77633dn(userSession, null, null, new C57746PjZ(c40987IDi, 35), A1a), igdsButton2);
            view = c38450GvX.A01;
            igdsButton = igdsButton2;
        }
        view.setVisibility(8);
        igdsButton.setVisibility(A1U ? 1 : 0);
        c40987IDi.A00.A07(igdsButton);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42310IoY.class;
    }

    public HIF(UserSession userSession) {
        this.A00 = userSession;
    }
}
