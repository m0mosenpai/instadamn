package X;

import java.util.HashMap;

/* loaded from: classes10.dex */
public final class TN4 implements Runnable {
    public final /* synthetic */ C62898SWe A00;
    public final /* synthetic */ InterfaceC65333TiE A01;

    public TN4(C62898SWe c62898SWe, InterfaceC65333TiE interfaceC65333TiE) {
        this.A00 = c62898SWe;
        this.A01 = interfaceC65333TiE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C63971Swx c63971Swx = this.A00.A00;
        InterfaceC65333TiE interfaceC65333TiE = this.A01;
        if (c63971Swx.A05) {
            HashMap hashMap = c63971Swx.A03;
            SZQ szq = SYP.A02;
            interfaceC65333TiE.CyN(szq.A02(hashMap), c63971Swx.A01.A00(hashMap), szq.A01(hashMap), SZQ.A00(hashMap));
        } else {
            C1ON A06 = AbstractC152476ta.A06(c63971Swx.A02);
            A06.A00 = new C58530Pwy(3, c63971Swx, interfaceC65333TiE);
            C1GJ.A03(A06);
        }
    }
}
