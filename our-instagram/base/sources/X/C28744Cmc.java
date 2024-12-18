package X;

import androidx.compose.foundation.layout.WindowInsets;

/* renamed from: X.Cmc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28744Cmc implements WindowInsets {
    public final WindowInsets A00;
    public final WindowInsets A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28744Cmc)) {
            return false;
        }
        C28744Cmc c28744Cmc = (C28744Cmc) obj;
        return C14360o3.A0K(c28744Cmc.A00, this.A00) && C14360o3.A0K(c28744Cmc.A01, this.A01);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int AhR(InterfaceC1128957x interfaceC1128957x) {
        return Math.max(this.A00.AhR(interfaceC1128957x), this.A01.AhR(interfaceC1128957x));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int BMu(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583) {
        return Math.max(this.A00.BMu(interfaceC1128957x, anonymousClass583), this.A01.BMu(interfaceC1128957x, anonymousClass583));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int BpO(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583) {
        return Math.max(this.A00.BpO(interfaceC1128957x, anonymousClass583), this.A01.BpO(interfaceC1128957x, anonymousClass583));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int C9Q(InterfaceC1128957x interfaceC1128957x) {
        return Math.max(this.A00.C9Q(interfaceC1128957x), this.A01.C9Q(interfaceC1128957x));
    }

    public final int hashCode() {
        return this.A00.hashCode() + AbstractC166987dD.A0G(this.A01);
    }

    public C28744Cmc(WindowInsets windowInsets, WindowInsets windowInsets2) {
        this.A00 = windowInsets;
        this.A01 = windowInsets2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append('(');
        A1C.append(this.A00);
        A1C.append(" ∪ ");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
