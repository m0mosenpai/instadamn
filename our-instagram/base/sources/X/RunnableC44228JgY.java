package X;

/* renamed from: X.JgY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44228JgY implements Runnable {
    public final /* synthetic */ C5TA A00;
    public final /* synthetic */ C4S7 A01;

    public RunnableC44228JgY(C5TA c5ta, C4S7 c4s7) {
        this.A00 = c5ta;
        this.A01 = c4s7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5TA c5ta = this.A00;
        C4QW c4qw = c5ta.A06;
        C3Q0 c3q0 = ((C4QT) c4qw).A0M;
        C14360o3.A07(c3q0);
        if (c3q0 != C3Q0.PLAYING) {
            c4qw.E4T("start", false);
        }
        C4S7 c4s7 = this.A01;
        boolean z = c4s7.A00;
        C44218JgN c44218JgN = c5ta.A07;
        if (z) {
            c44218JgN.A02(0);
        } else {
            c44218JgN.A00(0.0f, 0);
        }
        c5ta.A00.Dzb(c4s7);
    }
}
