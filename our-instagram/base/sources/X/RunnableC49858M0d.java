package X;

/* renamed from: X.M0d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49858M0d implements Runnable {
    public final /* synthetic */ C164667Yf A00;

    public RunnableC49858M0d(C164667Yf c164667Yf) {
        this.A00 = c164667Yf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C164667Yf c164667Yf = this.A00;
        ((C7IY) c164667Yf.A0H.invoke()).AZT().notifyDataSetChanged();
        C162307Os c162307Os = c164667Yf.A02;
        if (c162307Os != null) {
            c162307Os.A05(false, null);
        }
    }
}
