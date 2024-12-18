package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class PTI implements Runnable {
    public final /* synthetic */ C51199Mjj A00;
    public final /* synthetic */ RecyclerView A01;
    public final /* synthetic */ N6U A02;
    public final /* synthetic */ boolean A03;

    public PTI(C51199Mjj c51199Mjj, RecyclerView recyclerView, N6U n6u, boolean z) {
        this.A01 = recyclerView;
        this.A02 = n6u;
        this.A03 = z;
        this.A00 = c51199Mjj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.A01;
        if (this.A02.A03 == null) {
            C14360o3.A0F("recyclerAdapter");
            throw C00O.createAndThrow();
        }
        C3OO A0V = recyclerView.A0V(r0.getItemCount() - 1);
        if (this.A03 && (A0V instanceof C52611NPg)) {
            AbstractC51370MmV abstractC51370MmV = (AbstractC51370MmV) A0V;
            AbstractC51370MmV.A01(abstractC51370MmV, new C57247PbV(abstractC51370MmV, 15));
        }
        recyclerView.A15(this.A00);
    }
}
