package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VWr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68590VWr {
    public static C70868WiZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C70868WiZ c70868WiZ = new C70868WiZ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("color".equals(A0s)) {
                    c70868WiZ.A01 = c16l.A1D();
                } else if ("corner_radius".equals(A0s)) {
                    c70868WiZ.A00 = (float) c16l.A0U();
                } else if ("paths".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C139136Ru parseFromJson = AbstractC69984Vz3.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c70868WiZ.A02 = arrayList;
                }
                c16l.A0z();
            }
            return c70868WiZ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
