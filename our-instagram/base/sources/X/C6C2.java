package X;

/* renamed from: X.6C2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6C2 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        throw new IllegalStateException("This class should not be used for comparisons");
    }

    public final int hashCode() {
        throw new IllegalStateException("This class should not be used for comparisons");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IdentifierPair{igid='");
        sb.append(this.A01);
        sb.append('\'');
        sb.append(", fbid='");
        sb.append(this.A00);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r3 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6C2(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            r1.<init>()
            if (r2 != 0) goto L8
            r0 = 0
            if (r3 == 0) goto L9
        L8:
            r0 = 1
        L9:
            X.C18C.A0E(r0)
            r1.A01 = r2
            r1.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6C2.<init>(java.lang.String, java.lang.String):void");
    }
}
