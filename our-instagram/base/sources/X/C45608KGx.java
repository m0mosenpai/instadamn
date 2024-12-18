package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.KGx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45608KGx extends AbstractC66412zI {
    public InterfaceC165317aK A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C161427Ld c161427Ld = (C161427Ld) interfaceC66482zP;
        C44696Jqf c44696Jqf = (C44696Jqf) c3oo;
        c44696Jqf.itemView.setBackgroundColor(c161427Ld.A00);
        TextView textView = c44696Jqf.A01;
        textView.setText(c161427Ld.A07);
        textView.setTextColor(c161427Ld.A02);
        TextView textView2 = c44696Jqf.A00;
        ViewOnClickListenerC48062LPn viewOnClickListenerC48062LPn = null;
        if (textView2 != null) {
            textView2.setText(c161427Ld.A06);
            textView2.setTextColor(c161427Ld.A03);
            if (c161427Ld.A0A) {
                viewOnClickListenerC48062LPn = new ViewOnClickListenerC48062LPn(this, 42);
            }
            C0fQ.A00(viewOnClickListenerC48062LPn, textView2);
            c44696Jqf.A02.setVisibility(8);
            textView2.setVisibility(0);
            View view = c44696Jqf.itemView;
            int i = c161427Ld.A01;
            AbstractC13880nE.A0i(view, i, i);
            return;
        }
        throw AbstractC166987dD.A15("setOnClickListener");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C44696Jqf(AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_shhmode_thread_title));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C161427Ld.class;
    }
}
