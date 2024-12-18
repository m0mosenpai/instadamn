package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KI1 extends AbstractC66412zI {
    public final InterfaceC16660sJ A00;
    public final InterfaceC16660sJ A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44723Jr6(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.muted_word_list_item_editable, false), this.A00, this.A01);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45285K2n c45285K2n = (C45285K2n) interfaceC66482zP;
        C44723Jr6 c44723Jr6 = (C44723Jr6) c3oo;
        AbstractC167017dG.A1N(c45285K2n, c44723Jr6);
        c44723Jr6.A00.setText(c45285K2n.A01);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45285K2n.class;
    }

    public KI1(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        this.A00 = interfaceC16660sJ;
        this.A01 = interfaceC16660sJ2;
    }
}
