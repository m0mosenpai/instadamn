package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.KHk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45621KHk extends AbstractC66412zI {
    public final C47433KxO A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44646Jpq(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.pending_threads_load_more_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45645KIi c45645KIi = (C45645KIi) interfaceC66482zP;
        C44646Jpq c44646Jpq = (C44646Jpq) c3oo;
        AbstractC167017dG.A1N(c45645KIi, c44646Jpq);
        TextView textView = c44646Jpq.A00;
        Context context = textView.getContext();
        int i = 2131960482;
        if (c45645KIi.A00) {
            i = 2131960483;
        }
        AbstractC166987dD.A1P(context, textView, i);
        ViewOnClickListenerC48074LPz.A01(textView, 31, this);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45645KIi.class;
    }

    public C45621KHk(C47433KxO c47433KxO) {
        this.A00 = c47433KxO;
    }
}
