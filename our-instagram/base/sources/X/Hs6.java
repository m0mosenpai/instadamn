package X;

import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class Hs6 {
    public static C38748H4o parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C37771pE c37771pE = null;
            ProfileGridItemTypeEnum profileGridItemTypeEnum = null;
            C38321qM c38321qM = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("highlight".equals(A0s)) {
                    c37771pE = AbstractC38741r6.parseFromJson(c16l);
                } else if ("item_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    profileGridItemTypeEnum = (ProfileGridItemTypeEnum) ProfileGridItemTypeEnum.A01.get(A1P);
                    if (profileGridItemTypeEnum == null) {
                        profileGridItemTypeEnum = ProfileGridItemTypeEnum.A06;
                    }
                } else if (AbstractC37300Gc1.A1F(A0s)) {
                    c38321qM = C38321qM.A00(c16l);
                }
                c16l.A0z();
            }
            return new C38748H4o(profileGridItemTypeEnum, c38321qM, c37771pE);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
