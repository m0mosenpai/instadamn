package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes10.dex */
public final class T3B implements InterfaceC65385TjI {
    /* JADX WARN: Type inference failed for: r1v2, types: [X.3OO, X.Q9Y] */
    @Override // X.InterfaceC65385TjI
    public final C3OO D8V(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        C2FP.A0E();
        View A0A = AbstractC31172DnG.A0A(AbstractC58322PtE.A0I(context, R.style.Ig4aFbPay), viewGroup, R.layout.hub_disclaimer_item_row);
        ?? c3oo = new C3OO(A0A);
        TextView A0T = AbstractC166997dE.A0T(A0A, R.id.disclaimer);
        c3oo.A00 = A0T;
        AbstractC25227BEk.A11(A0T);
        return c3oo;
    }
}
