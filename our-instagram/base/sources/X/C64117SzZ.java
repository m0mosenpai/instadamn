package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.SzZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64117SzZ implements InterfaceC65574Tn8 {
    public final C0f5 A00;
    public final C100684fX A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC65574Tn8
    public final void A9R(String str) {
    }

    @Override // X.InterfaceC65574Tn8
    public final void A8W(Exception exc) {
        this.A00.ERI(exc);
    }

    @Override // X.InterfaceC65574Tn8
    public final boolean isSampled() {
        return this.A00.isSampled();
    }

    @Override // X.InterfaceC65574Tn8
    public final void report() {
        C0f5 c0f5 = this.A00;
        if (c0f5.isSampled()) {
            Iterator it = AbstractC06930Yk.A0E().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(it);
                c0f5.ABW(AbstractC31172DnG.A17(A1K), AbstractC58318PtA.A0p(A1K));
            }
            c0f5.report();
        }
    }

    public C64117SzZ(C100684fX c100684fX, Integer num, InterfaceC09390do interfaceC09390do) {
        AbstractC167017dG.A1R(interfaceC09390do, c100684fX);
        this.A02 = interfaceC09390do;
        this.A01 = c100684fX;
        int A00 = AbstractC62788SRh.A00(num);
        this.A00 = ((C0f6) interfaceC09390do.getValue()).AEp(AbstractC62788SRh.A01(num), A00);
    }

    @Override // X.InterfaceC65574Tn8
    public final void ABZ(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.ABW(str, str2);
    }
}
