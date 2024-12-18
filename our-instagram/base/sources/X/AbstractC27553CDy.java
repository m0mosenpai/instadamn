package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CDy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27553CDy {
    public static final C25999Ben A00(AnonymousClass520 anonymousClass520, Double d, boolean z, boolean z2) {
        List C5D;
        int seconds;
        InterfaceC101404gy BeJ = anonymousClass520.BeJ();
        if (BeJ == null || (C5D = BeJ.C5D()) == null) {
            return null;
        }
        ArrayList A0q = AbstractC167017dG.A0q(C5D);
        Iterator it = C5D.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            String str = "";
            if (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                InterfaceC101384gv interfaceC101384gv = (InterfaceC101384gv) next;
                String text = interfaceC101384gv.getText();
                if (text != null) {
                    str = text;
                }
                A0q.add(new C26068Bfw(i2, str, AbstractC167017dG.A0K(interfaceC101384gv.Arz()), 1));
                i2 = i3;
            } else {
                String pollId = BeJ.getPollId();
                if (pollId == null) {
                    pollId = "";
                }
                Integer CGO = BeJ.CGO();
                C5Hc A00 = AbstractC133095zb.A00(A0q);
                boolean A1Z = AbstractC166997dE.A1Z(BeJ.CG3(), true);
                Integer B3B = BeJ.B3B();
                if (B3B != null) {
                    seconds = B3B.intValue();
                } else {
                    if (d != null) {
                        i = (int) d.doubleValue();
                    }
                    seconds = i + ((int) TimeUnit.DAYS.toSeconds(1L));
                }
                return new C25999Ben(CGO, pollId, A00, seconds, z, A1Z, z2);
            }
        }
    }
}
