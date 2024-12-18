package X;

import java.util.List;

/* renamed from: X.Mr2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51609Mr2 extends C0T6 {
    public final C38602Gy5 A00;
    public final List A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C51609Mr2(C38602Gy5 c38602Gy5, String str, String str2, List list, List list2) {
        AbstractC167007dF.A1G(list, 3, c38602Gy5);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = list;
        this.A04 = list2;
        this.A00 = c38602Gy5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51609Mr2) {
                C51609Mr2 c51609Mr2 = (C51609Mr2) obj;
                if (!C14360o3.A0K(this.A02, c51609Mr2.A02) || !C14360o3.A0K(this.A03, c51609Mr2.A03) || !C14360o3.A0K(this.A01, c51609Mr2.A01) || !C14360o3.A0K(this.A04, c51609Mr2.A04) || !C14360o3.A0K(this.A00, c51609Mr2.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, (AbstractC166997dE.A0J(this.A01, ((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A04)) * 31);
    }
}
