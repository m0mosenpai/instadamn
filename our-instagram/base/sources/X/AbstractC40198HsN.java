package X;

import com.instagram.api.schemas.RIXUCoverPreviewType;
import java.io.IOException;

/* renamed from: X.HsN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40198HsN {
    public static C38688GzT parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C38688GzT c38688GzT = null;
            Integer num = null;
            Integer num2 = null;
            RIXUCoverPreviewType rIXUCoverPreviewType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("elements".equals(A0s)) {
                    c38688GzT = AbstractC40200HsP.parseFromJson(c16l);
                } else if ("preview_length_in_sec".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("preview_stagger_in_sec".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("preview_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    rIXUCoverPreviewType = (RIXUCoverPreviewType) RIXUCoverPreviewType.A01.get(A1P);
                    if (rIXUCoverPreviewType == null) {
                        rIXUCoverPreviewType = RIXUCoverPreviewType.A05;
                    }
                }
                c16l.A0z();
            }
            return new C38688GzT(2, c38688GzT, num2, rIXUCoverPreviewType, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
