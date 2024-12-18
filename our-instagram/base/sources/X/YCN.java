package X;

/* loaded from: classes12.dex */
public abstract class YCN implements YOu {
    public InterfaceC73606YNv A00;
    public boolean A01;
    public boolean A02;

    @Override // X.YOu
    public final C72865XpU Csq(Object obj) {
        C72724Xlw AJv;
        YD9 yd9;
        int i;
        if (this.A01) {
            return new C72865XpU(true, null);
        }
        InterfaceC73606YNv interfaceC73606YNv = this.A00;
        if (interfaceC73606YNv == null) {
            if (this instanceof C72212XYg) {
                yd9 = new YD9(XXr.class);
                i = 3;
            } else {
                yd9 = new YD9(XXu.class);
                i = 1;
            }
            AJv = new C72724Xlw(new C73421YCq(this, i), yd9);
        } else {
            AJv = interfaceC73606YNv.AJv(obj);
        }
        InterfaceC73606YNv interfaceC73606YNv2 = AJv.A00;
        if (interfaceC73606YNv2 == C73422YCr.A00) {
            if (this.A02) {
                this.A01 = true;
                this.A00 = null;
                return new C72865XpU(true, null);
            }
            return EKx();
        }
        this.A00 = interfaceC73606YNv2;
        return new C72865XpU(false, AJv.A01);
    }

    @Override // X.YOu
    public final C72865XpU EKx() {
        if (this.A02) {
            this.A01 = true;
        } else {
            this.A02 = true;
            this.A00 = new C73420YCp(this);
        }
        return Csq(null);
    }
}
