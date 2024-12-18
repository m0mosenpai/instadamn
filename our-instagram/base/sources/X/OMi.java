package X;

import java.util.Random;

/* loaded from: classes9.dex */
public final class OMi {
    public final int A00 = new Random().nextInt();
    public final C006802i A01;
    public final C25531Mh A02;

    public final void A00() {
        this.A01.markerEnd(533737437, this.A00, (short) 3);
    }

    public final void A01() {
        this.A01.markerEnd(533737437, this.A00, (short) 2);
    }

    public final void A02() {
        this.A01.markerPoint(533737437, this.A00, "validate_end");
    }

    public final void A03() {
        this.A01.markerPoint(533737437, this.A00, "validate_start");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r5.length() == 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(java.lang.String r5) {
        /*
            r4 = this;
            X.02i r3 = r4.A01
            int r2 = r4.A00
            r1 = 533737437(0x1fd02fdd, float:8.817061E-20)
            java.lang.String r0 = "nonce_end"
            r3.markerPoint(r1, r2, r0)
            X.1Mh r2 = r4.A02
            if (r2 == 0) goto L23
            if (r5 == 0) goto L19
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L1a
        L19:
            r0 = 1
        L1a:
            java.lang.Boolean r1 = X.AbstractC31172DnG.A0s(r0)
            java.lang.String r0 = "has_challenge_nonce"
            r2.A0O(r0, r1)
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OMi.A04(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r5.length() == 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(java.lang.String r5) {
        /*
            r4 = this;
            X.02i r3 = r4.A01
            int r2 = r4.A00
            r1 = 533737437(0x1fd02fdd, float:8.817061E-20)
            java.lang.String r0 = "google_end"
            r3.markerPoint(r1, r2, r0)
            X.1Mh r2 = r4.A02
            if (r2 == 0) goto L23
            if (r5 == 0) goto L19
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L1a
        L19:
            r0 = 1
        L1a:
            java.lang.Boolean r1 = X.AbstractC31172DnG.A0s(r0)
            java.lang.String r0 = "has_integrity_token"
            r2.A0O(r0, r1)
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OMi.A05(java.lang.String):void");
    }

    public OMi(C25531Mh c25531Mh, C006802i c006802i) {
        this.A01 = c006802i;
        this.A02 = c25531Mh;
    }
}
