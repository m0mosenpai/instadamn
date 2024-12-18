package X;

/* renamed from: X.XbQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72328XbQ extends AbstractC42051wv {
    public final Object[] A00;

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        C72333XbV c72333XbV = new C72333XbV(interfaceC42071wx, this.A00);
        interfaceC42071wx.Dpc(c72333XbV);
        if (!c72333XbV.A01) {
            Object[] objArr = c72333XbV.A03;
            int length = objArr.length;
            for (int i = 0; i < length && !c72333XbV.A04; i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    c72333XbV.A02.onError(AbstractC166987dD.A15(AnonymousClass001.A0c("The ", "th element is null", i)));
                    return;
                }
                c72333XbV.A02.DVo(obj);
            }
            if (c72333XbV.A04) {
                return;
            }
            c72333XbV.A02.onComplete();
        }
    }

    public C72328XbQ(Object[] objArr) {
        this.A00 = objArr;
    }
}
