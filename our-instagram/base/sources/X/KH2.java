package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes8.dex */
public final class KH2 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44600Joz(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.row_appreciation_funding_balance, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45647KIk c45647KIk = (C45647KIk) interfaceC66482zP;
        C44600Joz c44600Joz = (C44600Joz) c3oo;
        AbstractC167017dG.A1N(c45647KIk, c44600Joz);
        IgTextView igTextView = c44600Joz.A00;
        igTextView.setText(c45647KIk.A00);
        igTextView.setContentDescription(c45647KIk.A01);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45647KIk.class;
    }
}
