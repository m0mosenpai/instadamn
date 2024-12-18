package X;

import java.io.IOException;

/* loaded from: classes10.dex */
public final class TQC implements Runnable {
    public final /* synthetic */ SFP A00;
    public final /* synthetic */ Q07 A01;
    public final /* synthetic */ IOException A02;

    public TQC(SFP sfp, Q07 q07, IOException iOException) {
        this.A02 = iOException;
        this.A00 = sfp;
        this.A01 = q07;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IOException iOException = this.A02;
        if (iOException != null) {
            SFP sfp = this.A00;
            Q07 q07 = this.A01;
            C14360o3.A0B(q07, 1);
            sfp.A01.A01(q07, iOException);
        }
    }
}
