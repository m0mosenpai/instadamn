package X;

import java.util.Iterator;

/* renamed from: X.Izu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43004Izu implements InterfaceC673031v {
    public final /* synthetic */ C43005Izv A00;

    @Override // X.InterfaceC673031v
    public final void DM9(Integer num) {
        C14360o3.A0B(num, 0);
        Iterator it = this.A00.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC673031v) it.next()).DM9(num);
        }
    }

    @Override // X.InterfaceC673031v
    public final boolean DMA(C1PZ c1pz) {
        C14360o3.A0B(c1pz, 0);
        if (c1pz.A0C == C05F.A01) {
            this.A00.COx();
        }
        boolean z = true;
        Iterator it = this.A00.A02.iterator();
        while (it.hasNext()) {
            z &= ((InterfaceC673031v) it.next()).DMA(c1pz);
        }
        return z;
    }

    public C43004Izu(C43005Izv c43005Izv) {
        this.A00 = c43005Izv;
    }

    @Override // X.InterfaceC673031v
    public final void D7f(Object obj) {
        Iterator it = this.A00.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC673031v) it.next()).D7f(obj);
        }
    }

    @Override // X.InterfaceC673031v
    public final void DKk(C1PZ c1pz) {
        Iterator it = this.A00.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC673031v) it.next()).DKk(c1pz);
        }
    }

    @Override // X.InterfaceC673031v
    public final void Dgp() {
        Iterator it = this.A00.A02.iterator();
        while (it.hasNext()) {
            ((InterfaceC673031v) it.next()).Dgp();
        }
    }
}
