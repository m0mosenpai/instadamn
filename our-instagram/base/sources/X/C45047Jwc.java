package X;

import java.util.List;

/* renamed from: X.Jwc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45047Jwc extends C0T6 {
    public final C45028JwJ A00;
    public final Long A01;
    public final List A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45047Jwc) {
                C45047Jwc c45047Jwc = (C45047Jwc) obj;
                if (!C14360o3.A0K(this.A01, c45047Jwc.A01) || !C14360o3.A0K(this.A02, c45047Jwc.A02) || !C14360o3.A0K(this.A03, c45047Jwc.A03) || this.A04 != c45047Jwc.A04 || this.A05 != c45047Jwc.A05 || !C14360o3.A0K(this.A00, c45047Jwc.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC167017dG.A0M(this.A01) * 31)))) + AbstractC166997dE.A0I(this.A00);
    }

    public C45047Jwc(C45028JwJ c45028JwJ, Long l, List list, List list2, boolean z, boolean z2) {
        AbstractC167017dG.A1R(list, list2);
        this.A01 = l;
        this.A02 = list;
        this.A03 = list2;
        this.A04 = z;
        this.A05 = z2;
        this.A00 = c45028JwJ;
    }
}
