package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EYL extends AbstractC66422zJ {
    public final InterfaceC16660sJ A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C31959E2n(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.layout_ai_agent_category_pill, false), this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        InterfaceC09390do interfaceC09390do;
        C32079E8d c32079E8d = (C32079E8d) interfaceC66482zP;
        C31959E2n c31959E2n = (C31959E2n) c3oo;
        AbstractC167017dG.A1N(c32079E8d, c31959E2n);
        TextView textView = c31959E2n.A00;
        textView.setText(BHX.A00(AbstractC166997dE.A0L(c31959E2n.itemView), c32079E8d.A00));
        boolean z = c32079E8d.A02;
        textView.setSelected(z);
        if (z) {
            interfaceC09390do = c31959E2n.A02;
        } else {
            interfaceC09390do = c31959E2n.A01;
        }
        textView.setTextColor(AbstractC167027dH.A01(interfaceC09390do));
        ViewOnClickListenerC35683FpI.A00(textView, 36, c32079E8d, c31959E2n);
    }

    public EYL(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32079E8d.class;
    }
}
