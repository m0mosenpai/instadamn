package X;

/* loaded from: classes6.dex */
public final class GNO implements Runnable {
    public final /* synthetic */ C32529EUf A00;
    public final /* synthetic */ String A01;

    public GNO(C32529EUf c32529EUf, String str) {
        this.A00 = c32529EUf;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C32529EUf c32529EUf = this.A00;
        if (!c32529EUf.A00.requireActivity().isFinishing()) {
            boolean z = C3CZ.A0G;
            C69923Cb.A03(c32529EUf.A01, c32529EUf.A02, this.A01);
        }
    }
}
