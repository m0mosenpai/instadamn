package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EYE extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E2R(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fan_club_empty_results, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32616EXq c32616EXq = (C32616EXq) interfaceC66482zP;
        E2R e2r = (E2R) c3oo;
        AbstractC167017dG.A1N(c32616EXq, e2r);
        C5QE c5qe = c32616EXq.A00;
        C14360o3.A0B(c5qe, 0);
        e2r.A02.setText(BHX.A00(AbstractC166997dE.A0L(e2r.A01), c5qe));
        e2r.A00 = c5qe;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32616EXq.class;
    }
}
