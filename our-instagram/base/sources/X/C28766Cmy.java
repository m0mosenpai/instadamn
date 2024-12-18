package X;

import java.util.List;

/* renamed from: X.Cmy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28766Cmy implements InterfaceC30905DiI {
    public final List A00 = AbstractC166987dD.A1E();
    public final /* synthetic */ C6MH A01;

    public C28766Cmy(C6MH c6mh) {
        this.A01 = c6mh;
    }

    @Override // X.InterfaceC30905DiI
    public final void EM5(int i) {
        long j = AbstractC27741CLi.A00;
        C6MH c6mh = this.A01;
        C138126Nq c138126Nq = c6mh.A00;
        if (c138126Nq != null) {
            this.A00.add(new C25277BGr(c138126Nq, c6mh.A01, i, j));
        }
    }
}
