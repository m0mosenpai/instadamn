package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Bwo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27065Bwo extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C25921BdO(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.encrypted_backups_fishfooding_screens_text, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C26170Bhv c26170Bhv = (C26170Bhv) interfaceC66482zP;
        C25921BdO c25921BdO = (C25921BdO) c3oo;
        AbstractC167017dG.A1N(c26170Bhv, c25921BdO);
        TextView textView = c25921BdO.A00;
        textView.setText(c26170Bhv.A00.A00);
        ViewOnClickListenerC28667ClF.A01(textView, 62, c26170Bhv);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C26170Bhv.class;
    }
}
