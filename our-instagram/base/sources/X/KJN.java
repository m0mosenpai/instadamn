package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KJN extends AbstractC66422zJ {
    public View A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45191JzX c45191JzX = (C45191JzX) interfaceC66482zP;
        C44703Jqm c44703Jqm = (C44703Jqm) c3oo;
        AbstractC167017dG.A1N(c45191JzX, c44703Jqm);
        c44703Jqm.A00.setVisibility(AbstractC167007dF.A05(c45191JzX.A00 ? 1 : 0));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45191JzX.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_hall_pass_other_members_header, false);
        this.A00 = A0R;
        return new C44703Jqm(A0R);
    }
}
