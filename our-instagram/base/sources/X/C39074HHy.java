package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.HHy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39074HHy extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        TextView textView;
        int i;
        C42300IoO c42300IoO = (C42300IoO) interfaceC66482zP;
        C38447GvU c38447GvU = (C38447GvU) c3oo;
        AbstractC167017dG.A1N(c42300IoO, c38447GvU);
        C51740MtP c51740MtP = c42300IoO.A00;
        if (!c51740MtP.A01) {
            textView = c38447GvU.A01;
            i = 2131965660;
        } else {
            String str = c51740MtP.A00;
            if (AbstractC001900j.A0T(str)) {
                textView = c38447GvU.A01;
                i = 2131973064;
            } else {
                AbstractC31177DnL.A0r(c38447GvU.A00, c38447GvU.A01, str, 2131973065);
                return;
            }
        }
        textView.setText(i);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42300IoO.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C38447GvU(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.tagging_feed_spinner, false));
    }
}
