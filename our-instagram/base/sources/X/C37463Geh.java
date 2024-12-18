package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Geh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37463Geh {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.H9Z, X.1um, X.1ul] */
    public static H9Z parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
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
                    String str = null;
                    HashMap hashMap = null;
                    if ("ad_media_items".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C37471Gep parseFromJson = AbstractC37470Geo.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList2.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A08 = arrayList2;
                    } else if ("ads_pool_threshold_for_next_request".equals(A0q)) {
                        c40791um.A04 = Integer.valueOf(c16l.A1D());
                    } else if ("container_module".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c40791um.A06 = str;
                    } else if ("earliest_request_position".equals(A0q)) {
                        c40791um.A05 = Integer.valueOf(c16l.A1D());
                    } else if ("is_overlay".equals(A0q)) {
                        c40791um.A02 = Boolean.valueOf(c16l.A0d());
                    } else if ("media_id_to_brand_safety_severity_map".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap2 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap2.put(A1P, null);
                                } else {
                                    Integer valueOf = Integer.valueOf(c16l.A1D());
                                    if (valueOf != null) {
                                        hashMap2.put(A1P, valueOf);
                                    }
                                }
                            }
                            hashMap = hashMap2;
                        }
                        c40791um.A07 = hashMap;
                    } else if ("more_available_ad_media".equals(A0q)) {
                        c40791um.A03 = Boolean.valueOf(c16l.A0d());
                    } else if ("netego_media_items".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                H4O parseFromJson2 = AbstractC40104HqW.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c40791um.A09 = arrayList;
                    } else if ("profile_ads_info".equals(A0q)) {
                        c40791um.A01 = AbstractC37464Gei.parseFromJson(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0q);
                    }
                    c16l.A0z();
                } else {
                    List list = c40791um.A08;
                    C14360o3.A0A(list);
                    Integer num = c40791um.A04;
                    String str2 = c40791um.A06;
                    C14360o3.A0A(str2);
                    Integer num2 = c40791um.A05;
                    Boolean bool = c40791um.A02;
                    HashMap hashMap3 = c40791um.A07;
                    Boolean bool2 = c40791um.A03;
                    List list2 = c40791um.A09;
                    C14360o3.A0A(list2);
                    c40791um.A00 = new C37461Gef(c40791um.A01, bool, bool2, num, num2, str2, hashMap3, list, list2);
                    return c40791um;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
