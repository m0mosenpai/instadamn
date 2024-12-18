package X;

/* renamed from: X.WwO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71573WwO implements Runnable {
    public final /* synthetic */ XCX A00;
    public final /* synthetic */ OVl A01;
    public final /* synthetic */ C15370ps A02;

    public RunnableC71573WwO(XCX xcx, OVl oVl, C15370ps c15370ps) {
        this.A01 = oVl;
        this.A02 = c15370ps;
        this.A00 = xcx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!AbstractC31177DnL.A1b(this.A01.A00)) {
            String str = (String) this.A02.A00;
            XCX xcx = this.A00;
            if (str != null) {
                xcx.D9V(str);
            } else {
                xcx.D7w();
            }
        }
    }
}
