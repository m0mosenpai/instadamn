package X;

import java.util.Arrays;

/* renamed from: X.CUl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27965CUl {
    public final android.net.Uri A00;
    public final C27771Wf A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r1.equals(r0) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L56
            r2 = 0
            if (r5 == 0) goto L22
            boolean r0 = r5 instanceof X.C27965CUl
            if (r0 == 0) goto L22
            X.CUl r5 = (X.C27965CUl) r5
            java.lang.String r1 = r4.A03
            java.lang.String r0 = r5.A03
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L22
            java.lang.Object r1 = r4.A02
            java.lang.Object r0 = r5.A02
            if (r1 == 0) goto L23
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L26
        L22:
            return r2
        L23:
            if (r0 == 0) goto L26
            return r2
        L26:
            java.lang.String r1 = r4.A04
            java.lang.String r0 = r5.A04
            if (r1 == 0) goto L33
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L36
            return r2
        L33:
            if (r0 == 0) goto L36
            return r2
        L36:
            android.net.Uri r1 = r4.A00
            android.net.Uri r0 = r5.A00
            if (r1 == 0) goto L43
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L46
            return r2
        L43:
            if (r0 == 0) goto L46
            return r2
        L46:
            X.1Wf r1 = r4.A01
            X.1Wf r0 = r5.A01
            if (r1 == 0) goto L53
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L56
            return r2
        L53:
            if (r0 == 0) goto L56
            return r2
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27965CUl.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A02, this.A04, this.A00, null, this.A01, null, getClass()});
    }

    public C27965CUl(android.net.Uri uri, C27771Wf c27771Wf, Object obj, String str, String str2) {
        this.A03 = str;
        this.A02 = obj;
        this.A04 = str2;
        this.A00 = uri;
        this.A01 = c27771Wf;
    }
}
