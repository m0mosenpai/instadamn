package X;

import com.instagram.api.schemas.IGStoryTextAlignmentTypeEnum;
import java.io.IOException;

/* renamed from: X.4sN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC107174sN {
    public static C107184sP parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IGStoryTextAlignmentTypeEnum iGStoryTextAlignmentTypeEnum = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("text_alignment".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGStoryTextAlignmentTypeEnum = (IGStoryTextAlignmentTypeEnum) IGStoryTextAlignmentTypeEnum.A01.get(A1P);
                    if (iGStoryTextAlignmentTypeEnum == null) {
                        iGStoryTextAlignmentTypeEnum = IGStoryTextAlignmentTypeEnum.A06;
                    }
                }
                c16l.A0z();
            }
            return new C107184sP(iGStoryTextAlignmentTypeEnum);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
