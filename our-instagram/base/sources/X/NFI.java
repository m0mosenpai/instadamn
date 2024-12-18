package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes9.dex */
public final class NFI extends AbstractC66422zJ {
    public static final NFI A00 = new Object();

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C51813MvH c51813MvH = (C51813MvH) interfaceC66482zP;
        C51307MlU c51307MlU = (C51307MlU) c3oo;
        AbstractC167017dG.A1N(c51813MvH, c51307MlU);
        c51307MlU.A00 = c51813MvH;
        c51307MlU.A01.setText(c51813MvH.A00);
        c51307MlU.A02.setVisibility(AbstractC167007dF.A05(c51813MvH.A01 ? 1 : 0));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C51813MvH.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        return new C51307MlU(layoutInflater, viewGroup);
    }
}
