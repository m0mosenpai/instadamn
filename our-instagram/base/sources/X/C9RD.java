package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.9RD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9RD implements InterfaceC179077xJ {
    public final List A00;

    @Override // X.InterfaceC179077xJ
    public final boolean CLu() {
        return true;
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
        C14360o3.A0B(c178907x2, 0);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC179087xK) it.next()).CNk(c178907x2);
        }
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ InterfaceC179467xw EGc(InterfaceC179467xw interfaceC179467xw, InterfaceC179437xt interfaceC179437xt, InterfaceC179037xF interfaceC179037xF, Long l) {
        return interfaceC179467xw;
    }

    @Override // X.InterfaceC179077xJ
    public final void EGd(InterfaceC179037xF interfaceC179037xF, Long l) {
        C14360o3.A0B(interfaceC179037xF, 0);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC179077xJ) it.next()).EGd(interfaceC179037xF, l);
        }
    }

    @Override // X.InterfaceC179077xJ
    public final void FDL(int i, Object obj) {
        C14360o3.A0B(obj, 1);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC179077xJ) it.next()).FDL(i, obj);
        }
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC179087xK) it.next()).ACv(interfaceC180227zC);
        }
    }

    @Override // X.InterfaceC179077xJ
    public final int AlT() {
        Iterator it = this.A00.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((InterfaceC179077xJ) it.next()).AlT();
        }
        return i;
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ int AwF() {
        return 0;
    }

    @Override // X.InterfaceC179077xJ
    public final /* synthetic */ boolean Cbr() {
        return false;
    }

    @Override // X.InterfaceC179077xJ
    public final void FBm(int i, int i2, int i3, boolean z, int i4, int i5) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC179077xJ) it.next()).FBm(i, i2, i3, z, i4, i5);
        }
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC179087xK) it.next()).detach();
        }
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC179087xK) it.next()).release();
        }
    }

    public C9RD(List list) {
        this.A00 = list;
    }
}
