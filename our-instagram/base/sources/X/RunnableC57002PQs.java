package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.PQs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57002PQs implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ N6t A01;

    public RunnableC57002PQs(N6t n6t, int i) {
        this.A01 = n6t;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC70663Fe abstractC70663Fe;
        N6t n6t = this.A01;
        InterfaceC09390do interfaceC09390do = n6t.A04;
        ((AbstractC110824yu) interfaceC09390do.getValue()).A00 = this.A00;
        RecyclerView recyclerView = n6t.A00;
        if (recyclerView != null && (abstractC70663Fe = recyclerView.A0D) != null) {
            abstractC70663Fe.A10((AbstractC110824yu) interfaceC09390do.getValue());
        }
    }
}
