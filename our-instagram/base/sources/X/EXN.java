package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EXN extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final InterfaceC37204GaF A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C31924E1e(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.selectable_user_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C36189Fy3 c36189Fy3 = (C36189Fy3) interfaceC66482zP;
        C31924E1e c31924E1e = (C31924E1e) c3oo;
        AbstractC167007dF.A1K(c36189Fy3, c31924E1e);
        C31953E2h c31953E2h = c31924E1e.A00;
        FNI fni = c36189Fy3.A00;
        InterfaceC37204GaF interfaceC37204GaF = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        AbstractC167007dF.A1D(c31953E2h, 0, interfaceC37204GaF);
        C14360o3.A0B(interfaceC11380iw, 4);
        FY8.A01(null, interfaceC11380iw, interfaceC37204GaF, c31953E2h, fni, false, false, false);
    }

    public EXN(InterfaceC11380iw interfaceC11380iw, InterfaceC37204GaF interfaceC37204GaF) {
        this.A01 = interfaceC37204GaF;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36189Fy3.class;
    }
}
