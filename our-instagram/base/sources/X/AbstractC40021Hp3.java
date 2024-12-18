package X;

import com.instagram.api.schemas.IGRFSurveyContextDictImpl;
import com.instagram.api.schemas.IGRFSurveyInfoDictImpl;
import java.io.IOException;

/* renamed from: X.Hp3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40021Hp3 {
    public static IGRFSurveyInfoDictImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            IGRFSurveyContextDictImpl iGRFSurveyContextDictImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("feed_context".equals(AbstractC166997dE.A0s(c16l))) {
                    iGRFSurveyContextDictImpl = AbstractC40020Hp1.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new IGRFSurveyInfoDictImpl(iGRFSurveyContextDictImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
