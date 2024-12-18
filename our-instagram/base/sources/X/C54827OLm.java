package X;

import androidx.paging.PagingConfig;
import java.util.List;

/* renamed from: X.OLm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54827OLm {
    public final int A00;
    public final Integer A01;
    public final List A02;
    public final PagingConfig A03;

    public C54827OLm(PagingConfig pagingConfig, Integer num, List list, int i) {
        C14360o3.A0B(pagingConfig, 3);
        this.A02 = list;
        this.A01 = num;
        this.A03 = pagingConfig;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C54827OLm) {
            C54827OLm c54827OLm = (C54827OLm) obj;
            if (C14360o3.A0K(this.A02, c54827OLm.A02) && C14360o3.A0K(this.A01, c54827OLm.A01) && C14360o3.A0K(this.A03, c54827OLm.A03) && this.A00 == c54827OLm.A00) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, this.A02.hashCode() + AbstractC25235BEs.A06(this.A01)) + this.A00;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PagingState(pages=");
        A1C.append(this.A02);
        A1C.append(", anchorPosition=");
        A1C.append(this.A01);
        A1C.append(", config=");
        A1C.append(this.A03);
        A1C.append(", leadingPlaceholderCount=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
