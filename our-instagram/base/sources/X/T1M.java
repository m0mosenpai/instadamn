package X;

/* loaded from: classes10.dex */
public final class T1M implements InterfaceC65369Tj1 {
    public final C62912SWt A00;

    @Override // X.InterfaceC65369Tj1
    public final int Aew() {
        int i;
        C62912SWt c62912SWt = this.A00;
        synchronized (c62912SWt) {
            int A07 = AbstractC58318PtA.A07(C62912SWt.A05.get(c62912SWt.A03.get()));
            i = 900;
            if (A07 <= 900) {
                i = Math.max(A07, 60);
            }
        }
        return i;
    }

    public T1M(C62912SWt c62912SWt) {
        this.A00 = c62912SWt;
    }
}
