package X;

/* renamed from: X.7gv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169227gv extends AbstractC166097bd {
    public final EnumC166147bi A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169227gv) {
                C169227gv c169227gv = (C169227gv) obj;
                if (this.A00 != c169227gv.A00 || this.A01 != c169227gv.A01) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C169227gv(X.EnumC166147bi r3, boolean r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "restricted_comments_reveal_header"
            r1.append(r0)
            java.lang.String r0 = r3.A00
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            r2.A00 = r3
            r2.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C169227gv.<init>(X.7bi, boolean):void");
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }
}
