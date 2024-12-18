package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8m5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC196158m5 {
    public static C196168m6 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C196168m6 c196168m6 = new C196168m6();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                if ("identity_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    c196168m6.A00 = str;
                } else if ("identity_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    C14360o3.A0B(str2, 0);
                    c196168m6.A01 = str2;
                } else if ("obfuscated_identity_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    C14360o3.A0B(str3, 0);
                    c196168m6.A02 = str3;
                } else if ("surface_to_xpost_eligibilities".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C8m8 parseFromJson = AbstractC196178m7.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c196168m6.A03 = arrayList;
                }
                c16l.A0z();
            }
            return c196168m6;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
