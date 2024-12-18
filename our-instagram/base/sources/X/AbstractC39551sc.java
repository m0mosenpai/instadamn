package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1sc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39551sc {
    public static C39561sd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Double d = null;
            String str = null;
            String str2 = null;
            Double d2 = null;
            String str3 = null;
            Double d3 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("enable_user_engagement_base_insertion".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("max_xout_prediction_threshold".equals(A0q)) {
                    d = Double.valueOf(c16l.A0U());
                } else if ("post_gap_to_previous_ad".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("post_gap_to_previous_netego".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("predicted_xout_rate".equals(A0q)) {
                    d2 = Double.valueOf(c16l.A0U());
                } else if ("push_up_min_gap".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("time_based_insertion_gap_in_seconds".equals(A0q)) {
                    d3 = Double.valueOf(c16l.A0U());
                } else if ("user_engagement_based_insertion_settings".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38808H6y parseFromJson = AbstractC40435HwQ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new C39561sd(bool, d, d2, d3, str, str2, str3, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C39561sd c39561sd) {
        anonymousClass182.A0d();
        Boolean bool = c39561sd.A00;
        if (bool != null) {
            anonymousClass182.A0T("enable_user_engagement_base_insertion", bool.booleanValue());
        }
        Double d = c39561sd.A01;
        if (d != null) {
            anonymousClass182.A0O("max_xout_prediction_threshold", d.doubleValue());
        }
        String str = c39561sd.A04;
        if (str != null) {
            anonymousClass182.A0S("post_gap_to_previous_ad", str);
        }
        String str2 = c39561sd.A05;
        if (str2 != null) {
            anonymousClass182.A0S("post_gap_to_previous_netego", str2);
        }
        Double d2 = c39561sd.A02;
        if (d2 != null) {
            anonymousClass182.A0O("predicted_xout_rate", d2.doubleValue());
        }
        String str3 = c39561sd.A06;
        if (str3 != null) {
            anonymousClass182.A0S("push_up_min_gap", str3);
        }
        Double d3 = c39561sd.A03;
        if (d3 != null) {
            anonymousClass182.A0O("time_based_insertion_gap_in_seconds", d3.doubleValue());
        }
        List<C38808H6y> list = c39561sd.A07;
        if (list != null) {
            C16V.A03(anonymousClass182, "user_engagement_based_insertion_settings");
            for (C38808H6y c38808H6y : list) {
                if (c38808H6y != null) {
                    anonymousClass182.A0d();
                    List<C38809H6z> list2 = c38808H6y.A01;
                    if (list2 != null) {
                        C16V.A03(anonymousClass182, "eligible_engagement_signals");
                        for (C38809H6z c38809H6z : list2) {
                            if (c38809H6z != null) {
                                anonymousClass182.A0d();
                                String str4 = c38809H6z.A01;
                                if (str4 != null) {
                                    anonymousClass182.A0S("signal_item", str4);
                                }
                                String str5 = c38809H6z.A02;
                                if (str5 != null) {
                                    anonymousClass182.A0S("signal_type", str5);
                                }
                                Double d4 = c38809H6z.A00;
                                if (d4 != null) {
                                    anonymousClass182.A0O("time_based_insertion_gap_in_seconds", d4.doubleValue());
                                }
                                anonymousClass182.A0a();
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    String str6 = c38808H6y.A00;
                    if (str6 != null) {
                        anonymousClass182.A0S("min_post_gap_to_previous_item", str6);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
