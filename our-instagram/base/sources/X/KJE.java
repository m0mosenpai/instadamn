package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KJE extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C44693Jqc(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.layout_note_reactions_disclaimer_item, false), this);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45654KIr c45654KIr = (C45654KIr) interfaceC66482zP;
        C44693Jqc c44693Jqc = (C44693Jqc) c3oo;
        AbstractC167017dG.A1N(c45654KIr, c44693Jqc);
        c44693Jqc.A00.setText(c45654KIr.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45654KIr.class;
    }
}
