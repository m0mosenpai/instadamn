package X;

/* renamed from: X.YCq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73421YCq implements InterfaceC73606YNv {
    public final int A00;
    public final Object A01;

    public C73421YCq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC73606YNv
    public final /* bridge */ /* synthetic */ C72724Xlw AJv(Object obj) {
        Object yd4;
        int i;
        C73421YCq c73421YCq;
        int i2;
        switch (this.A00) {
            case 1:
                yd4 = new YD4(new XY0(C05F.A01));
                i = 0;
                c73421YCq = new C73421YCq(this, i);
                break;
            case 2:
            default:
                YCN ycn = (YCN) ((C73421YCq) this.A01).A01;
                if (ycn instanceof C72212XYg) {
                    yd4 = new YD9(XXr.class);
                    i2 = 3;
                } else {
                    yd4 = new YD9(XXu.class);
                    i2 = 1;
                }
                c73421YCq = new C73421YCq(ycn, i2);
                break;
            case 3:
                yd4 = new YD4(new Object());
                i = 2;
                c73421YCq = new C73421YCq(this, i);
                break;
        }
        return new C72724Xlw(c73421YCq, yd4);
    }
}
