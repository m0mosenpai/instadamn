package X;

import com.instagram.api.schemas.AdvantageAudienceDataImpl;
import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;
import java.io.IOException;

/* renamed from: X.VNy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68364VNy {
    public static AdvantageAudienceDataImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("advantage_audience_status".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    xFBTargetingAutomationAdvantageAudienceStatus = (XFBTargetingAutomationAdvantageAudienceStatus) XFBTargetingAutomationAdvantageAudienceStatus.A01.get(A1P);
                    if (xFBTargetingAutomationAdvantageAudienceStatus == null) {
                        xFBTargetingAutomationAdvantageAudienceStatus = XFBTargetingAutomationAdvantageAudienceStatus.A06;
                    }
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "min_age_constraint");
                }
                c16l.A0z();
            }
            return new AdvantageAudienceDataImpl(xFBTargetingAutomationAdvantageAudienceStatus, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
