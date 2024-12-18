package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.KHj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45620KHj extends AbstractC66412zI {
    public final C47432KxN A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44645Jpp(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.pending_threads_load_more_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45644KIh c45644KIh = (C45644KIh) interfaceC66482zP;
        C44645Jpp c44645Jpp = (C44645Jpp) c3oo;
        AbstractC167017dG.A1N(c45644KIh, c44645Jpp);
        TextView textView = c44645Jpp.A00;
        Context context = textView.getContext();
        int i = 2131960072;
        if (c45644KIh.A00) {
            i = 2131960073;
        }
        AbstractC166987dD.A1P(context, textView, i);
        ViewOnClickListenerC48074LPz.A01(textView, 30, this);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45644KIh.class;
    }

    public C45620KHj(C47432KxN c47432KxN) {
        this.A00 = c47432KxN;
    }
}
