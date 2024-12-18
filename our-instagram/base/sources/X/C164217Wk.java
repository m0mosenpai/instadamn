package X;

import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.7Wk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164217Wk implements InterfaceC164227Wl {
    public final InterfaceC08830cm A00;
    public final InterfaceC16820sZ A01;

    public C164217Wk(InterfaceC08830cm interfaceC08830cm, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 1);
        this.A01 = interfaceC16820sZ;
        this.A00 = interfaceC08830cm;
    }

    @Override // X.InterfaceC164227Wl
    public final boolean CYr() {
        InterfaceC16820sZ interfaceC16820sZ = this.A01;
        if (((C7U0) interfaceC16820sZ.invoke()).C7r().CTV() && ((C7U0) interfaceC16820sZ.invoke()).C7r().CWO()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC164227Wl
    public final boolean CYs() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A00.get();
        if (linearLayoutManager == null) {
            return false;
        }
        return ((C7U0) this.A01.invoke()).BT6().Cd3(linearLayoutManager.A1a(), linearLayoutManager.A1b());
    }

    @Override // X.InterfaceC164227Wl
    public final boolean CeO() {
        return ((C7U0) this.A01.invoke()).C7r().CTV();
    }
}
