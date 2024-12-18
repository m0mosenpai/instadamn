package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.LhH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48749LhH implements InterfaceC50492MQu {
    public final /* synthetic */ KC6 A00;

    @Override // X.InterfaceC50492MQu
    public final void D01() {
    }

    public C48749LhH(KC6 kc6) {
        this.A00 = kc6;
    }

    @Override // X.InterfaceC50492MQu
    public final void D9m(long j) {
        C45993KXh c45993KXh = (C45993KXh) this.A00.A0G.getValue();
        if (j != 0) {
            c45993KXh.A01.A08(j);
        }
    }

    @Override // X.InterfaceC50492MQu
    public final void Dxz(String str) {
        ((C45993KXh) this.A00.A0G.getValue()).A01.A0B(str);
    }

    @Override // X.InterfaceC50492MQu
    public final void ElJ() {
        KC6 kc6 = this.A00;
        EnumC46180KcI enumC46180KcI = EnumC46180KcI.A06;
        FragmentActivity activity = kc6.getActivity();
        if (activity != null) {
            LHE.A02(activity, enumC46180KcI);
        }
    }
}
