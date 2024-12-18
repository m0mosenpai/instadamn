package androidx.compose.animation;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.BTO;
import X.C14360o3;
import X.C58J;
import X.C58N;
import X.C5E7;
import X.CU1;
import X.CWS;
import X.CWT;
import X.InterfaceC16820sZ;
import X.InterfaceC30762Dfz;

/* loaded from: classes5.dex */
public final class EnterExitTransitionElement extends C58N {
    public CWS A00;
    public CWT A01;
    public InterfaceC30762Dfz A02;
    public CU1 A03;
    public CU1 A04;
    public CU1 A05;
    public InterfaceC16820sZ A06;
    public final BTO A07;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EnterExitTransitionElement) {
                EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
                if (!C14360o3.A0K(this.A07, enterExitTransitionElement.A07) || !C14360o3.A0K(this.A04, enterExitTransitionElement.A04) || !C14360o3.A0K(this.A03, enterExitTransitionElement.A03) || !C14360o3.A0K(this.A05, enterExitTransitionElement.A05) || !C14360o3.A0K(this.A00, enterExitTransitionElement.A00) || !C14360o3.A0K(this.A01, enterExitTransitionElement.A01) || !C14360o3.A0K(this.A06, enterExitTransitionElement.A06) || !C14360o3.A0K(this.A02, enterExitTransitionElement.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        BTO bto = this.A07;
        CU1 cu1 = this.A04;
        CU1 cu12 = this.A03;
        CU1 cu13 = this.A05;
        return new C5E7(this.A00, this.A01, this.A02, cu1, cu12, cu13, bto, this.A06);
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C5E7 c5e7 = (C5E7) c58j;
        c5e7.A07 = this.A07;
        c5e7.A05 = this.A04;
        c5e7.A04 = this.A03;
        c5e7.A06 = this.A05;
        c5e7.A01 = this.A00;
        c5e7.A02 = this.A01;
        c5e7.A09 = this.A06;
        c5e7.A03 = this.A02;
    }

    @Override // X.C58N
    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A00, (((((AbstractC166987dD.A0G(this.A07) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A05)) * 31))));
    }

    public EnterExitTransitionElement(CWS cws, CWT cwt, InterfaceC30762Dfz interfaceC30762Dfz, CU1 cu1, CU1 cu12, CU1 cu13, BTO bto, InterfaceC16820sZ interfaceC16820sZ) {
        this.A07 = bto;
        this.A04 = cu1;
        this.A03 = cu12;
        this.A05 = cu13;
        this.A00 = cws;
        this.A01 = cwt;
        this.A06 = interfaceC16820sZ;
        this.A02 = interfaceC30762Dfz;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EnterExitTransitionElement(transition=");
        A1C.append(this.A07);
        A1C.append(", sizeAnimation=");
        A1C.append(this.A04);
        A1C.append(", offsetAnimation=");
        A1C.append(this.A03);
        A1C.append(", slideAnimation=");
        A1C.append(this.A05);
        A1C.append(", enter=");
        A1C.append(this.A00);
        A1C.append(", exit=");
        A1C.append(this.A01);
        A1C.append(", isEnabled=");
        A1C.append(this.A06);
        A1C.append(", graphicsLayerBlock=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
