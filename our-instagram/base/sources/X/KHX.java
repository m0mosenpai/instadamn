package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KHX extends AbstractC66412zI {
    public final InterfaceC165237aC A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.collapsable_message, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
        return new C44760Jrh((TextView) inflate);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        K2B k2b = (K2B) interfaceC66482zP;
        C44760Jrh c44760Jrh = (C44760Jrh) c3oo;
        AbstractC167017dG.A1N(k2b, c44760Jrh);
        TextView textView = c44760Jrh.A00;
        textView.setText(k2b.A04);
        textView.setTextColor(k2b.A01);
        textView.setBackgroundColor(k2b.A00);
        int i = 23;
        if (k2b.A06) {
            i = 22;
        }
        LQ1.A00(textView, i, this, k2b);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return K2B.class;
    }

    public KHX(InterfaceC165237aC interfaceC165237aC) {
        this.A00 = interfaceC165237aC;
    }
}
