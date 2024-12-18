package X;

import java.util.List;

/* renamed from: X.PuA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58370PuA extends C2ZY {
    public C1KJ A01 = null;
    public long A00 = 0;

    @Override // X.C2ZY
    public final int A00() {
        return 8;
    }

    @Override // X.C2ZY
    public final String A01() {
        return "memory_trim_event";
    }

    @Override // X.C2ZY
    public final void A02(StringBuilder sb) {
        C14360o3.A0B(sb, 0);
        Object obj = this.A01;
        if (obj == null) {
            obj = AbstractC25227BEk.A0o();
        }
        sb.append(obj);
        sb.append("|");
        sb.append(this.A00);
    }

    @Override // X.C2ZY
    public final void A03(List list) {
        C1KJ c1kj;
        C14360o3.A0B(list, 0);
        int A0C = AbstractC167007dF.A0C(list, 0);
        if (A0C >= 0) {
            C1KJ[] values = C1KJ.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                c1kj = values[i];
                if (c1kj.ordinal() != A0C) {
                }
            }
            throw AbstractC25230BEn.A0n("Unknown type: ", A0C);
        }
        c1kj = null;
        this.A01 = c1kj;
        this.A00 = Long.parseLong(AbstractC25226BEj.A1I(list, 1));
    }

    @Override // X.C2ZY
    public final boolean A04(C1KR c1kr) {
        return false;
    }

    public final String toString() {
        String str;
        C1KJ c1kj = this.A01;
        if (c1kj == null || (str = c1kj.name()) == null) {
            str = "unknown";
        }
        return AnonymousClass001.A0s(str, " memory trim after ", "ms", this.A00);
    }
}
