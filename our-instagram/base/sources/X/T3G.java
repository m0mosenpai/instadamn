package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes10.dex */
public final class T3G implements InterfaceC65385TjI {
    public final int A00;

    public T3G(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.3OO, X.Q9a] */
    @Override // X.InterfaceC65385TjI
    public final C3OO D8V(ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(AbstractC58322PtE.A0I(viewGroup.getContext(), this.A00), viewGroup, R.layout.hub_header_view);
        ?? c3oo = new C3OO(A0A);
        TextView A0T = AbstractC166997dE.A0T(A0A, R.id.hub_header);
        c3oo.A01 = A0T;
        A0T.setFocusable(true);
        c3oo.A00 = AbstractC166997dE.A0T(A0A, R.id.cta_button);
        AbstractC010103p.A0I(c3oo.A01, true);
        AbstractC56952jT.A01(c3oo.A00);
        return c3oo;
    }
}
