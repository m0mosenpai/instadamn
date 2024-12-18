package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;

/* loaded from: classes7.dex */
public final class HIJ extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final InterfaceC16660sJ A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C38406Guh(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.row_appreciation_horizontal_scroll_item, false), this.A00, this.A01);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C39087HIl c39087HIl = (C39087HIl) interfaceC66482zP;
        C38406Guh c38406Guh = (C38406Guh) c3oo;
        AbstractC167017dG.A1N(c39087HIl, c38406Guh);
        C66362zD c66362zD = c38406Guh.A00;
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        A0E.A01(c39087HIl.A00);
        c66362zD.A05(A0E);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C39087HIl.class;
    }

    public HIJ(InterfaceC11380iw interfaceC11380iw, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC11380iw;
        this.A01 = interfaceC16660sJ;
    }
}
