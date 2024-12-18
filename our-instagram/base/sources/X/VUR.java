package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VUR {
    public static C68993VfV parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68993VfV c68993VfV = new C68993VfV();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("header".equals(A0s)) {
                    c68993VfV.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("points".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C68992VfU parseFromJson = VUQ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c68993VfV.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c68993VfV;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
