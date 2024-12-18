package X;

import android.os.Handler;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class ACK {
    public final Handler A03;
    public final InterfaceC176157sY A04;
    public final AtomicInteger A06 = new AtomicInteger(0);
    public final LinkedList A05 = new LinkedList();
    public int A00 = 0;
    public boolean A01 = false;
    public boolean A02 = false;

    public final synchronized C23393AYs A00() {
        if (!this.A01) {
            this.A00++;
        } else {
            throw AbstractC166987dD.A14("Cannot generate callbacks after complete is called");
        }
        return new C23393AYs(this, 1);
    }

    public final synchronized void A01() {
        try {
            this.A01 = true;
            if (this.A06.get() == this.A00) {
                AD8.A01(this.A04, this.A03);
            }
        } finally {
        }
    }

    public ACK(InterfaceC176157sY interfaceC176157sY, Handler handler) {
        this.A04 = interfaceC176157sY;
        this.A03 = handler;
    }
}
