package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class OMR {
    public PDX A00;
    public C19L A01;
    public final OI6 A02;
    public final InterfaceC58064Pop A03;
    public final C55177Odh A04;
    public final OJM A05;
    public final InterfaceC16660sJ A06;
    public final C12N A07;
    public final OWf A08;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.PlO, java.lang.Object] */
    public final void A00() {
        this.A02.A00 = this.A08;
        C55177Odh c55177Odh = this.A04;
        OJM ojm = this.A05;
        InterfaceC58064Pop interfaceC58064Pop = this.A03;
        C14360o3.A0B(ojm, 0);
        c55177Odh.A01 = ojm;
        c55177Odh.A00 = interfaceC58064Pop;
        c55177Odh.A05(new Object());
        C19L c19l = this.A01;
        if (c19l == null) {
            c19l = AnonymousClass194.A02(AnonymousClass190.A02(((C12M) this.A07).A04, new AnonymousClass197(null)));
        }
        this.A01 = c19l;
        AbstractC166987dD.A1Z(new PZL((InterfaceC23621Ds) null, this, 9), c19l);
        PDX pdx = this.A00;
        if (pdx != null) {
            c55177Odh.A05(pdx);
            this.A00 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.PlO, java.lang.Object] */
    public final void A01() {
        C55177Odh c55177Odh = this.A04;
        c55177Odh.A05(new Object());
        c55177Odh.A01 = null;
        c55177Odh.A00 = null;
        c55177Odh.A02.removeCallbacksAndMessages(null);
        c55177Odh.A03.clear();
        this.A02.A00 = null;
        C19L c19l = this.A01;
        if (c19l != null) {
            AnonymousClass194.A05(null, c19l);
        }
        this.A01 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.PlK, java.lang.Object] */
    public final void A02(boolean z) {
        InterfaceC57858PlO interfaceC57858PlO;
        InterfaceC57853PlJ interfaceC57853PlJ;
        NTU ntu = this.A05.A00;
        if (ntu != null) {
            if (z != ntu.A05) {
                OI6 oi6 = ntu.A0A;
                if (z) {
                    interfaceC57853PlJ = PBH.A00;
                } else {
                    interfaceC57853PlJ = PBG.A00;
                }
                oi6.A00(interfaceC57853PlJ);
            }
            ntu.A05 = z;
            if (z) {
                interfaceC57858PlO = C56678PDw.A00;
            } else {
                interfaceC57858PlO = C56677PDv.A00;
            }
            InterfaceC57858PlO interfaceC57858PlO2 = interfaceC57858PlO;
            if (ntu.A06) {
                C55177Odh c55177Odh = ntu.A0C;
                c55177Odh.A05(interfaceC57858PlO2);
                c55177Odh.A03(new Object());
                c55177Odh.A03(new C56697PEp(z));
            } else {
                ntu.A03 = interfaceC57858PlO2;
            }
            C57072ji c57072ji = (C57072ji) ntu.A0G.getValue();
            View A0d = AbstractC166987dD.A0d(ntu.A0D);
            if (z) {
                c57072ji.A00(A0d);
                ntu.A08.post(new POC(ntu));
            } else {
                c57072ji.A01(A0d);
            }
        }
        if (this.A01 != null) {
            this.A04.A03(new PBR(z));
        } else {
            this.A03.A7P(new PBR(z));
        }
    }

    public final void A03(boolean z) {
        if (this.A01 != null) {
            this.A04.A03(new PBS(z));
        } else {
            this.A03.A7P(new PBS(z));
        }
    }

    public OMR(OI6 oi6, InterfaceC58064Pop interfaceC58064Pop, C55177Odh c55177Odh, OJM ojm, OWf oWf) {
        AbstractC167027dH.A13(ojm, c55177Odh, interfaceC58064Pop);
        AbstractC167007dF.A1G(oi6, 4, oWf);
        this.A05 = ojm;
        this.A04 = c55177Odh;
        this.A03 = interfaceC58064Pop;
        this.A02 = oi6;
        this.A08 = oWf;
        this.A06 = new C57753Pjg(this, 4);
        this.A07 = C12L.A00;
    }
}
