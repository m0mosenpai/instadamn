package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes9.dex */
public final class PMQ implements Runnable {
    public final /* synthetic */ C52458NJc A00;

    public PMQ(C52458NJc c52458NJc) {
        this.A00 = c52458NJc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C52458NJc c52458NJc = this.A00;
        if (c52458NJc.A05()) {
            AnonymousClass841 anonymousClass841 = c52458NJc.A02;
            if (anonymousClass841.CPp()) {
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator A0n = MSX.A0n(anonymousClass841);
                while (A0n.hasNext()) {
                    C47Z BcC = c52458NJc.A03.BcC(MSW.A0R(A0n).BcD());
                    if (BcC != null) {
                        A1E.add(BcC);
                    }
                }
                c52458NJc.A04().A0j(A1E);
            }
            c52458NJc.A05.Egh(new C8ZT(AbstractC55179Odk.A00(c52458NJc.A04())));
            while (true) {
                Queue queue = c52458NJc.A04;
                if (!queue.isEmpty()) {
                    ((Runnable) queue.remove()).run();
                } else {
                    return;
                }
            }
        }
    }
}
