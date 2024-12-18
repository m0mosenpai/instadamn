package X;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes10.dex */
public final class TM6 implements Runnable {
    public final /* synthetic */ SZM A00;

    public TM6(SZM szm) {
        this.A00 = szm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        SZM szm = this.A00;
        synchronized (szm) {
            if (szm.A0D) {
                return;
            }
            SZF szf = szm.A0A;
            if (szm.A0B) {
                i = szm.A03;
            } else {
                i = -1;
            }
            szm.A03++;
            szm.A0B = true;
            if (i != -1) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("sent ping but didn't receive pong within ");
                A1C.append(szm.A0E);
                A1C.append("ms (after ");
                A1C.append(i - 1);
                szm.A00(new SocketTimeoutException(AbstractC166997dE.A0x(" successful ping/pongs)", A1C)));
                return;
            }
            try {
                SZF.A00(szf, C64531TIl.A02, 9);
            } catch (IOException e) {
                szm.A00(e);
            }
        }
    }
}
