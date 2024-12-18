package X;

/* renamed from: X.XNk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72090XNk extends AbstractC42051wv {
    public final int A00;
    public final C6D4 A01;
    public final Iterable A02;
    public final InterfaceC42061ww[] A03;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        int length;
        Object[] objArr = this.A03;
        if (objArr == 0) {
            length = 0;
            objArr = new AbstractC42051wv[8];
            for (Object obj : this.A02) {
                if (length == objArr.length) {
                    InterfaceC42061ww[] interfaceC42061wwArr = new InterfaceC42061ww[(length >> 2) + length];
                    System.arraycopy(objArr, 0, interfaceC42061wwArr, 0, length);
                    objArr = interfaceC42061wwArr;
                }
                objArr[length] = obj;
                length++;
                objArr = objArr;
            }
        } else {
            length = objArr.length;
        }
        if (length == 0) {
            interfaceC42071wx.Dpc(EnumC137086Im.INSTANCE);
            interfaceC42071wx.onComplete();
            return;
        }
        XMN xmn = new XMN(interfaceC42071wx, this.A01, length, this.A00);
        XMO[] xmoArr = xmn.A07;
        int length2 = xmoArr.length;
        xmn.A03.Dpc(xmn);
        for (int i = 0; i < length2 && !xmn.A09 && !xmn.A08; i++) {
            objArr[i].EpF(xmoArr[i]);
        }
    }

    public C72090XNk(C6D4 c6d4, Iterable iterable, InterfaceC42061ww[] interfaceC42061wwArr, int i) {
        this.A03 = interfaceC42061wwArr;
        this.A02 = iterable;
        this.A01 = c6d4;
        this.A00 = i;
    }
}
