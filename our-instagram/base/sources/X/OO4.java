package X;

import com.instagram.api.schemas.BrandedContentGatingInfo;

/* loaded from: classes9.dex */
public abstract class OO4 {
    public static final boolean A00(BrandedContentGatingInfo brandedContentGatingInfo) {
        Integer num = brandedContentGatingInfo.A00;
        if ((num == null || num.intValue() == 0) && brandedContentGatingInfo.A02 == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r1 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(com.instagram.api.schemas.BrandedContentGatingInfo r1) {
        /*
            java.util.List r0 = r1.A04
            if (r0 == 0) goto Lb
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto Lc
        Lb:
            r0 = 1
        Lc:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OO4.A01(com.instagram.api.schemas.BrandedContentGatingInfo):boolean");
    }
}
