package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VSY {
    public static C25547BRj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C25547BRj c25547BRj = new C25547BRj();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("tokens".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            US9 parseFromJson = AbstractC69932Vxx.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c25547BRj.A01 = arrayList;
                } else if ("confidence".equals(A0s)) {
                    c25547BRj.A00 = (float) c16l.A0U();
                }
                c16l.A0z();
            }
            return c25547BRj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
