package X;

/* renamed from: X.MyL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51977MyL extends C668630d {
    public final /* synthetic */ C51474MoL A00;

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        C51474MoL c51474MoL = this.A00;
        C55982hj c55982hj2 = c51474MoL.A0B;
        if (c55982hj == c55982hj2) {
            float f = (float) c55982hj2.A09.A00;
            c51474MoL.A09.setX(f);
            C51474MoL.A0F = Float.valueOf(f);
        } else {
            C55982hj c55982hj3 = c51474MoL.A0C;
            if (c55982hj != c55982hj3) {
                return;
            }
            float f2 = (float) c55982hj3.A09.A00;
            c51474MoL.A09.setY(f2);
            C51474MoL.A0G = Float.valueOf(f2);
        }
    }

    public C51977MyL(C51474MoL c51474MoL) {
        this.A00 = c51474MoL;
    }
}
