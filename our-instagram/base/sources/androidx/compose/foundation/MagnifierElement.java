package androidx.compose.foundation;

import X.AbstractC114335Dx;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25236BEt;
import X.C119145aW;
import X.C14360o3;
import X.C58J;
import X.C58N;
import X.C5EC;
import X.CBO;
import X.InterfaceC1128957x;
import X.InterfaceC16660sJ;
import X.InterfaceC31112Dlu;
import android.view.View;

/* loaded from: classes5.dex */
public final class MagnifierElement extends C58N {
    public final InterfaceC31112Dlu A04;
    public final InterfaceC16660sJ A05;
    public final InterfaceC16660sJ A06;
    public final float A02 = Float.NaN;
    public final boolean A08 = true;
    public final long A03 = 9205357640488583168L;
    public final float A00 = Float.NaN;
    public final float A01 = Float.NaN;
    public final boolean A07 = true;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MagnifierElement) {
                MagnifierElement magnifierElement = (MagnifierElement) obj;
                if (this.A06 != magnifierElement.A06 || this.A02 != magnifierElement.A02 || this.A08 != magnifierElement.A08 || this.A03 != magnifierElement.A03 || !C119145aW.A01(this.A00, magnifierElement.A00) || !C119145aW.A01(this.A01, magnifierElement.A01) || this.A07 != magnifierElement.A07 || this.A05 != magnifierElement.A05 || !C14360o3.A0K(this.A04, magnifierElement.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public MagnifierElement(InterfaceC31112Dlu interfaceC31112Dlu, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        this.A06 = interfaceC16660sJ;
        this.A05 = interfaceC16660sJ2;
        this.A04 = interfaceC31112Dlu;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        InterfaceC16660sJ interfaceC16660sJ = this.A06;
        float f = this.A02;
        boolean z = this.A08;
        long j = this.A03;
        float f2 = this.A00;
        float f3 = this.A01;
        boolean z2 = this.A07;
        return new C5EC(this.A04, interfaceC16660sJ, this.A05, f, f2, f3, j, z, z2);
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C5EC c5ec = (C5EC) c58j;
        InterfaceC16660sJ interfaceC16660sJ = this.A06;
        float f = this.A02;
        boolean z = this.A08;
        long j = this.A03;
        float f2 = this.A00;
        float f3 = this.A01;
        boolean z2 = this.A07;
        InterfaceC16660sJ interfaceC16660sJ2 = this.A05;
        InterfaceC31112Dlu interfaceC31112Dlu = this.A04;
        float f4 = c5ec.A02;
        long j2 = c5ec.A03;
        float f5 = c5ec.A00;
        boolean z3 = c5ec.A0E;
        float f6 = c5ec.A01;
        boolean z4 = c5ec.A0D;
        InterfaceC31112Dlu interfaceC31112Dlu2 = c5ec.A07;
        View view = c5ec.A05;
        InterfaceC1128957x interfaceC1128957x = c5ec.A09;
        c5ec.A0B = interfaceC16660sJ;
        c5ec.A02 = f;
        c5ec.A0E = z;
        c5ec.A03 = j;
        c5ec.A00 = f2;
        c5ec.A01 = f3;
        c5ec.A0D = z2;
        c5ec.A0A = interfaceC16660sJ2;
        c5ec.A07 = interfaceC31112Dlu;
        View A00 = CBO.A00(c5ec);
        InterfaceC1128957x interfaceC1128957x2 = AbstractC114335Dx.A02(c5ec).A0C;
        if (c5ec.A06 != null && (((!Float.isNaN(f) || !Float.isNaN(f4)) && f != f4 && !interfaceC31112Dlu.Al8()) || j != j2 || !C119145aW.A01(f2, f5) || !C119145aW.A01(f3, f6) || z != z3 || z2 != z4 || !C14360o3.A0K(interfaceC31112Dlu, interfaceC31112Dlu2) || !C14360o3.A0K(A00, view) || !C14360o3.A0K(interfaceC1128957x2, interfaceC1128957x))) {
            C5EC.A01(c5ec);
        }
        C5EC.A02(c5ec);
    }

    @Override // X.C58N
    public final int hashCode() {
        int i = 0;
        int A0D = AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC25236BEt.A01(this.A03, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A00(AbstractC166987dD.A0G(this.A06) * 31, this.A02))), this.A00), this.A01));
        InterfaceC16660sJ interfaceC16660sJ = this.A05;
        if (interfaceC16660sJ != null) {
            i = interfaceC16660sJ.hashCode();
        }
        return AbstractC166987dD.A0I(this.A04, (A0D + i) * 31);
    }
}
