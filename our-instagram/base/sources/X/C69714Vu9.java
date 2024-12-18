package X;

import android.os.Handler;
import java.util.Comparator;
import java.util.PriorityQueue;

/* renamed from: X.Vu9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69714Vu9 {
    public C68852Vd8 A00;
    public C68855VdB A01;
    public long A02;
    public final Handler A03;
    public final InterfaceC147646kp A04;
    public final PriorityQueue A05;
    public final Comparator A06;

    public C69714Vu9(InterfaceC147646kp interfaceC147646kp) {
        this.A04 = interfaceC147646kp;
        C71658Wy9 c71658Wy9 = C71658Wy9.A00;
        this.A06 = c71658Wy9;
        this.A05 = new PriorityQueue(1, c71658Wy9);
        this.A03 = AbstractC167007dF.A0J();
        this.A02 = Long.MIN_VALUE;
    }

    public final void A00() {
        long Av5 = this.A04.Av5();
        while (true) {
            PriorityQueue priorityQueue = this.A05;
            if (!priorityQueue.isEmpty()) {
                XBT xbt = (XBT) priorityQueue.poll();
                if (xbt.Bdx() <= Av5) {
                    C68855VdB c68855VdB = this.A01;
                    if (c68855VdB != null) {
                        C71147Woi c71147Woi = (C71147Woi) xbt;
                        C14360o3.A0B(c71147Woi, 0);
                        W6j.A01(c68855VdB.A00, c71147Woi.A00);
                    }
                } else {
                    A01(xbt);
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void A01(XBT xbt) {
        long Bdx = xbt.Bdx();
        InterfaceC147646kp interfaceC147646kp = this.A04;
        long Av5 = Bdx - interfaceC147646kp.Av5();
        if (Av5 < 0) {
            if (Bdx >= this.A02) {
                this.A02 = Bdx;
            } else {
                return;
            }
        }
        this.A05.add(xbt);
        this.A03.postDelayed(new RunnableC71386Wsv(this), Math.max(0L, Av5));
        if (this.A00 == null) {
            C68852Vd8 c68852Vd8 = new C68852Vd8(this);
            this.A00 = c68852Vd8;
            interfaceC147646kp.Egw(c68852Vd8);
        }
    }
}
