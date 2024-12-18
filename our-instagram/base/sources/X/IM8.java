package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.model.reels.Reel;

/* loaded from: classes7.dex */
public final class IM8 {
    public boolean A00;
    public final ProfileGridItemTypeEnum A01;
    public final C38321qM A02;
    public final Reel A03;
    public final boolean A04;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0012 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A00() {
        /*
            r3 = this;
            com.instagram.api.schemas.ProfileGridItemTypeEnum r2 = r3.A01
            com.instagram.api.schemas.ProfileGridItemTypeEnum r0 = com.instagram.api.schemas.ProfileGridItemTypeEnum.A05
            java.lang.String r1 = ""
            if (r2 != r0) goto L13
            X.1qM r0 = r3.A02
            if (r0 == 0) goto L1c
            java.lang.String r0 = r0.getId()
        L10:
            if (r0 == 0) goto L1c
            return r0
        L13:
            com.instagram.model.reels.Reel r0 = r3.A03
            if (r0 == 0) goto L1c
            java.lang.String r0 = r0.getId()
            goto L10
        L1c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IM8.A00():java.lang.String");
    }

    public IM8(ProfileGridItemTypeEnum profileGridItemTypeEnum, C38321qM c38321qM, Reel reel) {
        this.A01 = profileGridItemTypeEnum;
        this.A02 = c38321qM;
        this.A03 = reel;
        this.A04 = profileGridItemTypeEnum == ProfileGridItemTypeEnum.A04;
    }
}
