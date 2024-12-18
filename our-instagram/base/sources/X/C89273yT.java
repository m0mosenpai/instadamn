package X;

/* renamed from: X.3yT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89273yT implements InterfaceC51012Vx, InterfaceC09670ek, InterfaceC89283yU {
    public final C51002Vw A00 = new C51002Vw();
    public final C07X A01;

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        Integer num;
        C14360o3.A0B(c07r, 1);
        int ordinal = c07r.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 5) {
                    this.A00.A00(C05F.A0C);
                    this.A01.getLifecycle().A0A(this);
                    return;
                }
                return;
            }
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        this.A00.A00(num);
    }

    @Override // X.InterfaceC51012Vx
    public final void A91(C2VN c2vn) {
        this.A00.A91(c2vn);
    }

    @Override // X.InterfaceC89283yU
    public final C07X BN8() {
        return this.A01;
    }

    @Override // X.InterfaceC51012Vx
    public final Integer CGg() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC51012Vx
    public final void EFX(C2VN c2vn) {
        this.A00.EFX(c2vn);
    }

    public C89273yT(C07X c07x) {
        this.A01 = c07x;
        c07x.getLifecycle().A09(this);
    }
}
