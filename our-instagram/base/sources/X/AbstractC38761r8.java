package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1r8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38761r8 {
    public static C38011pl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            ArrayList arrayList = null;
            Integer num4 = null;
            Integer num5 = null;
            Boolean bool = null;
            Integer num6 = null;
            Integer num7 = null;
            Integer num8 = null;
            Integer num9 = null;
            Integer num10 = null;
            C39561sd c39561sd = null;
            Integer num11 = null;
            Integer num12 = null;
            Integer num13 = null;
            Integer num14 = null;
            Float f = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("carry_over_highest_position_rule".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("consumed_media_gap_to_previous_ad".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("consumed_media_gap_to_previous_netego".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("dnf".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            H83 parseFromJson = I9R.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("highest_ad_position_rule_value".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("highest_position_rule".equals(A0q)) {
                    num5 = Integer.valueOf(c16l.A1D());
                } else if ("is_media_based_hp_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("max_reel_gap_to_previous_item".equals(A0q)) {
                    num6 = Integer.valueOf(c16l.A1D());
                } else if ("min_container_gap_to_previous_ad".equals(A0q)) {
                    num7 = Integer.valueOf(c16l.A1D());
                } else if ("min_container_gap_to_previous_overlay_ad".equals(A0q)) {
                    num8 = Integer.valueOf(c16l.A1D());
                } else if ("min_media_gap_to_previous_item".equals(A0q)) {
                    num9 = Integer.valueOf(c16l.A1D());
                } else if ("pool_refresh_ttl_in_sec".equals(A0q)) {
                    num10 = Integer.valueOf(c16l.A1D());
                } else if ("push_up_client_gap_rules".equals(A0q)) {
                    c39561sd = AbstractC39551sc.parseFromJson(c16l);
                } else if ("reel_gap_to_previous_ad".equals(A0q)) {
                    num11 = Integer.valueOf(c16l.A1D());
                } else if ("reel_gap_to_previous_netego".equals(A0q)) {
                    num12 = Integer.valueOf(c16l.A1D());
                } else if ("self_pog_chaining_highest_position_rule".equals(A0q)) {
                    num13 = Integer.valueOf(c16l.A1D());
                } else if ("target_insertion_position".equals(A0q)) {
                    num14 = Integer.valueOf(c16l.A1D());
                } else if ("time_gap_to_previous_item_in_sec".equals(A0q)) {
                    f = new Float(c16l.A0U());
                }
                c16l.A0z();
            }
            return new C38011pl(c39561sd, bool, f, num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38011pl c38011pl) {
        anonymousClass182.A0d();
        Integer num = c38011pl.A03;
        if (num != null) {
            anonymousClass182.A0Q("carry_over_highest_position_rule", num.intValue());
        }
        Integer num2 = c38011pl.A04;
        if (num2 != null) {
            anonymousClass182.A0Q("consumed_media_gap_to_previous_ad", num2.intValue());
        }
        Integer num3 = c38011pl.A05;
        if (num3 != null) {
            anonymousClass182.A0Q("consumed_media_gap_to_previous_netego", num3.intValue());
        }
        List<H83> list = c38011pl.A0H;
        if (list != null) {
            C16V.A03(anonymousClass182, "dnf");
            for (H83 h83 : list) {
                if (h83 != null) {
                    anonymousClass182.A0d();
                    List<H84> list2 = h83.A00;
                    if (list2 != null) {
                        C16V.A03(anonymousClass182, "exp");
                        for (H84 h84 : list2) {
                            if (h84 != null) {
                                anonymousClass182.A0d();
                                Integer num4 = h84.A01;
                                if (num4 != null) {
                                    anonymousClass182.A0Q("op", num4.intValue());
                                }
                                Integer num5 = h84.A02;
                                if (num5 != null) {
                                    anonymousClass182.A0Q("p", num5.intValue());
                                }
                                Float f = h84.A00;
                                if (f != null) {
                                    anonymousClass182.A0P("v", f.floatValue());
                                }
                                anonymousClass182.A0a();
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        Integer num6 = c38011pl.A06;
        if (num6 != null) {
            anonymousClass182.A0Q("highest_ad_position_rule_value", num6.intValue());
        }
        Integer num7 = c38011pl.A07;
        if (num7 != null) {
            anonymousClass182.A0Q("highest_position_rule", num7.intValue());
        }
        Boolean bool = c38011pl.A01;
        if (bool != null) {
            anonymousClass182.A0T("is_media_based_hp_enabled", bool.booleanValue());
        }
        Integer num8 = c38011pl.A08;
        if (num8 != null) {
            anonymousClass182.A0Q("max_reel_gap_to_previous_item", num8.intValue());
        }
        Integer num9 = c38011pl.A09;
        if (num9 != null) {
            anonymousClass182.A0Q("min_container_gap_to_previous_ad", num9.intValue());
        }
        Integer num10 = c38011pl.A0A;
        if (num10 != null) {
            anonymousClass182.A0Q("min_container_gap_to_previous_overlay_ad", num10.intValue());
        }
        Integer num11 = c38011pl.A0B;
        if (num11 != null) {
            anonymousClass182.A0Q("min_media_gap_to_previous_item", num11.intValue());
        }
        Integer num12 = c38011pl.A0C;
        if (num12 != null) {
            anonymousClass182.A0Q("pool_refresh_ttl_in_sec", num12.intValue());
        }
        InterfaceC39571se interfaceC39571se = c38011pl.A00;
        if (interfaceC39571se != null) {
            anonymousClass182.A0r("push_up_client_gap_rules");
            AbstractC39551sc.A00(anonymousClass182, interfaceC39571se.Eyq());
        }
        Integer num13 = c38011pl.A0D;
        if (num13 != null) {
            anonymousClass182.A0Q("reel_gap_to_previous_ad", num13.intValue());
        }
        Integer num14 = c38011pl.A0E;
        if (num14 != null) {
            anonymousClass182.A0Q("reel_gap_to_previous_netego", num14.intValue());
        }
        Integer num15 = c38011pl.A0F;
        if (num15 != null) {
            anonymousClass182.A0Q("self_pog_chaining_highest_position_rule", num15.intValue());
        }
        Integer num16 = c38011pl.A0G;
        if (num16 != null) {
            anonymousClass182.A0Q("target_insertion_position", num16.intValue());
        }
        Float f2 = c38011pl.A02;
        if (f2 != null) {
            anonymousClass182.A0P("time_gap_to_previous_item_in_sec", f2.floatValue());
        }
        anonymousClass182.A0a();
    }
}
