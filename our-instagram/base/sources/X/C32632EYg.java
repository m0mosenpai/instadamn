package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.direct.inbox.DirectInviteContactViewModel;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.EYg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32632EYg extends AbstractC66422zJ {
    public final InterfaceC16660sJ A00;
    public final InterfaceC16620sF A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C31995E3x(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_search_row_layout, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) interfaceC66482zP;
        C31995E3x c31995E3x = (C31995E3x) c3oo;
        AbstractC167007dF.A1K(directInviteContactViewModel, c31995E3x);
        InterfaceC16620sF interfaceC16620sF = this.A01;
        ViewGroup viewGroup = c31995E3x.A00;
        interfaceC16620sF.invoke(directInviteContactViewModel, viewGroup);
        FpQ.A01(viewGroup, 27, this, directInviteContactViewModel);
        c31995E3x.A08.CMM();
        IgSimpleImageView igSimpleImageView = c31995E3x.A05;
        igSimpleImageView.setVisibility(0);
        igSimpleImageView.setImageResource(directInviteContactViewModel.A02);
        c31995E3x.A07.setText(directInviteContactViewModel.A07);
        c31995E3x.A04.setText(directInviteContactViewModel.A06);
        c31995E3x.A01.setVisibility(8);
        IgdsButton igdsButton = c31995E3x.A09;
        igdsButton.setVisibility(0);
        igdsButton.setText(directInviteContactViewModel.A01);
        FpQ.A01(igdsButton, 28, this, directInviteContactViewModel);
    }

    public C32632EYg(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        this.A01 = interfaceC16620sF;
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return DirectInviteContactViewModel.class;
    }
}
