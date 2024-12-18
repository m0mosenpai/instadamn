package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.MediaIdToBrandSafetyContentBlocklistBitmapMapImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.IPw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41307IPw {
    public static C38858H9g parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38858H9g c38858H9g = new C38858H9g();
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
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if ("client_hints".equals(A0s)) {
                        c38858H9g.A02 = AbstractC74353Vr.parseFromJson(c16l);
                    } else {
                        HashMap hashMap = null;
                        ArrayList arrayList = null;
                        ArrayList arrayList2 = null;
                        ArrayList arrayList3 = null;
                        if ("container_module".equals(A0s)) {
                            c38858H9g.A09 = AbstractC167017dG.A0m(c16l);
                        } else if ("is_shell_response".equals(A0s)) {
                            c38858H9g.A06 = AbstractC166997dE.A0d(c16l);
                        } else if (DialogModule.KEY_ITEMS.equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    C38601Gy4 parseFromJson = AbstractC40089HqG.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        arrayList.add(parseFromJson);
                                    }
                                }
                            }
                            C14360o3.A0B(arrayList, 0);
                            c38858H9g.A0B = arrayList;
                        } else if ("items_with_ads".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList2 = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    C38688GzT parseFromJson2 = AbstractC40088HqF.parseFromJson(c16l);
                                    if (parseFromJson2 != null) {
                                        arrayList2.add(parseFromJson2);
                                    }
                                }
                            }
                            c38858H9g.A0C = arrayList2;
                        } else if ("media_id_to_brand_safety_content_blocklist_map".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList3 = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    MediaIdToBrandSafetyContentBlocklistBitmapMapImpl parseFromJson3 = AbstractC37858GlC.parseFromJson(c16l);
                                    if (parseFromJson3 != null) {
                                        arrayList3.add(parseFromJson3);
                                    }
                                }
                            }
                            c38858H9g.A0D = arrayList3;
                        } else if ("media_id_to_brand_safety_severity_map".equals(A0s)) {
                            if (c16l.A11() == c16r) {
                                HashMap A1G = AbstractC166987dD.A1G();
                                while (c16l.A1J() != c16r2) {
                                    String A1P = c16l.A1P();
                                    if (AbstractC37301Gc2.A05(c16l) == C16R.A0G) {
                                        A1G.put(A1P, null);
                                    } else {
                                        Integer A0h = AbstractC166997dE.A0h(c16l);
                                        if (A0h != null) {
                                            A1G.put(A1P, A0h);
                                        }
                                    }
                                }
                                hashMap = A1G;
                            }
                            c38858H9g.A0A = hashMap;
                        } else if ("paging_info".equals(A0s)) {
                            C111074zO parseFromJson4 = AbstractC111064zN.parseFromJson(c16l);
                            C14360o3.A0B(parseFromJson4, 0);
                            c38858H9g.A04 = parseFromJson4;
                        } else if ("preload_distance".equals(A0s)) {
                            c38858H9g.A08 = AbstractC166997dE.A0h(c16l);
                        } else if ("ranking_info".equals(A0s)) {
                            c38858H9g.A05 = AbstractC40203HsS.parseFromJson(c16l);
                        } else if ("unable_to_load_chaining_media".equals(A0s)) {
                            c38858H9g.A07 = AbstractC166997dE.A0d(c16l);
                        } else {
                            C55702hA.A01(c16l, c38858H9g, A0s);
                        }
                    }
                    c16l.A0z();
                } else {
                    C74433Vz c74433Vz = c38858H9g.A02;
                    String str = c38858H9g.A09;
                    Boolean bool = c38858H9g.A06;
                    List list = c38858H9g.A0B;
                    C14360o3.A0A(list);
                    List list2 = c38858H9g.A0C;
                    List list3 = c38858H9g.A0D;
                    HashMap hashMap2 = c38858H9g.A0A;
                    C111074zO c111074zO = c38858H9g.A04;
                    C14360o3.A0A(c111074zO);
                    c38858H9g.A03 = new C38647Gyo(c74433Vz, c111074zO, c38858H9g.A05, bool, c38858H9g.A07, c38858H9g.A08, str, hashMap2, list, list2, list3);
                    return c38858H9g;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
