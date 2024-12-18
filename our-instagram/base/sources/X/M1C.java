package X;

/* loaded from: classes8.dex */
public final class M1C implements Runnable {
    public final /* synthetic */ C7L5 A00;

    public M1C(C7L5 c7l5) {
        this.A00 = c7l5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7L5 c7l5 = this.A00;
        c7l5.A02 = false;
        C7IN c7in = c7l5.A0A;
        c7in.A02 = null;
        C5TA c5ta = c7in.A03;
        if (c5ta != null) {
            c5ta.A0A("fragment_paused");
            c7in.A03 = null;
        }
        C7IN.A00(c7in);
        c7in.A04 = C05F.A00;
        c7in.A07.A00 = null;
        c7l5.A00 = null;
        C7LU c7lu = c7l5.A09;
        if (c7lu != null) {
            c7lu.A01();
        }
        if (c7l5.A0F) {
            c7in.A00 = null;
            AbstractC23021Ah.A00(c7l5.A06).A19(c7l5.A0C);
        }
    }
}
