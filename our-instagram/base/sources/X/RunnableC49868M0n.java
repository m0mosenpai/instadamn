package X;

/* renamed from: X.M0n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49868M0n implements Runnable {
    public final /* synthetic */ C44520JmQ A00;

    public RunnableC49868M0n(C44520JmQ c44520JmQ) {
        this.A00 = c44520JmQ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C44520JmQ c44520JmQ = this.A00;
        if (!c44520JmQ.A00.hasNext()) {
            c44520JmQ.A00 = c44520JmQ.A03.listIterator();
        }
        int A0H = AbstractC166987dD.A0H(c44520JmQ.A00.next());
        C05A c05a = c44520JmQ.A04;
        c05a.getValue();
        c05a.Egh(new C51755Mte(Integer.valueOf(A0H), 5));
        c44520JmQ.A01.postDelayed(this, 4000L);
    }
}
