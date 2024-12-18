package X;

/* renamed from: X.PQm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56996PQm implements Runnable {
    public final /* synthetic */ NMX A00;
    public final /* synthetic */ String A01;

    public RunnableC56996PQm(NMX nmx, String str) {
        this.A00 = nmx;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NMX nmx = this.A00;
        MSW.A0b(nmx.A0Y).ESH(this.A01);
        NMX.A09(nmx);
    }
}
