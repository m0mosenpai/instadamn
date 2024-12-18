package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VV4 {
    public static C69008Vfk parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69008Vfk c69008Vfk = new C69008Vfk();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("control_node".equals(A0s)) {
                    c69008Vfk.A00 = AbstractC69951VyR.parseFromJson(c16l);
                } else if ("buckets".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C68807VcO parseFromJson = VV3.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c69008Vfk.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c69008Vfk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
