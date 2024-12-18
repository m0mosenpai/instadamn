package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VSl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68480VSl {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Vlw, java.lang.Object] */
    public static C69350Vlw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (MSV.A00(1721).equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("warning_url".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("warning_button_show_posts_title".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("warning_button_open_url_title".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("warning_contents".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    obj.A05 = arrayList;
                } else if ("category_id".equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
