package X;

import java.util.List;

/* renamed from: X.PQi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56992PQi implements Runnable {
    public final /* synthetic */ IKG A00;
    public final /* synthetic */ C3O0 A01;

    public RunnableC56992PQi(IKG ikg, C3O0 c3o0) {
        this.A01 = c3o0;
        this.A00 = ikg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3O0 c3o0 = this.A01;
        if (!c3o0.A0C) {
            ((C55982hj) c3o0.A0N.getValue()).A03();
            return;
        }
        List list = c3o0.A0J;
        C14360o3.A07(list);
        list.add(0, this.A00);
        c3o0.A05 = null;
        c3o0.A0B = C05F.A00;
    }
}
