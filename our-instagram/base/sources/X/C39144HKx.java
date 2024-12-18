package X;

/* renamed from: X.HKx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39144HKx extends AbstractC65332xV {
    public boolean A00;
    public final C38U A01;
    public final C42411xV A02;

    @Override // X.AbstractC65332xV
    public final int A02() {
        double ceil;
        double size = super.A01.size() / 3.0d;
        if (this.A00) {
            ceil = Math.floor(size);
        } else {
            ceil = Math.ceil(size);
        }
        return (int) ceil;
    }

    @Override // X.AbstractC65332xV
    public final /* bridge */ /* synthetic */ String A03(Object obj) {
        IM8 im8 = (IM8) obj;
        C14360o3.A0B(im8, 0);
        return im8.A00();
    }

    public C39144HKx(C42411xV c42411xV, C38U c38u) {
        this.A02 = c42411xV;
        this.A01 = c38u;
    }
}
