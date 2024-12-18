package X;

import java.util.List;

/* renamed from: X.4fr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100814fr extends C2ZY {
    public String A00 = "";

    @Override // X.C2ZY
    public final int A00() {
        return 6;
    }

    @Override // X.C2ZY
    public final String A01() {
        return "error_message";
    }

    @Override // X.C2ZY
    public final void A02(StringBuilder sb) {
        C14360o3.A0B(sb, 0);
        sb.append(this.A00);
    }

    @Override // X.C2ZY
    public final void A03(List list) {
        C14360o3.A0B(list, 0);
        this.A00 = (String) list.get(0);
    }

    @Override // X.C2ZY
    public final boolean A04(C1KR c1kr) {
        return false;
    }

    public final String toString() {
        return AnonymousClass001.A0S("show error message(", this.A00, ')');
    }
}
