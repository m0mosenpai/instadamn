package X;

import java.util.List;

/* renamed from: X.GNz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36904GNz implements Runnable {
    public final /* synthetic */ G3O A00;
    public final /* synthetic */ List A01;

    public RunnableC36904GNz(G3O g3o, List list) {
        this.A01 = list;
        this.A00 = g3o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<C160787Im> list = this.A01;
        G3O g3o = this.A00;
        for (C160787Im c160787Im : list) {
            g3o.A01.BT6().EZ9(C05F.A0C, c160787Im.A0e.A0i(), false);
        }
    }
}
