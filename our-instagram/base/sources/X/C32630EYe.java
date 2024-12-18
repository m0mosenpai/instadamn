package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.direct.inbox.DirectInviteContactViewModel;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.EYe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32630EYe extends AbstractC66422zJ {
    public final InterfaceC16660sJ A00;
    public final InterfaceC16620sF A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C31974E3c(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.directshare_row_user, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) interfaceC66482zP;
        C31974E3c c31974E3c = (C31974E3c) c3oo;
        AbstractC167007dF.A1K(directInviteContactViewModel, c31974E3c);
        InterfaceC16620sF interfaceC16620sF = this.A01;
        View view = c31974E3c.A00;
        interfaceC16620sF.invoke(directInviteContactViewModel, view);
        ViewOnClickListenerC35683FpI.A00(view, 68, directInviteContactViewModel, this);
        c31974E3c.A05.setVisibility(8);
        IgSimpleImageView igSimpleImageView = c31974E3c.A03;
        igSimpleImageView.setVisibility(0);
        igSimpleImageView.setImageResource(directInviteContactViewModel.A02);
        TextView textView = c31974E3c.A02;
        textView.setText(directInviteContactViewModel.A07);
        AbstractC31177DnL.A0z(textView, textView.getContext());
        TextView textView2 = c31974E3c.A01;
        textView2.setVisibility(0);
        textView2.setText(directInviteContactViewModel.A06);
        AbstractC31177DnL.A0y(textView2, textView2.getContext());
        IgdsButton igdsButton = c31974E3c.A04;
        igdsButton.setVisibility(0);
        igdsButton.setText(directInviteContactViewModel.A01);
        ViewOnClickListenerC35683FpI.A00(igdsButton, 69, directInviteContactViewModel, this);
    }

    public C32630EYe(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        this.A01 = interfaceC16620sF;
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return DirectInviteContactViewModel.class;
    }
}
