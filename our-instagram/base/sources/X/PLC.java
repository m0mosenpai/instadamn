package X;

/* loaded from: classes9.dex */
public final class PLC implements Runnable {
    public final /* synthetic */ OLA A00;

    public PLC(OLA ola) {
        this.A00 = ola;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        OLA ola = this.A00;
        if (ola.A01) {
            C4RG c4rg = ola.A02;
            AH6 ah6 = ola.A00;
            C14360o3.A0A(ah6);
            int A00 = c4rg.A00(ah6);
            if (A00 != 1) {
                if (A00 == 2) {
                    str = "Delayed";
                } else {
                    str = "Failed";
                }
                AbstractC459729h.A01("AudioFocusManager", AnonymousClass001.A0R(str, " to abandon audio focus"), new Object[0]);
                ola.A04.DFt(A00);
            }
        }
        ola.A00 = null;
        ola.A01 = false;
        ola.A0C = 0;
    }
}
