package X;

/* renamed from: X.YCb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73410YCb implements YRK {
    public final YRK A00;
    public final Object A01 = AbstractC58318PtA.A0b();

    @Override // X.YRK, X.YNq
    public final void APm(Object obj) {
        synchronized (this.A01) {
            this.A00.APm(obj);
        }
    }

    @Override // X.YRK
    public final Object getState() {
        return this.A00.getState();
    }

    public C73410YCb(YRK yrk) {
        this.A00 = yrk;
    }
}
