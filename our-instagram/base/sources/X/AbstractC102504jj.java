package X;

import com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.ParcelableSignalData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4jj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102504jj {
    public static ParcelableSignalData parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ParcelableSignalData parcelableSignalData = new ParcelableSignalData();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    String str5 = null;
                    String str6 = null;
                    String str7 = null;
                    String str8 = null;
                    String str9 = null;
                    String str10 = null;
                    String str11 = null;
                    String str12 = null;
                    ArrayList arrayList = null;
                    String str13 = null;
                    String str14 = null;
                    String str15 = null;
                    String str16 = null;
                    String str17 = null;
                    String str18 = null;
                    String str19 = null;
                    HashMap hashMap = null;
                    String str20 = null;
                    String str21 = null;
                    String str22 = null;
                    String str23 = null;
                    if ("signal_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        parcelableSignalData.A0a = str2;
                    } else {
                        if ("signal_type".equals(A0q)) {
                            if (c16l.A11() != C16R.A0G) {
                                str3 = c16l.A1P();
                            }
                            for (AnonymousClass317 anonymousClass317 : AnonymousClass317.values()) {
                                if (C14360o3.A0K(str3, anonymousClass317.A01)) {
                                    parcelableSignalData.A03 = anonymousClass317;
                                }
                            }
                            throw new IllegalArgumentException("Unrecognized value");
                        }
                        if ("signal_status".equals(A0q)) {
                            if (c16l.A11() != C16R.A0G) {
                                str4 = c16l.A1P();
                            }
                            parcelableSignalData.A02 = AbstractC72646Xjc.A00(str4);
                        } else {
                            if ("surface_type".equals(A0q)) {
                                if (c16l.A11() != C16R.A0G) {
                                    str5 = c16l.A1P();
                                }
                                for (EnumC64222vh enumC64222vh : EnumC64222vh.values()) {
                                    if (C14360o3.A0K(str5, enumC64222vh.A00)) {
                                        parcelableSignalData.A04 = enumC64222vh;
                                    }
                                }
                                throw new IllegalArgumentException("Unrecognized value");
                            }
                            if ("item_id".equals(A0q)) {
                                if (c16l.A11() != C16R.A0G) {
                                    str6 = c16l.A1P();
                                }
                                parcelableSignalData.A0V = str6;
                            } else {
                                if ("item_type".equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str7 = c16l.A1P();
                                    }
                                    for (EnumC64262vl enumC64262vl : EnumC64262vl.values()) {
                                        if (C14360o3.A0K(str7, enumC64262vl.A00)) {
                                            parcelableSignalData.A01 = enumC64262vl;
                                        }
                                    }
                                    throw new IllegalArgumentException("Unrecognized value");
                                }
                                if (AbstractC65709Tsi.A02(42, 10, 99).equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str8 = c16l.A1P();
                                    }
                                    parcelableSignalData.A0Z = str8;
                                } else if ("media_id".equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str9 = c16l.A1P();
                                    }
                                    parcelableSignalData.A0W = str9;
                                } else if ("media_timespent".equals(A0q)) {
                                    parcelableSignalData.A0K = Long.valueOf(c16l.A0y());
                                } else if ("media_last_seen_timestamp".equals(A0q)) {
                                    parcelableSignalData.A0J = Long.valueOf(c16l.A0y());
                                } else if ("media_percent_visible".equals(A0q)) {
                                    parcelableSignalData.A07 = new Float(c16l.A0U());
                                } else if ("container_module".equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str10 = c16l.A1P();
                                    }
                                    parcelableSignalData.A0T = str10;
                                } else if ("inventory_source".equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str11 = c16l.A1P();
                                    }
                                    parcelableSignalData.A0U = str11;
                                } else if ("author_id".equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str12 = c16l.A1P();
                                    }
                                    parcelableSignalData.A0R = str12;
                                } else if ("media_ids".equals(A0q)) {
                                    if (c16l.A11() == C16R.A0C) {
                                        arrayList = new ArrayList();
                                        while (c16l.A1J() != C16R.A08) {
                                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                                arrayList.add(A1P);
                                            }
                                        }
                                    }
                                    parcelableSignalData.A0f = arrayList;
                                } else if ("click_timestamp".equals(A0q)) {
                                    parcelableSignalData.A0H = Long.valueOf(c16l.A0y());
                                } else if ("click_media_id".equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str13 = c16l.A1P();
                                    }
                                    parcelableSignalData.A0S = str13;
                                } else if ("xout_timestamp".equals(A0q)) {
                                    parcelableSignalData.A0M = Long.valueOf(c16l.A0y());
                                } else if ("xout_media_id".equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str14 = c16l.A1P();
                                    }
                                    parcelableSignalData.A0e = str14;
                                } else if ("reason".equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str15 = c16l.A1P();
                                    }
                                    parcelableSignalData.A0Y = str15;
                                } else if ("meta_id".equals(A0q)) {
                                    parcelableSignalData.A00 = AbstractC102514jk.parseFromJson(c16l);
                                } else if ("signal_timestamp".equals(A0q)) {
                                    parcelableSignalData.A0L = Long.valueOf(c16l.A0y());
                                } else if ("signal_mediaId".equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str16 = c16l.A1P();
                                    }
                                    parcelableSignalData.A0b = str16;
                                } else if ("account_type".equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str17 = c16l.A1P();
                                    }
                                    parcelableSignalData.A0N = str17;
                                } else if ("multi_ads_type".equals(A0q)) {
                                    parcelableSignalData.A0E = Integer.valueOf(c16l.A1D());
                                } else if ("gap_to_last_ad".equals(A0q)) {
                                    parcelableSignalData.A0B = Integer.valueOf(c16l.A1D());
                                } else if ("gap_to_last_netego".equals(A0q)) {
                                    parcelableSignalData.A0C = Integer.valueOf(c16l.A1D());
                                } else if ("client_insertion_position".equals(A0q)) {
                                    parcelableSignalData.A0A = Integer.valueOf(c16l.A1D());
                                } else if ("reel_gap_to_last_ad".equals(A0q)) {
                                    parcelableSignalData.A0G = Integer.valueOf(c16l.A1D());
                                } else if ("ad_consumed_media_gap".equals(A0q)) {
                                    parcelableSignalData.A08 = Integer.valueOf(c16l.A1D());
                                } else if ("num_media_consumed_in_ad".equals(A0q)) {
                                    parcelableSignalData.A0F = Integer.valueOf(c16l.A1D());
                                } else if ("tracking_token".equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str18 = c16l.A1P();
                                    }
                                    parcelableSignalData.A0c = str18;
                                } else if ("imp_signature".equals(A0q)) {
                                    parcelableSignalData.A0D = Integer.valueOf(c16l.A1D());
                                } else if ("afi_id".equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str19 = c16l.A1P();
                                    }
                                    parcelableSignalData.A0O = str19;
                                } else if ("extra_data".equals(A0q)) {
                                    if (c16l.A11() == c16r) {
                                        HashMap hashMap2 = new HashMap();
                                        while (c16l.A1J() != c16r2) {
                                            String A1P2 = c16l.A1P();
                                            c16l.A1J();
                                            if (c16l.A11() == C16R.A0G) {
                                                hashMap2.put(A1P2, null);
                                            } else {
                                                String A1P3 = c16l.A1P();
                                                if (A1P3 != null) {
                                                    hashMap2.put(A1P2, A1P3);
                                                }
                                            }
                                        }
                                        hashMap = hashMap2;
                                    }
                                    parcelableSignalData.A0g = hashMap;
                                } else if ("afi_type".equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str20 = c16l.A1P();
                                    }
                                    parcelableSignalData.A0P = str20;
                                } else if ("global_position".equals(A0q)) {
                                    parcelableSignalData.A0I = Long.valueOf(c16l.A0y());
                                } else if ("question_id".equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str21 = c16l.A1P();
                                    }
                                    parcelableSignalData.A0X = str21;
                                } else if ("trigger_source_enum".equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str22 = c16l.A1P();
                                    }
                                    parcelableSignalData.A0d = str22;
                                } else if ("answer_id".equals(A0q)) {
                                    if (c16l.A11() != C16R.A0G) {
                                        str23 = c16l.A1P();
                                    }
                                    parcelableSignalData.A0Q = str23;
                                } else {
                                    if ("afi_event_type".equals(A0q)) {
                                        if (c16l.A11() != C16R.A0G) {
                                            str = c16l.A1P();
                                        }
                                        for (Integer num : C05F.A00(2)) {
                                            if (C14360o3.A0K(str, A2P.A00(num))) {
                                                parcelableSignalData.A09 = num;
                                            }
                                        }
                                        throw new IllegalArgumentException("Unrecognized value");
                                    }
                                    if ("no_bounce_client_logging".equals(A0q)) {
                                        parcelableSignalData.A06 = Boolean.valueOf(c16l.A0d());
                                    } else if ("is_ad_click".equals(A0q)) {
                                        parcelableSignalData.A05 = Boolean.valueOf(c16l.A0d());
                                    }
                                }
                            }
                        }
                    }
                    c16l.A0z();
                } else {
                    return parcelableSignalData;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ParcelableSignalData parcelableSignalData) {
        anonymousClass182.A0d();
        String str = parcelableSignalData.A0a;
        if (str != null) {
            anonymousClass182.A0S("signal_id", str);
        }
        AnonymousClass317 anonymousClass317 = parcelableSignalData.A03;
        if (anonymousClass317 != null) {
            anonymousClass182.A0S("signal_type", anonymousClass317.A01);
        }
        EnumC74603Ws enumC74603Ws = parcelableSignalData.A02;
        if (enumC74603Ws != null) {
            anonymousClass182.A0S("signal_status", enumC74603Ws.A00);
        }
        EnumC64222vh enumC64222vh = parcelableSignalData.A04;
        if (enumC64222vh != null) {
            anonymousClass182.A0S("surface_type", enumC64222vh.A00);
        }
        String str2 = parcelableSignalData.A0V;
        if (str2 != null) {
            anonymousClass182.A0S("item_id", str2);
        }
        EnumC64262vl enumC64262vl = parcelableSignalData.A01;
        if (enumC64262vl != null) {
            anonymousClass182.A0S("item_type", enumC64262vl.A00);
        }
        String str3 = parcelableSignalData.A0Z;
        if (str3 != null) {
            anonymousClass182.A0S(AbstractC65709Tsi.A02(42, 10, 99), str3);
        }
        String str4 = parcelableSignalData.A0W;
        if (str4 != null) {
            anonymousClass182.A0S("media_id", str4);
        }
        Long l = parcelableSignalData.A0K;
        if (l != null) {
            anonymousClass182.A0R("media_timespent", l.longValue());
        }
        Long l2 = parcelableSignalData.A0J;
        if (l2 != null) {
            anonymousClass182.A0R("media_last_seen_timestamp", l2.longValue());
        }
        Float f = parcelableSignalData.A07;
        if (f != null) {
            anonymousClass182.A0P("media_percent_visible", f.floatValue());
        }
        String str5 = parcelableSignalData.A0T;
        if (str5 != null) {
            anonymousClass182.A0S("container_module", str5);
        }
        String str6 = parcelableSignalData.A0U;
        if (str6 != null) {
            anonymousClass182.A0S("inventory_source", str6);
        }
        String str7 = parcelableSignalData.A0R;
        if (str7 != null) {
            anonymousClass182.A0S("author_id", str7);
        }
        if (parcelableSignalData.A0f != null) {
            C16V.A03(anonymousClass182, "media_ids");
            for (String str8 : parcelableSignalData.A0f) {
                if (str8 != null) {
                    anonymousClass182.A0u(str8);
                }
            }
            anonymousClass182.A0Z();
        }
        Long l3 = parcelableSignalData.A0H;
        if (l3 != null) {
            anonymousClass182.A0R("click_timestamp", l3.longValue());
        }
        String str9 = parcelableSignalData.A0S;
        if (str9 != null) {
            anonymousClass182.A0S("click_media_id", str9);
        }
        Long l4 = parcelableSignalData.A0M;
        if (l4 != null) {
            anonymousClass182.A0R("xout_timestamp", l4.longValue());
        }
        String str10 = parcelableSignalData.A0e;
        if (str10 != null) {
            anonymousClass182.A0S("xout_media_id", str10);
        }
        String str11 = parcelableSignalData.A0Y;
        if (str11 != null) {
            anonymousClass182.A0S("reason", str11);
        }
        if (parcelableSignalData.A00 != null) {
            anonymousClass182.A0r("meta_id");
            C9CQ c9cq = parcelableSignalData.A00;
            anonymousClass182.A0d();
            String str12 = c9cq.A01;
            if (str12 != null) {
                anonymousClass182.A0S("ad_id", str12);
            }
            String str13 = c9cq.A03;
            if (str13 != null) {
                anonymousClass182.A0S("campaign_id", str13);
            }
            String str14 = c9cq.A02;
            if (str14 != null) {
                anonymousClass182.A0S("app_id", str14);
            }
            String str15 = c9cq.A05;
            if (str15 != null) {
                anonymousClass182.A0S("page_id", str15);
            }
            String str16 = c9cq.A00;
            if (str16 != null) {
                anonymousClass182.A0S("actor_id", str16);
            }
            String str17 = c9cq.A04;
            if (str17 != null) {
                anonymousClass182.A0S("media_id", str17);
            }
            anonymousClass182.A0a();
        }
        Long l5 = parcelableSignalData.A0L;
        if (l5 != null) {
            anonymousClass182.A0R("signal_timestamp", l5.longValue());
        }
        String str18 = parcelableSignalData.A0b;
        if (str18 != null) {
            anonymousClass182.A0S("signal_mediaId", str18);
        }
        String str19 = parcelableSignalData.A0N;
        if (str19 != null) {
            anonymousClass182.A0S("account_type", str19);
        }
        Integer num = parcelableSignalData.A0E;
        if (num != null) {
            anonymousClass182.A0Q("multi_ads_type", num.intValue());
        }
        Integer num2 = parcelableSignalData.A0B;
        if (num2 != null) {
            anonymousClass182.A0Q("gap_to_last_ad", num2.intValue());
        }
        Integer num3 = parcelableSignalData.A0C;
        if (num3 != null) {
            anonymousClass182.A0Q("gap_to_last_netego", num3.intValue());
        }
        Integer num4 = parcelableSignalData.A0A;
        if (num4 != null) {
            anonymousClass182.A0Q("client_insertion_position", num4.intValue());
        }
        Integer num5 = parcelableSignalData.A0G;
        if (num5 != null) {
            anonymousClass182.A0Q("reel_gap_to_last_ad", num5.intValue());
        }
        Integer num6 = parcelableSignalData.A08;
        if (num6 != null) {
            anonymousClass182.A0Q("ad_consumed_media_gap", num6.intValue());
        }
        Integer num7 = parcelableSignalData.A0F;
        if (num7 != null) {
            anonymousClass182.A0Q("num_media_consumed_in_ad", num7.intValue());
        }
        String str20 = parcelableSignalData.A0c;
        if (str20 != null) {
            anonymousClass182.A0S("tracking_token", str20);
        }
        Integer num8 = parcelableSignalData.A0D;
        if (num8 != null) {
            anonymousClass182.A0Q("imp_signature", num8.intValue());
        }
        String str21 = parcelableSignalData.A0O;
        if (str21 != null) {
            anonymousClass182.A0S("afi_id", str21);
        }
        if (parcelableSignalData.A0g != null) {
            anonymousClass182.A0r("extra_data");
            anonymousClass182.A0d();
            for (Map.Entry entry : parcelableSignalData.A0g.entrySet()) {
                if (!C16V.A04(anonymousClass182, entry)) {
                    anonymousClass182.A0u((String) entry.getValue());
                }
            }
            anonymousClass182.A0a();
        }
        String str22 = parcelableSignalData.A0P;
        if (str22 != null) {
            anonymousClass182.A0S("afi_type", str22);
        }
        Long l6 = parcelableSignalData.A0I;
        if (l6 != null) {
            anonymousClass182.A0R("global_position", l6.longValue());
        }
        String str23 = parcelableSignalData.A0X;
        if (str23 != null) {
            anonymousClass182.A0S("question_id", str23);
        }
        String str24 = parcelableSignalData.A0d;
        if (str24 != null) {
            anonymousClass182.A0S("trigger_source_enum", str24);
        }
        String str25 = parcelableSignalData.A0Q;
        if (str25 != null) {
            anonymousClass182.A0S("answer_id", str25);
        }
        Integer num9 = parcelableSignalData.A09;
        if (num9 != null) {
            anonymousClass182.A0S("afi_event_type", A2P.A00(num9));
        }
        Boolean bool = parcelableSignalData.A06;
        if (bool != null) {
            anonymousClass182.A0T("no_bounce_client_logging", bool.booleanValue());
        }
        Boolean bool2 = parcelableSignalData.A05;
        if (bool2 != null) {
            anonymousClass182.A0T("is_ad_click", bool2.booleanValue());
        }
        anonymousClass182.A0a();
    }
}
