package X;

/* loaded from: classes10.dex */
public final class RMN extends AbstractC64527TId {
    public final String A00;

    public final int hashCode() {
        return AbstractC37301Gc2.A02(3, this.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
    
        r1 = r4.A00;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r5) {
        /*
            r4 = this;
            X.TId r5 = (X.AbstractC64527TId) r5
            int r3 = r5.A02()
            r2 = 3
            if (r2 != r3) goto L1e
            X.RMN r5 = (X.RMN) r5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            int r3 = r0.length()
            int r2 = r1.length()
            if (r2 != r3) goto L1e
            int r2 = r1.compareTo(r0)
            return r2
        L1e:
            int r2 = r2 - r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RMN.compareTo(java.lang.Object):int");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((RMN) obj).A00);
    }

    public final String toString() {
        return AnonymousClass001.A0g("\"", this.A00, "\"");
    }

    public RMN(String str) {
        this.A00 = str;
    }
}
