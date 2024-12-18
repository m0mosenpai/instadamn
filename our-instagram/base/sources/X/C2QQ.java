package X;

import com.facebook.memorytimeline.MemoryTimeline;

/* renamed from: X.2QQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2QQ {
    public MemoryTimeline A00;
    public C1TU A01;
    public boolean A02 = false;
    public final InterfaceC220315d A03 = new InterfaceC220315d() { // from class: X.2QR
        @Override // X.InterfaceC220315d
        public final void F8d(C1KJ c1kj) {
            MemoryTimeline memoryTimeline;
            C0TM c0tm;
            int ordinal = c1kj.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal != 1) {
                        if (ordinal != 3) {
                            if (ordinal == 5) {
                                memoryTimeline = C2QQ.this.A00;
                                c0tm = C0TM.A04;
                            } else {
                                return;
                            }
                        } else {
                            memoryTimeline = C2QQ.this.A00;
                            c0tm = C0TM.A07;
                        }
                    } else {
                        memoryTimeline = C2QQ.this.A00;
                        c0tm = C0TM.A05;
                    }
                } else {
                    memoryTimeline = C2QQ.this.A00;
                    c0tm = C0TM.A06;
                }
            } else {
                memoryTimeline = C2QQ.this.A00;
                c0tm = C0TM.A03;
            }
            C2RK c2rk = (C2RK) memoryTimeline;
            c2rk.A09.post(new RunnableC58689Q0c(c0tm, c2rk));
        }
    };
    public final C2QP A04;

    public final void A00() {
        if (this.A02) {
            C2RK c2rk = (C2RK) this.A00;
            synchronized (c2rk) {
                c2rk.A04 = true;
            }
            C2RK.A02(c2rk, true);
            AbstractC25061Kk.A00().EDS(this.A03);
        }
    }

    public C2QQ(C2QP c2qp) {
        this.A04 = c2qp;
    }
}
