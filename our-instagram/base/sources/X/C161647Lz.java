package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.7Lz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161647Lz {
    public final C9BW A00;
    public final C34498FIk A01;
    public final C83403nh A02;
    public final Boolean A03;
    public final Boolean A04;
    public final List A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C161647Lz c161647Lz = (C161647Lz) obj;
            if (this.A06 != c161647Lz.A06 || !AbstractC50102Ry.A00(this.A05, c161647Lz.A05) || !AbstractC50102Ry.A00(this.A00, c161647Lz.A00) || !AbstractC50102Ry.A00(this.A01, c161647Lz.A01) || !AbstractC50102Ry.A00(this.A02, c161647Lz.A02) || !AbstractC50102Ry.A00(this.A04, c161647Lz.A04) || !AbstractC50102Ry.A00(this.A03, c161647Lz.A03)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A00, Boolean.valueOf(this.A06), this.A01, this.A02, this.A04, this.A03});
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (X.AbstractC83893oY.A00((java.util.Collection) r3.A01) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C161647Lz(X.C9BW r3, X.C34498FIk r4, X.C83403nh r5, java.lang.Boolean r6, java.lang.Boolean r7, java.util.List r8) {
        /*
            r2 = this;
            r2.<init>()
            r2.A05 = r8
            r2.A00 = r3
            if (r3 == 0) goto L14
            java.lang.Object r0 = r3.A01
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r1 = X.AbstractC83893oY.A00(r0)
            r0 = 1
            if (r1 == 0) goto L15
        L14:
            r0 = 0
        L15:
            r2.A06 = r0
            r2.A01 = r4
            r2.A02 = r5
            r2.A04 = r6
            r2.A03 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161647Lz.<init>(X.9BW, X.FIk, X.3nh, java.lang.Boolean, java.lang.Boolean, java.util.List):void");
    }
}
