package X;

import java.util.ArrayList;

/* renamed from: X.PRw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57031PRw implements Runnable {
    public final /* synthetic */ C9J0 A00;
    public final /* synthetic */ AbstractC51174MjI A01;

    public RunnableC57031PRw(C9J0 c9j0, AbstractC51174MjI abstractC51174MjI) {
        this.A01 = abstractC51174MjI;
        this.A00 = c9j0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N5T n5t = this.A01.A09;
        C9J0 c9j0 = this.A00;
        C75E c75e = (C75E) n5t.A0E.getValue();
        ArrayList A1M = AbstractC16960so.A1M(c9j0);
        C141796aw A00 = AbstractC141776au.A00(c75e);
        AbstractC23641Du.A05(AnonymousClass191.A00, new C57171PZp(A1M, c75e, (InterfaceC23621Ds) null, 18), A00);
    }
}
