package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VTp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68510VTp {
    public static C68776Vbt parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68776Vbt c68776Vbt = new C68776Vbt();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("edges".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C68775Vbs parseFromJson = AbstractC68509VTo.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c68776Vbt.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c68776Vbt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
