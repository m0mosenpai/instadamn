package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes9.dex */
public final class NF6 extends AbstractC66422zJ {
    public final C52177N7m A00;

    @Override // X.AbstractC66422zJ
    public final C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C51230MkF(AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.trials_loading_state, viewGroup, false), 1);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        Ok4 ok4;
        C52361NEz c52361NEz = (C52361NEz) interfaceC66482zP;
        AbstractC167017dG.A1N(c52361NEz, c3oo);
        SpinnerImageView spinnerImageView = (SpinnerImageView) c3oo.itemView.findViewById(R.id.loading_indicator);
        if (c52361NEz.A00) {
            spinnerImageView.setLoadingStatus(C3T1.FAILED);
            ok4 = new Ok4(this, 2);
        } else {
            AbstractC31171DnF.A1M(spinnerImageView);
            ok4 = null;
        }
        C0fQ.A00(ok4, spinnerImageView);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52361NEz.class;
    }

    public NF6(C52177N7m c52177N7m) {
        this.A00 = c52177N7m;
    }
}
