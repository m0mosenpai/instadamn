package X;

import com.instagram.api.schemas.ContentAppreciationFeatureStatus;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class INu {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.H8U, X.1um, X.1ul] */
    public static H8U parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("content_appreciation_status".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    ContentAppreciationFeatureStatus contentAppreciationFeatureStatus = (ContentAppreciationFeatureStatus) ContentAppreciationFeatureStatus.A01.get(A1P);
                    if (contentAppreciationFeatureStatus == null) {
                        contentAppreciationFeatureStatus = ContentAppreciationFeatureStatus.A06;
                    }
                    c40791um.A00 = contentAppreciationFeatureStatus;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            ContentAppreciationFeatureStatus contentAppreciationFeatureStatus2 = c40791um.A00;
            C14360o3.A0A(contentAppreciationFeatureStatus2);
            c40791um.A01 = new C45137Jyd(contentAppreciationFeatureStatus2);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
