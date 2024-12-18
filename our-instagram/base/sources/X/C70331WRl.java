package X;

import android.util.SparseArray;

/* renamed from: X.WRl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70331WRl implements InterfaceC72026XFo {
    public final /* synthetic */ WZ6 A00;

    public C70331WRl(WZ6 wz6) {
        this.A00 = wz6;
    }

    @Override // X.InterfaceC72026XFo
    public final void ASd() {
        this.A00.A08 = true;
    }

    @Override // X.InterfaceC72026XFo
    public final void EMe(InterfaceC71878X8l interfaceC71878X8l) {
        this.A00.A04 = interfaceC71878X8l;
    }

    @Override // X.InterfaceC72026XFo
    public final XG2 F87(int i, int i2) {
        WZ6 wz6 = this.A00;
        SparseArray sparseArray = wz6.A09;
        WS6 ws6 = (WS6) sparseArray.get(i);
        if (ws6 == null) {
            if (wz6.A08) {
                return new WS5();
            }
            C66399UFk c66399UFk = new C66399UFk(wz6.A0E, wz6, i);
            sparseArray.put(i, c66399UFk);
            return c66399UFk;
        }
        return ws6;
    }
}
