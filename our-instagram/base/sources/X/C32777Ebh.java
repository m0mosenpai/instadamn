package X;

import com.instagram.model.reels.ReelType;

/* renamed from: X.Ebh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32777Ebh extends FKR {
    public final C41181vS A00;
    public final String A01;
    public final boolean A02;
    public final ReelType A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32777Ebh) {
                C32777Ebh c32777Ebh = (C32777Ebh) obj;
                if (!C14360o3.A0K(this.A01, c32777Ebh.A01) || this.A03 != c32777Ebh.A03 || !C14360o3.A0K(this.A00, c32777Ebh.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r4 == com.instagram.model.reels.ReelType.A05) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C32777Ebh(X.C41181vS r3, com.instagram.model.reels.ReelType r4, java.lang.String r5) {
        /*
            r2 = this;
            X.2EY r0 = X.C2EY.A1B
            r2.<init>(r0, r5)
            r2.A01 = r5
            r2.A03 = r4
            r2.A00 = r3
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A06
            if (r4 == r0) goto L14
            com.instagram.model.reels.ReelType r1 = com.instagram.model.reels.ReelType.A05
            r0 = 0
            if (r4 != r1) goto L15
        L14:
            r0 = 1
        L15:
            r2.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32777Ebh.<init>(X.1vS, com.instagram.model.reels.ReelType, java.lang.String):void");
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
