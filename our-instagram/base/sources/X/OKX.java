package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes9.dex */
public final class OKX {
    public RecyclerView A00;
    public final C51132Mib A01;

    public final void A00(RecyclerView recyclerView) {
        Context context;
        this.A00 = recyclerView;
        C51132Mib c51132Mib = this.A01;
        recyclerView.setAdapter(c51132Mib);
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            context = recyclerView2.getContext();
        } else {
            context = null;
        }
        AbstractC31174DnI.A17(context, recyclerView, false);
        if (recyclerView.A12.size() == 0) {
            Context context2 = recyclerView.getContext();
            AbstractC37304Gc5.A0z(recyclerView, AbstractC167017dG.A03(context2), AbstractC167017dG.A06(context2));
        }
        RecyclerView recyclerView3 = this.A00;
        if (recyclerView3 != null) {
            recyclerView3.setVisibility(MSY.A01(c51132Mib.getItemCount()));
        }
    }

    public final void A01(List list) {
        C51132Mib c51132Mib = this.A01;
        List list2 = c51132Mib.A01;
        list2.clear();
        list2.addAll(list);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setVisibility(MSY.A01(c51132Mib.getItemCount()));
        }
        c51132Mib.notifyDataSetChanged();
    }

    public OKX(InterfaceC58083Pp8 interfaceC58083Pp8, boolean z) {
        this.A01 = new C51132Mib(interfaceC58083Pp8, z);
    }
}
