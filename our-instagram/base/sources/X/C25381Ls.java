package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Ls, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25381Ls implements InterfaceC25391Lt {
    public final InterfaceC25441Ly A00;

    public C25381Ls(InterfaceC25441Ly interfaceC25441Ly) {
        C14360o3.A0B(interfaceC25441Ly, 1);
        this.A00 = interfaceC25441Ly;
    }

    @Override // X.InterfaceC25391Lt
    public final void EGJ(List list) {
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A00.EGI(((C9C7) ((C9BW) it.next()).A01).A06);
        }
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
    }

    @Override // X.InterfaceC25391Lt
    public final void DVh(C9BW c9bw) {
        this.A00.AAM(c9bw);
    }

    @Override // X.InterfaceC25391Lt
    public final List EMt(InterfaceC115345Ji interfaceC115345Ji) {
        return interfaceC115345Ji.EMu(this.A00.AbA());
    }
}
