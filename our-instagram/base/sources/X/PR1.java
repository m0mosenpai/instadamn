package X;

/* loaded from: classes9.dex */
public final class PR1 implements Runnable {
    public final /* synthetic */ JIN A00;
    public final /* synthetic */ C52168N6x A01;

    public PR1(JIN jin, C52168N6x c52168N6x) {
        this.A01 = c52168N6x;
        this.A00 = jin;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C52168N6x c52168N6x = this.A01;
        C38067Gov c38067Gov = c52168N6x.A07;
        if (c38067Gov == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        c38067Gov.notifyItemChanged(C52168N6x.A00(this.A00, c52168N6x));
    }
}
