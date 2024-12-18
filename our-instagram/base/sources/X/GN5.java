package X;

/* loaded from: classes6.dex */
public final class GN5 implements Runnable {
    public final /* synthetic */ ENZ A00;

    public GN5(ENZ enz) {
        this.A00 = enz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EQM eqm = this.A00.A0A;
        if (eqm == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        eqm.A03();
    }
}
