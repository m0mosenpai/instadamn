package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class M4R implements Runnable {
    public final /* synthetic */ C48525LdN A00;
    public final /* synthetic */ C2Io A01;

    public M4R(C48525LdN c48525LdN, C2Io c2Io) {
        this.A00 = c48525LdN;
        this.A01 = c2Io;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C116155Nu A00;
        C48525LdN c48525LdN = this.A00;
        List list = this.A01.A02;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C83403nh A0e = AbstractC43592JPx.A0e(it);
                String A0h = A0e.A0h();
                if (A0h != null && (A00 = C48525LdN.A00(c48525LdN, A0h)) != null) {
                    C48525LdN.A01(A00, A0e, c48525LdN);
                }
            }
        }
    }
}
