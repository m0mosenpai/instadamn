package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class J5K implements Runnable {
    public final /* synthetic */ C1I1 A00;
    public final /* synthetic */ C61922rt A01;
    public final /* synthetic */ C15370ps A02;

    public J5K(C1I1 c1i1, C61922rt c61922rt, C15370ps c15370ps) {
        this.A01 = c61922rt;
        this.A00 = c1i1;
        this.A02 = c15370ps;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C61842rl c61842rl = this.A01.A0A;
        if (c61842rl != null) {
            C1I1 c1i1 = this.A00;
            Object obj = this.A02.A00;
            if (obj != null) {
                List list = (List) obj;
                C14360o3.A0B(list, 1);
                if (AbstractC166987dD.A1b(list)) {
                    c61842rl.A0b.A05(c1i1, null, "LOCAL", "delivery_controller", null, null);
                    C673732c c673732c = c61842rl.A0F;
                    if (c673732c != null) {
                        c673732c.A00(null, null, null, c1i1.A00, EnumC73363Qm.A04, null, null, null, null, null, null, null, null, list, -1L, true, false);
                        return;
                    } else {
                        C0w9.A03(AbstractC111324zv.A00(314), "onLocalFeedRequestSuccess()");
                        c61842rl.A0h.A01 = true;
                        return;
                    }
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
