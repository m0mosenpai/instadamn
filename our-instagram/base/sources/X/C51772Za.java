package X;

import java.util.List;

/* renamed from: X.2Za, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51772Za extends C2ZY {
    public long A00 = -1;
    public Long A01;
    public boolean A02;

    @Override // X.C2ZY
    public final int A00() {
        return 2;
    }

    @Override // X.C2ZY
    public final String A01() {
        return "loading";
    }

    @Override // X.C2ZY
    public final void A02(StringBuilder sb) {
        C14360o3.A0B(sb, 0);
        sb.append(this.A02);
        sb.append("|");
        sb.append(this.A00);
    }

    @Override // X.C2ZY
    public final void A03(List list) {
        C14360o3.A0B(list, 0);
        this.A02 = AbstractC001900j.A0b((String) list.get(0));
        this.A00 = Long.parseLong((String) list.get(1));
    }

    @Override // X.C2ZY
    public final boolean A04(C1KR c1kr) {
        C14360o3.A0B(c1kr, 0);
        if (!(c1kr instanceof C82243ll)) {
            if (!(c1kr instanceof C74583Wq)) {
                if (c1kr instanceof C123355iA) {
                    this.A02 = true;
                } else if (!(c1kr instanceof C4ND)) {
                    return false;
                }
            }
            this.A01 = Long.valueOf(((C1KP) c1kr).A00);
            return true;
        }
        Long l = this.A01;
        if (l != null) {
            this.A00 = ((C1KP) c1kr).A00 - l.longValue();
            return true;
        }
        return true;
    }

    public final String toString() {
        String str;
        String str2;
        if (this.A02) {
            str = "Pull-to-refresh loading indicator";
        } else {
            str = "Loading indicator";
        }
        long j = this.A00;
        StringBuilder sb = new StringBuilder();
        if (j <= 0) {
            sb.append(str);
            str2 = " shown and didn't stop";
        } else {
            sb.append(str);
            sb.append(" shown for ");
            sb.append(j);
            str2 = " ms";
        }
        sb.append(str2);
        return sb.toString();
    }
}
