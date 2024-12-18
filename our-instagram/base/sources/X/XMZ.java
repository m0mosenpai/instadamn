package X;

import java.util.Iterator;

/* loaded from: classes12.dex */
public final class XMZ extends AbstractC73492YFv {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final InterfaceC42071wx A03;
    public final Iterator A04;
    public volatile boolean A05;

    @Override // X.InterfaceC136006Df
    public final int EJ7(int i) {
        if ((i & 1) != 0) {
            this.A02 = true;
            return 1;
        }
        return 0;
    }

    @Override // X.InterfaceC136016Dg
    public final void clear() {
        this.A01 = true;
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A05 = true;
    }

    @Override // X.InterfaceC136016Dg
    public final Object poll() {
        if (!this.A01) {
            if (this.A00) {
                if (!this.A04.hasNext()) {
                    this.A01 = true;
                }
            } else {
                this.A00 = true;
            }
            Object next = this.A04.next();
            AbstractC42141x4.A01(next, "The iterator returned a null value");
            return next;
        }
        return null;
    }

    public XMZ(InterfaceC42071wx interfaceC42071wx, Iterator it) {
        this.A03 = interfaceC42071wx;
        this.A04 = it;
    }

    @Override // X.InterfaceC136016Dg
    public final boolean isEmpty() {
        return this.A01;
    }
}
