package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.6OD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6OD implements C6OE, C6OF, C6OG {
    public final InterfaceC119545bC A00;
    public final InterfaceC119545bC A01;
    public final InterfaceC74953Yl A02;
    public final InterfaceC74953Yl A03;
    public final Object A04;
    public final C6MJ A05;

    @Override // X.C6OF
    public final C6OD E4L() {
        C6OD c6od;
        InterfaceC119545bC interfaceC119545bC = this.A01;
        if (interfaceC119545bC.BIi() == 0) {
            this.A05.A00.add(this);
            C6OF c6of = (C6OF) this.A02.getValue();
            if (c6of != null) {
                c6od = c6of.E4L();
            } else {
                c6od = null;
            }
            this.A03.Egh(c6od);
        }
        interfaceC119545bC.EWE(interfaceC119545bC.BIi() + 1);
        return this;
    }

    @Override // X.C6OE
    public final void release() {
        InterfaceC119545bC interfaceC119545bC = this.A01;
        if (interfaceC119545bC.BIi() > 0) {
            interfaceC119545bC.EWE(interfaceC119545bC.BIi() - 1);
            if (interfaceC119545bC.BIi() == 0) {
                this.A05.A00.remove(this);
                InterfaceC74953Yl interfaceC74953Yl = this.A03;
                C6OE c6oe = (C6OE) interfaceC74953Yl.getValue();
                if (c6oe != null) {
                    c6oe.release();
                }
                interfaceC74953Yl.Egh(null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Release should only be called once");
    }

    public C6OD(C6MJ c6mj, Object obj) {
        this.A04 = obj;
        this.A05 = c6mj;
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A00 = new ParcelableSnapshotMutableIntState(-1);
        this.A01 = new ParcelableSnapshotMutableIntState(0);
        this.A03 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), null);
        this.A02 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), null);
    }
}
