package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I6p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40813I6p {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.ICq] */
    public static C40969ICq parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                ArrayList arrayList = null;
                if (AbstractC37304Gc5.A1Z(c16l, A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else {
                    if ("is_expanded".equals(A0q)) {
                        c16l.A0d();
                    } else if ("destination".equals(A0q)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("sections".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                IJD parseFromJson = I7C.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A00 = arrayList;
                    }
                    c16l.A0z();
                }
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
