package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EYB extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E1J(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.partial_ci_select_all_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        E1J e1j = (E1J) c3oo;
        AbstractC167017dG.A1N(interfaceC66482zP, e1j);
        ViewOnClickListenerC35679FpE.A01(e1j.A00, 39, interfaceC66482zP);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36181Fxv.class;
    }
}
