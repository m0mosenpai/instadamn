package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EXA extends AbstractC66412zI {
    public final InterfaceC16660sJ A00;

    public EXA(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 1);
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new E34(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.layout_cowatch_closed_caption_option, false), this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C36201FyF c36201FyF = (C36201FyF) interfaceC66482zP;
        E34 e34 = (E34) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c36201FyF, e34);
        e34.A00 = c36201FyF;
        e34.A01.setText(c36201FyF.A02);
        if (c36201FyF.A00 == c36201FyF.A01) {
            e34.A02.setChecked(A1a);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36201FyF.class;
    }
}
