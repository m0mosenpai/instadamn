package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.HZr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39352HZr extends IN1 {
    public final C38321qM A00;
    public final Reel A01;
    public final String A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C39352HZr(X.C38321qM r7, com.instagram.model.reels.Reel r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 1
            r3 = r9
            X.C14360o3.A0B(r9, r0)
            java.lang.Integer r2 = X.C05F.A0j
            boolean r0 = r7.Cff()
            if (r0 == 0) goto L23
            java.lang.String r4 = "story_video"
        Lf:
            float r5 = r7.A0m()
            X.IbL r1 = new X.IbL
            r1.<init>(r7)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A02 = r9
            r6.A00 = r7
            r6.A01 = r8
            return
        L23:
            java.lang.String r4 = "story_photo"
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39352HZr.<init>(X.1qM, com.instagram.model.reels.Reel, java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39352HZr) {
                C39352HZr c39352HZr = (C39352HZr) obj;
                if (!C14360o3.A0K(this.A02, c39352HZr.A02) || !C14360o3.A0K(this.A00, c39352HZr.A00) || !C14360o3.A0K(this.A01, c39352HZr.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A02)));
    }
}
