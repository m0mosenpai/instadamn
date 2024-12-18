package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EYK extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E23(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_profile_edit_bottom_message_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C36188Fy2 c36188Fy2 = (C36188Fy2) interfaceC66482zP;
        E23 e23 = (E23) c3oo;
        AbstractC167017dG.A1N(c36188Fy2, e23);
        AbstractC31176DnK.A1G(e23.A00, c36188Fy2.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36188Fy2.class;
    }
}
