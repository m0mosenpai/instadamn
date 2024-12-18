package androidx.compose.foundation.selection;

import X.AbstractC114335Dx;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC25235BEs;
import X.BZS;
import X.C14360o3;
import X.C58J;
import X.C58N;
import X.C5XO;
import X.C5XQ;
import X.InterfaceC118065Vq;
import X.InterfaceC16660sJ;

/* loaded from: classes5.dex */
public final class ToggleableElement extends C58N {
    public final InterfaceC118065Vq A00;
    public final C5XO A01;
    public final C5XQ A02;
    public final InterfaceC16660sJ A03;
    public final boolean A04;
    public final boolean A05;

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        BZS bzs = (BZS) c58j;
        boolean z = this.A05;
        C5XO c5xo = this.A01;
        InterfaceC118065Vq interfaceC118065Vq = this.A00;
        boolean z2 = this.A04;
        C5XQ c5xq = this.A02;
        InterfaceC16660sJ interfaceC16660sJ = this.A03;
        if (bzs.A01 != z) {
            bzs.A01 = z;
            AbstractC114335Dx.A02(bzs).A0M();
        }
        bzs.A00 = interfaceC16660sJ;
        bzs.A0J(interfaceC118065Vq, c5xo, c5xq, null, bzs.A02, z2);
    }

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ToggleableElement toggleableElement = (ToggleableElement) obj;
                if (this.A05 != toggleableElement.A05 || !C14360o3.A0K(this.A01, toggleableElement.A01) || !C14360o3.A0K(this.A00, toggleableElement.A00) || this.A04 != toggleableElement.A04 || !C14360o3.A0K(this.A02, toggleableElement.A02) || this.A03 != toggleableElement.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        boolean z = this.A05;
        C5XO c5xo = this.A01;
        return new BZS(this.A00, c5xo, this.A02, this.A03, z, this.A04);
    }

    @Override // X.C58N
    public final int hashCode() {
        int i = 0;
        int A0D = AbstractC167007dF.A0D(this.A04, (((AbstractC25225BEi.A08(this.A05) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A00)) * 31);
        C5XQ c5xq = this.A02;
        if (c5xq != null) {
            i = c5xq.A00;
        }
        return AbstractC166987dD.A0I(this.A03, (A0D + i) * 31);
    }

    public ToggleableElement(InterfaceC118065Vq interfaceC118065Vq, C5XO c5xo, C5XQ c5xq, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        this.A05 = z;
        this.A01 = c5xo;
        this.A00 = interfaceC118065Vq;
        this.A04 = z2;
        this.A02 = c5xq;
        this.A03 = interfaceC16660sJ;
    }
}
