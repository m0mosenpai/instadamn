package X;

import android.view.View;

/* renamed from: X.Aes, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23719Aes implements InterfaceC30992Djr {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C23719Aes(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj4;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    @Override // X.InterfaceC30992Djr
    public final void Dap() {
        switch (this.A00) {
            case 0:
                Object obj = this.A03;
                if (obj == EnumC85043qs.A05) {
                    InterfaceC909343k BRw = ((C77133cz) this.A04).A01.BRw();
                    C38321qM c38321qM = (C38321qM) this.A01;
                    C75113Zb c75113Zb = (C75113Zb) this.A02;
                    BRw.DlG(c38321qM, c75113Zb, AbstractC111324zv.A00(105), c75113Zb.getPosition());
                    return;
                }
                if (obj != EnumC85043qs.A02) {
                    return;
                }
                InterfaceC86963uC BRs = ((C77133cz) this.A04).A01.BRs();
                C38321qM c38321qM2 = (C38321qM) this.A01;
                C75113Zb c75113Zb2 = (C75113Zb) this.A02;
                BRs.D67(c38321qM2, c75113Zb2, c75113Zb2.getPosition(), false);
                return;
            case 1:
                C37599Ggu c37599Ggu = (C37599Ggu) this.A04;
                C37599Ggu.A00((View) this.A03, (C120985dq) this.A01, (C37644Ghd) this.A02, c37599Ggu, AbstractC111324zv.A00(105));
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC30992Djr
    public final void DjX() {
        switch (this.A00) {
            case 0:
                Object obj = this.A03;
                if (obj == EnumC85043qs.A05) {
                    InterfaceC909343k BRw = ((C77133cz) this.A04).A01.BRw();
                    C38321qM c38321qM = (C38321qM) this.A01;
                    C75113Zb c75113Zb = (C75113Zb) this.A02;
                    BRw.DlG(c38321qM, c75113Zb, AbstractC111324zv.A00(106), c75113Zb.getPosition());
                    return;
                }
                if (obj != EnumC85043qs.A02) {
                    return;
                }
                InterfaceC86963uC BRs = ((C77133cz) this.A04).A01.BRs();
                C38321qM c38321qM2 = (C38321qM) this.A01;
                C75113Zb c75113Zb2 = (C75113Zb) this.A02;
                BRs.D67(c38321qM2, c75113Zb2, c75113Zb2.getPosition(), false);
                return;
            case 1:
                C37599Ggu c37599Ggu = (C37599Ggu) this.A04;
                C37599Ggu.A00((View) this.A03, (C120985dq) this.A01, (C37644Ghd) this.A02, c37599Ggu, AbstractC111324zv.A00(106));
                return;
            default:
                return;
        }
    }
}
