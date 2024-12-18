package X;

import com.instagram.model.reels.ReelType;

/* renamed from: X.Ebj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32779Ebj extends FKR {
    public final C38321qM A00;
    public final C41181vS A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final ReelType A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32779Ebj) {
                C32779Ebj c32779Ebj = (C32779Ebj) obj;
                if (!C14360o3.A0K(this.A02, c32779Ebj.A02) || !C14360o3.A0K(this.A03, c32779Ebj.A03) || this.A06 != c32779Ebj.A06 || !C14360o3.A0K(this.A01, c32779Ebj.A01) || !C14360o3.A0K(this.A04, c32779Ebj.A04) || !C14360o3.A0K(this.A00, c32779Ebj.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r5 == com.instagram.model.reels.ReelType.A05) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C32779Ebj(X.C38321qM r3, X.C41181vS r4, com.instagram.model.reels.ReelType r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r2 = this;
            X.2EY r0 = X.C2EY.A1g
            r2.<init>(r0, r6)
            r2.A02 = r6
            r2.A03 = r7
            r2.A06 = r5
            r2.A01 = r4
            r2.A04 = r8
            r2.A00 = r3
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A06
            if (r5 == r0) goto L1a
            com.instagram.model.reels.ReelType r1 = com.instagram.model.reels.ReelType.A05
            r0 = 0
            if (r5 != r1) goto L1b
        L1a:
            r0 = 1
        L1b:
            r2.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32779Ebj.<init>(X.1qM, X.1vS, com.instagram.model.reels.ReelType, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
