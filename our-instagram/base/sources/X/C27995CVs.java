package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.CVs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27995CVs {
    public final C5Y5 A00;
    public final Alignment A01;
    public final InterfaceC16660sJ A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27995CVs) {
                C27995CVs c27995CVs = (C27995CVs) obj;
                if (!C14360o3.A0K(this.A01, c27995CVs.A01) || !C14360o3.A0K(this.A02, c27995CVs.A02) || !C14360o3.A0K(this.A00, c27995CVs.A00) || this.A03 != c27995CVs.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01))));
    }

    public C27995CVs(C5Y5 c5y5, Alignment alignment, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A01 = alignment;
        this.A02 = interfaceC16660sJ;
        this.A00 = c5y5;
        this.A03 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ChangeSize(alignment=");
        A1C.append(this.A01);
        A1C.append(", size=");
        A1C.append(this.A02);
        A1C.append(", animationSpec=");
        A1C.append(this.A00);
        A1C.append(", clip=");
        return AbstractC25236BEt.A0a(A1C, this.A03);
    }
}
