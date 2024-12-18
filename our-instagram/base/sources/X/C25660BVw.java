package X;

/* renamed from: X.BVw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25660BVw {
    public final BVY A00;
    public final InterfaceC74953Yl A01;

    public final float A00(int i) {
        BVY bvy = this.A00;
        if (i >= 0 && i <= bvy.A04()) {
            return (i - r2.A05.BIi()) - bvy.A0N.A04.B72();
        }
        throw AbstractC25230BEn.A0o("page ", " is not within the range 0 to ", i, bvy.A04());
    }

    public final int A01() {
        return AbstractC166987dD.A0H(this.A00.A0Y.getValue());
    }

    public C25660BVw(BVY bvy, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = bvy;
        this.A01 = AbstractC25230BEn.A0U(interfaceC16820sZ);
    }
}
