package X;

import java.util.List;

/* renamed from: X.PQj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56993PQj implements Runnable {
    public final /* synthetic */ C54971OTd A00;
    public final /* synthetic */ C3O0 A01;

    public RunnableC56993PQj(C54971OTd c54971OTd, C3O0 c3o0) {
        this.A01 = c3o0;
        this.A00 = c54971OTd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3O0 c3o0 = this.A01;
        if (!c3o0.A0C) {
            ((C55982hj) c3o0.A0N.getValue()).A03();
            return;
        }
        if (c3o0.A06 != null) {
            C54971OTd c54971OTd = this.A00;
            c54971OTd.A02.F9j(c3o0);
            List list = c3o0.A0L;
            C14360o3.A07(list);
            list.add(0, c54971OTd);
            c3o0.A06 = null;
        }
        c3o0.A0B = C05F.A00;
    }
}
