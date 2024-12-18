package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NE5 extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C51279Ml2(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_broadcast_chat_activity_feed_v2_header_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C51810MvE c51810MvE = (C51810MvE) interfaceC66482zP;
        C51279Ml2 c51279Ml2 = (C51279Ml2) c3oo;
        AbstractC167007dF.A1K(c51810MvE, c51279Ml2);
        String str = c51810MvE.A00;
        boolean A1N = AbstractC167007dF.A1N(str.length());
        TextView textView = c51279Ml2.A01;
        if (A1N) {
            textView.setVisibility(8);
            c51279Ml2.A00.setVisibility(0);
        } else {
            textView.setVisibility(0);
            c51279Ml2.A00.setVisibility(8);
            textView.setText(str);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C51810MvE.class;
    }
}
