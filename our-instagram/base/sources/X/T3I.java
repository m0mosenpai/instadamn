package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes10.dex */
public final class T3I implements InterfaceC65385TjI {
    public final int A00;

    public T3I(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.3OO, X.Q9Z] */
    @Override // X.InterfaceC65385TjI
    public final C3OO D8V(ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(AbstractC58322PtE.A0I(viewGroup.getContext(), this.A00), viewGroup, R.layout.hub_link_item_row);
        ?? c3oo = new C3OO(A0A);
        TextView A06 = AbstractC31180DnO.A06(A0A);
        c3oo.A00 = A06;
        AbstractC56952jT.A01(A06);
        return c3oo;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public T3I() {
        this(R.style.Ig4aFbPay);
        C2FP.A0E();
    }
}
