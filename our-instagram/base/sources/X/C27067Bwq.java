package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Bwq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27067Bwq extends AbstractC66422zJ {
    public final Integer A00;
    public final InterfaceC16660sJ A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C25930BdX(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.creator_inspiration_hub_pill, false), this.A00, this.A01);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C26171Bhw c26171Bhw = (C26171Bhw) interfaceC66482zP;
        C25930BdX c25930BdX = (C25930BdX) c3oo;
        AbstractC167017dG.A1N(c26171Bhw, c25930BdX);
        if (c25930BdX.A01 != C05F.A00) {
            c25930BdX.A00.getLayoutParams().width = -2;
        }
        TextView textView = c25930BdX.A00;
        textView.setText(c26171Bhw.A01);
        textView.setSelected(c26171Bhw.A02);
        ViewOnClickListenerC28668ClG.A02(textView, 27, c26171Bhw, c25930BdX);
    }

    public C27067Bwq(Integer num, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = num;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C26171Bhw.class;
    }
}
