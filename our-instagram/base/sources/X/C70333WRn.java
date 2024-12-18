package X;

import android.util.SparseArray;

/* renamed from: X.WRn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70333WRn implements InterfaceC72026XFo {
    public final SparseArray A00 = new SparseArray();
    public final InterfaceC72026XFo A01;
    public final InterfaceC72027XFp A02;

    @Override // X.InterfaceC72026XFo
    public final XG2 F87(int i, int i2) {
        if (i2 != 3) {
            return this.A01.F87(i, i2);
        }
        SparseArray sparseArray = this.A00;
        WS7 ws7 = (WS7) sparseArray.get(i);
        if (ws7 != null) {
            return ws7;
        }
        WS7 ws72 = new WS7(this.A01.F87(i, i2), this.A02);
        sparseArray.put(i, ws72);
        return ws72;
    }

    @Override // X.InterfaceC72026XFo
    public final void ASd() {
        this.A01.ASd();
    }

    @Override // X.InterfaceC72026XFo
    public final void EMe(InterfaceC71878X8l interfaceC71878X8l) {
        this.A01.EMe(interfaceC71878X8l);
    }

    public C70333WRn(InterfaceC72026XFo interfaceC72026XFo, InterfaceC72027XFp interfaceC72027XFp) {
        this.A01 = interfaceC72026XFo;
        this.A02 = interfaceC72027XFp;
    }
}
