package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EYN extends AbstractC66422zJ {
    public final FFR A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E2K(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.prompts_suggestion, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        E8V e8v = (E8V) interfaceC66482zP;
        E2K e2k = (E2K) c3oo;
        boolean A1a = AbstractC167017dG.A1a(e8v, e2k);
        FFR ffr = this.A00;
        C14360o3.A0B(ffr, A1a ? 1 : 0);
        e2k.A01 = e8v;
        e2k.A00 = ffr;
        e2k.A02.setText(e8v.A00);
    }

    public EYN(FFR ffr) {
        this.A00 = ffr;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return E8V.class;
    }
}
