package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EYM extends AbstractC66422zJ {
    public final Context A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.channel_education_nux, viewGroup, false);
        List list = E45.A05;
        Context context = this.A00;
        C14360o3.A0A(inflate);
        return new E45(context, inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C36199FyD c36199FyD = (C36199FyD) interfaceC66482zP;
        E45 e45 = (E45) c3oo;
        AbstractC167017dG.A1N(c36199FyD, e45);
        IgImageView igImageView = e45.A03;
        Context context = e45.A00;
        AbstractC166997dE.A19(context, igImageView, R.drawable.instagram_illustrations_product_illustration_pi_plus_what_are_channels);
        IgTextView igTextView = e45.A02;
        AbstractC166987dD.A1P(C02G.A01(context), igTextView, c36199FyD.A00);
        igTextView.setVisibility(0);
        List list = c36199FyD.A01;
        if (list != null) {
            Iterator A0q = AbstractC31180DnO.A0q(E45.A05, list);
            int i = 0;
            while (A0q.hasNext()) {
                Object next = A0q.next();
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                InterfaceC56392iX A0U = AbstractC31173DnH.A0U(e45.A01, AbstractC166987dD.A0H(next));
                AbstractC166997dE.A19(context, AbstractC31173DnH.A0I(A0U.getView(), R.id.icon), ((C32073E6z) list.get(i)).A01);
                AbstractC166987dD.A1P(C02G.A01(context), AbstractC31180DnO.A06(A0U.getView()), ((C32073E6z) list.get(i)).A02);
                TextView A0N = AbstractC167007dF.A0N(A0U.getView(), R.id.description);
                A0N.setVisibility(8);
                Number number = (Number) ((C32073E6z) list.get(i)).A03;
                if (number != null) {
                    AbstractC166987dD.A1P(C02G.A01(context), A0N, number.intValue());
                    A0N.setVisibility(0);
                }
                i = i2;
            }
        }
        IgdsButton igdsButton = e45.A04;
        igdsButton.setText(2131955069);
        igdsButton.setVisibility(0);
        ViewOnClickListenerC35681FpG.A01(igdsButton, 19, c36199FyD);
    }

    public EYM(Context context) {
        this.A00 = context;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36199FyD.class;
    }
}
