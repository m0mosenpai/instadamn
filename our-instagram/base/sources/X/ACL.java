package X;

import android.os.Handler;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class ACL {
    public final Handler A03;
    public final InterfaceC176207sd A04;
    public final AtomicInteger A06 = new AtomicInteger(0);
    public final LinkedList A05 = new LinkedList();
    public int A00 = 0;
    public boolean A01 = false;
    public boolean A02 = false;

    public final synchronized AVS A00(Runnable runnable) {
        if (!this.A01) {
            this.A00++;
        } else {
            throw AbstractC166987dD.A14("Cannot generate callbacks after complete is called");
        }
        return new AVS(0, runnable, this);
    }

    public final synchronized void A01() {
        try {
            this.A01 = true;
            if (this.A06.get() == this.A00) {
                AbstractC72880XqE.A00(this.A03, this.A04);
            }
        } finally {
        }
    }

    public ACL(Handler handler, InterfaceC176207sd interfaceC176207sd) {
        this.A04 = interfaceC176207sd;
        this.A03 = handler;
    }
}
