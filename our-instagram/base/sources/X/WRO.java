package X;

import android.util.SparseArray;

/* loaded from: classes11.dex */
public final class WRO implements XE1 {
    public C70333WRn A00;
    public final XE1 A01;
    public final InterfaceC72027XFp A02;

    @Override // X.XE1
    public final XE1 CCR() {
        return this.A01;
    }

    @Override // X.XE1
    public final void CNe(InterfaceC72026XFo interfaceC72026XFo) {
        C70333WRn c70333WRn = new C70333WRn(interfaceC72026XFo, this.A02);
        this.A00 = c70333WRn;
        this.A01.CNe(c70333WRn);
    }

    @Override // X.XE1
    public final int E7l(XGj xGj, VZk vZk) {
        return this.A01.E7l(xGj, vZk);
    }

    @Override // X.XE1
    public final void EMc(long j, long j2) {
        C70333WRn c70333WRn = this.A00;
        if (c70333WRn != null) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c70333WRn.A00;
                if (i >= sparseArray.size()) {
                    break;
                }
                InterfaceC71939XBo interfaceC71939XBo = ((WS7) sparseArray.valueAt(i)).A01;
                if (interfaceC71939XBo != null) {
                    interfaceC71939XBo.reset();
                }
                i++;
            }
        }
        this.A01.EMc(j, j2);
    }

    @Override // X.XE1
    public final boolean EmK(XGj xGj) {
        return this.A01.EmK(xGj);
    }

    public WRO(XE1 xe1, InterfaceC72027XFp interfaceC72027XFp) {
        this.A01 = xe1;
        this.A02 = interfaceC72027XFp;
    }
}
