package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VXL {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.Viw, java.lang.Object] */
    public static C69167Viw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (!"donations_count".equals(A0s) && !"donations_count_current_session_only".equals(A0s)) {
                    if ("formatted_amount_raised".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("formatted_donations_count".equals(A0s)) {
                        obj.A01 = AbstractC167017dG.A0m(c16l);
                    } else if ("formatted_amount_raised_current_session_only".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("formatted_donations_count_current_session_only".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("formatted_goal_amount".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else {
                        if (!"live_fundraiser_id".equals(A0s)) {
                            if ("formatted_amount_raised_of_goal_amount_str".equals(A0s)) {
                                obj.A00 = AbstractC167017dG.A0m(c16l);
                            } else if ("formatted_amount_raised_during_live_str".equals(A0s)) {
                                if (c16l.A11() == C16R.A0G) {
                                }
                                c16l.A1P();
                            } else if ("fundraiser_title".equals(A0s)) {
                                obj.A02 = AbstractC167017dG.A0m(c16l);
                            } else if (!"standalone_fundraiser_id".equals(A0s)) {
                            }
                        }
                        c16l.A0y();
                    }
                } else {
                    c16l.A1D();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
