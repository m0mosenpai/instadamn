package X;

/* loaded from: classes9.dex */
public final class PNM implements Runnable {
    public final /* synthetic */ C52168N6x A00;

    public PNM(C52168N6x c52168N6x) {
        this.A00 = c52168N6x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C38067Gov c38067Gov = this.A00.A07;
        if (c38067Gov == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        c38067Gov.notifyDataSetChanged();
    }
}
