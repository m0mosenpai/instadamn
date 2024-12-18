package X;

import com.instagram.api.schemas.MediaIdToBrandSafetyContentBlocklistBitmapMapImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.Gl3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37849Gl3 {
    public static C37850Gl4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C37850Gl4 c37850Gl4 = new C37850Gl4();
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
                    ArrayList arrayList = null;
                    ArrayList arrayList2 = null;
                    HashMap hashMap = null;
                    HashMap hashMap2 = null;
                    ArrayList arrayList3 = null;
                    if ("ad_media_items".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C38252Grv parseFromJson = AbstractC38251Gru.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList2.add(parseFromJson);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList2, 0);
                        c37850Gl4.A02 = arrayList2;
                    } else if ("ad_positions".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap3 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap3.put(A1P, null);
                                } else {
                                    Integer valueOf = Integer.valueOf(c16l.A1D());
                                    if (valueOf != null) {
                                        hashMap3.put(A1P, valueOf);
                                    }
                                }
                            }
                            hashMap = hashMap3;
                        }
                        C14360o3.A0B(hashMap, 0);
                        c37850Gl4.A01 = hashMap;
                    } else if ("is_overlay".equals(A0q)) {
                        c37850Gl4.A05 = c16l.A0d();
                    } else if ("media_id_to_brand_safety_severity_map".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap4 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P2 = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap4.put(A1P2, null);
                                } else {
                                    Long valueOf2 = Long.valueOf(c16l.A0y());
                                    if (valueOf2 != null) {
                                        hashMap4.put(A1P2, valueOf2);
                                    }
                                }
                            }
                            hashMap2 = hashMap4;
                        }
                        c37850Gl4.A00 = hashMap2;
                    } else if ("media_id_to_brand_safety_content_blocklist_map".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList3 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                MediaIdToBrandSafetyContentBlocklistBitmapMapImpl parseFromJson2 = AbstractC37858GlC.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList3.add(parseFromJson2);
                                }
                            }
                        }
                        c37850Gl4.A03 = arrayList3;
                    } else if ("netego_media_items".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C41170IKj parseFromJson3 = AbstractC40552HyY.parseFromJson(c16l);
                                if (parseFromJson3 != null) {
                                    arrayList.add(parseFromJson3);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c37850Gl4.A04 = arrayList;
                    } else {
                        C55702hA.A01(c16l, c37850Gl4, A0q);
                    }
                    c16l.A0z();
                } else {
                    return c37850Gl4;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
