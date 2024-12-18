package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public abstract class OY0 {
    public static final void A01(View view, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(view, 0);
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A04 = new C52374NFq(interfaceC16820sZ, 23);
        A0s.A07 = true;
        A0s.A00();
    }

    public static final InterfaceC09390do A00(AbstractC59962oe abstractC59962oe, int i) {
        return AbstractC09440dt.A00(EnumC09460dv.A02, new C57249PbX(i, 33, abstractC59962oe));
    }

    public static final void A02(RecyclerView recyclerView, int i) {
        Integer valueOf = Integer.valueOf(i);
        int i2 = 0;
        if (valueOf != null) {
            Context A0L = AbstractC166997dE.A0L(recyclerView);
            i2 = (int) AbstractC13880nE.A00(A0L, A0L.getResources().getDimension(valueOf.intValue()));
        }
        recyclerView.A10(new C51184MjS(i2, 4));
    }
}
