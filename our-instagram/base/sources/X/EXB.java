package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EXB extends AbstractC66412zI {
    public final InterfaceC16660sJ A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new E2Z(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.layout_call_survey_option, false), this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32078E8c c32078E8c = (C32078E8c) interfaceC66482zP;
        E2Z e2z = (E2Z) c3oo;
        AbstractC167017dG.A1N(c32078E8c, e2z);
        e2z.A00 = c32078E8c;
        e2z.A01.setText(c32078E8c.A01);
    }

    public EXB(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32078E8c.class;
    }
}
