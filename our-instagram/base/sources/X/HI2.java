package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes7.dex */
public final class HI2 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.upcoming_event_cta_row_item, false);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(A0D, new C38429GvC(A0D)), "null cannot be cast to non-null type com.instagram.upcomingevents.bottomsheet.adapter.definition.UpcomingEventCtaRowItemViewBinder.ViewHolder");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42309IoX c42309IoX = (C42309IoX) interfaceC66482zP;
        C38429GvC c38429GvC = (C38429GvC) c3oo;
        AbstractC167017dG.A1N(c42309IoX, c38429GvC);
        IgdsListCell igdsListCell = c38429GvC.A00;
        C32071E6x c32071E6x = c42309IoX.A00;
        InterfaceC43396JFl interfaceC43396JFl = c42309IoX.A01;
        igdsListCell.A05(c32071E6x.A00);
        igdsListCell.A0I(c32071E6x.A01);
        if (interfaceC43396JFl == null) {
            igdsListCell.setAlpha(0.3f);
        } else {
            igdsListCell.A0C(ViewOnClickListenerC42035Ik4.A00(interfaceC43396JFl, 40));
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42309IoX.class;
    }
}
