package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hju, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39724Hju {
    public static H2A parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("medias_dict".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1J(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("sound_sync_infos".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51797Mv1 parseFromJson = AbstractC40253HtJ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("medias_dict", c16l, "ACRClientStitchMetadata");
            } else if (arrayList2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("sound_sync_infos", c16l, "ACRClientStitchMetadata");
            } else {
                return new H2A(arrayList, arrayList2);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
