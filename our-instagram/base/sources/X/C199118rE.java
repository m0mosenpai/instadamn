package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8rE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199118rE {
    public static C199108rD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C199108rD c199108rD = new C199108rD();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("composer_config".equals(A0q)) {
                    c199108rD.A01 = AbstractC201828wF.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    ArrayList arrayList2 = null;
                    String str = null;
                    if ("static_stickers".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C148276lx parseFromJson = AbstractC201078up.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList2.add(parseFromJson);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList2, 0);
                        c199108rD.A02 = arrayList2;
                    } else if ("version".equals(A0q)) {
                        c16l.A1D();
                    } else if ("layout_name".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        C14360o3.A0B(str, 0);
                    } else if ("sticker_tray".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C201068un parseFromJson2 = AbstractC201058um.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c199108rD.A03 = arrayList;
                    } else if ("stories_sticker_drop_info".equals(A0q)) {
                        c199108rD.A00 = C9xL.parseFromJson(c16l);
                    } else {
                        C55702hA.A01(c16l, c199108rD, A0q);
                    }
                }
                c16l.A0z();
            }
            return c199108rD;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
