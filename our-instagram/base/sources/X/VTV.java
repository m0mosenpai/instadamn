package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VTV {
    public static C68767Vbk parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68767Vbk c68767Vbk = new C68767Vbk();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("candidates".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69118Vi8 parseFromJson = VTU.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c68767Vbk.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c68767Vbk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
