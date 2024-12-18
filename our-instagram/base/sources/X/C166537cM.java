package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.7cM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166537cM {
    public static C168827gH parseFromJson(C16L c16l) {
        EnumC166147bi enumC166147bi;
        Integer num;
        String str;
        int i;
        C14360o3.A0B(c16l, 0);
        try {
            C168827gH c168827gH = new C168827gH();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str2 = null;
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                String str3 = null;
                String str4 = null;
                ArrayList arrayList3 = null;
                if ("comments".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38891rO parseFromJson = AbstractC38841rG.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c168827gH.A0D = arrayList;
                } else if ("preview_comments".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38891rO parseFromJson2 = AbstractC38841rG.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList2, 0);
                    c168827gH.A0E = arrayList2;
                } else if ("comment_count".equals(A0q)) {
                    c168827gH.A01 = c16l.A1D();
                } else if ("anonymous_comment_count".equals(A0q)) {
                    c168827gH.A00 = c16l.A1D();
                } else if ("show_comments_for_you_demarcator".equals(A0q)) {
                    c168827gH.A06 = Boolean.valueOf(c16l.A0d());
                } else if ("comments_disabled".equals(A0q)) {
                    c168827gH.A0G = c16l.A0d();
                } else if (MSV.A00(1220).equals(A0q)) {
                    c168827gH.A0H = c16l.A0d();
                } else if (MSV.A00(457).equals(A0q)) {
                    c168827gH.A0I = c16l.A0d();
                } else if ("scroll_behavior".equals(A0q)) {
                    int A1D = c16l.A1D();
                    for (Integer num2 : C05F.A00(3)) {
                        switch (num2.intValue()) {
                            case 1:
                                i = 1;
                                break;
                            case 2:
                                i = 2;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        if (i != A1D) {
                        }
                    }
                } else if ("media_header_display".equals(A0q)) {
                    String A1Q = c16l.A1Q();
                    Integer[] A00 = C05F.A00(2);
                    int length = A00.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            num = A00[i2];
                            if (1 - num.intValue() != 0) {
                                str = "full";
                            } else {
                                str = NetInfoModule.CONNECTION_TYPE_NONE;
                            }
                            if (!str.equals(A1Q)) {
                                i2++;
                            }
                        } else {
                            num = C05F.A01;
                        }
                    }
                    c168827gH.A07 = num;
                } else if ("sort_order".equals(A0q)) {
                    Integer A002 = AbstractC169187gr.A00(c16l.A1Q());
                    C14360o3.A0B(A002, 0);
                    c168827gH.A08 = A002;
                } else if ("comment_filter_param".equals(A0q)) {
                    String A1Q2 = c16l.A1Q();
                    C14360o3.A0B(A1Q2, 0);
                    EnumC166067ba enumC166067ba = (EnumC166067ba) EnumC166067ba.A01.get(A1Q2);
                    if (enumC166067ba == null) {
                        enumC166067ba = EnumC166067ba.A04;
                    }
                    c168827gH.A05 = enumC166067ba;
                } else {
                    if (!"insert_new_comment_to_top".equals(A0q)) {
                        if ("caption".equals(A0q)) {
                            c168827gH.A02 = AbstractC38841rG.parseFromJson(c16l);
                        } else if ("next_max_id".equals(A0q)) {
                            if (c16l.A11() != C16R.A0G) {
                                str3 = c16l.A1P();
                            }
                            C14360o3.A0B(str3, 0);
                            c168827gH.A0B = str3;
                        } else if (MSV.A00(235).equals(A0q)) {
                            if (c16l.A11() != C16R.A0G) {
                                str4 = c16l.A1P();
                            }
                            C14360o3.A0B(str4, 0);
                            c168827gH.A0C = str4;
                        } else if ("quick_response_emojis".equals(A0q)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList3 = new ArrayList();
                                while (c16l.A1J() != C16R.A08) {
                                    C206329Bp parseFromJson3 = AbstractC168837gI.parseFromJson(c16l);
                                    if (parseFromJson3 != null) {
                                        arrayList3.add(parseFromJson3);
                                    }
                                }
                            }
                            c168827gH.A0F = arrayList3;
                        } else if ("comment_cover_pos".equals(A0q)) {
                            String A1Q3 = c16l.A1Q();
                            EnumC166147bi[] values = EnumC166147bi.values();
                            int length2 = values.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length2) {
                                    enumC166147bi = values[i3];
                                    if (!C14360o3.A0K(enumC166147bi.A00, A1Q3)) {
                                        i3++;
                                    }
                                } else {
                                    enumC166147bi = EnumC166147bi.A04;
                                }
                            }
                            c168827gH.A04 = enumC166147bi;
                        } else if ("fb_comment_count".equals(A0q)) {
                            c16l.A1D();
                        } else if ("fb_graphqlid".equals(A0q)) {
                            if (c16l.A11() != C16R.A0G) {
                                str2 = c16l.A1P();
                            }
                            c168827gH.A0A = str2;
                        } else if (!"has_comment_spike".equals(A0q)) {
                            if ("liked_by_media_owner_badge_enabled".equals(A0q)) {
                                c168827gH.A0K = c16l.A0d();
                            } else if ("is_eligible_for_creator_nudges".equals(A0q)) {
                                c168827gH.A0J = c16l.A0d();
                            } else if ("comment_prompt_parent_comment".equals(A0q)) {
                                c168827gH.A03 = AbstractC38841rG.parseFromJson(c16l);
                            } else if ("th_reply_count".equals(A0q)) {
                                c168827gH.A09 = Integer.valueOf(c16l.A1D());
                            } else {
                                C55702hA.A01(c16l, c168827gH, A0q);
                            }
                        }
                    }
                    c16l.A0d();
                }
                c16l.A0z();
            }
            return c168827gH;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
