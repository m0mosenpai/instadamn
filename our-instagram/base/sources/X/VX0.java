package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VX0 {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Wib, java.lang.Object] */
    public static C70870Wib parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("background_color".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("emphasis_rects".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C69250VkJ parseFromJson = AbstractC69986Vz5.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A02 = arrayList;
                    } else if ("text_emphasis_mode".equals(A0s)) {
                        obj.A01 = A2Y.A00(AbstractC167017dG.A0m(c16l));
                    }
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
