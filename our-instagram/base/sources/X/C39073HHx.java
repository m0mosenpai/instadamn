package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.HHx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39073HHx extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42299IoN c42299IoN = (C42299IoN) interfaceC66482zP;
        C38446GvT c38446GvT = (C38446GvT) c3oo;
        AbstractC167017dG.A1N(c42299IoN, c38446GvT);
        TextView textView = c38446GvT.A01;
        H82 h82 = (H82) c42299IoN.A00;
        textView.setText(h82.A01);
        c38446GvT.A00.setText(h82.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42299IoN.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C38446GvT(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.tagging_feed_null_state_shops, false));
    }
}
