package X;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NF8 extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final InterfaceC16660sJ A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C51328Mlp(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.layout_ai_agent_picker_item, false), this.A00, this.A01);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C51816MvK c51816MvK = (C51816MvK) interfaceC66482zP;
        C51328Mlp c51328Mlp = (C51328Mlp) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c51816MvK, c51328Mlp);
        c51328Mlp.A03.setUrl(c51816MvK.A00, c51328Mlp.A02);
        TextView textView = c51328Mlp.A00;
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(c51816MvK.A02);
        C85963sQ.A08(AbstractC37301Gc2.A03(c51328Mlp), A0H, A1R);
        textView.setText(A0H);
        String str = c51816MvK.A03;
        if (str != null && str.length() != 0) {
            TextView textView2 = c51328Mlp.A01;
            textView2.setVisibility(0);
            textView2.setText(str);
        } else {
            c51328Mlp.A01.setVisibility(8);
        }
        ViewOnClickListenerC55465OkK.A01(c51328Mlp.itemView, 22, c51816MvK, c51328Mlp);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C51816MvK.class;
    }

    public NF8(InterfaceC11380iw interfaceC11380iw, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC11380iw;
        this.A01 = interfaceC16660sJ;
    }
}
