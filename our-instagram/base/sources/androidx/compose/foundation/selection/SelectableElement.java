package androidx.compose.foundation.selection;

import X.AbstractC114335Dx;
import X.AbstractC114345Dz;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC25235BEs;
import X.BZR;
import X.C14360o3;
import X.C58J;
import X.C58N;
import X.C5XO;
import X.C5XQ;
import X.InterfaceC118065Vq;
import X.InterfaceC16820sZ;

/* loaded from: classes5.dex */
public final class SelectableElement extends C58N {
    public final InterfaceC118065Vq A00;
    public final C5XO A01;
    public final C5XQ A02;
    public final InterfaceC16820sZ A03;
    public final boolean A04;
    public final boolean A05;

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        BZR bzr = (BZR) c58j;
        boolean z = this.A05;
        C5XO c5xo = this.A01;
        InterfaceC118065Vq interfaceC118065Vq = this.A00;
        boolean z2 = this.A04;
        C5XQ c5xq = this.A02;
        InterfaceC16820sZ interfaceC16820sZ = this.A03;
        if (bzr.A00 != z) {
            bzr.A00 = z;
            AbstractC114335Dx.A02(bzr).A0M();
        }
        bzr.A0J(interfaceC118065Vq, c5xo, c5xq, null, interfaceC16820sZ, z2);
    }

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                SelectableElement selectableElement = (SelectableElement) obj;
                if (this.A05 != selectableElement.A05 || !C14360o3.A0K(this.A01, selectableElement.A01) || !C14360o3.A0K(this.A00, selectableElement.A00) || this.A04 != selectableElement.A04 || !C14360o3.A0K(this.A02, selectableElement.A02) || this.A03 != selectableElement.A03) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.5Dz, X.BZR, X.58J] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        boolean z = this.A05;
        C5XO c5xo = this.A01;
        ?? abstractC114345Dz = new AbstractC114345Dz(this.A00, c5xo, this.A02, null, this.A03, this.A04);
        abstractC114345Dz.A00 = z;
        return abstractC114345Dz;
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

    public SelectableElement(InterfaceC118065Vq interfaceC118065Vq, C5XO c5xo, C5XQ c5xq, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        this.A05 = z;
        this.A01 = c5xo;
        this.A00 = interfaceC118065Vq;
        this.A04 = z2;
        this.A02 = c5xq;
        this.A03 = interfaceC16820sZ;
    }
}
