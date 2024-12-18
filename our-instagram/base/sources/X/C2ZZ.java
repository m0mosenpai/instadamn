package X;

import java.util.List;

/* renamed from: X.2ZZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2ZZ extends C2ZY {
    public String A00 = null;
    public String A01 = null;

    @Override // X.C2ZY
    public final int A00() {
        return 4;
    }

    @Override // X.C2ZY
    public final String A01() {
        return "navigation";
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
        this.A00 = (String) list.get(0);
        this.A01 = (String) list.get(1);
    }

    @Override // X.C2ZY
    public final boolean A04(C1KR c1kr) {
        C14360o3.A0B(c1kr, 0);
        if (!(c1kr instanceof C1KS)) {
            return false;
        }
        this.A01 = ((C1KP) c1kr).A01;
        return true;
    }

    public final String toString() {
        StringBuilder sb;
        String str = this.A01;
        if (str != null) {
            sb = new StringBuilder();
            sb.append("navigated from ");
            sb.append(this.A00);
            sb.append(" to ");
        } else {
            sb = new StringBuilder();
            sb.append("navigated away from ");
            str = this.A00;
        }
        sb.append(str);
        return sb.toString();
    }
}
