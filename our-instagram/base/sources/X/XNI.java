package X;

/* loaded from: classes12.dex */
public final class XNI implements InterfaceC51012Vx, C2VN, InterfaceC89283yU {
    public C51002Vw A00;
    public final /* synthetic */ C124005jE A01;

    @Override // X.InterfaceC51012Vx
    public final synchronized void A91(C2VN c2vn) {
        this.A00.A91(c2vn);
    }

    @Override // X.InterfaceC51012Vx
    public final synchronized void EFX(C2VN c2vn) {
        this.A00.EFX(c2vn);
    }

    public XNI(C124005jE c124005jE) {
        this.A01 = c124005jE;
        c124005jE.A0C.A91(this);
        this.A00 = new C51002Vw();
    }

    @Override // X.InterfaceC89283yU
    public final C07X BN8() {
        InterfaceC51012Vx interfaceC51012Vx = this.A01.A0C;
        if (interfaceC51012Vx != null && (interfaceC51012Vx instanceof InterfaceC89283yU)) {
            return ((InterfaceC89283yU) interfaceC51012Vx).BN8();
        }
        return null;
    }

    @Override // X.InterfaceC51012Vx
    public final Integer CGg() {
        return this.A00.A00;
    }

    public final void A00(Integer num) {
        C2XV.A00();
        this.A00.A00(num);
        if (num == C05F.A0C) {
            C124005jE c124005jE = this.A01;
            c124005jE.A0C.EFX(this);
            c124005jE.A01 = null;
            c124005jE.A06 = false;
        }
    }

    @Override // X.C2VN
    public final void DU0(Integer num) {
        Integer num2;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                num2 = C05F.A0C;
            } else {
                num2 = C05F.A01;
            }
        } else {
            num2 = C05F.A00;
        }
        A00(num2);
    }
}
