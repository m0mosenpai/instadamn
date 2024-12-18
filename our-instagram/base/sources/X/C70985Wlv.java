package X;

import java.util.PriorityQueue;

/* renamed from: X.Wlv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70985Wlv implements InterfaceC146336iW {
    public boolean A01;
    public final PriorityQueue A02 = new PriorityQueue(2, new C71659WyA((InterfaceC16620sF) X6B.A00, 7));
    public Integer A00 = C05F.A0N;

    @Override // X.InterfaceC146336iW
    public final void Diz(Integer num) {
        C14360o3.A0B(num, 0);
        Dj1(this.A00, num);
        this.A00 = num;
    }

    @Override // X.InterfaceC146336iW
    public final void Dj1(Integer num, Integer num2) {
        boolean A1R = AbstractC167007dF.A1R(0, num, num2);
        Integer num3 = C05F.A01;
        if ((num == num3 && num2 == C05F.A0C) || num2 == C05F.A00) {
            this.A01 = A1R;
            C142196bc c142196bc = (C142196bc) this.A02.peek();
            if (c142196bc != null) {
                c142196bc.A00 = A1R;
                c142196bc.A04.postFrameCallback(c142196bc.A03);
                return;
            }
            return;
        }
        if (num2 != num3) {
            return;
        }
        this.A01 = false;
        C142196bc c142196bc2 = (C142196bc) this.A02.peek();
        if (c142196bc2 == null) {
            return;
        }
        c142196bc2.A00 = false;
    }

    @Override // X.InterfaceC146336iW
    public final boolean isEnabled() {
        return true;
    }

    @Override // X.InterfaceC146336iW
    public final void EDQ(C142196bc c142196bc) {
        PriorityQueue priorityQueue = this.A02;
        C142196bc c142196bc2 = (C142196bc) priorityQueue.peek();
        priorityQueue.add(c142196bc);
        A00(c142196bc2, (C142196bc) priorityQueue.peek());
    }

    @Override // X.InterfaceC146336iW
    public final void F9c(C142196bc c142196bc) {
        PriorityQueue priorityQueue = this.A02;
        C142196bc c142196bc2 = (C142196bc) priorityQueue.peek();
        priorityQueue.remove(c142196bc);
        A00(c142196bc2, (C142196bc) priorityQueue.peek());
    }

    private final void A00(C142196bc c142196bc, C142196bc c142196bc2) {
        if (!C14360o3.A0K(c142196bc, c142196bc2)) {
            if (c142196bc != null) {
                c142196bc.A00 = false;
            }
            if (this.A01 && c142196bc2 != null) {
                c142196bc2.A00 = true;
                c142196bc2.A04.postFrameCallback(c142196bc2.A03);
            }
        }
    }
}
