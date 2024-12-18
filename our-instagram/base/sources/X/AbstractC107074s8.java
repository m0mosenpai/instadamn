package X;

import com.instagram.api.schemas.MoreInfoFacepilePositionType;
import com.instagram.api.schemas.MoreInfoFacepileSizeType;
import java.io.IOException;

/* renamed from: X.4s8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC107074s8 {
    public static C107084sB parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            MoreInfoFacepilePositionType moreInfoFacepilePositionType = null;
            MoreInfoFacepileSizeType moreInfoFacepileSizeType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("position".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    moreInfoFacepilePositionType = (MoreInfoFacepilePositionType) MoreInfoFacepilePositionType.A01.get(A1P2);
                    if (moreInfoFacepilePositionType == null) {
                        moreInfoFacepilePositionType = MoreInfoFacepilePositionType.A06;
                    }
                } else if ("size".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    moreInfoFacepileSizeType = (MoreInfoFacepileSizeType) MoreInfoFacepileSizeType.A01.get(A1P);
                    if (moreInfoFacepileSizeType == null) {
                        moreInfoFacepileSizeType = MoreInfoFacepileSizeType.A06;
                    }
                }
                c16l.A0z();
            }
            return new C107084sB(moreInfoFacepilePositionType, moreInfoFacepileSizeType);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
