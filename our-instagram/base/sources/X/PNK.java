package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class PNK implements Runnable {
    public final /* synthetic */ AbstractC51370MmV A00;

    public PNK(AbstractC51370MmV abstractC51370MmV) {
        this.A00 = abstractC51370MmV;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC51370MmV abstractC51370MmV = this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        InterfaceC09390do interfaceC09390do = abstractC51370MmV.A0A;
        View A0d = AbstractC166987dD.A0d(interfaceC09390do);
        if (A0d != null) {
            A0d.requestFocus();
        }
        View A0d2 = AbstractC166987dD.A0d(interfaceC09390do);
        if (A0d2 != null) {
            AbstractC13880nE.A0R(A0d2);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
