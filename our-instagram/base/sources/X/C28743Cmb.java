package X;

import androidx.compose.foundation.layout.WindowInsets;

/* renamed from: X.Cmb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28743Cmb implements WindowInsets {
    public final WindowInsets A00;
    public final WindowInsets A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28743Cmb)) {
            return false;
        }
        C28743Cmb c28743Cmb = (C28743Cmb) obj;
        return C14360o3.A0K(c28743Cmb.A01, this.A01) && C14360o3.A0K(c28743Cmb.A00, this.A00);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int AhR(InterfaceC1128957x interfaceC1128957x) {
        int AhR = this.A01.AhR(interfaceC1128957x) - this.A00.AhR(interfaceC1128957x);
        return AbstractC25230BEn.A06(AhR, AhR);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int BMu(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583) {
        int BMu = this.A01.BMu(interfaceC1128957x, anonymousClass583) - this.A00.BMu(interfaceC1128957x, anonymousClass583);
        return AbstractC25230BEn.A06(BMu, BMu);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int BpO(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583) {
        int BpO = this.A01.BpO(interfaceC1128957x, anonymousClass583) - this.A00.BpO(interfaceC1128957x, anonymousClass583);
        return AbstractC25230BEn.A06(BpO, BpO);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int C9Q(InterfaceC1128957x interfaceC1128957x) {
        int C9Q = this.A01.C9Q(interfaceC1128957x) - this.A00.C9Q(interfaceC1128957x);
        return AbstractC25230BEn.A06(C9Q, C9Q);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public C28743Cmb(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.A01 = windowInsets;
        this.A00 = windowInsets2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append('(');
        A1C.append(this.A01);
        A1C.append(" - ");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
