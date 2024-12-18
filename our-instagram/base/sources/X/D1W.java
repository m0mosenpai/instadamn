package X;

/* loaded from: classes5.dex */
public final class D1W implements Runnable {
    public final /* synthetic */ C3MT A00;
    public final /* synthetic */ Long A01;

    public D1W(C3MT c3mt, Long l) {
        this.A00 = c3mt;
        this.A01 = l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3MR c3mr = this.A00.A01;
        if (c3mr != null) {
            c3mr.Dih(this.A01.longValue());
        }
    }
}
