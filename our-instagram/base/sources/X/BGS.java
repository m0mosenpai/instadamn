package X;

/* loaded from: classes5.dex */
public final class BGS extends BH1 {
    public final int A00;
    public final BGT A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BGS(X.BGT r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            X.5HW r0 = r3.A01
            java.lang.String r1 = r0.A09
            X.C14360o3.A07(r1)
            java.lang.String r0 = "content_type_newsfeed_story"
            r2.<init>(r1, r0)
            r2.A01 = r3
            r2.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BGS.<init>(X.BGT, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGS) {
                BGS bgs = (BGS) obj;
                if (!C14360o3.A0K(this.A01, bgs.A01) || this.A00 != bgs.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }
}
