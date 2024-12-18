package X;

import com.instagram.api.schemas.RIXUCoverElementMetadataType;
import java.io.IOException;

/* renamed from: X.HsO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40199HsO {
    public static C51756Mtf parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            RIXUCoverElementMetadataType rIXUCoverElementMetadataType = null;
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC58317Pt9.A00(864).equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    rIXUCoverElementMetadataType = (RIXUCoverElementMetadataType) RIXUCoverElementMetadataType.A01.get(A1P);
                    if (rIXUCoverElementMetadataType == null) {
                        rIXUCoverElementMetadataType = RIXUCoverElementMetadataType.A0D;
                    }
                }
                c16l.A0z();
            }
            return new C51756Mtf(rIXUCoverElementMetadataType, 21);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
