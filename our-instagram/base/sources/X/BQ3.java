package X;

/* loaded from: classes5.dex */
public final class BQ3 implements InterfaceC51122Wi {
    public final int A00;
    public final Object A01;

    public BQ3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC51122Wi
    public final void DyX(C2XI c2xi) {
        BVR bvr;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                bvr = (BVR) obj;
                bvr.A04 = true;
                bvr.requestLayout();
                break;
            case 1:
                bvr = (BVR) obj;
                bvr.A00 = C17s.A01(AbstractC166987dD.A09(c2xi.A00));
                break;
            default:
                ((C51762Yz) obj).A01(c2xi.A00);
                return;
        }
        bvr.invalidate();
    }
}
