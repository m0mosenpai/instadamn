package X;

import java.util.List;

/* renamed from: X.Ms1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51670Ms1 extends C0T6 {
    public final Integer A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    public C51670Ms1(Integer num, List list, List list2, List list3, boolean z, boolean z2) {
        C14360o3.A0B(list, 1);
        this.A03 = list;
        this.A02 = list2;
        this.A01 = list3;
        this.A04 = z;
        this.A00 = num;
        this.A05 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51670Ms1) {
                C51670Ms1 c51670Ms1 = (C51670Ms1) obj;
                if (!C14360o3.A0K(this.A03, c51670Ms1.A03) || !C14360o3.A0K(this.A02, c51670Ms1.A02) || !C14360o3.A0K(this.A01, c51670Ms1.A01) || this.A04 != c51670Ms1.A04 || !C14360o3.A0K(this.A00, c51670Ms1.A00) || this.A05 != c51670Ms1.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, (AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A03)))) + AbstractC167017dG.A0M(this.A00)) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ViewState(upcomingEvents=");
        A1C.append(this.A03);
        A1C.append(", suggestedLives=");
        A1C.append(this.A02);
        A1C.append(", postLives=");
        A1C.append(this.A01);
        A1C.append(", showLoadingAtEndOfUpcomingEventsList=");
        A1C.append(this.A04);
        A1C.append(", backgroundAttrRes=");
        A1C.append(this.A00);
        A1C.append(", useIGDSListCellForActionRows=");
        return AbstractC25236BEt.A0a(A1C, this.A05);
    }
}
