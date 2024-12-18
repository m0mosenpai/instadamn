package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NF4 extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51306MlT(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_quick_snap_reaction_item, false), this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56096OvG c56096OvG = (C56096OvG) interfaceC66482zP;
        C51306MlT c51306MlT = (C51306MlT) c3oo;
        AbstractC167017dG.A1N(c56096OvG, c51306MlT);
        c51306MlT.A02.setUrl(c56096OvG.A00.Bhu(), c51306MlT.A00);
        c51306MlT.A01.setText(c56096OvG.A01);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56096OvG.class;
    }

    public NF4(InterfaceC11380iw interfaceC11380iw) {
        this.A00 = interfaceC11380iw;
    }
}
