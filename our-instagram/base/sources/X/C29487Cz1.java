package X;

import java.util.List;

/* renamed from: X.Cz1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29487Cz1 implements InterfaceC30840DhF {
    public final List A00;
    public final InterfaceC16660sJ A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29487Cz1) {
                C29487Cz1 c29487Cz1 = (C29487Cz1) obj;
                if (!C14360o3.A0K(this.A00, c29487Cz1.A00) || !C14360o3.A0K(this.A01, c29487Cz1.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C29487Cz1(InterfaceC16660sJ interfaceC16660sJ, List list) {
        this.A00 = list;
        this.A01 = interfaceC16660sJ;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MetaAIReelsUIState(reelsData=");
        A1C.append(this.A00);
        A1C.append(", onReelClicked=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
