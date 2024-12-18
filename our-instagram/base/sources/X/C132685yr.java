package X;

/* renamed from: X.5yr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132685yr extends AbstractC42051wv {
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
        YKZ ykz = new YKZ(interfaceC42071wx, this.A01, length);
        int i = this.A00;
        C73488YFr[] c73488YFrArr = ykz.A02;
        int length2 = c73488YFrArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            c73488YFrArr[i2] = new C73488YFr(ykz, i);
        }
        ykz.lazySet(0);
        ykz.A00.Dpc(ykz);
        for (int i3 = 0; i3 < length2 && !ykz.A04; i3++) {
            objArr[i3].EpF(c73488YFrArr[i3]);
        }
    }

    public C132685yr(C6D4 c6d4, Iterable iterable, InterfaceC42061ww[] interfaceC42061wwArr, int i) {
        this.A03 = interfaceC42061wwArr;
        this.A02 = iterable;
        this.A01 = c6d4;
        this.A00 = i;
    }
}
