package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class U2I {
    public final /* synthetic */ AbstractC65919TwQ A00;

    public U2I(AbstractC65919TwQ abstractC65919TwQ) {
        this.A00 = abstractC65919TwQ;
    }

    public final void A00() {
        int i;
        AbstractC70663Fe abstractC70663Fe;
        AbstractC70663Fe abstractC70663Fe2;
        AbstractC65919TwQ abstractC65919TwQ = this.A00;
        RecyclerView recyclerView = abstractC65919TwQ.A0H().A00;
        if (recyclerView != null && (abstractC70663Fe2 = recyclerView.A0D) != null) {
            i = ((LinearLayoutManager) abstractC70663Fe2).A1c();
        } else {
            i = 0;
        }
        C65960TxC c65960TxC = abstractC65919TwQ.A07;
        if (c65960TxC == null) {
            C14360o3.A0F("dataSource");
            throw C00O.createAndThrow();
        }
        C65963TxG.A00(c65960TxC, abstractC65919TwQ);
        RecyclerView recyclerView2 = abstractC65919TwQ.A0H().A00;
        if (recyclerView2 != null && (abstractC70663Fe = recyclerView2.A0D) != null) {
            ((LinearLayoutManager) abstractC70663Fe).A1p(i, 0);
        }
    }
}
