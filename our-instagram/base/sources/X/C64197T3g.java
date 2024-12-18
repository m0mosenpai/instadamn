package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.T3g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64197T3g implements InterfaceC65512Tlh {
    public final ConcurrentHashMap A00 = AbstractC58318PtA.A14();
    public final /* synthetic */ InterfaceC65512Tlh A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    public C64197T3g(InterfaceC65512Tlh interfaceC65512Tlh, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC65512Tlh;
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC65512Tlh
    public final void A9a(InterfaceC65392TjP interfaceC65392TjP) {
        C64200T3j c64200T3j = new C64200T3j(1, interfaceC65392TjP, this.A02);
        this.A01.A9a(c64200T3j);
        this.A00.put(interfaceC65392TjP, c64200T3j);
    }

    @Override // X.InterfaceC65512Tlh
    public final void AOi(InterfaceC65392TjP interfaceC65392TjP) {
        InterfaceC65392TjP interfaceC65392TjP2 = (InterfaceC65392TjP) C15500q5.A04(this.A00).remove(interfaceC65392TjP);
        if (interfaceC65392TjP2 != null) {
            this.A01.AOi(interfaceC65392TjP2);
        }
    }
}
