package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EX2 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C31934E1o(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.suggested_blocks_header_text, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32621EXv c32621EXv = (C32621EXv) interfaceC66482zP;
        C31934E1o c31934E1o = (C31934E1o) c3oo;
        AbstractC167017dG.A1N(c32621EXv, c31934E1o);
        c31934E1o.A00.setText(c32621EXv.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32621EXv.class;
    }
}
