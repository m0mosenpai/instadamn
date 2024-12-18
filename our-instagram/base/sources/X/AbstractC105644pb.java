package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4pb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC105644pb {
    public static C9BW parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9BW c9bw = new C9BW(17);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                if ("postback_items".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C105954q9 parseFromJson = C4q8.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c9bw.A00 = arrayList;
                } else if ("url_items".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C9CJ parseFromJson2 = AbstractC22716A0m.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c9bw.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c9bw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
