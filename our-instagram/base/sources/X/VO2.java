package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.BoostedActionStatus;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VO2 {
    public static UQi parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            BoostedActionStatus boostedActionStatus = null;
            String str = null;
            Integer num = null;
            Integer num2 = null;
            String str2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            String str3 = null;
            Integer num6 = null;
            Integer num7 = null;
            String str4 = null;
            Integer num8 = null;
            Integer num9 = null;
            Integer num10 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("boosting_status".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    boostedActionStatus = (BoostedActionStatus) BoostedActionStatus.A01.get(A1P);
                    if (boostedActionStatus == null) {
                        boostedActionStatus = BoostedActionStatus.A0N;
                    }
                } else if ("budget".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("daily_spend_offset_amount".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("elapsed_duration_in_days".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("instagram_media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("number_of_ctd_threads".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("remaining_budget_offset_amount".equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if ("remaining_duration_in_days".equals(A0s)) {
                    num5 = AbstractC166997dE.A0h(c16l);
                } else if ("spent".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("spent_budget_offset_amount".equals(A0s)) {
                    num6 = AbstractC166997dE.A0h(c16l);
                } else if (TraceFieldType.StartTime.equals(A0s)) {
                    num7 = AbstractC166997dE.A0h(c16l);
                } else if ("thumbnail_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("time_remaining_in_hours".equals(A0s)) {
                    num8 = AbstractC166997dE.A0h(c16l);
                } else if ("total_budget_offset_amount".equals(A0s)) {
                    num9 = AbstractC166997dE.A0h(c16l);
                } else {
                    num10 = AbstractC31178DnM.A0V(c16l, num10, A0s, "total_duration_in_days");
                }
                c16l.A0z();
            }
            return new UQi(boostedActionStatus, num, num2, num3, num4, num5, num6, num7, num8, num9, num10, str, str2, str3, str4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
