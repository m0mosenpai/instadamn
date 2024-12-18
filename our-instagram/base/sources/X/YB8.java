package X;

/* loaded from: classes12.dex */
public final class YB8 implements InterfaceC51012Vx, C2VN {
    public final C51002Vw A00 = new C51002Vw();

    @Override // X.C2VN
    public final void DU0(Integer num) {
        Integer num2;
        int A03 = AbstractC43592JPx.A03(num, 0);
        if (A03 != 0) {
            if (A03 != 1) {
                if (C2V3.defaultInstance.A0L) {
                    num2 = C05F.A0C;
                } else {
                    return;
                }
            } else {
                num2 = C05F.A01;
            }
        } else {
            num2 = C05F.A00;
        }
        this.A00.A00(num2);
    }

    @Override // X.InterfaceC51012Vx
    public final void A91(C2VN c2vn) {
        this.A00.A91(c2vn);
    }

    @Override // X.InterfaceC51012Vx
    public final Integer CGg() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC51012Vx
    public final void EFX(C2VN c2vn) {
        this.A00.EFX(c2vn);
    }

    public YB8(InterfaceC51012Vx interfaceC51012Vx) {
        interfaceC51012Vx.A91(this);
    }
}
