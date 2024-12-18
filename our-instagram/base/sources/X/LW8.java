package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class LW8 implements YO0 {
    public final /* synthetic */ LK0 A00;
    public final /* synthetic */ C1336561u A01;
    public final /* synthetic */ List A02;

    public LW8(LK0 lk0, C1336561u c1336561u, List list) {
        this.A01 = c1336561u;
        this.A00 = lk0;
        this.A02 = list;
    }

    @Override // X.YO0
    public final void D6a(C5KS c5ks) {
        C14360o3.A0B(c5ks, 0);
        C1336561u c1336561u = this.A01;
        c1336561u.A02.execute(new M66(this.A00, c1336561u, c5ks, this.A02));
    }
}
