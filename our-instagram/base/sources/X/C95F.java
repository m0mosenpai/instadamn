package X;

/* renamed from: X.95F, reason: invalid class name */
/* loaded from: classes4.dex */
public class C95F extends C95G {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C95F) {
            C95G c95g = (C95G) obj;
            if (this.A00 == null && c95g.A00 == null) {
                C95G c95g2 = this.A02;
                C95G c95g3 = c95g.A02;
                if (c95g2 != null ? c95g2.equals(c95g3) : c95g3 == null) {
                    if (this.A03.equals(c95g.A03)) {
                        return true;
                    }
                }
            }
            if (A01() == null) {
                if (c95g.A01() == null) {
                    return true;
                }
                return false;
            }
            return A01().equals(c95g.A01());
        }
        return false;
    }
}
