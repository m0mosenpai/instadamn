package X;

import androidx.compose.foundation.layout.WindowInsets;

/* renamed from: X.Cme, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28746Cme implements WindowInsets {
    public final InterfaceC74953Yl A00 = AbstractC25230BEn.A0U(C02I.A04);
    public final InterfaceC74953Yl A01 = AbstractC25229BEm.A0R(AbstractC166997dE.A0b());
    public final int A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C28746Cme) && this.A02 == ((C28746Cme) obj).A02;
        }
        return true;
    }

    public final void A00(C011504d c011504d) {
        int i = this.A02;
        C011304b c011304b = c011504d.A00;
        this.A00.Egh(c011304b.A05(i));
        AbstractC25227BEk.A1A(this.A01, c011304b.A0I(i));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int AhR(InterfaceC1128957x interfaceC1128957x) {
        return ((C02I) this.A00.getValue()).A00;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int BMu(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583) {
        return ((C02I) this.A00.getValue()).A01;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int BpO(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583) {
        return ((C02I) this.A00.getValue()).A02;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int C9Q(InterfaceC1128957x interfaceC1128957x) {
        return ((C02I) this.A00.getValue()).A03;
    }

    public C28746Cme(int i, String str) {
        this.A02 = i;
        this.A03 = str;
    }

    public final int hashCode() {
        return this.A02;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A03);
        A1C.append('(');
        InterfaceC74953Yl interfaceC74953Yl = this.A00;
        A1C.append(((C02I) interfaceC74953Yl.getValue()).A01);
        A1C.append(", ");
        A1C.append(((C02I) interfaceC74953Yl.getValue()).A03);
        A1C.append(", ");
        A1C.append(((C02I) interfaceC74953Yl.getValue()).A02);
        A1C.append(", ");
        return AbstractC25236BEt.A0Z(A1C, ((C02I) interfaceC74953Yl.getValue()).A00);
    }
}
