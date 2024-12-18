package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NF5 extends AbstractC66422zJ {
    public final C52177N7m A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C3OO(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.trials_empty_state, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56073Ouq c56073Ouq = (C56073Ouq) interfaceC66482zP;
        boolean A1a = AbstractC167017dG.A1a(c56073Ouq, c3oo);
        C52177N7m c52177N7m = this.A00;
        C14360o3.A0B(c52177N7m, A1a ? 1 : 0);
        View findViewById = c3oo.itemView.findViewById(R.id.empty_state_create_new_trial);
        if (findViewById != null) {
            findViewById.setEnabled(c56073Ouq.A00);
            ViewOnClickListenerC55468OkN.A00(findViewById, 17, c52177N7m, c56073Ouq);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56073Ouq.class;
    }

    public NF5(C52177N7m c52177N7m) {
        this.A00 = c52177N7m;
    }
}
