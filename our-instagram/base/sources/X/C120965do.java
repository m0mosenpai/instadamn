package X;

import com.instagram.newsfeed.model.PillsFilterCategory;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5do, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120965do {
    public static C122995ha parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C122995ha c122995ha = new C122995ha();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("is_first_page".equals(A0q)) {
                    c16l.A0d();
                } else if ("is_last_page".equals(A0q)) {
                    c122995ha.A0Q = c16l.A0d();
                } else {
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    ArrayList arrayList = null;
                    ArrayList arrayList2 = null;
                    ArrayList arrayList3 = null;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    String str5 = null;
                    if ("continuation_token".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("auto_load_more_enabled".equals(A0q)) {
                        c122995ha.A0P = c16l.A0d();
                    } else if ("next_max_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c122995ha.A0G = str2;
                    } else if ("last_updated".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("last_checked".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        c122995ha.A0F = str3;
                    } else if ("pagination_first_record_timestamp".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        c122995ha.A0E = str4;
                    } else if ("counts".equals(A0q)) {
                        c122995ha.A0B = AbstractC123015hc.parseFromJson(c16l);
                    } else if ("copyright_stories".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C5HW parseFromJson = C5HV.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c122995ha.A0I = arrayList;
                    } else if ("friend_request_stories".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C5HW parseFromJson2 = C5HV.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList2.add(parseFromJson2);
                                }
                            }
                        }
                        c122995ha.A0K = arrayList2;
                    } else if ("priority_stories".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList3 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C5HW parseFromJson3 = C5HV.parseFromJson(c16l);
                                if (parseFromJson3 != null) {
                                    arrayList3.add(parseFromJson3);
                                }
                            }
                        }
                        c122995ha.A0O = arrayList3;
                    } else if ("new_stories".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList4 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C5HW parseFromJson4 = C5HV.parseFromJson(c16l);
                                if (parseFromJson4 != null) {
                                    arrayList4.add(parseFromJson4);
                                }
                            }
                        }
                        c122995ha.A0L = arrayList4;
                    } else if ("old_stories".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList5 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C5HW parseFromJson5 = C5HV.parseFromJson(c16l);
                                if (parseFromJson5 != null) {
                                    arrayList5.add(parseFromJson5);
                                }
                            }
                        }
                        c122995ha.A0M = arrayList5;
                    } else if ("suggested_users".equals(A0q)) {
                        c122995ha.A07 = I0Z.parseFromJson(c16l);
                    } else if ("aymf".equals(A0q)) {
                        c122995ha.A0A = AbstractC31358DqN.parseFromJson(c16l);
                    } else if ("ads_manager".equals(A0q)) {
                        c122995ha.A08 = AbstractC65800TuI.parseFromJson(c16l);
                    } else if ("branded_content".equals(A0q)) {
                        c122995ha.A09 = AbstractC37496GfE.parseFromJson(c16l);
                    } else if ("business_conversion_reminder".equals(A0q)) {
                        c122995ha.A04 = AbstractC47074KrV.parseFromJson(c16l);
                    } else if ("story_mentions".equals(A0q)) {
                        c122995ha.A05 = AbstractC50588MUy.parseFromJson(c16l);
                    } else if ("partition".equals(A0q)) {
                        c122995ha.A0C = AbstractC123105hl.parseFromJson(c16l);
                    } else if ("filters".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList6 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C51757Mtg parseFromJson6 = AbstractC31352DqH.parseFromJson(c16l);
                                if (parseFromJson6 != null) {
                                    arrayList6.add(parseFromJson6);
                                }
                            }
                        }
                        c122995ha.A0J = arrayList6;
                    } else if ("pills".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList7 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                PillsFilterCategory parseFromJson7 = AbstractC37490Gf8.parseFromJson(c16l);
                                if (parseFromJson7 != null) {
                                    arrayList7.add(parseFromJson7);
                                }
                            }
                        }
                        c122995ha.A0N = arrayList7;
                    } else if ("text_post_app_aysf".equals(A0q)) {
                        c122995ha.A06 = AbstractC40405Hvs.parseFromJson(c16l);
                    } else if ("strong_starts_index".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str5 = c16l.A1P();
                        }
                        c122995ha.A0H = str5;
                    } else if ("banner".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c122995ha.A0D = str;
                    } else if ("badging_info".equals(A0q)) {
                        c122995ha.A01 = AbstractC123075hi.parseFromJson(c16l);
                    } else if ("unaggregated_badging_info".equals(A0q)) {
                        c122995ha.A02 = AbstractC123075hi.parseFromJson(c16l);
                    } else if ("truncation_config".equals(A0q)) {
                        c122995ha.A03 = AbstractC123005hb.parseFromJson(c16l);
                    } else if ("ui_config".equals(A0q)) {
                        c122995ha.A00 = AbstractC123095hk.parseFromJson(c16l);
                    } else {
                        C55702hA.A01(c16l, c122995ha, A0q);
                    }
                }
                c16l.A0z();
            }
            C122995ha.A00(c122995ha.A0I, "copyright_stories");
            C122995ha.A00(c122995ha.A0K, "friend_request_stories");
            C122995ha.A00(c122995ha.A0O, "priority_stories");
            C122995ha.A00(c122995ha.A0L, "new_stories");
            C122995ha.A00(c122995ha.A0M, "old_stories");
            return c122995ha;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
