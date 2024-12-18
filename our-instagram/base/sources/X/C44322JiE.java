package X;

import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: X.JiE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44322JiE implements InterfaceC13000lm {
    public final C25671My A00;
    public final InterfaceC41501vz A01;
    public final Queue A02;
    public final InterfaceC08830cm A03;

    public C44322JiE(C25671My c25671My, InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(c25671My, 2);
        this.A03 = interfaceC08830cm;
        this.A00 = c25671My;
        this.A02 = new LinkedList();
        C44288Jhe c44288Jhe = new C44288Jhe(this, 10);
        this.A01 = c44288Jhe;
        c25671My.A01(c44288Jhe, C2Q5.class);
    }

    public static final synchronized void A00(C44322JiE c44322JiE) {
        synchronized (c44322JiE) {
            Iterator it = c44322JiE.A02.iterator();
            while (it.hasNext()) {
                MQ5 mq5 = (MQ5) it.next();
                C47Z A03 = ((PendingMediaStore) c44322JiE.A03.get()).A03(mq5.BcD());
                if (A03 != null && A03.A5l) {
                    mq5.AJ9(A03);
                    it.remove();
                }
            }
        }
    }

    public final synchronized void A01(MQ5 mq5) {
        this.A02.add(mq5);
        A00(this);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A02(this.A01, C2Q5.class);
    }
}
