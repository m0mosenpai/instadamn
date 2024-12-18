package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KJF extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C44694Jqd(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.layout_self_note_bottom_sheet_section_title, false), this);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45655KIs c45655KIs = (C45655KIs) interfaceC66482zP;
        C44694Jqd c44694Jqd = (C44694Jqd) c3oo;
        AbstractC167017dG.A1N(c45655KIs, c44694Jqd);
        c44694Jqd.A00.setText(c45655KIs.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45655KIs.class;
    }
}
