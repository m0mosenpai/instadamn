package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class JWN extends C4F4 {
    public final C4F3 A00;
    public final C4FL A01;
    public final Integer A02;
    public final List A03;
    public final List A04;
    public final C26084BgD A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JWN) {
                JWN jwn = (JWN) obj;
                if (!C14360o3.A0K(this.A03, jwn.A03) || !C14360o3.A0K(this.A01, jwn.A01) || !C14360o3.A0K(this.A00, jwn.A00) || !C14360o3.A0K(this.A02, jwn.A02) || !C14360o3.A0K(this.A05, jwn.A05) || !C14360o3.A0K(this.A04, jwn.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AbstractC166987dD.A0G(this.A03) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public JWN(C26084BgD c26084BgD, C4F3 c4f3, C4FL c4fl, Integer num, List list, List list2) {
        this.A03 = list;
        this.A01 = c4fl;
        this.A00 = c4f3;
        this.A02 = num;
        this.A05 = c26084BgD;
        this.A04 = list2;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CFHubRecyclerViewModel(itemViewModels=");
        A1C.append(this.A03);
        A1C.append(", creationItem=");
        A1C.append(this.A01);
        A1C.append(", friendMapNote=");
        A1C.append(this.A00);
        A1C.append(", chevronItemIndex=");
        A1C.append(this.A02);
        A1C.append(", spotlightModel=");
        A1C.append(this.A05);
        A1C.append(", mediaNoteStacks=");
        return AbstractC167017dG.A0o(this.A04, A1C);
    }
}
