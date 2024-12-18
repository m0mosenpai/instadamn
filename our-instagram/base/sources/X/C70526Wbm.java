package X;

/* renamed from: X.Wbm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70526Wbm implements InterfaceC98454bO {
    public final long A00;
    public final C69745Vuf A01;

    @Override // X.InterfaceC98454bO
    public final boolean Cca() {
        return false;
    }

    @Override // X.InterfaceC98454bO
    public final long Azt() {
        return this.A00;
    }

    public C70526Wbm(long j, long j2) {
        W5Q w5q;
        this.A00 = j;
        if (j2 == 0) {
            w5q = W5Q.A02;
        } else {
            w5q = new W5Q(0L, j2);
        }
        this.A01 = new C69745Vuf(w5q, w5q);
    }

    @Override // X.InterfaceC98454bO
    public final C69745Vuf Bs5(long j) {
        return this.A01;
    }

    @Override // X.InterfaceC98454bO
    public final /* synthetic */ long CAK(int i) {
        return this.A00;
    }
}
