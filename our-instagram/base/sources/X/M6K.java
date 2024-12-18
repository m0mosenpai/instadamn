package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes8.dex */
public final class M6K implements Runnable {
    public final /* synthetic */ C26086BgF A00;
    public final /* synthetic */ C7FG A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ ConcurrentLinkedQueue A03;

    public M6K(C26086BgF c26086BgF, C7FG c7fg, Long l, ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.A03 = concurrentLinkedQueue;
        this.A01 = c7fg;
        this.A00 = c26086BgF;
        this.A02 = l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List A00 = JUD.A00(this.A03, 27);
        ArrayList A0q = AbstractC167017dG.A0q(A00);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC43592JPx.A17(it).A01);
        }
        C7FG c7fg = this.A01;
        MessageIdentifier messageIdentifier = c7fg.A00;
        C7FA c7fa = c7fg.A03;
        if (messageIdentifier != null) {
            c7fa.Dke(messageIdentifier, A0q);
            c7fg.A00 = null;
        } else {
            c7fa.Dkg(this.A00, this.A02, A0q);
        }
    }
}
