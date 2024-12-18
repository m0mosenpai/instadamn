package X;

/* renamed from: X.Y8a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73321Y8a implements YNF {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C73321Y8a(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // X.YNF
    public final void CP5(Object obj) {
        int i = this.A00;
        Object obj2 = this.A02;
        if (i != 0) {
            int i2 = this.A01;
            Y8T y8t = Y8T.$redex_init_class;
            ((YQ5) obj).DtI(((Y4C) obj2).A06, i2);
        } else {
            int i3 = this.A01;
            Y8T y8t2 = Y8T.$redex_init_class;
            ((YQ5) obj).DRx((C62972SZr) obj2, i3);
        }
    }
}
