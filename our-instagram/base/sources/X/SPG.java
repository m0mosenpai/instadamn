package X;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class SPG {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SPG)) {
            return false;
        }
        SPG spg = (SPG) obj;
        if (!SSI.A01(this.A00, spg.A00) || !SSI.A01(this.A02, spg.A02) || !SSI.A01(this.A03, spg.A03) || !SSI.A01(this.A01, spg.A01)) {
            return false;
        }
        return SSI.A00(this.A04, spg.A04);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A03, null, this.A01, null, this.A04});
    }

    public final String toString() {
        C62715SNe c62715SNe = new C62715SNe(this);
        c62715SNe.A00(this.A00, "applicationId");
        c62715SNe.A00(this.A02, "apiKey");
        c62715SNe.A00(this.A03, "databaseUrl");
        c62715SNe.A00(this.A01, "gcmSenderId");
        c62715SNe.A00(null, "storageBucket");
        c62715SNe.A00(this.A04, "projectId");
        return c62715SNe.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r3.trim().isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SPG(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L10
            java.lang.String r0 = r3.trim()
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L11
        L10:
            r0 = 1
        L11:
            r1 = r0 ^ 1
            java.lang.String r0 = "ApplicationId must be set."
            X.C3U5.A09(r1, r0)
            r2.A00 = r3
            r2.A02 = r4
            r2.A03 = r5
            r2.A01 = r6
            r2.A04 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SPG.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
