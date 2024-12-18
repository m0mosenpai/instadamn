package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.List;

/* loaded from: classes8.dex */
public final class KI2 extends AbstractC66412zI {
    public final Context A00;
    public final C47435KxQ A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44699Jqi(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.pending_threads_inbox_sort_and_filter_row, false), this.A01);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        LZN lzn = (LZN) interfaceC66482zP;
        C44699Jqi c44699Jqi = (C44699Jqi) c3oo;
        AbstractC167007dF.A1K(lzn, c44699Jqi);
        c44699Jqi.A02.setText(2131960117);
        List list = lzn.A00;
        if (AbstractC166987dD.A1b(list)) {
            TextView textView = c44699Jqi.A01;
            textView.setText(AbstractC25226BEj.A1H(", ", JUD.A00(list, 40), new C50261MHq(this, 44)));
            textView.setVisibility(0);
            return;
        }
        c44699Jqi.A01.setVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZN.class;
    }

    public KI2(Context context, C47435KxQ c47435KxQ) {
        this.A00 = context;
        this.A01 = c47435KxQ;
    }
}
