package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VV3 {
    public static C68807VcO parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68807VcO c68807VcO = new C68807VcO();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("configured_questions".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69423Vn8 parseFromJson = VV2.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c68807VcO.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c68807VcO;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
