package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KH1 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44681JqQ(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.row_appreciation_monthly_earnings, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45199Jzf c45199Jzf = (C45199Jzf) interfaceC66482zP;
        C44681JqQ c44681JqQ = (C44681JqQ) c3oo;
        AbstractC167007dF.A1K(c45199Jzf, c44681JqQ);
        c44681JqQ.A00.setText(c45199Jzf.A00);
        c44681JqQ.A01.setText(c45199Jzf.A01);
        c44681JqQ.A02.A0K(c45199Jzf.A02, false);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45199Jzf.class;
    }
}
