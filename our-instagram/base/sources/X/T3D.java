package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes10.dex */
public final class T3D implements InterfaceC65385TjI {
    /* JADX WARN: Type inference failed for: r1v2, types: [X.3OO, X.Q9b] */
    @Override // X.InterfaceC65385TjI
    public final C3OO D8V(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        C2FP.A0E();
        View A0A = AbstractC31172DnG.A0A(AbstractC58322PtE.A0I(context, R.style.Ig4aFbPay_NullState), viewGroup, R.layout.hub_null_state);
        ?? c3oo = new C3OO(A0A);
        c3oo.A00 = AbstractC31173DnH.A0I(A0A, R.id.icon);
        c3oo.A02 = AbstractC31180DnO.A06(A0A);
        c3oo.A01 = AbstractC166997dE.A0T(A0A, R.id.subtitle);
        return c3oo;
    }
}
