package androidx.compose.foundation;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC58317Pt9;
import X.C119145aW;
import X.C14360o3;
import X.C58J;
import X.C58N;
import X.C5EB;
import X.InterfaceC31080DlO;
import X.MSV;

/* loaded from: classes5.dex */
public final class MarqueeModifierElement extends C58N {
    public final InterfaceC31080DlO A04;
    public final int A03 = 3;
    public final int A01 = 1200;
    public final int A02 = 1200;
    public final float A00 = 30.0f;

    public MarqueeModifierElement(InterfaceC31080DlO interfaceC31080DlO) {
        this.A04 = interfaceC31080DlO;
    }

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarqueeModifierElement) {
                MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
                if (this.A03 != marqueeModifierElement.A03 || this.A01 != marqueeModifierElement.A01 || this.A02 != marqueeModifierElement.A02 || !C14360o3.A0K(this.A04, marqueeModifierElement.A04) || !C119145aW.A01(this.A00, marqueeModifierElement.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        return new C5EB(this.A04, this.A00, this.A03, this.A01, this.A02);
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C5EB c5eb = (C5EB) c58j;
        int i = this.A03;
        int i2 = this.A01;
        int i3 = this.A02;
        InterfaceC31080DlO interfaceC31080DlO = this.A04;
        float f = this.A00;
        c5eb.A0A.Egh(interfaceC31080DlO);
        c5eb.A08.Egh(new Object());
        if (c5eb.A03 != i || c5eb.A01 != i2 || c5eb.A02 != i3 || !C119145aW.A01(c5eb.A00, f)) {
            c5eb.A03 = i;
            c5eb.A01 = i2;
            c5eb.A02 = i3;
            c5eb.A00 = f;
            C5EB.A01(c5eb);
        }
    }

    @Override // X.C58N
    public final int hashCode() {
        return AbstractC25226BEj.A01(AbstractC166997dE.A0J(this.A04, ((((this.A03 * 31 * 31) + this.A01) * 31) + this.A02) * 31), this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MarqueeModifierElement(iterations=");
        A1C.append(this.A03);
        A1C.append(", animationMode=");
        A1C.append((Object) "Immediately");
        A1C.append(MSV.A00(622));
        A1C.append(this.A01);
        A1C.append(AbstractC58317Pt9.A00(432));
        A1C.append(this.A02);
        A1C.append(", spacing=");
        A1C.append(this.A04);
        A1C.append(AbstractC111324zv.A00(1465));
        return AbstractC167017dG.A0o(C119145aW.A00(this.A00), A1C);
    }
}
