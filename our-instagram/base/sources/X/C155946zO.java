package X;

/* renamed from: X.6zO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155946zO extends AbstractC65332xV {
    public Integer A00;
    public boolean A01;
    public final C38U A02;
    public final C155936zN A03;

    @Override // X.AbstractC65332xV
    public final int A02() {
        int i;
        double ceil;
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                return super.A01.size();
            }
            double size = super.A01.size() / 3.0d;
            if (this.A01) {
                ceil = Math.floor(size);
            } else {
                ceil = Math.ceil(size);
            }
            return (int) ceil;
        }
        int size2 = super.A01.size();
        if (this.A01) {
            i = super.A01.size() % 3;
        } else {
            i = 0;
        }
        return size2 - i;
    }

    @Override // X.AbstractC65332xV
    public final /* bridge */ /* synthetic */ String A03(Object obj) {
        C38321qM c38321qM = (C38321qM) obj;
        C14360o3.A0B(c38321qM, 0);
        return c38321qM.BqK();
    }

    public final C153126ug A0F(int i) {
        return new C153126ug(super.A01, i * 3, 3);
    }

    public C155946zO(C155936zN c155936zN, C38U c38u, Integer num) {
        this.A00 = num;
        this.A03 = c155936zN;
        this.A02 = c38u;
    }
}
