package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EXC extends AbstractC66412zI {
    public final InterfaceC11380iw A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        AbstractC167017dG.A1N(null, c3oo);
        C14360o3.A0B(this.A00, 2);
        throw AbstractC166987dD.A15("data");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new E3Q(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.chiclet, false));
    }

    public EXC(InterfaceC11380iw interfaceC11380iw) {
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return AbstractC36171Fxl.class;
    }
}
