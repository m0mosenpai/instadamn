package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.EWo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32588EWo extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new E1M(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_broadcast_chat_activity_feed_v2_empty_state_section, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        E8U e8u = (E8U) interfaceC66482zP;
        E1M e1m = (E1M) c3oo;
        AbstractC167017dG.A1N(e8u, e1m);
        e1m.A00.setText(e8u.A00);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return E8U.class;
    }
}
