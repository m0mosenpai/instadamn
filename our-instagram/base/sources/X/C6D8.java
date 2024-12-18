package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6D8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6D8 implements InterfaceC42061ww {
    public final C6D7 A00;
    public final AtomicReference A01;

    @Override // X.InterfaceC42061ww
    public final void EpF(InterfaceC42071wx interfaceC42071wx) {
        AtomicReference atomicReference;
        C6JK c6jk;
        AtomicReference atomicReference2;
        C6JO[] c6joArr;
        C6JO[] c6joArr2;
        do {
            atomicReference = this.A01;
            c6jk = (C6JK) atomicReference.get();
            if (c6jk != null) {
                break;
            } else {
                c6jk = new C6JK(new C6JL(1));
            }
        } while (!C1EM.A00(null, c6jk, atomicReference));
        C6JO c6jo = new C6JO(interfaceC42071wx, c6jk);
        interfaceC42071wx.Dpc(c6jo);
        do {
            atomicReference2 = c6jk.A03;
            c6joArr = (C6JO[]) atomicReference2.get();
            if (c6joArr == C6JK.A05) {
                break;
            }
            int length = c6joArr.length;
            c6joArr2 = new C6JO[length + 1];
            System.arraycopy(c6joArr, 0, c6joArr2, 0, length);
            c6joArr2[length] = c6jo;
        } while (!C1EM.A00(c6joArr, c6joArr2, atomicReference2));
        if (c6jo.A03) {
            c6jk.A00(c6jo);
        } else {
            c6jk.A01.EH6(c6jo);
        }
    }

    public C6D8(C6D7 c6d7, AtomicReference atomicReference) {
        this.A01 = atomicReference;
        this.A00 = c6d7;
    }
}
