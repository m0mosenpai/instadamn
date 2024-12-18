package X;

/* renamed from: X.WvJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71514WvJ implements Runnable {
    public final /* synthetic */ V7Z A00;
    public final /* synthetic */ V1B A01;

    public RunnableC71514WvJ(V7Z v7z, V1B v1b) {
        this.A01 = v1b;
        this.A00 = v7z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int AVT;
        V1B v1b = this.A01;
        if (v1b.mView != null) {
            C38321qM A0h = AbstractC25229BEm.A0h(v1b.A02, this.A00.A02);
            if (A0h != null && v1b.A06.A04 != null) {
                C68034V7f c68034V7f = v1b.A07;
                AbstractC127945qN A04 = C68034V7f.A00(c68034V7f.A00, c68034V7f).A04(A0h);
                if (A04 != null && (AVT = v1b.A05.AVT(A04)) != -1) {
                    v1b.A06.A04.A0o(AVT);
                }
            }
        }
    }
}
