package X;

import java.util.List;

/* renamed from: X.Rd8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60980Rd8 extends C2ZY {
    public int A00 = 0;
    public long A01 = 0;

    @Override // X.C2ZY
    public final int A00() {
        return 5;
    }

    @Override // X.C2ZY
    public final String A01() {
        return "crash";
    }

    @Override // X.C2ZY
    public final void A02(StringBuilder sb) {
        C14360o3.A0B(sb, 0);
        sb.append(this.A00);
        sb.append("|");
        sb.append(this.A01);
    }

    @Override // X.C2ZY
    public final void A03(List list) {
        C14360o3.A0B(list, 0);
        this.A00 = AbstractC167007dF.A0C(list, 0);
        this.A01 = Long.parseLong(AbstractC25226BEj.A1I(list, 1));
    }

    @Override // X.C2ZY
    public final boolean A04(C1KR c1kr) {
        return false;
    }

    public final String toString() {
        String str;
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                str = "unknown reliability issue";
            } else {
                str = "app ANR";
            }
        } else {
            str = "app crashed";
        }
        return AnonymousClass001.A0s(str, " after ", "ms", this.A01);
    }
}
