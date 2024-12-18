package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

/* loaded from: classes9.dex */
public final class PTJ implements Runnable {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C3G2 A01;
    public final /* synthetic */ C69473Ah A02;
    public final /* synthetic */ C3M4 A03;

    public PTJ(InterfaceC11380iw interfaceC11380iw, C3G2 c3g2, C69473Ah c69473Ah, C3M4 c3m4) {
        this.A03 = c3m4;
        this.A02 = c69473Ah;
        this.A01 = c3g2;
        this.A00 = interfaceC11380iw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3M4 c3m4 = this.A03;
        C69473Ah c69473Ah = this.A02;
        C3G2 c3g2 = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        Map map = C3M4.A13;
        InterfaceC72953Ov interfaceC72953Ov = (InterfaceC72953Ov) c69473Ah.A00(c3m4.A0D);
        if (interfaceC72953Ov == null) {
            RecyclerView recyclerView = c69473Ah.A03;
            if (recyclerView != null) {
                AbstractC13880nE.A0q(recyclerView, new PTK(interfaceC11380iw, c3g2, c69473Ah, c3m4));
                return;
            }
            interfaceC72953Ov = null;
        }
        C3M4.A0Q(interfaceC11380iw, c3m4.A0H, c3m4, interfaceC72953Ov);
    }
}
