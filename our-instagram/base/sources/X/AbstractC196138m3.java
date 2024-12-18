package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8m3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC196138m3 {
    public static C196148m4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C196148m4 c196148m4 = new C196148m4();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                String str = null;
                if ("source_identity_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    c196148m4.A00 = str;
                } else if ("destination_identities".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C196168m6 parseFromJson = AbstractC196158m5.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c196148m4.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c196148m4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
