package X;

/* renamed from: X.AyE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24792AyE implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass983 A01;
    public final /* synthetic */ C189478aR A02;

    public RunnableC24792AyE(AnonymousClass983 anonymousClass983, C189478aR c189478aR, int i) {
        this.A01 = anonymousClass983;
        this.A00 = i;
        this.A02 = c189478aR;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C56352iT c56352iT = this.A01.A04;
        if (c56352iT != null) {
            c56352iT.A0O.setBackgroundColor(this.A00);
        }
        C189478aR c189478aR = this.A02;
        if (c189478aR != null) {
            int i = this.A00;
            c189478aR.A0B(i, i);
        }
    }
}
