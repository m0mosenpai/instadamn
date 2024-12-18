package X;

import androidx.compose.foundation.layout.WindowInsets;

/* renamed from: X.Cmd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28745Cmd implements WindowInsets {
    public final InterfaceC74953Yl A00;
    public final String A01;

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int AhR(InterfaceC1128957x interfaceC1128957x) {
        return ((C27996CVt) this.A00.getValue()).A00;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int BMu(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583) {
        return ((C27996CVt) this.A00.getValue()).A01;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int BpO(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583) {
        return ((C27996CVt) this.A00.getValue()).A02;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public final int C9Q(InterfaceC1128957x interfaceC1128957x) {
        return ((C27996CVt) this.A00.getValue()).A03;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C28745Cmd)) {
            return false;
        }
        return AbstractC25229BEm.A1V(((C28745Cmd) obj).A00, this.A00.getValue());
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C28745Cmd(C27996CVt c27996CVt, String str) {
        this.A01 = str;
        this.A00 = AbstractC25230BEn.A0U(c27996CVt);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A01);
        A1C.append("(left=");
        InterfaceC74953Yl interfaceC74953Yl = this.A00;
        A1C.append(((C27996CVt) interfaceC74953Yl.getValue()).A01);
        A1C.append(", top=");
        A1C.append(((C27996CVt) interfaceC74953Yl.getValue()).A03);
        A1C.append(", right=");
        A1C.append(((C27996CVt) interfaceC74953Yl.getValue()).A02);
        A1C.append(", bottom=");
        return AbstractC25236BEt.A0Z(A1C, ((C27996CVt) interfaceC74953Yl.getValue()).A00);
    }
}
