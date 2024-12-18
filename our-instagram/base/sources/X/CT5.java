package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* loaded from: classes5.dex */
public final class CT5 {
    public final C26034BfN A00;
    public final IgdsRadioButton A01;
    public final InterfaceC16660sJ A02;
    public final Context A03;
    public final View A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgImageView A07;

    public CT5(Context context, View view, C26034BfN c26034BfN, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC25233BEq.A0w(2, view, c26034BfN, interfaceC16660sJ);
        this.A03 = context;
        this.A04 = view;
        this.A00 = c26034BfN;
        this.A02 = interfaceC16660sJ;
        IgImageView A0T = AbstractC167007dF.A0T(view, R.id.icon);
        this.A07 = A0T;
        IgTextView A0d = AbstractC25231BEo.A0d(view, R.id.title);
        this.A06 = A0d;
        IgTextView A0d2 = AbstractC25231BEo.A0d(view, R.id.subtitle);
        this.A05 = A0d2;
        this.A01 = (IgdsRadioButton) AbstractC166997dE.A0R(view, R.id.toggle_button);
        A0T.setImageResource(c26034BfN.A01);
        AbstractC166987dD.A1P(C02G.A01(context), A0d, c26034BfN.A03);
        AbstractC166987dD.A1P(C02G.A01(context), A0d2, c26034BfN.A02);
        ViewOnClickListenerC28667ClF.A01(view, 61, this);
    }
}
