package X;

import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.ProductArEffectMetadata;

/* renamed from: X.HZt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39354HZt extends IN1 {
    public final ImageInfo A00;
    public final ProductArEffectMetadata A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final Boolean A07;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C39354HZt(com.instagram.model.mediasize.ImageInfo r7, com.instagram.model.shopping.ProductArEffectMetadata r8, java.lang.Boolean r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r6 = this;
            r0 = 1
            r3 = r10
            X.C14360o3.A0B(r10, r0)
            java.lang.Integer r2 = X.C05F.A00
            if (r7 == 0) goto L27
            X.IbL r1 = new X.IbL
            r1.<init>(r7)
        Le:
            java.lang.String r4 = "ar_camera_nux"
            r5 = 1065353216(0x3f800000, float:1.0)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A02 = r10
            r6.A06 = r11
            r6.A05 = r12
            r6.A01 = r8
            r6.A00 = r7
            r6.A03 = r13
            r6.A04 = r14
            r6.A07 = r9
            return
        L27:
            r1 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39354HZt.<init>(com.instagram.model.mediasize.ImageInfo, com.instagram.model.shopping.ProductArEffectMetadata, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39354HZt) {
                C39354HZt c39354HZt = (C39354HZt) obj;
                if (!C14360o3.A0K(this.A02, c39354HZt.A02) || !C14360o3.A0K(this.A06, c39354HZt.A06) || !C14360o3.A0K(this.A05, c39354HZt.A05) || !C14360o3.A0K(this.A01, c39354HZt.A01) || !C14360o3.A0K(this.A00, c39354HZt.A00) || !C14360o3.A0K(this.A03, c39354HZt.A03) || !C14360o3.A0K(this.A04, c39354HZt.A04) || !C14360o3.A0K(this.A07, c39354HZt.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.A01, (((AbstractC166987dD.A0J(this.A02) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC166997dE.A0I(this.A07);
    }
}
