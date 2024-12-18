package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KHZ extends AbstractC66412zI {
    public final InterfaceC165317aK A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44717Jr0(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_shhmode_intro_qp, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C161447Lf c161447Lf = (C161447Lf) interfaceC66482zP;
        C44717Jr0 c44717Jr0 = (C44717Jr0) c3oo;
        AbstractC167017dG.A1N(c161447Lf, c44717Jr0);
        c44717Jr0.A02.setText(c161447Lf.A04);
        TextView textView = c44717Jr0.A01;
        textView.setText(c161447Lf.A03);
        textView.setTextColor(c161447Lf.A00);
        ViewOnClickListenerC48062LPn.A00(c44717Jr0.A00, 43, this);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C161447Lf.class;
    }

    public KHZ(InterfaceC165317aK interfaceC165317aK) {
        this.A00 = interfaceC165317aK;
    }
}
