package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class EXK extends AbstractC66412zI {
    public final String A00;
    public final String A01;

    public EXK(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new E2N(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_order_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C36186Fy0 c36186Fy0 = (C36186Fy0) interfaceC66482zP;
        E2N e2n = (E2N) c3oo;
        AbstractC167017dG.A1N(c36186Fy0, e2n);
        Context A0L = AbstractC166997dE.A0L(e2n.itemView);
        IgTextView igTextView = e2n.A01;
        C34542FKc c34542FKc = c36186Fy0.A00;
        igTextView.setText(c34542FKc.A01);
        e2n.A02.setText(c34542FKc.A02);
        e2n.A00.setText(c34542FKc.A00);
        ViewOnClickListenerC35684FpJ.A00(e2n.itemView, A0L, this, c36186Fy0, 23);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36186Fy0.class;
    }
}
