package X;

import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes8.dex */
public final class JoR extends C1I4 implements C07W {
    public final int A00 = 5;
    public final C45504KCt A01;
    public final C47639L1y A02;

    public JoR(C07X c07x, C45504KCt c45504KCt, C47639L1y c47639L1y) {
        this.A02 = c47639L1y;
        this.A01 = c45504KCt;
        c07x.getLifecycle().A09(this);
    }

    @OnLifecycleEvent(C07R.ON_START)
    public final void startObservingScroll() {
        this.A02.A02.A14(this);
    }

    @OnLifecycleEvent(C07R.ON_STOP)
    public final void stopObservingScroll() {
        this.A02.A02.A15(this);
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = C0f9.A03(1154831303);
        InterfaceC09390do interfaceC09390do = this.A01.A09;
        if (!((C44537Jmh) interfaceC09390do.getValue()).A00 && ((C44537Jmh) interfaceC09390do.getValue()).A07.A0D) {
            C47639L1y c47639L1y = this.A02;
            if (c47639L1y.A01.getItemCount() - c47639L1y.A00.A1b() < this.A00 && !((C44537Jmh) interfaceC09390do.getValue()).A00) {
                C44537Jmh c44537Jmh = (C44537Jmh) interfaceC09390do.getValue();
                C44537Jmh.A00(c44537Jmh, new C50537MSq(c44537Jmh, null, 10), false);
            }
        }
        C0f9.A0A(716957623, A03);
    }
}
