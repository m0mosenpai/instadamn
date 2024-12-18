package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ClipsSpecialResponseType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.Gdq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37410Gdq {
    public static C124275jh parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C124275jh c124275jh = new C124275jh();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                A00(c16l, c124275jh, A0q);
                c16l.A0z();
            }
            c124275jh.A00();
            return c124275jh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C16L c16l, C124275jh c124275jh, String str) {
        String A1P;
        if ("preload_distance".equals(str)) {
            c124275jh.A01 = Integer.valueOf(c16l.A1D());
            return;
        }
        if ("clips_special_response_type".equals(str)) {
            if (c16l.A11() == C16R.A0G) {
                A1P = null;
            } else {
                A1P = c16l.A1P();
            }
            ClipsSpecialResponseType clipsSpecialResponseType = (ClipsSpecialResponseType) ClipsSpecialResponseType.A01.get(A1P);
            if (clipsSpecialResponseType == null) {
                clipsSpecialResponseType = ClipsSpecialResponseType.A05;
            }
            c124275jh.A00 = clipsSpecialResponseType;
            return;
        }
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        HashMap hashMap = null;
        String str5 = null;
        if ("clips_items".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    C111034zF parseFromJson = AbstractC111024zE.parseFromJson(c16l);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            c124275jh.A09 = arrayList;
            return;
        }
        if ("container_module".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str3 = c16l.A1P();
            }
            c124275jh.A04 = str3;
            return;
        }
        if ("first_seen_media_id".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str4 = c16l.A1P();
            }
            c124275jh.A05 = str4;
            return;
        }
        if (DialogModule.KEY_ITEMS.equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList2 = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    C111034zF parseFromJson2 = AbstractC111024zE.parseFromJson(c16l);
                    if (parseFromJson2 != null) {
                        arrayList2.add(parseFromJson2);
                    }
                }
            }
            C14360o3.A0B(arrayList2, 0);
            c124275jh.A0A = arrayList2;
            return;
        }
        if ("items_with_ads".equals(str)) {
            if (c16l.A11() == C16R.A0C) {
                arrayList3 = new ArrayList();
                while (c16l.A1J() != C16R.A08) {
                    C38695H2g parseFromJson3 = AbstractC39815HlP.parseFromJson(c16l);
                    if (parseFromJson3 != null) {
                        arrayList3.add(parseFromJson3);
                    }
                }
            }
            c124275jh.A0B = arrayList3;
            return;
        }
        if ("media_id_to_brand_safety_severity_map".equals(str)) {
            if (c16l.A11() == C16R.A0D) {
                HashMap hashMap2 = new HashMap();
                while (c16l.A1J() != C16R.A09) {
                    String A1P2 = c16l.A1P();
                    c16l.A1J();
                    if (c16l.A11() == C16R.A0G) {
                        hashMap2.put(A1P2, null);
                    } else {
                        Integer valueOf = Integer.valueOf(c16l.A1D());
                        if (valueOf != null) {
                            hashMap2.put(A1P2, valueOf);
                        }
                    }
                }
                hashMap = hashMap2;
            }
            c124275jh.A08 = hashMap;
            return;
        }
        if ("paging_info".equals(str)) {
            C111074zO parseFromJson4 = AbstractC111064zN.parseFromJson(c16l);
            C14360o3.A0B(parseFromJson4, 0);
            c124275jh.A02 = parseFromJson4;
        } else if ("reels_page_index".equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str5 = c16l.A1P();
            }
            c124275jh.A06 = str5;
        } else if (TraceFieldType.RequestID.equals(str)) {
            if (c16l.A11() != C16R.A0G) {
                str2 = c16l.A1P();
            }
            c124275jh.A07 = str2;
        } else if ("unable_to_load_chaining_media".equals(str)) {
            c124275jh.A03 = Boolean.valueOf(c16l.A0d());
        } else {
            C55702hA.A01(c16l, c124275jh, str);
        }
    }
}
