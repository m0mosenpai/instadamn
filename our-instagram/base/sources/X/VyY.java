package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class VyY {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.UzE, X.1um, X.1ul] */
    public static C67841UzE parseFromJson(C16L c16l) {
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
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if ("header".equals(A0s)) {
                        c40791um.A03 = AbstractC47058KrF.parseFromJson(c16l);
                    } else if ("header_state_selector_in_bloks".equals(A0s)) {
                        c40791um.A07 = c16l.A0d();
                    } else {
                        HashMap hashMap = null;
                        ArrayList arrayList = null;
                        if ("units".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList = new ArrayList();
                                while (c16l.A1J() != C16R.A08) {
                                    C41136IJb parseFromJson = AbstractC40669I1b.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        arrayList.add(parseFromJson);
                                    }
                                }
                            }
                            c40791um.A06 = arrayList;
                        } else if ("state_selector".equals(A0s)) {
                            c40791um.A02 = VVE.parseFromJson(c16l);
                        } else if ("url_path_to_module_id".equals(A0s)) {
                            if (c16l.A11() == c16r) {
                                hashMap = new HashMap();
                                while (c16l.A1J() != c16r2) {
                                    AbstractC31179DnN.A1F(c16l, hashMap);
                                }
                            }
                            c40791um.A05 = hashMap;
                        } else if ("url".equals(A0s)) {
                            c40791um.A04 = AbstractC167017dG.A0m(c16l);
                        } else if ("share_unit".equals(A0s)) {
                            c40791um.A01 = AbstractC47057KrE.parseFromJson(c16l);
                        } else if ("info_glyph_unit".equals(A0s)) {
                            c40791um.A00 = VVC.parseFromJson(c16l);
                        } else if ("is_sunset".equals(A0s)) {
                            c40791um.A08 = c16l.A0d();
                        } else {
                            C55702hA.A01(c16l, c40791um, A0s);
                        }
                    }
                    c16l.A0z();
                } else {
                    return c40791um;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
