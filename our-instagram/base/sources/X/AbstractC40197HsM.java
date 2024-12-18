package X;

import com.instagram.api.schemas.RIXUCoverCTAPosition;
import com.instagram.api.schemas.RIXUCtaType;
import java.io.IOException;

/* renamed from: X.HsM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40197HsM {
    public static C51757Mtg parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            RIXUCtaType rIXUCtaType = null;
            RIXUCoverCTAPosition rIXUCoverCTAPosition = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("cta_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    rIXUCtaType = (RIXUCtaType) RIXUCtaType.A01.get(A1P2);
                    if (rIXUCtaType == null) {
                        rIXUCtaType = RIXUCtaType.A05;
                    }
                } else if ("position_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    rIXUCoverCTAPosition = (RIXUCoverCTAPosition) RIXUCoverCTAPosition.A01.get(A1P);
                    if (rIXUCoverCTAPosition == null) {
                        rIXUCoverCTAPosition = RIXUCoverCTAPosition.A05;
                    }
                } else if (AbstractC37300Gc1.A1D(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C51757Mtg(rIXUCoverCTAPosition, rIXUCtaType, str, 4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
