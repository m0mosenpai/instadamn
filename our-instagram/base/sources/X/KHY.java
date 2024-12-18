package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KHY extends AbstractC66412zI {
    public final InterfaceC165587al A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44635Jpf(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_shh_mode_interleaved_footer, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C161437Le c161437Le = (C161437Le) interfaceC66482zP;
        C44635Jpf c44635Jpf = (C44635Jpf) c3oo;
        AbstractC167017dG.A1N(c161437Le, c44635Jpf);
        TextView textView = c44635Jpf.A00;
        textView.setText(c161437Le.A03);
        textView.setBackgroundColor(c161437Le.A00);
        ViewOnClickListenerC48062LPn.A00(textView, 41, this);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C161437Le.class;
    }

    public KHY(InterfaceC165587al interfaceC165587al) {
        this.A00 = interfaceC165587al;
    }
}
