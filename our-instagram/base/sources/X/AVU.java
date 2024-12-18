package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class AVU implements InterfaceC176207sd {
    public final /* synthetic */ InterfaceC176207sd A00;
    public final /* synthetic */ InterfaceC176207sd A01;
    public final /* synthetic */ C176097sS A02;
    public final /* synthetic */ List A03;

    public AVU(InterfaceC176207sd interfaceC176207sd, InterfaceC176207sd interfaceC176207sd2, C176097sS c176097sS, List list) {
        this.A02 = c176097sS;
        this.A03 = list;
        this.A01 = interfaceC176207sd;
        this.A00 = interfaceC176207sd2;
    }

    @Override // X.InterfaceC176207sd
    public final void onError(Throwable th) {
        this.A02.A06(new C23423AZw(this.A00, th, 1));
    }

    @Override // X.InterfaceC176207sd
    public final void onSuccess() {
        C176097sS c176097sS = this.A02;
        List list = this.A03;
        InterfaceC176207sd interfaceC176207sd = this.A01;
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC176187sb interfaceC176187sb = (InterfaceC176187sb) c176097sS.A05.get(((InterfaceC177537un) it.next()).CBK());
            if (interfaceC176187sb != null && interfaceC176187sb.CRb()) {
                if (interfaceC176187sb.BaH() != null) {
                    A1G.put(interfaceC176187sb.CBK(), interfaceC176187sb.BaH());
                } else {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("One of the configured tracks ");
                    A1C.append(interfaceC176187sb.CBK());
                    interfaceC176207sd.onError(new AbstractC223559ty(21002, AbstractC166997dE.A0x(" has null Output MediaFormatProvider", A1C)));
                    return;
                }
            }
        }
        C176137sW c176137sW = c176097sS.A03;
        c176137sW.A01 = A1G;
        c176137sW.A04(C176137sW.A0I);
        c176137sW.A0E = false;
        interfaceC176207sd.onSuccess();
    }
}
