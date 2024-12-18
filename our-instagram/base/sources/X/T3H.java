package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;

/* loaded from: classes10.dex */
public final class T3H implements InterfaceC65385TjI {
    public final int A00;
    public final InterfaceC65386TjJ A01;

    public T3H(InterfaceC65386TjJ interfaceC65386TjJ, int i) {
        this.A00 = i;
        this.A01 = interfaceC65386TjJ;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.3OO, X.Q9e] */
    @Override // X.InterfaceC65385TjI
    public final C3OO D8V(ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(AbstractC58322PtE.A0I(viewGroup.getContext(), this.A00), viewGroup, R.layout.hub_item_row);
        ?? c3oo = new C3OO(A0A);
        c3oo.A01 = AbstractC31173DnH.A0I(A0A, R.id.icon);
        c3oo.A04 = AbstractC31180DnO.A06(A0A);
        c3oo.A03 = AbstractC166997dE.A0T(A0A, R.id.subtitle);
        c3oo.A02 = AbstractC166997dE.A0T(A0A, R.id.description);
        ViewStub A0G = AbstractC31173DnH.A0G(A0A, R.id.rightView);
        c3oo.A00 = A0G;
        c3oo.A05 = this.A01.D8Z(A0G);
        return c3oo;
    }
}
