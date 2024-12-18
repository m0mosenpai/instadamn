package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class HIC extends AbstractC66412zI {
    public final IDA A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42298IoM c42298IoM = (C42298IoM) interfaceC66482zP;
        Gv8 gv8 = (Gv8) c3oo;
        AbstractC167017dG.A1N(c42298IoM, gv8);
        IDA ida = this.A00;
        C14360o3.A0B(ida, 2);
        TextView textView = gv8.A00;
        textView.setText(c42298IoM.A00.A01);
        ViewOnClickListenerC38053Gog.A03(textView, 7, ida, c42298IoM);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42298IoM.class;
    }

    public HIC(IDA ida) {
        this.A00 = ida;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new Gv8(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.tagging_feed_expansion, false));
    }
}
