package X;

import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class U3E extends C1P1 {
    public final U34 A00;
    public final UQE A01;
    public final /* synthetic */ C65979TxY A02;

    public U3E(UQE uqe, U34 u34, C65979TxY c65979TxY) {
        this.A02 = c65979TxY;
        this.A01 = uqe;
        this.A00 = u34;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 170815525);
        super.onFail(abstractC115105If);
        U34 u34 = this.A00;
        InterfaceC169457hL interfaceC169457hL = u34.A01.A00;
        if (interfaceC169457hL != null) {
            interfaceC169457hL.Dfq(u34.A00, abstractC115105If);
        }
        C0f9.A0A(1686971968, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1780704289);
        LinkedHashMap linkedHashMap = this.A02.A01;
        C15500q5.A04(linkedHashMap).remove(this.A01);
        U34 u34 = this.A00;
        InterfaceC169457hL interfaceC169457hL = u34.A01.A00;
        if (interfaceC169457hL != null) {
            interfaceC169457hL.Dg0(u34.A00);
        }
        C0f9.A0A(1593624678, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1924600177);
        super.onStart();
        U34 u34 = this.A00;
        InterfaceC169457hL interfaceC169457hL = u34.A01.A00;
        if (interfaceC169457hL != null) {
            interfaceC169457hL.DgG(u34.A00);
        }
        C0f9.A0A(-107932802, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1025173081);
        InterfaceC40821up interfaceC40821up = (InterfaceC40821up) obj;
        int A0N = AbstractC167017dG.A0N(interfaceC40821up, 84360040);
        super.onSuccess(interfaceC40821up);
        this.A00.A00(interfaceC40821up);
        C0f9.A0A(1454663179, A0N);
        C0f9.A0A(1188190371, A03);
    }
}
