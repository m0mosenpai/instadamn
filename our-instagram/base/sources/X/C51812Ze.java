package X;

import java.util.List;

/* renamed from: X.2Ze, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51812Ze extends C2ZY {
    public boolean A00;
    public boolean A01;

    @Override // X.C2ZY
    public final int A00() {
        return 3;
    }

    @Override // X.C2ZY
    public final String A01() {
        return "scroll";
    }

    @Override // X.C2ZY
    public final void A02(StringBuilder sb) {
        C14360o3.A0B(sb, 0);
        sb.append(this.A01);
        sb.append("|");
        sb.append(this.A00);
    }

    @Override // X.C2ZY
    public final void A03(List list) {
        C14360o3.A0B(list, 0);
        this.A01 = AbstractC001900j.A0b((String) list.get(0));
        this.A00 = AbstractC001900j.A0b((String) list.get(1));
    }

    @Override // X.C2ZY
    public final boolean A04(C1KR c1kr) {
        C14360o3.A0B(c1kr, 0);
        if (!(c1kr instanceof C4JQ)) {
            return false;
        }
        this.A01 = true;
        this.A00 = ((C4JQ) c1kr).A00;
        return true;
    }

    public final String toString() {
        String str;
        String str2;
        if (this.A00) {
            str = "vertical";
        } else {
            str = "horizontal";
        }
        boolean z = this.A01;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(str);
            str2 = " scroll animation started and stopped";
        } else {
            sb.append(str);
            str2 = " scroll started";
        }
        sb.append(str2);
        return sb.toString();
    }
}
