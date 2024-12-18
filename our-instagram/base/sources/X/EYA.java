package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EYA extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E1I(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.alphabetical_letter_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        E8T e8t = (E8T) interfaceC66482zP;
        E1I e1i = (E1I) c3oo;
        AbstractC167017dG.A1N(e8t, e1i);
        e1i.A00.setText(String.valueOf(e8t.A00));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return E8T.class;
    }
}
