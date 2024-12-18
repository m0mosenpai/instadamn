package X;

import java.util.List;

/* renamed from: X.4gr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101344gr extends C2ZY {
    public boolean A00 = false;

    @Override // X.C2ZY
    public final int A00() {
        return 7;
    }

    @Override // X.C2ZY
    public final String A01() {
        return "account_switch";
    }

    @Override // X.C2ZY
    public final void A02(StringBuilder sb) {
        C14360o3.A0B(sb, 0);
        sb.append(this.A00);
    }

    @Override // X.C2ZY
    public final void A03(List list) {
        C14360o3.A0B(list, 0);
        this.A00 = Boolean.parseBoolean((String) list.get(0));
    }

    @Override // X.C2ZY
    public final boolean A04(C1KR c1kr) {
        C14360o3.A0B(c1kr, 0);
        if (!(c1kr instanceof C4NF)) {
            return false;
        }
        this.A00 = ((C4NF) c1kr).A00;
        return true;
    }

    public final String toString() {
        if (this.A00) {
            return AbstractC111324zv.A00(2682);
        }
        return "switched account";
    }
}
