package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KH7 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44637Jph(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.header_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45188JzU c45188JzU = (C45188JzU) interfaceC66482zP;
        C44637Jph c44637Jph = (C44637Jph) c3oo;
        AbstractC167017dG.A1N(c45188JzU, c44637Jph);
        AbstractC166987dD.A1P(AbstractC31172DnG.A05(c44637Jph), c44637Jph.A00, c45188JzU.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45188JzU.class;
    }
}
