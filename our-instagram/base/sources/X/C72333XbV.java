package X;

/* renamed from: X.XbV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72333XbV extends AbstractC73492YFv {
    public int A00;
    public boolean A01;
    public final InterfaceC42071wx A02;
    public final Object[] A03;
    public volatile boolean A04;

    @Override // X.InterfaceC136006Df
    public final int EJ7(int i) {
        if ((i & 1) != 0) {
            this.A01 = true;
            return 1;
        }
        return 0;
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A04 = true;
    }

    @Override // X.InterfaceC136016Dg
    public final void clear() {
        this.A00 = this.A03.length;
    }

    @Override // X.InterfaceC136016Dg
    public final boolean isEmpty() {
        return AbstractC167007dF.A1P(this.A00, this.A03.length);
    }

    @Override // X.InterfaceC136016Dg
    public final Object poll() {
        int i = this.A00;
        Object[] objArr = this.A03;
        if (i != objArr.length) {
            this.A00 = i + 1;
            Object obj = objArr[i];
            AbstractC42141x4.A01(obj, "The array element is null");
            return obj;
        }
        return null;
    }

    public C72333XbV(InterfaceC42071wx interfaceC42071wx, Object[] objArr) {
        this.A02 = interfaceC42071wx;
        this.A03 = objArr;
    }
}
