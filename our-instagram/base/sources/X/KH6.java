package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KH6 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C3OO(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.poll_message_question_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45195Jzb c45195Jzb = (C45195Jzb) interfaceC66482zP;
        AbstractC167017dG.A1N(c45195Jzb, c3oo);
        View view = c3oo.itemView;
        C14360o3.A0C(view, "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView");
        ((TextView) view).setText(c45195Jzb.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45195Jzb.class;
    }
}
