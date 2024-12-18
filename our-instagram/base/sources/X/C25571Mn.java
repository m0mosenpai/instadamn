package X;

import com.instagram.api.schemas.IGUserHighlightsTrayType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Mn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25571Mn {
    public static C3LZ parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            C3LZ c3lz = new C3LZ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                ArrayList arrayList2 = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                String str4 = null;
                if ("broadcasts".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C37941pb parseFromJson = AbstractC108524ud.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    }
                    c3lz.A0J = arrayList2;
                } else if ("btp_timestamps".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c3lz.A0G = str;
                } else if ("client_hints".equals(A0q)) {
                    c3lz.A01 = AbstractC74353Vr.parseFromJson(c16l);
                } else if ("cursor".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c3lz.A0H = str2;
                } else if ("has_new_nux_story".equals(A0q)) {
                    c3lz.A07 = Boolean.valueOf(c16l.A0d());
                } else if ("highlights_tray_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    c3lz.A02 = AbstractC81803kw.A00(str3);
                } else if ("is_streaming_last_chunk".equals(A0q)) {
                    c3lz.A08 = Boolean.valueOf(c16l.A0d());
                } else if ("lookahead_count_tray".equals(A0q)) {
                    c3lz.A0B = Integer.valueOf(c16l.A1D());
                } else if ("lookahead_count_viewer".equals(A0q)) {
                    c3lz.A0C = Integer.valueOf(c16l.A1D());
                } else if ("my_week_enabled".equals(A0q)) {
                    c3lz.A09 = Boolean.valueOf(c16l.A0d());
                } else if ("next_page_size".equals(A0q)) {
                    c3lz.A0D = Integer.valueOf(c16l.A1D());
                } else if ("personalization_features".equals(A0q)) {
                    c3lz.A04 = C3NH.parseFromJson(c16l);
                } else if ("refresh_window_ms".equals(A0q)) {
                    c3lz.A0E = Integer.valueOf(c16l.A1D());
                } else if ("remaining_reel_ids_to_fetch".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                arrayList3.add(A1P2);
                            }
                        }
                    }
                    c3lz.A0K = arrayList3;
                } else if ("reusable_reel_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList4.add(A1P);
                            }
                        }
                    }
                    c3lz.A0L = arrayList4;
                } else if ("self_pog_extra_data".equals(A0q)) {
                    c3lz.A05 = AbstractC38741r6.parseFromJson(c16l);
                } else if ("share_to_friends_story_pending_media".equals(A0q)) {
                    c3lz.A03 = Hr7.parseFromJson(c16l);
                } else if ("stories_viewer_gestures_nux_eligible".equals(A0q)) {
                    c3lz.A0A = Boolean.valueOf(c16l.A0d());
                } else if ("story_ranking_token".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str4 = c16l.A1P();
                    }
                    c3lz.A0I = str4;
                } else if ("tray".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C37771pE parseFromJson2 = AbstractC38741r6.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c3lz.A0M = arrayList;
                } else {
                    C55702hA.A01(c16l, c3lz, A0q);
                }
                c16l.A0z();
            }
            List list = c3lz.A0J;
            String str5 = c3lz.A0G;
            C74433Vz c74433Vz = c3lz.A01;
            String str6 = c3lz.A0H;
            Boolean bool = c3lz.A07;
            IGUserHighlightsTrayType iGUserHighlightsTrayType = c3lz.A02;
            Boolean bool2 = c3lz.A08;
            Integer num = c3lz.A0B;
            Integer num2 = c3lz.A0C;
            Boolean bool3 = c3lz.A09;
            Integer num3 = c3lz.A0D;
            c3lz.A06 = new C3NO(c74433Vz, iGUserHighlightsTrayType, c3lz.A03, c3lz.A04, c3lz.A05, bool, bool2, bool3, c3lz.A0A, num, num2, num3, c3lz.A0E, str5, str6, c3lz.A0I, list, c3lz.A0K, c3lz.A0L, c3lz.A0M);
            return c3lz;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
