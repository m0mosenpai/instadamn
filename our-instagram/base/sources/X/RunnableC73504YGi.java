package X;

/* renamed from: X.YGi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73504YGi implements Runnable {
    public final /* synthetic */ RunnableC73549YIw A00;

    public RunnableC73504YGi(RunnableC73549YIw runnableC73549YIw) {
        this.A00 = runnableC73549YIw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        YN2 yn2 = this.A00.A04;
        if (yn2 != null) {
            C22878A6y c22878A6y = ((C73477YFa) yn2).A00;
            C8PR c8pr = c22878A6y.A01;
            if (c8pr.A06 != C05F.A00) {
                if (AbstractC166987dD.A1b(c22878A6y.A00.A0E.A0H)) {
                    num = C05F.A0Y;
                } else {
                    num = C05F.A0C;
                }
                c8pr.A0E(num);
            }
        }
    }
}
